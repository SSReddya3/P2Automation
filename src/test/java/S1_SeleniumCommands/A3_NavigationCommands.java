package S1_SeleniumCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A3_NavigationCommands {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver ss=new ChromeDriver();
	
	Thread.sleep(4000);	
	
	//Browser maximizeing
	ss.manage().window().maximize();
	
	//Browser Commands
	ss.get("https://onlinetestinghelp.com/");
	
	
	System.out.println("1) CurrentUrl ..= "+ss.getCurrentUrl());
	System.out.println("2) Title ..= "+ ss.getTitle());
	
	ss.navigate().to("https://onlinetestinghelp.com/projects/banking/admin/login.php");
	
	System.out.println("3) CurrentUrl ..= "+ss.getCurrentUrl());
	System.out.println("4) Title ..= "+ ss.getTitle());

	Thread.sleep(2000);	
	
	ss.navigate().back();
	
	Thread.sleep(2000);	
	
	ss.navigate().forward();
	
	Thread.sleep(2000);	
	
	ss.navigate().refresh();
	
	
	
	
	
	
	ss.close();	
	
		
		
		
		
		
		
		
		
		//a[@href='#'][normalize-space()='Projects']
	}

}
