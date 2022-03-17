package SeleniumAssignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\andre\\eclipse-workspace\\SeleniumWorks2\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement txtBox = driver.findElement(By.id("twotabsearchtextbox"));
    	txtBox.sendKeys("Iphone", Keys.ENTER);
		Thread.sleep(3000);
		WebElement lnkPhone = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
		lnkPhone.click();
		// Parent Window Id
    	String parent = driver.getWindowHandle();
		System.out.println(parent);
		// All windows Id
		Set<String> allId = driver.getWindowHandles();
		System.out.println(allId);
		// Find child window id
		// Iterate
		for (String childId : allId) {
			if (!parent.equals(childId)) {
				driver.switchTo().window(childId);
			}

		}

		Thread.sleep(3000);
		/// driver.switchTo().window(null)

		WebElement btnCart = driver.findElement(By.id("add-to-cart-button"));
		String attribute = btnCart.getAttribute("value");
		System.out.println(attribute);
		//driver.switchTo().window(parent);
		//WebElement txtBox1 = driver.findElement(By.id("twotabsearchtextbox"));
	//	btnCart.click();
		Thread.sleep(10000);
		/// to click multiple webelement
		driver.switchTo().window(parent);
		List<WebElement> l = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		int size = l.size();
		for (WebElement click : l) {
			click.click();
		}
		// To switch to particular window
		Thread.sleep(10000);
		for (String particularvalue : allId) {
			int count = 0;
		if (count == 15) {
			driver.switchTo().window(particularvalue);
			}
			count++;
	}
		Thread.sleep(10000);
		// To Swith window by using list 
		List<String> li = new ArrayList<>();
		li.addAll(allId);
		driver.switchTo().window(li.get(0));
		
		Thread.sleep(5000);
		// To get attribute iphone
		WebElement txtBox1 = driver.findElement(By.id("twotabsearchtextbox"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)",txtBox1);
		String attribute2 = txtBox1.getAttribute("value");
		System.out.println(attribute2);
	}

} 
