package selelilumbasic;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String chromeExePath = System.getProperty("user.dir") + "\\Executables\\chromedriver.exe";
		// setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		// creating an instance of Chrome browser and up-casting it to WebDriver
		// interface
		WebDriver driver = new ChromeDriver();
		// maximize browser window
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// to enter required application URL use get() of WebDriver interface
		driver.get("https://www.google.com/");
		//
		driver.findElement(By.name("q")).sendKeys("selenium interview questions");
		//
		List<WebElement> sugg= driver.findElements(By.cssSelector("ul>li>div>div:nth-of-type(2)>div:nth-of-type(1)>span"));
		
		System.out.println("Suggestion count:" +sugg.size());
		
		//print suggestions in the console
				for(int i=0;i<sugg.size();i++) {
					WebElement element=sugg.get(i);
					System.out.println(element.getText());
	}

	}
}
