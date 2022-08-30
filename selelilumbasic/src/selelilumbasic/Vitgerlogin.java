package selelilumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vitgerlogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String currentWorkingDir=System.getProperty("user.dir");/*F:\\JavaWorkspace\\SeleniumTesting*/
		String chromeExePath=currentWorkingDir+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		//ChromeDriver cdriver=new ChromeDriver(); //or
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		// enter url
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		// set url
		String currenturl=driver.getCurrentUrl();
		String expectedurl="https://demo.vtiger.com/vtigercrm/index.php";
		System.out.println("current url and epected url="+currenturl.equals(expectedurl));
		// title
		String pagetitle= driver.getTitle();
		String expectedtitle = "vtiger";
		System.out.println("pagetitle and expected title="+pagetitle.equals(expectedtitle));
		//page source
		String pagesource= driver.getPageSource();
		System.out.println("print page source count="+pagesource.length());
		//identify user nme field
		WebElement username= driver.findElement(By.id("username"));
		// perform required operation
		username.clear();
		username.sendKeys("admin");
		// identify for password by findelement
		WebElement password= driver.findElement(By.name("password"));
		// perform required field
		password.clear();
		password.sendKeys("Test@123");
//		perform lfro cliclbutton
		WebElement clickbutton= driver.findElement(By.className("buttonBlue"));
		//
		clickbutton.click();
		driver.close();
	}

}
/*Admin Acceleration9:04 AM
Perform following operations on the application
1. Open any browser
2. Enter the url as https://opensource-demo.orangehrmlive.com/
3. Verify login page elements


Perform following operations on the application
1. Open any browser
2. Enter the url as https://demo.actitime.com/login.do
3. Verify login page elements

Perform following operations on the application
1. Open any browser
2. Enter the url as https://opensource-demo.orangehrmlive.com/
3. verify login page
4. enter username and password
*/