package com.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	
	private WebDriver driver;

	
	@FindBy(linkText="Logout")
	private WebElement logout;
	
	

	public Logout(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}



	public WebElement getLogout() {
		return logout;
	}

}
