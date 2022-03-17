import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sprint {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\andre\\eclipse-workspace\\SeleniumWorks2\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sprint.com");

		WebElement btn = driver.findElement(By.xpath("//button[@tabindex='0']"));
		btn.click();
		WebElement btn2 = driver.findElement(By.xpath("//i[@class='fa fa-times-circle']"));
		btn2.click();
		WebElement LnkPhone = driver.findElement(By.xpath("//a[@id='digital-header-nav-link-head-1']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(LnkPhone).perform();
		WebElement btn5G = driver.findElement(By.xpath("//a[@href='https://www.t-mobile.com/devices/5g-phones']"));
		btn5G.click();
		WebElement txtPrint = driver.findElement(By.xpath("//a[text()=' Do Not Sell My Personal Information']"));
		String text = txtPrint.getText();
		System.out.println(text);
		driver.getTitle();
		

	}
}
