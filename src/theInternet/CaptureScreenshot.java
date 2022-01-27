package theInternet;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureScreenshot {
	
	public static void main(String[] args) throws IOException{
				
		Date currentdate = new Date();
		//System.out.println(currentdate);
		String screenshotfilename = currentdate.toString().replace(" ", "-").replace(":", "-");
		System.out.println(screenshotfilename);
				
		 System.setProperty("webdriver.gecko.driver",
		 "C:\\selenium\\geckodriver\\geckodriver.exe"); WebDriver driver = new
		 FirefoxDriver(); driver.manage().window().maximize();
		 driver.get("https://www.disney.com"); 
		 File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); 
		 FileUtils.copyFile(screenshotFile, new File(".//screenshots//" + screenshotfilename + ".png"));
		 		
		// Closing the driver instance
		driver.quit();
		
		
		
		
		
		
	
	
		
		
	}

}
