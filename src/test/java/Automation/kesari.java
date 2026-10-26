package Automation;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.util.concurrent.TimeoutException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.SkipException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class kesari  extends grpData{
	
@Test
public void tour() throws Exception
{
	
	
	/*String[][] grpplace =
		{
				
				{"Gujarati Special"},
				{"Chhota Break"},
				{"Second Innings"},
				
		};

	for(int i=0;i<grpplace.length;i++)
	{
	
	WebElement  special =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='"+grpplace[i][0]+"']")));
	special.click();
	
	
	}*/
	
	// //a[text()='Gujarati Special'] 
	
	
	
	Thread.sleep(3000);
	WebElement  special =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title=' Chhota Break']")));
	special.click();
	
	
	
	String[][] grpplace =
		{
		
				
				{"Andaman"},
				{"Chardham"},
				{"Goa"},
				
		};
	Thread.sleep(3000);
	
	for(int i=0;i<grpplace.length;i++)
	{
		Thread.sleep(3000);
	WebElement  story =wait.until(ExpectedConditions.elementToBeClickable( By.xpath("//span[normalize-space()='" + grpplace[i][0] + "']")));
	story.click();
	}		
			
	
			
			/*Thread.sleep(3000);
	WebElement  story =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h2[text()=' My Kesari Story ! ']")));

	
	Thread.sleep(3000);*/
	
	
	
	
	/*Thread.sleep(3000);
	JavascriptExecutor scroll=(JavascriptExecutor)driver;
	scroll.executeScript("arguments[0].scrollIntoView({block:'center'});",story);
	
	 
	Thread.sleep(3000);
	TakesScreenshot screen=(TakesScreenshot)driver;
	File dir = new File("E://react1");
	File name = new File(dir,"test3.png");
	File GetFile=screen.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile( GetFile,name);
	
	

	Thread.sleep(3000);
	WebElement  bscroll =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[text()=' Luxury Tour Experiences Tours (3 Tour Option)']")));
	
	
	Thread.sleep(3000);
	JavascriptExecutor scrollbck=(JavascriptExecutor)driver;
	scrollbck.executeScript("arguments[0].scrollIntoView({block:'center'});",bscroll);
	*/
	
	Thread.sleep(3000);
	try
	{
	WebElement  japan =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[text=' Exotic Japan - Luxury Tour '])[1] ")));
	Thread.sleep(3000);
	Actions act =new Actions(driver);
	act.clickAndHold(japan).perform();
	Thread.sleep(3000);
	act.release(japan).perform();
	}
	
	catch(org.openqa.selenium.TimeoutException ex)
	{
		
		throw new Exception("know");
		
	}
	/*Thread.sleep(3000);
	String text1 =japan.getText();
	Thread.sleep(3000);
	System.out.println(text1);
	
	
	String text2 ="japan";
	SoftAssert asst =new SoftAssert();
	
	asst.assertEquals(text1,text2);
	
	
	*/
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	





}//class
