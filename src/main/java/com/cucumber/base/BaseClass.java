package com.cucumber.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver browserLaunch(String browserName) {

		browserName.equals("chrome");
		System.setProperty("webdriver.chrome.driver",
				"E:\\WorkSpace\\Cucumber\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		return driver;
	}
	

	public static void getUrl(String url) {
		driver.get(url);
	}

	public static void selectOptions(WebElement element, String value, String Option) {

		Select sel = new Select(element);
		try {
			if (Option.equalsIgnoreCase("byIndex")) {
				int parseInt = Integer.parseInt(value);
				sel.selectByIndex(parseInt);
			} else if (Option.equalsIgnoreCase("byValue")) {
				sel.selectByValue(value);
			} else if (Option.equalsIgnoreCase("byVisibleText")) {
				sel.selectByVisibleText(value);
			} else {
				System.out.println("Invalid Option");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void clickElement(WebElement clickElement) {
		clickElement.click();
	}

	public static void inputElement(WebElement element, String value) {
		
		element.sendKeys(value);
		
		
	}
	

	public static void scrollUp(WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", element);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void scrollDown(WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", element);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void attributeName(String String, WebElement element) {
		System.out.println(element.getAttribute(String));
	}

	public static void navigationTo(String url) {
		driver.navigate().to(url);
	}

	public static void navigationBack(String url) {
		driver.navigate().back();
	}

	public static void navigationForward(String url) {
		driver.navigate().forward();
	}

	public static void navigationRefresh(String url) {
		driver.navigate().refresh();
	}

	public static void dragDrop(WebElement source, WebElement destination) {
		Actions ac = new Actions(driver);
		ac.dragAndDrop(source, destination).build().perform();
	}

	public static void closeDriver(WebElement closeDriver) {
		driver.close();
	}

	public static void quitDriver(WebElement quitDriver) {
		driver.quit();
	}

	public static void alertAccept(WebElement alertAccept) {
		driver.switchTo().alert().accept();
	}

	public static void alertDismiss(WebElement alertDismiss) {
		driver.switchTo().alert().dismiss();
	}

	public static void alertText(String Value) {
		driver.switchTo().alert().sendKeys(Value);
	}

	public static void clickDouble(WebElement Element) {
		Actions act = new Actions(driver);
		act.doubleClick(Element).build().perform();
	}

	public static void clickRight(WebElement Element) {
		Actions act = new Actions(driver);
		act.contextClick(Element).build().perform();
	}

	public static void pressDown(WebElement Element) throws Exception {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
	}
	
	public static void pressUp(WebElement Element) throws Exception {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_UP);
	}
	
	public static void releaseDown(WebElement Element) throws Exception {
		Robot r = new Robot();
		r.keyRelease(KeyEvent.VK_DOWN);
	}
	
	public static void releaseUp(WebElement Element) throws Exception {
		Robot r = new Robot();
		r.keyRelease(KeyEvent.VK_UP);
	}
	
	public static void pressEnter(WebElement Element) throws Exception {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
	}
	
	public static void releaseEnter(WebElement Element) throws Exception {
		Robot r = new Robot();
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public static void currentUrl(String url) {
		System.out.println(driver.getCurrentUrl());
	}
	
	public static void titleName(WebElement String) {
		System.out.println(driver.getTitle());
	}

	public static void textName (WebElement element) {
		//driver().getText();
	}
	
	public static void getScreenshot (String path) throws IOException {
		TakesScreenshot ss = (TakesScreenshot) driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File destination = new File(path);
		FileUtils.copyFile(source, destination);
	}
}
