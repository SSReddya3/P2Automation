package S1_SeleniumCommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.support.ui.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A_SeleniumCommands {

	public static void main(String[] args) throws InterruptedException {

		
		

		
		
	//Open the Browser	
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new  ChromeDriver(); 
		
	
		
		
	//Browser Commands for Operating the WebPage. Some of Browser commands are Get(),GetTitle(),GetCurrentUrl();,GetPageSource()Close(),Quit().
		
		driver.get("https://book.spicejet.com/");// it use uesed to open the Web Applicartion
			
			String title=	driver.getTitle(); // used to get title of the Curent Page
			String url=	driver.getCurrentUrl();
			String ps=	driver.getPageSource();
				
			System.out.println("Title of the Page := "+title);
			System.out.println("CurrentUrl of the Page := "+url);
			//System.out.println("Title of the Page := "+ps);
			
			driver.findElement(By.xpath("//a[normalize-space()='SME Travellers']")).click();
			
			driver.close();	
	// Here close() Command will be use to close the only Single Web Page Only.
			
	// Waits Concept
			
			Thread.sleep(1000);
           driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
			WebDriverWait wait= new WebDriverWait(driver, 10);
			
	//Browser Commands 2		
			driver.get("https://book.spicejet.com/");
		
		System.out.println("Title of the Page := "+driver.getTitle());
		System.out.println("CurrentUrl of the Page := "+driver.getCurrentUrl());
		//System.out.println("Title of the Page := "+driver.getPageSource());
		 
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='SME Travellers']")));

		driver.findElement(By.xpath("//a[normalize-space()='SME Travellers']")).click();
		
		driver.quit();
	// Here quit() Command will be use to close the all the Web Pages .
		
		
           
		
	}

}
