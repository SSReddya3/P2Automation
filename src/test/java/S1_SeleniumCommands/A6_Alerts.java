 package S1_SeleniumCommands;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import io.github.bonigarcia.wdm.WebDriverManager;
public class A6_Alerts {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver ss=new ChromeDriver();
	
	Thread.sleep(4000);	
	
//Browser maximizeing
	ss.manage().window().maximize();
	
//Browser Commands
	ss.get("https://the-internet.herokuapp.com/javascript_alerts");
	
	System.out.println("1) CurrentUrl ..= "+ss.getCurrentUrl());
	System.out.println("2) Title ..= "+ ss.getTitle());

	Thread.sleep(2300);
	
// Alert Accept	
	ss.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();

	//System.out.println(ss.findElement(By.xpath("//p[@id='result']")).getText());
	

	Thread.sleep(2300);	
	ss.switchTo().alert().accept();
	
Thread.sleep(4300);

//Alert Accept & Cancel	

ss.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
	
	Thread.sleep(2300);	
	ss.switchTo().alert().accept();
	//System.out.println(ss.findElement(By.xpath("//p[@id='result']")).getText());
	
	
Thread.sleep(4300);
	
	ss.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
	
	Thread.sleep(2300);	
	ss.switchTo().alert().dismiss();
	//System.out.println(ss.findElement(By.xpath("//p[@id='result']")).getText());
	
	Thread.sleep(2300);	
	
Thread.sleep(4300);
	
//Alert Sendkeys and Accept & Cancel	

	ss.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
	
	Thread.sleep(2300);	
	ss.switchTo().alert().sendKeys("sivasanakrreddyankireddypalle");
	Thread.sleep(2300);	
	
	System.out.println(ss.switchTo().alert().getText());
	ss.switchTo().alert().accept();
	
	
	
	
	//System.out.println(ss.findElement(By.xpath("//p[@id='result']")).getText());
	
	Thread.sleep(2300);	
	
	
ss.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
	
	Thread.sleep(2300);	
	ss.switchTo().alert().dismiss();
	//System.out.println(ss.findElement(By.xpath("//p[@id='result']")).getText());
	
	Thread.sleep(2300);	
	
	
	
	
	
	
	
	ss.close();	
	
		
		
		
		
		
	
		
		
		
		
	}

}
