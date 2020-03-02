package com.cucumber.helper;

import java.io.IOException;

public class FileReaderManager {
	
	private FileReaderManager() {
		
	}
	
	public static FileReaderManager getInstance() {
		FileReaderManager f=new FileReaderManager();
		return f;
		
	}

	public ConfigurationReader getInstanceCR() throws IOException {
		ConfigurationReader cr=new ConfigurationReader();
		return cr;
	}
	
	
	
}
