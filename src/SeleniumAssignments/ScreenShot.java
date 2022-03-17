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

public class ScreenShot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\andre\\eclipse-workspace\\SeleniumWorks2\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.moneycontrol.com/markets/fno-market-snapshot");
		driver.manage().window().maximize();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File s = ts.getScreenshotAs(OutputType.FILE);
		File d = new File("C:\\\\Users\\\\andre\\\\OneDrive\\\\Pictures\\\\fb.png");
		FileUtils.copyFile(s, d);

		WebElement element = driver.findElement(By.xpath("(//div[@class='leftD'])[2]"));
		// ScreenShot using WebElement
		File source = element.getScreenshotAs(OutputType.FILE);
		System.out.println(source);
		// Dest File Location
		File dest = new File("C:\\Users\\andre\\OneDrive\\Pictures\\Saved Picturesfb.png");
		// To Copy File
		FileUtils.copyFile(source, dest);
		

	}

}
