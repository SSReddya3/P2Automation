import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Mobile {

	
		public static void main(String[] args) throws InterruptedException, IOException {
		
			XSSFWorkbook wb=new XSSFWorkbook();
			XSSFSheet sh=wb.createSheet("emp info");
			
			WebDriverManager.chromedriver().setup();
			//Creating a object for chrome
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			WebElement ele = driver.findElement(By.xpath("//button[contains(@class,'_2doB4')]"));
			WebDriverWait wait = new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(@class,'_2doB4')]")));
			ele.click();
			
			//Search with mobiles
			driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("Mobiles");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
			
			//Get the each mobile name and price
			java.util.List<WebElement> items = driver.findElements(By.xpath("//div[contains(@class,'_3HqJxg')]/div[1]/div[2]/div"));
			
			//Iterate through each element
			for(int i=2;i<=items.size();i++) {
				By itemName = By.xpath("//div[contains(@class,'_3HqJxg')]/div[1]/div[2]/div["+ i +"]//div[contains(@class,'_4rR01T')]");
				By price = By.xpath("//div[contains(@class,'_3HqJxg')]/div[1]/div[2]/div["+ i +"]//div[contains(@class,'_1_WHN1')]");
				
				String itemText = driver.findElement(itemName).getText();
				String itemPrice = driver.findElement(price).getText();
				
				System.out.println("Item Name is "+ itemText +" and Item Price is "+ itemPrice);
			
				ArrayList<Object[]> empdata=new  ArrayList<Object[]>();
		         empdata.add(new Object[] {"itemText","itemPrice"});
		         
			}
			String  file =".\\datafiles\\employee1.xlsx";
			
			FileOutputStream fos =new FileOutputStream(".\\datafiles\\employee.xlsx");	
			
					wb.write(fos);
					fos.close();
					System.out.println("employee.xlsx file is created successfully");
					
		}

		

	}


