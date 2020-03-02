package hooksPackage;

import java.io.IOException;

import com.cucumber.base.BaseClass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends BaseClass {
	
	@Before
	public void beforeHooks (Scenario scenario) {
		System.out.println("Name: "+scenario.getName());
	}

	
	@After
	public void afterHooks(Scenario scenario) throws IOException {
		System.out.println("Status: "+scenario.getStatus());
		
		if (scenario.isFailed()) {
			getScreenshot("E:\\WorkSpace\\CucumberProject\\Screenshot");
			
		}
	}
}
