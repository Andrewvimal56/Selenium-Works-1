package SeleniumAssignments;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.grid.Main;

public class ExampleScreenShot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\andre\\eclipse-workspace\\SeleniumWorks2\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		TakesScreenshot sC = (TakesScreenshot) driver;
		File screenshotAs = sC.getScreenshotAs(OutputType.FILE);
		System.out.println(screenshotAs);
		File d =new File ("C:\\Users\\andre\\OneDrive\\Pictures\\Saved Picturesnews.png");
		FileUtils.copyFile(screenshotAs, d);
		WebElement findElement = driver.findElement(By.xpath("//div[@class='_6luv _52jv']"));
		 File screenshotAs2 = findElement.getScreenshotAs(OutputType.FILE);
		 File dest = new File ("C:\\\\Users\\\\andre\\\\OneDrive\\\\Pictures\\\\Saved PicturesnewElement.png");
		 FileUtils.copyFile(screenshotAs2, dest);
		
	}

}
