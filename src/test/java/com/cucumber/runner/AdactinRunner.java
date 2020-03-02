package com.cucumber.runner;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


import com.cucumber.base.BaseClass;
import com.cucumber.helper.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;




@RunWith(Cucumber.class)

@CucumberOptions(features ="src\\test\\java\\com\\cucumber\\feature", 
				glue = "com\\cucumber\\stepdefinition",
				tags = {"@login,@logout"},
				plugin = {"com.cucumber.listener.ExtentCucumberFormatter:Report/cucumberExtent.html","html:Report"},
				strict = true,
				dryRun = false,
				monochrome = true)

public class AdactinRunner {
	
	public static WebDriver driver;


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@BeforeClass
	public static void setup() throws IOException {
		
		driver=BaseClass.browserLaunch(FileReaderManager.getInstance().getInstanceCR().getBrowser());
		
		
	}
	
	
	
	
	
}
