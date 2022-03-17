package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\andre\\eclipse-workspace\\SeleniumWorks2\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement txtName = driver.findElement(By.id("username"));
		txtName.sendKeys("Andrew07");
		WebElement txtPass = driver.findElement(By.id("password"));
		txtPass.sendKeys("Andrew_07");
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
		WebElement dDn = driver.findElement(By.xpath("//select[@name='location']"));
		Select select = new Select(dDn);
		select.selectByIndex(7);
		WebElement dDn1 = driver.findElement(By.id("hotels"));
		Select select1 = new Select(dDn1);
		select1.selectByValue("Hotel Sunshine");
		WebElement dDn2 = driver.findElement(By.id("room_type"));
		Select select2 = new Select(dDn2);
		select2.selectByVisibleText("Deluxe");
		WebElement dDn3 = driver.findElement(By.id("room_nos"));
		Select select3 = new Select(dDn3);
		select3.selectByValue("4");
		WebElement txtDateIn = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		txtDateIn.clear();
		txtDateIn.sendKeys("12/04/2022");
		WebElement txtDateOut = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		txtDateOut.clear();
		txtDateOut.sendKeys("16/04/2022");
		WebElement dDn4 = driver.findElement(By.xpath("// select[@name='adult_room']"));
		Select select4 = new Select(dDn4);
		select4.selectByIndex(2);
		WebElement dDn5 = driver.findElement(By.xpath("// select[@name='child_room']"));
		Select select5 = new Select(dDn5);
		select5.selectByIndex(2);
		WebElement btn1 = driver.findElement(By.xpath("// input[@name='Submit']"));
		btn1.click();
		WebElement btnRbutton = driver.findElement(By.xpath("// input[@name='radiobutton_0']"));
		btnRbutton.click();
		WebElement btnContinue = driver.findElement(By.xpath("// input[@name='continue']"));
		btnContinue.click();
		WebElement txtName1 = driver.findElement(By.xpath("// input[@name='first_name']"));
		txtName1.sendKeys("Herbert");
		WebElement txtNamelast = driver.findElement(By.xpath("// input[@name='last_name']"));
		txtNamelast.sendKeys("rajasekar");
		WebElement txtAddress = driver.findElement(By.xpath("// textarea[@name='address']"));
		txtAddress.sendKeys("chennai,choolaimedu,no/10");
		WebElement txtCard = driver.findElement(By.xpath("// input[@name='cc_num']"));
		txtCard.sendKeys("0987654320923456");
		WebElement dDnCardType = driver.findElement(By.xpath("// select[@name='cc_type']"));
		Select select6 = new Select(dDnCardType);
		select6.selectByIndex(1);
		WebElement dDnMonth = driver.findElement(By.xpath("// select[@name='cc_exp_month']"));
		Select select7 = new Select(dDnMonth);
		select7.selectByIndex(6);
		WebElement dDnYear = driver.findElement(By.xpath("// select[@name='cc_exp_year']"));
		Select select8 = new Select(dDnYear);
		select8.selectByIndex(5);
		WebElement txtCvv = driver.findElement(By.xpath("// input[@name='cc_cvv']"));
		txtCvv.sendKeys("832");
		WebElement btnBook = driver.findElement(By.xpath("// input[@name='book_now']"));
		
		btnBook.click();
		Thread.sleep(10000);
		WebElement txtOrderNo = driver.findElement(By.xpath("// input[@name='order_no']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", txtOrderNo);
		Object textOrder = js.executeScript("return arguments[0].getAttribute('value')", txtOrderNo);
		//Thread.sleep(3000);
		System.out.println(textOrder);

	}
}