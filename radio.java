package Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;



public class radio {
public static void main (String args[]) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
	
	driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
	
	w.until(ExpectedConditions.attributeContains(driver.findElement(By.id("Div1")), "style", "display: block; opacity: 1"));
	driver.findElement(By.id("Div1")).getAttribute("style").contains("opacity: 1;");
	//to check with property in something is enabled - IMPortant 
	System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
	System.out.println(driver.findElement(By.id("Div1")).getAttribute("style").contains("opacity: 1;"));
	Assert.assertTrue(driver.findElement(By.id("Div1")).getAttribute("style").contains("opacity: 1;"), "Calander Enabled ");
	driver.close();
}
}
