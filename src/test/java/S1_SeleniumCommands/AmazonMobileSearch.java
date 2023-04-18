package S1_SeleniumCommands;

	import java.io.File;
import java.io.FileOutputStream;
	import java.util.List;

	import org.apache.poi.ss.usermodel.*;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;

	public class AmazonMobileSearch {
	    public static void main(String[] args) throws Exception {
	        // Set up WebDriver and navigate to Amazon
	    	WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.amazon.com/");

	        // Enter search term and submit
	        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles phones");
	        driver.findElement(By.id("nav-search-submit-button")).click();

	    
	        // Extract mobile details from search results and save in Excel
	        List<WebElement> mobileResults = driver.findElements(By.cssSelector("[data-component-type='s-search-result']"));
	        File file = new File("D:\\Aprial2023");
	        Workbook workbook = new XSSFWorkbook();
	        Sheet sheet = workbook.createSheet("Mobile Search Results");
	        Row headerRow = sheet.createRow(0);
	        headerRow.createCell(0).setCellValue("Title");
	        headerRow.createCell(1).setCellValue("Price");
	        headerRow.createCell(2).setCellValue("Rating");
	        int rowNum = 1;
	        for (WebElement result : mobileResults) {
	            String title = result.findElement(By.cssSelector("h2 a span")).getText();
	            String price = result.findElement(By.xpath("//span[@class='a-price-whole']")).getText()
	                    + "." + result.findElement(By.cssSelector("//span[@class='a-price-fraction']")).getText();
	         //  String rating = result.findElement(By.cssSelector("[aria-label*='out of 5 stars']")).getAttribute("aria-label").replaceAll("[^0-9.]", "");

	            Row row = sheet.createRow(rowNum++);
	            row.createCell(0).setCellValue(title);
	            row.createCell(1).setCellValue(price);
	          //  row.createCell(2).setCellValue(rating);
	        }

	        // Save Excel file and quit driver
	      
			
		
	        FileOutputStream outputStream = new FileOutputStream(file);
		       
	       // FileOutputStream outputStream = new FileOutputStream("mobile_search_results.xlsx");
	        workbook.write(outputStream);
	        outputStream.close();
	        driver.quit();
		
	
	}

}
