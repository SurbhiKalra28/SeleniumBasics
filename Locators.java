package Basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// selenium manager pacakge detect the browser and find the chrome driver and set up itself .if you write Sysyem.set the selenium manager is turned off else it does.
		ChromeOptions options = new ChromeOptions();
		WebDriver driver= new ChromeDriver(options) ;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));  // this will wait for 5 second if any element is not displayed. if element is displayed its good else it wait for it 5 seconds asmentioned. 
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("inputUsername")).sendKeys("Surbhi28kalra@gmail.com");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("signInBtn")).click();
		//System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		//driver.findElement(By.linkText("Forgot your password?")).click();
		//driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("SurbhiKalra");
		//driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("surbhi28kalra@gmail.com");
		//driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("4708869245");
		String[] message = driver.findElement(By.tagName("p")).getText().split("'");
		String[] message1 = message[0].split("'");
		System.out.print(message1[0]);
		//Assert.assertEquals(message1[0], "You are successfully logged in.");
		//driver.findElement(By.cssSelector("logout-btn"));  ////*[text()='Log Out'] or /button*[text()='Log Out']
		
		
		////div/button[text()='Practice']/following-sibling::button[1]
		////div/button[1]/parent::div
		
		
driver.close();
	}

}
