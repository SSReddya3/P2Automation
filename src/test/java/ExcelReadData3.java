import java.io.FileInputStream;
import java.io.IOException;
import java.security.Provider;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.*;

import org.openqa.selenium.chrome.*;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.*;

public class ExcelReadData3 {
	WebDriver driver;

	@BeforeClass

	public void browserlanch() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
	}

	@Test(dataProvider = "testdata")
	public void LoginTest(String UN ,String PWD) throws InterruptedException {

		driver.get("https://demo.applitools.com/index.html");
	
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(UN);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(PWD);
		
		driver.findElement(By.xpath("//a[@id='log-in']")).click();
		Thread.sleep(3000);
		
	}

	@DataProvider
	public Object[][] testdata()
	{
		Object [][] data= new Object[2][2];
		
		data[0][0]="siva";
		
		data[0][1]="ssr";
		
     data[1][0]="sankar";
		
		data[1][1]="reddy";
		
		return data;
		
	}
	
	
	
	
	@AfterClass

	public void BrowserClose() {
		driver.close();
	}

}
