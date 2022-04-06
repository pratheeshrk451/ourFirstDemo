package com.baseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
public static WebDriver getDriver(String browser) {
	if(browser.equalsIgnoreCase("chrome")) {
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	driver.manage().window().maximize();
}else if(browser.equalsIgnoreCase("firebox")) {
	WebDriverManager.firefoxdriver().setup();
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
}
	return driver;

}
public static void getUrl(String s) {
	driver.get(s);
		
}
public static void click(WebElement ele) {
	ele.click();
	
}
public static void inputValue(WebElement ele, String s) {
	ele.sendKeys(s);
}
public static void sleep(int sec) throws InterruptedException {
	Thread.sleep(sec);
	
}
public static void getDropDownSelectByValue(WebElement ele, String value) {
	Select s = new Select(ele);
	s.selectByValue(value);	
}
public static void getDropDownSelectByIndex(WebElement ele, int index) {
	Select s = new Select(ele);
	s.selectByIndex(index);	
}
public static void getDropDownSelectByVisibleText(WebElement ele, String text) {
	Select s = new Select(ele);
	s.selectByVisibleText(text);
}
public static String getCurrentUrl() {
	String currentUrl=driver.getCurrentUrl();
	return currentUrl;
}
public static void getImplecitWait(int sec) {
	driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
}





}