package com.runnableclass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.baseandpom.BaseClass;
import com.baseandpom.PlaceOrderPOM;

public class PlaceOrder extends BaseClass{
	public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
		driver = browserLaunch("Chrome");
		getMethod("http://automationpractice.com/index.php");
		PlaceOrderPOM ppom = new PlaceOrderPOM(driver);
		// SignIn
		
		clickTheElement(ppom.getSignIn());
		inputValues(ppom.getEmail(), "dp22@gmail.com");
		inputValues(ppom.getPassword(), "dp@17");
		
		// Login
		clickTheElement(ppom.getSubmit());
		
		// Women
		// Dresses -->Evening Dress//MouseActions
		moveElementMethod(ppom.getWomen());
		impWait(5);
		clickMethod(ppom.getEveDress());
		impWait(6);

		// quickView
		clickTheElement(ppom.getQuickView());
		impWait(30);
		framesIndex(0);
		
		// quantity + button
		clickTheElement(ppom.getQuantity());

		// size
		//selectValue(ppom.getSize(), "2");
		// Addtocart
		clickTheElement(ppom.getAddToCart());
		exitFrame();
		
		//1.SUMMARY
		impWait(30);
		clickTheElement(ppom.getProceedToChkOut());

		//2.SignIn
		clickTheElement(ppom.getProCart());
		impWait(20);
		
		//3.ADDRESS
		clickTheElement(ppom.getAddressProCart());

		//4.SHIPPING
		// terms and condition check box
		clickTheElement(ppom.getTerms());
		impWait(10);
		
		//Proceed to checkout
		clickTheElement(ppom.getShipProCart());
		impWait(17);
		
		//5.PAYMENT
		// Cheque
		clickTheElement(ppom.getCheque());
		
		// ConfirmOrder
		clickTheElement(ppom.getConfirmOrder());
		impWait(18);
		
		// Screenshot:
		screenShotMethod("C:\\Users\\lenovo\\eclipse-workspace\\MiniProjectMaven\\Screenshots\\PlaceOrder.png");
	}
	

}
