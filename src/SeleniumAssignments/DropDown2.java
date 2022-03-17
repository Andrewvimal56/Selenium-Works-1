package SeleniumAssignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\andre\\eclipse-workspace\\SeleniumWorks2\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement txtCreateAcc = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		txtCreateAcc.click();
		WebElement txtName = driver.findElement(By.name("firstname"));
		txtName.sendKeys("Vimal");

		WebElement dDnDay = driver.findElement(By.name("birthday_day"));
		// To Select A particular value using index number
		Select select = new Select(dDnDay);
		List<WebElement> options2 = select.getOptions();
		// select.selectByIndex(8);
		select.selectByValue("20");
		// Printing All the text Options of years
		WebElement dDnYear = driver.findElement(By.name("birthday_year"));
		Select select1 = new Select(dDnYear);
		List<WebElement> options = select1.getOptions();
		//for (int i = 0; i < options.size(); i++) {
		//	WebElement element = options.get(i);
		for (WebElement x : options) {
			String text = x.getText();
			System.out.println(text);
		}
		for (int i = 0; i <options2.size(); i++) {
			select.selectByIndex(i);
			
		}
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		for (WebElement webElement : allSelectedOptions) {
			String text = webElement.getText();
			System.out.println(text);
		}
			select.deselectAll();
		}
			

		}
		

	


