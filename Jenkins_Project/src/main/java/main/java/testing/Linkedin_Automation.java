package main.java.testing;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Linkedin_Automation {
	static WebDriver driver;
	
	@Test
	public void openBrowser() throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Downloads\\chromedriver.exe");  
		
		
        
        // Instantiate a ChromeDriver class.     
   driver=new ChromeDriver();  
   driver.manage().deleteAllCookies();
      // Launch Website  
   driver.get("https://www.linkedin.com/uas/login?session_redirect=https%3A%2F%2Fwww%2Elinkedin%2Ecom%2Fsearch%2Fresults%2Fpeople%2F%3FgeoUrn%3D%255B%2522103644278%2522%255D%26keywords%3DA%26origin%3DFACETED_SEARCH&fromSignIn=true&trk=cold_join_sign_in"); 

   driver.manage().window().maximize();
   
   driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("-");
   
   driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("-");
   
   driver.findElement(By.xpath("(.//*[text()='Sign in'])[2]")).click();
   
   for (int l=0; l<100;l++){
	   
   
   
   Thread.sleep(6000);
	 
   List<WebElement> elements = driver.findElements(By.xpath(".//*[@class='pv2 artdeco-card ph0 mb2']"));
   for (int i=0; i<elements.size();i++){
	      System.out.println("Radio button text:" + elements.get(i).getText());
	    }
   scroll();
  
	  }
   
   
	}
	public static void scroll() throws InterruptedException
	{
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;

	        // Launch the application		

	        //This will scroll the web page till end.		
	        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	        Thread.sleep(3000);
	        driver.findElement(By.xpath(".//*[text()='Next']")).click();
	        Thread.sleep(3000);
	}
	
	
}
