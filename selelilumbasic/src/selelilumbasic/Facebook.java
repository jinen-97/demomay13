package selelilumbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// using system class
String path2 = System.getProperty("user.dir")+ "\\executables\\chromedriver.exe";
System.setProperty("webdriver.chrome.driver", path2);
// instance of web driver
WebDriver d1 = new ChromeDriver();


//enter url
d1.get("https://www.facebook.com");

// set url
String currenturl= d1.getCurrentUrl();
String expectedurl= "https://www.facebook.com";

// page title 
String currenttitle= d1.getTitle();
String expectedtitle="Facebook – log in or sign up";
System.out.println("page title and expected title="+currenttitle.contains(expectedtitle));
// page count 
String pagesource=d1.getPageSource();

	}

}
