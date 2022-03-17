package SeleniumAssignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionsAlerts {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\andre\\eclipse-workspace\\SeleniumWorks2\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		WebElement lnkAlert = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		lnkAlert.click();
		WebElement lnkbtn = driver
				.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
		lnkbtn.click();
		Alert al = driver.switchTo().alert();
		al.sendKeys("Vimal");
		al.accept();
		WebElement txt = driver.findElement(By.xpath("//p[text()='Hello Vimal How are you today']"));
		String text = txt.getText();
		System.out.println(text);

	}
}
