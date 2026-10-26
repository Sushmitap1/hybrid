package Automation;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;


public class Testcase {

@Test	
	public void workbook() throws EncryptedDocumentException, IOException
	{
		
		
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.kesari.in/Deals");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		/*FileInputStream file =new FileInputStream("E://test.xlsx");
		Workbook wc =WorkbookFactory.create(file);
		org.apache.poi.ss.usermodel.Sheet sheet =wc.getSheet("test");
		Row row =sheet.getRow(2);
		org.apache.poi.ss.usermodel.Cell cell =row.getCell(0);
		String data = cell.getStringCellValue();
		wc .close();
		file.close();*/
		
		
		
		
		
		
		FileInputStream file =new FileInputStream("E://test.xlsx");
		Workbook wc =WorkbookFactory.create(file);
		org.apache.poi.ss.usermodel.Sheet sheet =wc.getSheet("test");
		Row row =sheet.getRow(4);
		org.apache.poi.ss.usermodel.Cell cell =row.getCell(0);
		String data =cell.getStringCellValue();
		wc.close();
		file.close();
		
		try {
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement  login =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//inp[@id='checbox1'])[1]")));
		login.sendKeys(data);
		
		
		}
		catch(org.openqa.selenium.TimeoutException e)
		{
			throw new SkipException("");
			
		}
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

