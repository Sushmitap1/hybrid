package Automation;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class group {
	private WebDriver driver;
	private WebDriverWait wait ;	
	
	
	
	private By searchtype=By.xpath("(//input[@id='checbox1'])[1]");
	private By popup=By.xpath("//button[@aria-label='Close'and @class='popup-close']");
	private By grp =By.xpath("//span[@id='adventurestylesDropdown']");
	
	
	
	
	
	public group( WebDriver driverbowse, WebDriverWait waittime)
	{
		
		this.driver =driverbowse;
		this.wait =waittime;
		
	}
	
	
	
	
	
	
	
	
	public void resuablebase() throws InterruptedException
	{
	WebElement  search =wait.until(ExpectedConditions.elementToBeClickable(searchtype));
	search.sendKeys("rajasthan");
	search.clear();
	Thread.sleep(3000);
	
	WebElement  poup =wait.until(ExpectedConditions.elementToBeClickable(popup));
	poup.click();	
	Thread.sleep(3000);
	
	WebElement  sptour =wait.until(ExpectedConditions.elementToBeClickable(grp));
	sptour.click();
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
