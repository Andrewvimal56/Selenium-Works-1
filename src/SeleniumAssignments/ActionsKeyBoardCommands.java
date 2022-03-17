package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsKeyBoardCommands {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\andre\\eclipse-workspace\\SeleniumWorks2\\Driver\\msedgedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement txtName = driver.findElement(By.id("email"));
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.SHIFT).sendKeys(txtName, "VimalArul").keyDown(Keys.SHIFT).perform();
		actions.doubleClick(txtName).perform();
		
		
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("vimhhjj");

		// actions.keyDown(Keys.SHIFT).sendKeys(txtPass,"arulvimal90").keyUp(Keys.SHIFT).perform();

	}

}
