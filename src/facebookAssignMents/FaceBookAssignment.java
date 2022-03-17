package facebookAssignMents;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookAssignment {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\andre\\eclipse-workspace\\SeleniumWorks2\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement txtCreateAcc = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		txtCreateAcc.click();
		Thread.sleep(3000);
		// Printing All the text Options of years
		WebElement dDnYear = driver.findElement(By.name("birthday_year"));
		Select select = new Select(dDnYear);
		List<WebElement> options = select.getOptions();
		for (int i = 0; i < options.size(); i++) {
			WebElement element = options.get(i);
			String text = element.getText();
			System.out.print(text + "  ");

		}
		// Printing all the text options of Days
		WebElement dDnDay = driver.findElement(By.name("birthday_day"));
		Select selectDay = new Select(dDnDay);
		List<WebElement> options2 = selectDay.getOptions();
		System.out.println();
		for (WebElement element : options2) {
			String attribute = element.getAttribute("value");

			System.out.print(attribute + "  ");
		}
		System.out.println();

		// Printing First five Months
		WebElement dDnMonth = driver.findElement(By.name("birthday_month"));
		Select selectMonth = new Select(dDnMonth);
		List<WebElement> options3 = selectMonth.getOptions();
		// Getting Middle value
		int size = options3.size();
		WebElement element2 = options3.get(size / 2);
		String text2 = element2.getText();
		System.out.println(text2);

		for (int i = 0; i < 5; i++) {
			WebElement element = options3.get(i);
			String text = element.getText();
			System.out.print(text + "  ");

		}

		// Print all options without select class Month
		
		WebElement txtPrintMonth = driver.findElement(By.xpath("//select[contains(@title,'Month')]"));
		String textMonth = txtPrintMonth.getText();
		System.out.println(textMonth);
		
		// PRINT ALL DAY
		
		WebElement txtPrintDay = driver.findElement(By.xpath("//select[contains(@title,'Day')]"));
		String textDay = txtPrintDay.getText();
		System.out.println(textDay);
		
		// Print all Year
		
		WebElement txtPrintYear = driver.findElement(By.xpath("//select[contains(@title,'Year')]"));
		String textYear = txtPrintYear.getText();
		System.out.println(textYear);

		// Last Option
		
		WebElement dDnMonth2 = driver.findElement(By.name("birthday_month"));
		Select selectMonth2 = new Select(dDnMonth2);
		List<WebElement> options4 = selectMonth2.getOptions();
		WebElement element3 = options4.get(options4.size() - 1);
		String text3 = element3.getText();
		System.out.println(text3);
		for (int i = 0; i < (options4.size()-5); i++) {
			WebElement element = options4.get(i);
			String text4 = element.getText();
			System.out.println(text4);
		}
		
		
		// Print All Alternative Text
		WebElement dDnMonth3 = driver.findElement(By.name("birthday_month"));
		Select selectMonth3 = new Select(dDnMonth3);
		List<WebElement> options5 = selectMonth3.getOptions();
		for (int i = 0; i < options5.size(); i=i+2) {
			WebElement element = options5.get(i);
			String text = element.getText();
			System.out.println(text);
			
		}
		//  Check Duplicate 
		WebElement dDnMonth4 = driver.findElement(By.name("birthday_month"));
		Select selectMonth4 = new Select(dDnMonth4);
		List<WebElement> options6 = selectMonth4.getOptions();
		options6.size();
		Set<WebElement> s = new HashSet<>();
		s.addAll(options6);
		System.out.println(options6.size()-s.size());
		
		
		
		
		// Check Duplicate day
      s.addAll(options2);
      System.out.println(options2.size()-s.size());
      // check year duplicate
      s.addAll(options);
      System.out.println(options.size()-s.size());
      // Print last 5 values
      
      
      
	}
      
      
      
	

}
