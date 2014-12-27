//package com.ls.jobs;
//
//import static org.junit.Assert.fail;
//
//import java.util.concurrent.TimeUnit;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.NoAlertPresentException;
//import org.openqa.selenium.NoSuchElementException;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//public class TestGrabMetro {
//
//	private WebDriver driver;
//	private String baseUrl;
//	private boolean acceptNextAlert = true;
//	private StringBuffer verificationErrors = new StringBuffer();
//
//	@Before
//	public void setUp() throws Exception {
//
//		driver = new FirefoxDriver();
//		baseUrl = "https://portal.metro-link.com/public/logon/index.html?CTAuthMode=SECURID&language=en&URL=%2F";
//		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
//	}
//
//	@Test
//	public void testA() throws Exception {
//
//		driver.get(baseUrl);
//		driver.findElement(By.id("__field2")).clear();
//		driver.findElement(By.id("__field2")).sendKeys("yx_jiangfeng@163.com");
//		driver.findElement(By.id("__field3")).clear();
//		driver.findElement(By.id("__field3")).sendKeys("Metro52609");
//		driver.findElement(By.id("B-Send")).click();
//	}
//
//	@After
//	public void tearDown() throws Exception {
//
//		driver.quit();
//		String verificationErrorString = verificationErrors.toString();
//		if (!"".equals(verificationErrorString)) {
//			fail(verificationErrorString);
//		}
//	}
//
//	private boolean isElementPresent(By by) {
//
//		try {
//			driver.findElement(by);
//			return true;
//		} catch (NoSuchElementException e) {
//			return false;
//		}
//	}
//
//	private boolean isAlertPresent() {
//
//		try {
//			driver.switchTo().alert();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}
//	}
//
//	private String closeAlertAndGetItsText() {
//
//		try {
//			Alert alert = driver.switchTo().alert();
//			String alertText = alert.getText();
//			if (acceptNextAlert) {
//				alert.accept();
//			} else {
//				alert.dismiss();
//			}
//			return alertText;
//		} finally {
//			acceptNextAlert = true;
//		}
//	}
//}
