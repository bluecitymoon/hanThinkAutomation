package com.ls.util;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import javax.imageio.ImageIO;

import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.security.web.servletapi.SecurityContextHolderAwareRequestWrapper;

import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.io.Files;
import com.ls.entity.Role;
import com.ls.entity.User;
import com.ls.vo.JobSchedule;
import com.ls.vo.Orders;
import com.ls.vo.ResponseVo;
import com.ls.vo.StorageDetail;
import com.ls.vo.StorageGroup;

public class HanthinkUtil {

	private static ShaPasswordEncoder shaPasswordEncoder = new ShaPasswordEncoder(256);

	public static String getEncodedPassword(String password, String username) {

		return shaPasswordEncoder.encodePassword(password, username);
	}

	public static <T> T getJavaObjectFromJsonString(String jsonString, Class<T> classType) {

		@SuppressWarnings("unchecked")
		T javaObject = (T) JSONObject.toBean(JSONObject.fromObject(jsonString), classType);

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

				return (T) nodes.get(0);
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

				return (T) nodes.get(index);
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

	public static void unzipLingduZipFile(String zipFileName, String extractedFileName) {
		
		try {
			ZipFile fileToUnzip = new ZipFile(zipFileName);
			
			Enumeration<? extends ZipEntry> enumeration = fileToUnzip.entries();
			
			while(enumeration.hasMoreElements()) {
				
				ZipEntry zipEntry = enumeration.nextElement();
				
				InputStream bis = fileToUnzip.getInputStream(zipEntry);
				
				FileOutputStream fos = new FileOutputStream(new File(extractedFileName));
				OutputStream bos = new BufferedOutputStream(fos, 4096);           
                
                int count;
                byte data[] = new byte[4096];
                while ((count = bis.read(data, 0, 4096)) != -1)
                {
                    bos.write(data, 0, count);
                }
                bos.flush();
                bos.close();
                bis.close();
                
			}
			
			fileToUnzip.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void postStorageInformation() {
		
		HanthinkUtil.unzipLingduZipFile("C:\\Users\\Administrator\\Downloads\\stream.zip", "C:\\Users\\Administrator\\Downloads\\stream.csv");
		
		File dataFile = new File("C:\\Users\\Administrator\\Downloads\\stream.csv");
		
		try {
			List<String> lines = Files.readLines(dataFile, Charset.defaultCharset());
			
			parseDataFromCsvFile(lines);
			
		} catch (IOException e) {
		}
		
	}
	
	public static List<Orders> parseDataFromCsvFile(List<String> lines) {
		
		Map<String, List<StorageDetail>> storeGroups = new HashMap<String,List<StorageDetail>>();
		for (String singleLine : lines) {
			
			StorageDetail storageDetail = new StorageDetail();
			
			String deptNumber = "";
			String[] elements = singleLine.split(",");
			for (int i = 0; i < elements.length; i++) {
				
				String element = elements[i];
				switch (i) {
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
			
			if(storeGroups.containsKey(deptNumber)) {
				storeGroups.get(deptNumber).add(storageDetail);
				
			} else {
				
				List<StorageDetail> details = new ArrayList<StorageDetail>();
				details.add(storageDetail);
				storeGroups.put(deptNumber, details);
				
			}
		}
		
		System.out.println(storeGroups);
		System.out.println(storeGroups.size());
		
		return null;
	}
	
	public static void main(String[] args) {

		//getScheduleList(07, 20, 17, 19, 60);
		
		postStorageInformation();
	}
}
