package SeleniumAssignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames2 {public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\andre\\eclipse-workspace\\SeleniumWorks2\\Driver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	List<WebElement> list = driver.findElements(By.tagName("iframe"));
	int size = list.size();
	System.out.println(size);
	WebElement element = driver.findElement(By.xpath("//iframe[@id='DAsis']"));
	driver.switchTo().frame(element);
	driver.switchTo().frame(1);
// Navigation n = (Navigation) driver;
 
 
}
}