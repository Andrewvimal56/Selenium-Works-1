package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class NavigationCommands {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\andre\\eclipse-workspace\\SeleniumWorks2\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.facebook.com/");
		// Actions actions = new Actions(driver);
		WebElement txtMail = driver.findElement(By.id("email"));
		txtMail.sendKeys("Vimal07");
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("Vimal--09");
		// Treverse Forword
		driver.navigate().forward();
		// Refresh
		driver.navigate().refresh();
		//Treverse Back
		driver.navigate().back();

	}

}
