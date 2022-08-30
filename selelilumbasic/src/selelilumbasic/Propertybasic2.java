package selelilumbasic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Propertybasic2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// relatable path
FileInputStream file = new FileInputStream(".\\properties\\texr1.properties");
	// instance of proprty
Properties prop = new Properties();
// load property file using load()
prop.load(file);
// read method
System.out.println("key"+prop.getProperty("key"));
//String driverKey=prop.getProperty("driverKey");
System.out.println("FirstName"+prop.getProperty("FirstName"));
System.out.println("LastName"+prop.getProperty("LastName"));
System.out.println("Emailid"+prop.getProperty("Emailid"));
// upate value
//to wrote content into the file use setProperty()
		prop.setProperty("Subject3", "Selenium-Java");
		prop.setProperty("Subject4", "QTP-JavaScript");
		// file output setup
		FileOutputStream file1= new FileOutputStream(".\\properties\\texr1.properties");
		//add sentence
	prop.store(file1, "new value");
	}

}
