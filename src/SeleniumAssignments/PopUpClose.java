package SeleniumAssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpClose {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\andre\\eclipse-workspace\\SeleniumWorks2\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		List<WebElement> list = driver.findElements(By.tagName("button"));
		int size = list.size();
		if(size!=0) {
		click();
		}
		else {
			System.out.println("incorrect");
		}
	}

	private static void click() {
		// TODO Auto-generated method stub
		
	}



}
