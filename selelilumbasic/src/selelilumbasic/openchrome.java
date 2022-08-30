package selelilumbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openchrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1st type absoulute path
		//String driverpath1="E:\\accelerationeclipse\\selelilumbasic\\executables\\chromedriver.exe";
		
		//2nd type or Relative path --> '.' indicate current working dir
		
		//String driverPath2=".\\executables\\chromedriver.exe";
		
		// using System class
			String driverPath3=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
				
				
				//Set the driver executable path using System.setProperty(String key,String value)
				System.setProperty("webdriver.chrome.driver", driverPath3);
				//create an instance of required browser class
				WebDriver driver=new ChromeDriver();
				//enter the URL
				driver.get("https://www.google.com");
			
				
	}

}
