import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;

import org.openqa.selenium.chrome.*;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.*;

public class ExcelReadData {
	WebDriver driver;

	@BeforeClass

	public void browserlanch() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
	}

@Test
	public void LoginTest() throws InterruptedException, IOException {
		
		FileInputStream f= new FileInputStream(".\\datafiles\\inputstreem.xlsx");
		
		
		XSSFWorkbook wb= new XSSFWorkbook(f);
	
	XSSFSheet sh =	wb.getSheet("Sheet1");
	 String UN= sh.getRow(1).getCell(0).getStringCellValue();
	 
	 System.out.println("-----UN-----" +UN);
	
	 
	 double PWD_int= sh.getRow(1).getCell(1).getNumericCellValue();
	 
	 String PWD_str = String.valueOf(PWD_int);
	 System.out.println(PWD_str);    // 2344
	 
	 System.out.println("-----PWD-----" +PWD_str);
		

		driver.get("https://selectorshub.com/xpath-practice-page/");
	
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='userId']")).sendKeys(UN);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(PWD_str);
		
		
	}
	
	
	
	@AfterClass

	public void BrowserClose() {
		driver.close();
	}
}
