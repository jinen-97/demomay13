package selelilumbasic;

import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Step1: set the path of required browser executable file using System.setProperty(key, value)
		 * Step2: create an instance of required browser class
		 */
		System.setProperty("webdriver.chrome.driver","E:\\accelerationeclipse\\selelilumbasic\\executables\\chromedriver.exe");
		
		ChromeDriver cdriver=new ChromeDriver();
		//to enter the url on the open browser
		cdriver.get("https://www.flipkart.com");
		
		// input expected url
		String pageURL=cdriver.getCurrentUrl();
		String expectedURL="https://www.flipkart.com/";
		System.out.println("Page URL validation: "+pageURL.equals(expectedURL));
		// title expected 
		String pagetitle= cdriver.getTitle();
		String expectedtitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
	System.out.println("page title and expected tile ="+pagetitle.contains(expectedtitle));
	}

}
