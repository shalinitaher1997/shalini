package com.cucumber.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.pom.ItineraryClass;
import com.cucumber.pom.LoginClass;
import com.cucumber.pom.Logout;
import com.cucumber.pom.PersonalInfo;
import com.cucumber.pom.SearchHotel;
import com.cucumber.pom.SelectHotel;


public class PageObjectManager {
	
	private WebDriver driver;
	private  LoginClass lc;
	private PersonalInfo pi;
	private SearchHotel sh;
	private SelectHotel sl;
	private ItineraryClass ic;
	private Logout lo;
	
	public PageObjectManager(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}
	
	
	public LoginClass getLogin() {

		 lc=new LoginClass(driver);
		
		 return lc;
	}
	
	public PersonalInfo getPersonalInfo() {
		
		pi=new PersonalInfo(driver);
		
		return pi;

	}
	
	public SearchHotel getSearchHotel() {

		  sh=new SearchHotel(driver);
		  return sh;

		
	}
	
	public SelectHotel getSelectHotel() {
		
		  sl=new SelectHotel(driver);
		  return sl;


	}
	
	public ItineraryClass getItinerary() {
		
		  ic=new ItineraryClass(driver);
		  return ic;


	}
	
	public Logout getLogout() {
		
		  lo=new Logout(driver);
		  return lo;


	}

	
	
}
