package com.ls.util;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.imageio.ImageIO;

import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.security.web.servletapi.SecurityContextHolderAwareRequestWrapper;

import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.google.common.collect.Lists;
import com.ls.entity.Role;
import com.ls.entity.User;
import com.ls.vo.JobSchedule;
import com.ls.vo.ResponseVo;

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

	public static void main(String[] args) {

		getScheduleList(07, 20, 17, 19, 60);
	}
}
