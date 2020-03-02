package com.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {
	
	private WebDriver driver;
	
	@FindBy(id="radiobutton_0")
	private WebElement selectRadio;
	
	@FindBy(id="continue")
	private WebElement continueButton;
	
	public SelectHotel(WebDriver driver3) {
		this.driver=driver3;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSelectRadio() {
		return selectRadio;
	}
	
	public WebElement getcontinueButton() {
		return continueButton;
	}
	
	

}
