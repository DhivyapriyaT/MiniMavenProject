package com.baseandpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrderPOM {
	public static WebDriver driver;
	
	public PlaceOrderPOM(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	@FindBy(xpath="//a[@class='login']")
	private WebElement signIn;
	 
	@FindBy(id="email")
	private WebElement email;

	@FindBy(name="passwd")
	private WebElement password;
	 
	@FindBy(name="SubmitLogin")
	private WebElement submit;
	
	@FindBy(xpath="//a[@title='Women']")
	private WebElement women;
	 
	@FindBy(xpath="//a[@title='Evening Dresses']")
	private WebElement eveDress;
	
	@FindBy(xpath="(//img[@class='replace-2x img-responsive'])[2]")
	private WebElement quickView;
	 
	@FindBy(xpath="//i[@class='icon-plus']")
	private WebElement quantity;
	
	@FindBy(xpath="//select[@name='group_1']")
	private WebElement size;
	 
	@FindBy(name="Submit")
	private WebElement addToCart;
	
	@FindBy(xpath="//a[@class='btn btn-default button button-medium']")
	private WebElement proceedToChkOut;
	 
	@FindBy(xpath="//span[text()='Proceed to checkout']")
	private WebElement proCart;

	@FindBy(xpath="//span[text()='Proceed to checkout']")
	private WebElement addressProCart;
	 
	@FindBy(name="cgv")
	private WebElement terms;
	
	@FindBy(name="processCarrier")
	private WebElement shipProCart;
	
	@FindBy(xpath="//a[@class='cheque']")
	private WebElement cheque;

	@FindBy(xpath="//span[text()='I confirm my order']")
	private WebElement confirmOrder;
	public WebElement getSignIn() {
		return signIn;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getWomen() {
		return women;
	}

	public WebElement getEveDress() {
		return eveDress;
	}

	public WebElement getQuickView() {
		return quickView;
	}

	public WebElement getQuantity() {
		return quantity;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}

	public WebElement getProceedToChkOut() {
		return proceedToChkOut;
	}

	public WebElement getProCart() {
		return proCart;
	}

	public WebElement getAddressProCart() {
		return addressProCart;
	}

	public WebElement getTerms() {
		return terms;
	}

	public WebElement getShipProCart() {
		return shipProCart;
	}

	public WebElement getCheque() {
		return cheque;
	}

	public WebElement getConfirmOrder() {
		return confirmOrder;
	}

}
