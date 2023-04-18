 package S1_SeleniumCommands;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.*;

import io.github.bonigarcia.wdm.WebDriverManager;
public class google {

	public static void main(String[] args) throws InterruptedException  {
		
		String firstName="siva";
		String lastName="rama";
		String phone="234569870 ";
		String username="sivarama";
		String address1="ramcvfs";
		String city="sadxzc ";
		String state="asdcvfad";
		String postalCode="502360";
		String Contry="INDIA";
		
		String password="2140Ram";
		String repeatedPassword="2140Ram";
		
		
		
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver ss=new ChromeDriver();
	
	Thread.sleep(4000);	
	
	//Browser maximizeing
	ss.manage().window().maximize();
	
	//Browser Commands
	ss.get("https://www.google.com/");
	
	
	System.out.println("1) CurrentUrl ..= "+ss.getCurrentUrl());
	System.out.println("2) Title ..= "+ ss.getTitle());
	
	
	
	
//	ss.findElement(By.className("gLFyf")).sendKeys("Hi google");
//	Thread.sleep(1000);	 
//	ss.findElement(By.className("gLFyf")).clear();
//	
	
	JavascriptExecutor j = (JavascriptExecutor)ss;
	j.executeScript ("document.getElementById('input').value='Selenium'");
	
	ss.close();	
	
		
		
		
		
		
	
		
		
		
		
	}

}
