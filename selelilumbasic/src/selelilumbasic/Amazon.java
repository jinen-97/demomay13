package selelilumbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String path1 = System.getProperty("user.dir")+ "\\executables\\chromedriver.exe";
System.setProperty("webdriver.chrome.driver", path1);
// instance 
WebDriver b1 = new ChromeDriver();
// enter url 
b1.get("https://www.amazon.in");
// set url
String currenturl= b1.getCurrentUrl();
String expectedurl= "https://www.amazon.in/";
System.out.println("expected url and current url="+currenturl.contains(expectedurl));
// title 
String pagetitle= b1.getTitle();
String expectedtitle= "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
System.out.println("page title and expected title="+ pagetitle.contains(expectedtitle));
System.out.println("length title+"+pagetitle.length());
//source page
String sourcepage = b1.getPageSource();
System.out.println("page source count="+sourcepage.length());
// close
b1.close();
	}

}
