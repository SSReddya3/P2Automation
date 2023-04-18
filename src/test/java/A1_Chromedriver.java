import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A1_Chromedriver {

	public static void main(String[] args) throws InterruptedException {

WebDriverManager.chromedriver().setup();
WebDriver ss=new ChromeDriver();



ss.manage().window().maximize();
		
		
		
	Thread.sleep(4000);	
	
	
	
	
	ss.close();	
		
		
		
	}

}
