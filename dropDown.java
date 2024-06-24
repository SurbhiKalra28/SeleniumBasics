package Basics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {
	public static void main(String arg[]) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
     	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement webelement = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
//		Select dropdown = new Select(webelement);
//		dropdown.selectByIndex(2);
//		System.out.println(dropdown.getFirstSelectedOption().getText());;   //getFirstSelectedOption() return web element .
//		dropdown.selectByVisibleText("USD");
//		System.out.println(dropdown.getFirstSelectedOption().getText());
//		dropdown.selectByValue("INR");
//		System.out.println(dropdown.getFirstSelectedOption().getText());
		//static dropdown - > options are fixed .
//select is drop down and there is a calss to handle it -> Select and pass webElement iof that element that haas drop down
		
	
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR']//a[text()=' Bengaluru (BLR)']")).click();
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[text()=' Mumbai (BOM)']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Type to Select']")).sendKeys("ind");
		
		List<WebElement> options= driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		
		for(WebElement val: options) {
		System.out.println(	val.getText().equalsIgnoreCase("INDIA"));
			
		}
		
		driver.close();		
	}

}
