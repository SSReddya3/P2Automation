 package S1_SeleniumCommands;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import io.github.bonigarcia.wdm.WebDriverManager;
public class A4_WebElementCommands_Dropdowns {

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
	ss.get("https://demo.guru99.com/test/newtours/");
	
	
	System.out.println("1) CurrentUrl ..= "+ss.getCurrentUrl());
	System.out.println("2) Title ..= "+ ss.getTitle());
	
	
	
	String gt =ss.findElement(By.xpath("//div[@class='footer']")).getText();
	System.out.println("1) get text ..= "+ gt);
	
	
	
	
	ss.findElement(By.linkText("REGISTER")).click();
	ss.findElement(By.name("firstName")).sendKeys(firstName);
	ss.findElement(By.name("lastName")).sendKeys(lastName);
	ss.findElement(By.name("phone")).sendKeys(phone);
	ss.findElement(By.name("userName")).sendKeys(username);
	ss.findElement(By.name("address1")).sendKeys(address1);
	ss.findElement(By.name("city")).sendKeys(city);
	ss.findElement(By.name("state")).sendKeys(state);
	ss.findElement(By.name("postalCode")).sendKeys(postalCode);
	Thread.sleep(2000);
	ss.findElement(By.name("postalCode")).clear();
	Thread.sleep(2000);
	ss.findElement(By.name("postalCode")).sendKeys(postalCode);
	Thread.sleep(2000);
	
	
//Dropdown
	
	org.openqa.selenium.support.ui.Select drpCountry = new org.openqa.selenium.support.ui.Select(ss.findElement(By.name("country")));
	drpCountry.selectByVisibleText(Contry);
	Thread.sleep(2000);
	drpCountry.selectByIndex(10);
	Thread.sleep(2000);
	drpCountry.selectByValue("RUSSIA");
	Thread.sleep(2000);
	
	ss.findElement(By.name("email")).sendKeys(username);
	ss.findElement(By.name("password")).sendKeys(password);
	ss.findElement(By.name("confirmPassword")).sendKeys(repeatedPassword);
	ss.findElement(By.name("submit")).click();
	
	Thread.sleep(2000);
	
	String gt2 =ss.findElement(By.xpath("(//font[@face='Arial, Helvetica, sans-serif']/b)[1]")).getText();
	System.out.println("2) get text ..= "+ gt2);
	
	
	String gt3 =ss.findElement(By.xpath("//b[text()=' Note: Your user name is rcr451.']")).getText();
	System.out.println("2) get text ..= "+ gt3);
	
	
	ss.close();	
	
		
		
		
		
		
	
		
		
		
		
	}

}
