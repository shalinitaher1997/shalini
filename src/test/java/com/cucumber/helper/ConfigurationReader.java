package com.cucumber.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	
	public static Properties p;
	
	public ConfigurationReader() throws IOException {
		File f=new File("E:\\WorkSpace\\Cucumber\\src\\test\\java\\com\\cucumber\\properties\\Configuration.properties");
		FileInputStream fis=new FileInputStream(f);
		p=new Properties();
		p.load(fis);
	}

	public String getBrowser() {
		String browsername = p.getProperty("browsername");
		return browsername;
	}
	
	public String getUrl() {
		String url = p.getProperty("url");
		return url;
	}
	
	public String getUsername() {
		String username = p.getProperty("dbUsername");
		return username;
	}
	
	public String getPassword() {
		String password = p.getProperty("dbPassword");
		return password;
	}
	
}
