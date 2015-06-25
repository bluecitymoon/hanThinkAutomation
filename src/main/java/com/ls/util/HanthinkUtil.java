package com.ls.util;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import javax.imageio.ImageIO;

import net.sf.json.JSONObject;

import org.apache.commons.io.IOUtils;
import org.apache.struts2.ServletActionContext;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.security.web.servletapi.SecurityContextHolderAwareRequestWrapper;

import com.gargoylesoftware.htmlunit.Page;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.google.common.io.Files;
import com.ls.constants.HanthinkProperties;
import com.ls.entity.Role;
import com.ls.entity.User;
import com.ls.vo.JobSchedule;
import com.ls.vo.Orders;
import com.ls.vo.ResponseVo;
import com.ls.vo.StorageDetail;

public class HanthinkUtil {

	private static ShaPasswordEncoder shaPasswordEncoder = new ShaPasswordEncoder(256);

	public static String getEncodedPassword(String password, String username) {

		return shaPasswordEncoder.encodePassword(password, username);
	}

	public static <T> T getJavaObjectFromJsonString(String jsonString, Class<T> classType) {

		@SuppressWarnings("unchecked")
		T javaObject = (T)JSONObject.toBean(JSONObject.fromObject(jsonString), classType);

		return javaObject;
	}

	public static ResponseVo makeGeneralErrorResponse(Exception e) {

		if (e == null) {
			return ResponseVo.newFailMessage("操作失败");
		}
		ResponseVo errorResponseVo = ResponseVo.newFailMessage("你的操作在处理时发生了错误！ 异常的消息是 ： " + e.getMessage());

		return errorResponseVo;
	}

	public static ResponseVo makeGeneralSuccessResponse() {

		ResponseVo errorResponseVo = ResponseVo.newSuccessMessage("<b>操作成功!</b>");

		return errorResponseVo;
	}

	public static User getDevelopmentUser() {

		User user = new User();
		user.setId(1);
		user.setName("Jerry Jiang");

		return user;
	}

	public static boolean stringIsEmpty(String str) {

		if (str != null && str.trim().length() > 0) {
			return false;
		}
		return true;
	}

	public static Date getStandardDate(String dateString) {

		try {
			return XinXinConstants.FULL_DATE_FORMATTER.parse(dateString);
		} catch (ParseException e) {
			return null;
		}
	}

	public static Date getStandardDate(Date date) {

		String standardDateString = XinXinConstants.FULL_DATE_FORMATTER.format(date);
		return getStandardDate(standardDateString);
	}

	public static Date getStandardSimpleDate(Date date) {

		String standardDateString = XinXinConstants.SIMPLE_DATE_FORMATTER.format(date);
		try {
			return XinXinConstants.SIMPLE_DATE_FORMATTER.parse(standardDateString);
		} catch (ParseException e) {
			return null;
		}
	}

	public static String getCarrefourDateQueryString(String standerdString) throws ParseException {

		Date date = XinXinConstants.SIMPLE_DATE_FORMATTER.parse(standerdString);

		return new SimpleDateFormat(XinXinConstants.SIMPLE_DATE_FORMAT_CARREFOUR).format(date);
	}

	public static String getCarrefourDateToStandardString(String carrefourString) throws ParseException {

		Date date = new SimpleDateFormat("dd/MM/yyyy").parse(carrefourString);

		return new SimpleDateFormat(XinXinConstants.SIMPLE_DATE_FORMAT_STRING).format(date);
	}

	public static Date getNow() {

		return getStandardDate(new Date());
	}

	public static String getSimpleTodayString() {

		Date now = new Date();
		return XinXinConstants.SIMPLE_DATE_FORMATTER.format(now);
	}

	public static String getCurrentUserName() {

		SecurityContextHolderAwareRequestWrapper securityContextHolderAwareRequestWrapper = new SecurityContextHolderAwareRequestWrapper(ServletActionContext.getRequest(), "ROLE_");
		return securityContextHolderAwareRequestWrapper.getUserPrincipal().getName();
	}

