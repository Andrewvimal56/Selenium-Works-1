
package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\andre\\eclipse-workspace\\SeleniumWorks2\\Driver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
    driver.get("https://netbanking.hdfcbank.com/ \r\n" + "");
    driver.manage().window().maximize();
    driver.switchTo().frame("login_page");
	WebElement txtId = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
	txtId.sendKeys("Vimal");
	WebElement btnLogin = driver.findElement(By.xpath("//a[@onclick='return fLogon();']"));
		btnLogin.click();
	}

}
