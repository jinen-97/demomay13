package selelilumbasic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandelingDropdown {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// RELATABLE PATH
				FileInputStream file = new FileInputStream(".\\properties\\handelingdropdown.properties");
				//instance of property
				Properties prop = new Properties();
				// load property
				prop.load(file);
				//read property
		String driverKey=prop.getProperty("driverKey");
		String executablePath=prop.getProperty("driverExecutablePath");
		String applicationUrl=prop.getProperty("appUrl");
		String month = prop.getProperty("month");
		
		String chromeExePath=System.getProperty("user.dir")+executablePath;
		//setting the path for driver executable
		System.setProperty(driverKey, chromeExePath);
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		//to enter required application URL use get() of WebDriver interface
		driver.get(applicationUrl);
		
		//from here dropdown steps
		
		//**** Identify dropdown list
		WebElement skillDropdown=driver.findElement(By.id("Skills"));
		//**** Create an instance of Select class and pass above element into its constructor
		Select selectSkill=new Select(skillDropdown);
		//**** check whether dropdown is multiselect dropdown or not
		System.out.println("Is dropdown is allowing you to select multiple option: "+selectSkill.isMultiple());
		
		//**** get default or already select option
//		WebElement selectedOption=selectSkill.getFirstSelectedOption();
//		String selectedOptionName=selectedOption.getText();
//		System.out.println("Already selected option name: "+selectedOptionName);
					//or
		System.out.println("Already selected option name: "+selectSkill.getFirstSelectedOption().getText());
		
		// for countries
		//**** Identify dropdown list
				WebElement countries=driver.findElement(By.id("countries"));
				// instance for select for countires 
				Select countriesselect = new Select(countries);
				//**** check whether dropdown is multiselect dropdown or not
				System.out.println("Is dropdown is allowing you to select multiple option: "+countriesselect.isMultiple());
				
				// select optipon form dropdown countries
				countriesselect.selectByIndex(0);
				System.out.println("Already selected option name: "+countriesselect.getFirstSelectedOption().getText());
	//countriesselect.selectByIndex(0);
		//System.out.println("Already selected option name: "+countriesselect.getFirstSelectedOption().getText());
		
		// identifier dropdown for slect countries
		WebElement country = driver.findElement(By.id("country"));
		//instance 
		Select countryselect = new Select(country);
		//whether dropdown is multiple
		
		// slect option by index
		countryselect.selectByIndex(2);
		System.out.println("Already selected option name:"+countryselect.getFirstSelectedOption().getText());
		
		//for date
		// step1- identifier
		WebElement year = driver.findElement(By.id("yearbox"));
		// instance of 
		Select yearinput = new Select(year);
		// OPTION BY VISILBE value
		yearinput.selectByValue("1997");
		System.out.println("Already selected option value: "+yearinput.getFirstSelectedOption().getText());
		
		// for month
		WebElement Month = driver.findElement(By.cssSelector("select[ placeholder='Month']"));
		// instance of select
		Select monthselect = new Select(Month);
		//select by value
		monthselect.selectByValue("March");
		System.out.println("already select value-"+monthselect.getAllSelectedOptions());
		System.out.println("already select value-"+monthselect.getFirstSelectedOption().getText());
		// print all value
		List<WebElement> options=monthselect.getOptions();
		System.out.println("Option count is:"+options.size());
		//Get dropdown option names
		for(int i=0;i<options.size();i++) {
			System.out.println("Option "+i+": "+options.get(i).getText());
		}
		
		
		
		//select options from dropdown
	    selectSkill.selectByIndex(4);
		System.out.println("Already selected option name: "+selectSkill.getFirstSelectedOption().getText());
				//or
		//selectSkill.selectByValue("Backup Management");
		System.out.println("Already selected option name: "+selectSkill.getFirstSelectedOption().getText());
				//or
		//selectSkill.selectByVisibleText("Analytics");
		System.out.println("Already selected option name: "+selectSkill.getFirstSelectedOption().getText());
		
}
}
		//TODO: perform validation on following
		//1. Year(ascending order validation)
		//2. Month(month Sequence validation)
		//3. Days(ascending order validation)
	

