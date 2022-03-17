import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClassDemoGuru {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\andre\\eclipse-workspace\\SeleniumWorks2\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		WebElement txtS = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement txtD = driver.findElement(By.xpath("//li[@class='placeholder'][1]"));

		WebElement txtS1 = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement txtD1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));

		WebElement S2 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		WebElement txtD2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));

		WebElement txtS3 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement txtD3 = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		Actions actions = new Actions(driver);

		actions.dragAndDrop(txtS, txtD).perform();
		actions.dragAndDrop(txtS1, txtD1).perform();
		actions.dragAndDrop(S2, txtD2).perform();
		actions.dragAndDrop(txtS3, txtD3).perform();
		WebElement txtPerfect = driver.findElement(By.xpath("//a[text()='Perfect!']"));
		String text = txtPerfect.getText();
		System.out.println(text);

	}
}
