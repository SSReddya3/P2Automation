 package S1_SeleniumCommands;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import io.github.bonigarcia.wdm.WebDriverManager;
public class A5_Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver ss=new ChromeDriver();
	
	Thread.sleep(4000);	
	
//Browser maximizeing
	ss.manage().window().maximize();
	
//Browser Commands
	ss.get("https://demo.guru99.com/test/newtours/register.php");
	
	System.out.println("1) CurrentUrl ..= "+ss.getCurrentUrl());
	System.out.println("2) Title ..= "+ ss.getTitle());
//ScrollDown	
		 JavascriptExecutor js = (JavascriptExecutor) ss;
	        js.executeScript("window.scrollBy(0,500)");
	
//Dropdown
	
	        
	org.openqa.selenium.support.ui.Select drpCountry = new org.openqa.selenium.support.ui.Select(ss.findElement(By.name("country")));
	drpCountry.selectByVisibleText("INDIA");
	Thread.sleep(2000);
	drpCountry.selectByIndex(10);
	Thread.sleep(2000);
	drpCountry.selectByValue("RUSSIA");
	Thread.sleep(2000);
	
	
	ss.close();	
	
		
		
		
		
		
	
		
		
		
		
	}

}
