package S1_SeleniumCommands;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A2_BrowserCommands2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver ss=new ChromeDriver();
	
	Thread.sleep(4000);	
	
	//Browser maximizeing
	ss.manage().window().maximize();
	
	//Browser Commands
	ss.get("https://onlinetestinghelp.com/");
	
	String Currenturl=ss.getCurrentUrl();
	String title= ss.getTitle();
	
	System.out.println("1) CurrentUrl ..= "+ss.getCurrentUrl());
	System.out.println("2) Title ..= "+title);
	System.out.println("3) CurrentUrl ..= "+ss.getCurrentUrl());
	System.out.println("4) Title ..= "+ ss.getTitle());
	System.out.println("5) PageSource ..= "+ ss.getPageSource());
	
	
	
	ss.findElement(By.xpath("//a[@href='#'][normalize-space()='Projects']")).click();
	ss.findElement(By.xpath("//a[normalize-space()='Banking']")).click();
	
	
	Thread.sleep(4000);	
	
	
	ss.quit();	
		
		
		
	}

}
