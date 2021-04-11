package main.java.testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class OptionChainDeleteCookies {
	static WebDriver driver;
	
	@Test
	public void OptionChainData() throws InterruptedException, FileNotFoundException {
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Downloads\\chromedriver.exe");  
		
		
        
        // Instantiate a ChromeDriver class.     
   driver=new ChromeDriver();  
     
      // Launch Website  
   driver.navigate().to("https://www.nseindia.com/option-chain"); 
   
   driver.manage().window().maximize();
   
   driver.manage().deleteAllCookies();
   
   driver.findElement(By.id("equity_optionchain_select")).click();
    
    
    
    driver.manage().deleteAllCookies();
    String BANKNIFTY;
    
    driver.findElement(By.xpath("//*[contains(text(),'BANKNIFTY')]")).click();
    driver.manage().deleteAllCookies();
    
    wait(".//*[@id='downloadOCTable']");
    
  //  driver.findElement(By.id("downloadOCTable")).click();
    driver.findElement(By.xpath(".//*[@id='downloadOCTable']")).click();
    
    
    driver.findElement(By.xpath(".//*[text()='Invest']")).click();
   
   // rename();

	}
	/*
public static void rename() throws FileNotFoundException
{
	

	File sdcard = new File("C:\\Users\\Ramesh\\Downloads\\");
	
	File folder = new File("C:\\Users\\Ramesh\\Downloads\\");
	
	
	
	File from = new File(sdcard,"option-chain-ED-BANKNIFTY-01-Apr-2021.csv");
	File to = new File(folder,"to.csv");
	from.renameTo(to);
	write();
	}
public static void write() throws FileNotFoundException 
{ FileInputStream fil;
Workbook wb = null; 
	try
  	{
  	fil=new FileInputStream("C:\\Users\\Ramesh\\Downloads\\to.csv");
     wb=WorkbookFactory.create(fil);
    }catch(Exception ex)
  	{
  		ex.printStackTrace();
  
  	}
	
	
	
	
	
	
	
String filepath= ("C:\\Users\\Ramesh\\Downloads\\to.csv");
File file= new File(filepath);
FileOutputStream fos=new FileOutputStream(file);
   
Workbook wbq= new XSSFWorkbook();
   

int u=0;
int row= wb.getSheetAt(0).getLastRowNum();


// Setting cell formula and cell type
Cell cell = null;
cell.setCellFormula("SUM(B2:B95)");
//setCellFormula(SUM(B2:B95)), 
//cell.setCellType(Cell.CELL_TYPE_FORMULA);



}
*/
	
	public void wait(String element)
	{
		
		WebDriverWait w = new WebDriverWait(driver,3);
	      // presenceOfElementLocated condition
	      w.until(ExpectedConditions.presenceOfElementLocated (By.xpath(element)));
		
	}

}
