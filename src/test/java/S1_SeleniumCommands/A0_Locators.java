package S1_SeleniumCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A0_Locators {

	public static void main(String[] args) throws InterruptedException {
		
		String firstName="ram";
		String lastName="chandra";
		String street="ram";
		String city="aszxcdqwe";
		String state="sxcdsxs";
		String zipCode="502032";
		String phoneNumber="8524178120";
		String username="rcr451";
		String password="2140Ram";
		String repeatedPassword="2140Ram";
		
		
		// launch the Browser
		
	/*	
	 // Firefox Browser launch 
	   
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		 // Chrome Browser launch 
		
		//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		*/
		
//Browser Opening By useing Maven
		
		WebDriverManager.chromedriver().setup();
		WebDriver ss=new ChromeDriver();
	
//Browser maximizeing
	ss.manage().window().maximize();
	
//Browser Commands
	ss.get("https://parabank.parasoft.com/parabank/register.htm");
	
	ss.findElement(By.id("customer.firstName")).sendKeys(firstName);
	ss.findElement(By.name("customer.lastName")).sendKeys(lastName);
	ss.findElement(By.id("customer.address.street")).sendKeys(street);
	ss.findElement(By.id("customer.address.city")).sendKeys(city);
	ss.findElement(By.name("customer.address.state")).sendKeys(state);
	ss.findElement(By.id("customer.address.zipCode")).sendKeys(zipCode);
	ss.findElement(By.id("customer.phoneNumber")).sendKeys(phoneNumber);
	ss.findElement(By.name("customer.username")).sendKeys(username);
	ss.findElement(By.id("customer.password")).sendKeys(password);
	ss.findElement(By.id("repeatedPassword")).sendKeys(repeatedPassword);
	ss.findElement(By.xpath("//input[@value='Register']")).click();
	ss.findElement(By.name("username")).sendKeys(username);
	ss.findElement(By.name("password")).sendKeys(password);
	ss.findElement(By.xpath("//input[@value='Log In']")).click();
	
	
	Thread.sleep(2000);
	
	
	ss.quit();	
	
		
		
		
		
		
		
		
		
	}

}
