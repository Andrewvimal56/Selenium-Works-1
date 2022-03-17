package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class JavaExecutorScript {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\andre\\eclipse-workspace\\SeleniumWorks2\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement txtBox = driver.findElement(By.id("twotabsearchtextbox" + ""));
		// Type cast
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Set Attribute
		js.executeScript("arguments[0].setAttribute('value','Android Phones')", txtBox);
		// To get Attribute 
		Object executeScript = js.executeScript("return arguments[0].getAttribute('value')", txtBox);
		System.out.println(executeScript);
         // Click butten
		WebElement btnSearch = driver.findElement(By.id("nav-search-submit-button"));
		js.executeScript("arguments[0].click()", btnSearch);
//		WebElement lnkPhone = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[18]"));
//		js.executeScript("arguments[0].scrollIntoView('true')",lnkPhone);
//		WebElement lnkPhone2 = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
//  	js.executeScript("arguments[0].scrollIntoView('false')",lnkPhone2);
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,1000)");
		js.executeScript("window.scrollBy(0,-1000)");
		
		
		

	}
}