	public static boolean checkIfUserIsAdmin(User user) {

		List<Role> userRoles = user.getRoles();

		for (Role role : userRoles) {
			if (role.getName().equals("ROLE_ADMIN")) {
				return true;
			}
		}

		return false;
	}

	@SuppressWarnings("unchecked")
	public static <T> T getFirstElementByXPath(HtmlPage htmlPage, String xPath) {

		try {
			List<?> nodes = htmlPage.getByXPath(xPath);
			if (null != nodes && !nodes.isEmpty()) {

				return (T)nodes.get(0);
			}
		} catch (Exception e) {

		}

		return null;
	}

	@SuppressWarnings("unchecked")
	public static <T> T getElementAtIndexByXPath(HtmlPage htmlPage, String xPath, int index) {

		try {
			List<?> nodes = htmlPage.getByXPath(xPath);
			if (null != nodes && !nodes.isEmpty()) {

				return (T)nodes.get(index);
			}
		} catch (Exception e) {

		}

		return null;
	}

	public static String getNumbersInString(String content) {

		Pattern pattern = Pattern.compile("\\d+");
		Matcher matcher = pattern.matcher(content);
		while (matcher.find()) {
			return matcher.group(0);
		}
		return null;
	}

	public static List<JobSchedule> getScheduleList(int startHour, int startMinute, int endHour, int endMinute, int interval) {

		if (startHour > endHour) {
			throw new RuntimeException("起始时间配置错误");
		}
		List<JobSchedule> jobSchedules = Lists.newArrayList();

		int totallMinutes = (endHour - startHour) * 60 + (endMinute - startMinute);

		return jobSchedules;

	}

