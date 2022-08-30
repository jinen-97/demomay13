package selelilumbasic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openchromebrowser {

	public static void main(String[] args) {
		/**
		 * Step1: set the path of required browser executable file using System.setProperty(key, value)
		 * Step2: create an instance of required browser class
		 */
		System.setProperty("webdriver.chrome.driver","E:\\accelerationeclipse\\selelilumbasic\\executables\\chromedriver.exe");
		
		ChromeDriver cdriver=new ChromeDriver();
		//WebDriver cdr = new ChromeDriver();
		//to enter the url on the open browser
		cdriver.get("https://www.google.com");
		
		//expected page url
		String expectedUrl="https://www.google.com";
		//get the entered URL from the opened browser
		String appCurrentUrl=cdriver.getCurrentUrl();	
		// print current and expected url
		System.out.println("Actaul URL:"+appCurrentUrl);
		System.out.println("Expected URL: "+expectedUrl);
		System.out.println("expected url compare current url="+appCurrentUrl.contains(expectedUrl));
		// expected page title
		String pagetitle= cdriver.getTitle();
		// expected title
		String expectedtitle= "Google";
		// compare expected and current page title
		System.out.println("expexted title and curent title="+pagetitle.contains(expectedtitle));
		// source content length
		String sourcecontent=cdriver.getPageSource();
		System.out.println("get page source length="+sourcecontent.length());
		//close the current browser
		cdriver.close();
	}

}
