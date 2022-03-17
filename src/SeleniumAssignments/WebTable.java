package SeleniumAssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\andre\\eclipse-workspace\\SeleniumWorks2\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		WebElement table = driver.findElement(By.id("customers"));

		// To get All table Values
		String text = table.getText();
		System.out.println(text + "  ");

		// To get All Table Row Values
		List<WebElement> tableRows = table.findElements(By.tagName("tr"));
		for (int i = 0; i < tableRows.size(); i++) {
			WebElement element = tableRows.get(i);// String text2 = element.getText();
			// System.out.println(text2);
			System.out.println(element.getText());

		}
		// All table Rows and data
		for (int i = 0; i < tableRows.size(); i++) {
			WebElement element = tableRows.get(i);
			List<WebElement> cellDatas = element.findElements(By.tagName("td"));
			for (int j = 0; j < cellDatas.size(); j++) {
				WebElement element2 = cellDatas.get(j);
				// System.out.println(element2.getText());
				String text2 = element2.getText();
				if (text2.equals("Italy")) {
					System.out.println("Correct");
				}

			}
			System.out.println("  ");
		}

	}

}
