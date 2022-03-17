import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\andre\\eclipse-workspace\\SeleniumWorks2\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
		element.sendKeys("phones");
		WebElement element2 = driver.findElement(By.id("nav-search-submit-button"));
		element2.click();
//		WebElement element3 = driver.findElement(By.xpath("//span[contains( text(),'Samsung Galaxy')]"));
//		String text = element3.getText();
//		System.out.println(text);
		List<WebElement> elements = driver.findElements(By.xpath("//span[contains( text(),'Samsung Galaxy')]"));
	
		System.out.println(elements);
	}

}
