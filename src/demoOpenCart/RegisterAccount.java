package demoOpenCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RegisterAccount {

	public static void main(String[] args) {

		// Create WebDriver
		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		// Navigate to Site
		driver.get("https://demo.opencart.com/index.php");

		// Click on My Account and Register
		driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a/span[1]")).click();
		driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[1]/a")).click();
		
		// Fill out form
		driver.findElement(By.id("input-firstname")).sendKeys("Scuba");
		driver.findElement(By.id("input-lastname")).sendKeys("Steve");
		driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("226-666-6525");
		driver.findElement(By.id("input-password")).sendKeys("Winter09!");
		driver.findElement(By.id("input-confirm")).sendKeys("Winter09!");
		
		// Subscribe to newsletter
		driver.findElement(By.name("newsletter")).click();
		
		// Agree to privacy policy
		driver.findElement(By.name("agree")).click();
		
		// Click on continue button
		driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div/input[2]")).click();
		
		// Get confirmation
		String message = driver.findElement(By.xpath("/html/body/div[2]/div/div/h1")).getText();
		System.out.println("CONFIRMATION: " + message);
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/a")).click();

	}

}
