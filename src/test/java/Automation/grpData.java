package Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class grpData
{
	public WebDriver driver;
	public WebDriverWait wait ;
	@BeforeClass
	public void website() throws InterruptedException
	{
		
		
		driver=new ChromeDriver();
		driver.get("https://www.kesari.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		 wait =new WebDriverWait(driver, Duration.ofSeconds(30));
		
		 group grp =new group(driver ,wait);
		 grp.resuablebase();
		 
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
