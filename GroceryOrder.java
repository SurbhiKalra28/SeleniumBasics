package Basics;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroceryOrder {

	public static void main(String args[]) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String[] itemsNeeded = {"Cucumber","Brocolli","Beetroot"};
		addItems(driver,itemsNeeded);
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		Thread.sleep(5);
		List<WebElement> itemsordered = driver.findElements(By.xpath("//div[@class='cart-preview active']//ul[@class='cart-items']/li[@class='cart-item']"));
		Thread.sleep(5);
		System.out.println(itemsordered.size());
		
		driver.close();
		
	}
	
	public static void addItems(WebDriver driver, String[] itemNeeded) {
		
		int j=0;
		List<WebElement> listWebElement = driver.findElements(By.cssSelector("h4.product-name"));
		for(int i=0;i<listWebElement.size();i++ ) {
			
			String[] itemName =  listWebElement.get(i).getText().split("-");
			String formattedName = itemName[0].trim();
			
			List<String> ListitemNeeded = Arrays.asList(itemNeeded);
			if(ListitemNeeded.contains(formattedName)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			}
			
			if(j==ListitemNeeded.size())
			break;
		}
	}
}
