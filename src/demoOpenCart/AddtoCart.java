package demoOpenCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class AddtoCart {

	public static void main(String[] args) {

	// Create WebDriver
	System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	
	// Navigate to Site
	driver.get("https://demo.opencart.com/index.php?route=common/home");

	// Click on My Account and Register
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div/div[3]/button[1]/span")).click();
	driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[4]/a/span")).click();
	
	}

}

		
		

