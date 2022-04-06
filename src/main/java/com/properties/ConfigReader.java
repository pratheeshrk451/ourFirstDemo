package com.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	public static Properties property;
	
	public ConfigReader() throws IOException {
		File f = new File("src\\main\\java\\com\\properties\\data.properties");
		FileInputStream fi = new FileInputStream(f);
		property = new Properties();
		property.load(fi);
	}
public static String getName() {
	String name =property.getProperty("userName");
	return name;
}
public static String getPassword() {
	String pass = property.getProperty("password");
	return pass;	
}
public static String getFirstName() {
	String firstName = property.getProperty("firstName");
	return firstName;
}
public static String getLastName() {
	String lastName = property.getProperty("lastName");
	return lastName;
}
public static String getBillingAdress() {
	String billingAdress = property.getProperty("billingAdress");
	return billingAdress;
}
public static String creditCardNo() {
	String creditCardNo = property.getProperty("creditCardNo");
	return creditCardNo;


}
public static String cvvNo() {
	String cvvNo = property.getProperty("cvvNo");
	return cvvNo;
}

}