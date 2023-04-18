 package S1_SeleniumCommands;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import io.github.bonigarcia.wdm.WebDriverManager;
public class A8_ActionClass {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver ss=new ChromeDriver();
	
	Thread.sleep(4000);	
	
//Browser maximizeing
	ss.manage().window().maximize();
	
//Browser Commands
	ss.get("http://demo.guru99.com/test/newtours/");
	
	System.out.println("1) CurrentUrl ..= "+ss.getCurrentUrl());
	System.out.println("2) Title ..= "+ ss.getTitle());

	Thread.sleep(2300);
	
	ss.findElement(By.linkText("REGISTER")).click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	ss.close();	
	
		
		
		
		
		
	
		
		
		
		
	}

}
