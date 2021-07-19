package com.baseandpom;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	// WebElements
	// Method for click()
	public static void clickTheElement(WebElement element) {
		element.click();
	}

	// Method for sendKeys()
	public static void inputValues(WebElement input, String values) {
		input.sendKeys(values);
	}

	// Method for getText()
	public static void getTextValues(WebElement element) {
		element.getText();
	}

	// WebDiver
	// Method for close()
	public static WebDriver driver;

	public static void closeMethod() {
		driver.close();
	}

	// Method for quit()
	public static void quitMethod() {
		driver.quit();
	}

	// Method for Browser Launch(Set Property)
	public static WebDriver browserLaunch(String browser) {
		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\lenovo\\eclipse-workspace\\MiniProjectSelenium\\Driver\\chromedriver.exe");
			 driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\lenovo\\eclipse-workspace\\MiniProjectSelenium\\Driver\\chromedriver.exe");
			 driver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\lenovo\\eclipse-workspace\\MiniProjectSelenium\\Driver\\chromedriver.exe");
			 driver = new EdgeDriver();
		} else {
			System.out.println("Browser is not correct");
		}
		driver.manage().window().maximize();
		return driver;
	}

	// Method for get()
	public static void getMethod(String url) {
		driver.get(url);
	}

	// Method for Navigate to
	public static void navigateToMethod(String navPath) {
		driver.navigate().to(navPath);
	}

	// Method to Navigate forward
	// forwardMethod
	public static void forwardMethod() {
		driver.navigate().forward();
	}

	// backMethod
	public static void backMethod() {
		driver.navigate().back();
	}

	// Navigate refresh
	public static void refreshMethod() {
		driver.navigate().refresh();
	}

	/*
	 * //Window Handling public static void handleWindows() { Set<String>
	 * windowHandles = driver.getWindowHandles(); for (String string :
	 * windowHandles) { String title = driver.switchTo().window(string).getTitle();
	 * System.out.println(title); } String tit = titles
	 */

	// Frames
	// webelement
	public static void frameWebElement(WebElement element) {
		driver.switchTo().frame(element);
	}

	// string input
	public static void framesString(String str) {
		driver.switchTo().frame(str);
	}

	// index input
	public static void framesIndex(int index) {
		driver.switchTo().frame(index);
	}

	// exit frame
	public static void exitFrame() {
		driver.switchTo().defaultContent();
	}

	// Implicit wait
	public static void impWait(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}

	// move to element
	public static void moveElementMethod(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).build().perform();
	}

	// contextClick
	public static void contextClickMethod(WebElement element) {
		Actions ac = new Actions(driver);
		ac.contextClick(element).build().perform();
	}

	// contextClick
	public static void clickMethod(WebElement element) {
		Actions ac = new Actions(driver);
		ac.click(element).build().perform();
	}

	// DragandDrop
	public static void dragAndDropMethod(WebElement drag, WebElement drop) {
		Actions ac = new Actions(driver);
		ac.dragAndDrop(drag, drop);
		// ac.clickAndHold(drag).moveToElement(drop).release(drop).build().perform();
	}

	// doubleClick
	public static void doubleClickMethod(WebElement element) {
		Actions ac = new Actions(driver);
		ac.contextClick(element).build().perform();
	}

	// get current url
	public static void getCurrentPath() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	// getTitle
	public static void getTitleMethod() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	//getText
	public static void getTextMethod(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}
	//screenshot
	public static void screenShotMethod(String path) throws IOException {
	TakesScreenshot ts = (TakesScreenshot) driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dest = new File(path);
	FileHandler.copy(src, dest);
	}
	
	//select by index
	public static void selectIndex(WebElement element ,int index) {
		Select s= new Select(element);
		s.selectByIndex(index);

	}
	//Select by Value
	public static void selectValue(WebElement element,String value) {
		Select s =new Select(element);
		s.selectByValue(value);
	}
	//Select by Visible text
	public static void selectVisibleText(WebElement element,String visiText) {
		Select s= new Select(element);
		s.selectByVisibleText(visiText);
	}
	private void isSelectedMethod() {
		// TODO Auto-generated method stub

	}
}
