package com.properties;

import java.io.IOException;

public class FileReadManager {
	public FileReadManager() {
		
	}
	public static FileReadManager geInstantFRM() {
		FileReadManager frm = new FileReadManager(); 
		return frm;
		
	}
	public static ConfigReader getInstanceCR() throws IOException {
		ConfigReader cr= new ConfigReader();
		return cr;
		
	}

}
