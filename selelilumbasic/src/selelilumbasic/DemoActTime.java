package selelilumbasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoActTime {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/**
		 * Step1: set the path of required browser executable file using System.setProperty(key, value)
		 * Step2: create an instance of required browser class
		 */
		System.setProperty("webdriver.chrome.driver","E:\\accelerationeclipse\\selelilumbasic\\executables\\chromedriver.exe");
		
		ChromeDriver cdriver=new ChromeDriver();
		//to enter the url on the open browser
		cdriver.get("https://demo.actitime.com/login.do");
		
		//implicit wait
				cdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
		
		//set url 
		String Pageurl= cdriver.getCurrentUrl();
		String expectedurl="https://demo.actitime.com/login.do";
		System.out.println("page url and expected url="+ Pageurl.equals(expectedurl));
		
		// title 
		String pagetitle = cdriver.getTitle();
		String expectedtitle="actiTIME - Login";
		System.out.println("print title length="+pagetitle.length());
		System.out.println("page title and expected title="+pagetitle.equals(expectedtitle));
	
		// page source
		String pagesource = cdriver.getPageSource();
	System.out.println("print page source ="+pagesource.length());
	//find element
	WebElement username=cdriver.findElementById("username");
	username.sendKeys("admin");
	//find element password
	WebElement password=cdriver.findElementByName("pwd");
	password.sendKeys("manager");
	//login check box
	WebElement checkbox= cdriver.findElementById("keepLoggedInCheckBox");
	checkbox.click();
	// find eement for login
	WebElement login=cdriver.findElementById("loginButton");
	login.click();
	
	//explicit wait(static wait)
			Thread.sleep(5000);
			
			
	//home page page validation
	String homePageTitle=cdriver.getTitle();
	System.out.println("Home page title: "+homePageTitle);
	System.out.println("Home page validation status: "+homePageTitle.equals("actiTIME - Enter Time-Track"));
	//explicit wait(static wait)
	//Thread.sleep(5000);
	
	
	//logout
	WebElement logout=cdriver.findElementById("logoutLink");
	logout.click();
	
	
	
	
	}

}
