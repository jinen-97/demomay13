package selelilumbasic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;




public class Propertbasic {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// relatable path
FileInputStream file = new FileInputStream(".properties\\text.properties");
	// instance of proprty
Properties prop = new Properties();
// load property file using load()
prop.load(file);
// read method
System.out.println("key"+prop.getProperty("key"));
System.out.println("FirstName"+prop.getProperty("FirstName"));
System.out.println("LastName"+prop.getProperty("LastName"));
System.out.println("Emailid"+prop.getProperty("Emailid"));
// 


	}

}