	public static void changeImageToBlackAndWhite(String filePath) {

		File file = new File(filePath);

		try {
			BufferedImage bufImg = ImageIO.read(file);
			int height = bufImg.getHeight();
			int width = bufImg.getWidth();
			for (int i = 0; i < width; i++) {
				for (int j = 0; j < height; j++) {

					int rgb = bufImg.getRGB(i, j) & 0xFFFFFF;
					Color color = new Color(rgb);
					int red = color.getRed(), green = color.getGreen(), black = color.getBlue();

					if (red > 90 && green > 90 && black > 90) {
						bufImg.setRGB(i, j, Color.WHITE.getRGB());
					} else {
						bufImg.setRGB(i, j, Color.BLACK.getRGB());
					}
				}
			}
			ImageIO.write(bufImg, "jpg", file);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String unzipLingduZipFile(String zipFileName) {
		
		String extracedCsvFileName = null;
		try {
			ZipFile fileToUnzip = new ZipFile(zipFileName);

			Enumeration<? extends ZipEntry> enumeration = fileToUnzip.entries();

			while (enumeration.hasMoreElements()) {

				ZipEntry zipEntry = enumeration.nextElement();
				extracedCsvFileName = HanthinkProperties.getString("dataFileBase") + zipEntry.getName();
				
				File outputFile = new File(extracedCsvFileName);
				InputStream inputStream = fileToUnzip.getInputStream(zipEntry);
				FileOutputStream fileOutputStream = new FileOutputStream(outputFile);
				
				BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
				BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fileOutputStream, "UTF-8"));  
				String line= null;
				StringBuilder bigStringBuilder = new StringBuilder();
				while((line = reader.readLine()) != null) {
					bigStringBuilder.append(line + "\n");
					//writer.write(line+"\n");
				}
				
				Files.write(bigStringBuilder.toString().getBytes(), outputFile);
////				
////				
////				FileOutputStream fos = new FileOutputStream(new File(extracedCsvFileName));
////				OutputStream bos = new BufferedOutputStream(fos);
//
//				IOUtils.copy(bis, bos);
//
//				bos.close();
				inputStream.close();
				fileOutputStream.close();

			}

			fileToUnzip.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return extracedCsvFileName;
	}

	public static void writeAttachementToFile(Page conentPage, String fileName) {
		
		try {
			InputStream is = conentPage.getWebResponse().getContentAsStream();

			File file = new File(fileName);
			if (!file.exists()) {
				file.createNewFile();
			}
			FileOutputStream fileout = new FileOutputStream(file);

			byte[] buffer = new byte[2048];
			int ch = 0;
			while ((ch = is.read(buffer)) != -1) {
				fileout.write(buffer, 0, ch);
			}
			is.close();
			fileout.flush();
			fileout.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void postStorageInformation() {

		
		File dataFile = new File("/Users/jerryjiang/Documents/java-workplace/lingduDownloads/0949fc4e-a3c5-48a9-becd-c34c09b6d854.csv");

		try {
			List<String> lines = Files.readLines(dataFile, Charset.defaultCharset());

			List<Orders> orders = parseDataFromCsvFile(lines, "20140033");
			
			System.out.println(orders.size());

		} catch (IOException e) {
		}

	}

	public static List<Orders> parseDataFromCsvFile(List<String> lines, String orderDate) {
		
		String supplierNumber = "";
	
		Map<String, List<StorageDetail>> storeGroups = new HashMap<String, List<StorageDetail>>();
		for (String singleLine : lines) {

			StorageDetail storageDetail = new StorageDetail();

			String deptNumber = "";
			String[] elements = singleLine.split(",");
			if (elements.length != 15) {
				
				System.out.println("bad data in the csv file");
				continue;
			}
			for (int i = 0; i < elements.length; i++) {

				String element = elements[i];
				switch (i) {
					case 0:
						if (org.apache.commons.lang.StringUtils.isEmpty(supplierNumber)) supplierNumber = element;
						break;
					case 1:
						storageDetail.setProductNumber(element);
						break;
					case 2:
						storageDetail.setDescription(element);
						break;
					case 6:
						deptNumber = element;
						break;
					case 13:
						storageDetail.setDayBalanceInDb(element);
						break;
					case 10:
						storageDetail.setCount(element);
						break;
					case 11:
						storageDetail.setMoneyAmount(element);
						break;

					default:
						break;
				}
			}

			if (storeGroups.containsKey(deptNumber)) {
				storeGroups.get(deptNumber).add(storageDetail);

			} else {

				List<StorageDetail> details = new ArrayList<StorageDetail>();
				details.add(storageDetail);
				storeGroups.put(deptNumber, details);

			}
		}

		List<Orders> orders = new ArrayList<Orders>();
		Set<Entry<String, List<StorageDetail>>> entryset = storeGroups.entrySet();
		for (Entry<String, List<StorageDetail>> entry : entryset) {
			Orders singleOrder = new Orders();
			
			Map<String, String> titleMap = new HashMap<String, String>();
			String uuid = UUID.randomUUID().toString();
			titleMap.put("uuid", uuid);
			titleMap.put("storeNumber", entry.getKey());
			titleMap.put("orderDate", orderDate);
			titleMap.put("supplierNumber", supplierNumber);
			
			singleOrder.setOrderTitleMap(titleMap);
			
			List<Map<String, String>> detailList = new ArrayList<Map<String,String>>();
			
			List<StorageDetail> details = entry.getValue();
			for (StorageDetail singleDetail : details) {
				Map<String, String> singleDetaiMap = new HashMap<String, String>();
				singleDetaiMap.put("productNumber", singleDetail.getProductNumber());
				singleDetaiMap.put("description", singleDetail.getDescription());
				singleDetaiMap.put("count", singleDetail.getCount());
				singleDetaiMap.put("moneyAmountWithoutTax", singleDetail.getMoneyAmount());
				singleDetaiMap.put("dayBalanceInDb", singleDetail.getDayBalanceInDb());
				
				detailList.add(singleDetaiMap);
			}
			
			singleOrder.setOrdersItemList(detailList);
			
			orders.add(singleOrder);
			
		}
	
		return orders;
	}

	public static void main(String[] args) {

		// getScheduleList(07, 20, 17, 19, 60);
		unzipLingduZipFile("C:\\Downloads\\20150625100534.zip");
		//postStorageInformation();
	}
}
