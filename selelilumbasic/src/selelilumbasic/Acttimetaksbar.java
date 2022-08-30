package selelilumbasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Acttimetaksbar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		//setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		//to enter required application URL use get() of WebDriver interface
		driver.get("https://demo.actitime.com");
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		WebElement userNameInputField=driver.findElement(By.id("username"));
		userNameInputField.clear();
		userNameInputField.sendKeys("admin");
		
		WebElement passwordInputField=driver.findElement(By.name("pwd"));
		passwordInputField.sendKeys("manager");
		
		WebElement loginButton=driver.findElement(By.id("loginButton"));
		loginButton.click();
	
	WebElement taskbutton= driver.findElement(By.cssSelector(".content.tasks"));
	taskbutton.click();
	
	WebElement addnewbutton= driver.findElement(By.cssSelector(".addNewButton"));
	addnewbutton.click();
	
	WebElement addnewtask= driver.findElement(By.cssSelector(".item.createNewTasks"));
	addnewtask.click();
	
	//driver.findElement(By.cssSelector(".projectSelector .selectedItem")).click();
	
	//driver.findElement(By.cssSelector(".projectSelector .searchItemList>*:nth-child(4)")).click();
	
	driver.findElement(By.cssSelector("input[placeholder='Enter task name']")).sendKeys("Testing");

	driver.findElement(By.cssSelector(".components_checkboxContainer.checkboxContainer:nth-of-type(1)")).click();

	
	
	
	
	}

}
