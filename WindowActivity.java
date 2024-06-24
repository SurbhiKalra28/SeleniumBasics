package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivity {
	
public static void main(String args[]) {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://google.com");
	driver.navigate().to("https://rahulshettyacademy.com");  // opens another window/
	driver.navigate().back();  // back to first page
	driver.navigate().forward();
	driver.close();
	
}
}
