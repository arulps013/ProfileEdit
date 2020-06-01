package com.stepdef;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.base.LibGlobal;

import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdefinition extends LibGlobal {
	@When("user login with the valid credentials")
	public void user_login_with_the_valid_credentials() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mypathshala:mypathshala@2019@e2e.my-pathshala.com/");
		driver.findElement(By.xpath("//i[@class='jss11 lnr lnr-user']")).click();
		driver.findElement(By.xpath("(//li[@role='menuitem'])[4]")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	@When("user clicks profile button and performs editing address")
	public void user_clicks_profile_button_and_performs_editing_address() throws InterruptedException, AWTException {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("arulps013@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Ice@2795");
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//i[@class='lnr lnr-pencil'])[1]")).click();
		WebElement ua = driver.findElement(By.xpath("//*//p[text()='Update Address']"));
		ua.click();
		driver.findElement(By.xpath("(//span[text()='Edit'])[1]")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		WebElement txt = driver.findElement(
				By.xpath("//*[text()='Address Line 1']/following-sibling::div//input[contains(@value,'namakkal')]"));
		txt.sendKeys(Keys.CONTROL + "a");
		txt.sendKeys(Keys.DELETE);
		txt.sendKeys("namakkal");
		WebElement txt1 = driver.findElement(
				By.xpath("//*[text()='Address Line 2']/following-sibling::div//input[contains(@value,'malla')]"));
		txt1.sendKeys(Keys.CONTROL + "a");
		txt1.sendKeys(Keys.DELETE);
		txt1.sendKeys("mallasamudram");
		driver.findElement(By.xpath("//span[text()='Update']")).click();
		driver.findElement(By.xpath("//*//p[text()='Bank Details']")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement edit = driver.findElement(By.xpath("(//span[text()='Edit'])[2]"));
		js.executeScript("arguments[0].click()", edit);
		WebElement bank1 = driver.findElement(By.xpath("(//input[@value='KVB'])"));
		bank1.sendKeys(Keys.CONTROL + "a");
		bank1.sendKeys(Keys.DELETE);
		bank1.sendKeys("KVB");
		WebElement bank2 = driver.findElement(By.xpath("(//input[@value='12471247124712471247'])"));
		bank2.sendKeys(Keys.CONTROL + "a");
		bank2.sendKeys(Keys.DELETE);
		bank2.sendKeys("12471247124712471247");
		WebElement bank3 = driver.findElement(By.xpath("(//input[@value='KVBL0001247'])"));
		bank3.sendKeys(Keys.CONTROL + "a");
		bank3.sendKeys(Keys.DELETE);
		bank3.sendKeys("KVBL0001247");
		WebElement bank4 = driver.findElement(By.xpath("(//input[@value='erode'])"));
		bank4.sendKeys(Keys.CONTROL + "a");
		bank4.sendKeys(Keys.DELETE);
		bank4.sendKeys("erode");
		WebElement bank5 = driver.findElement(By.xpath("(//input[@value='absca9802m'])"));
		bank5.sendKeys(Keys.CONTROL + "a");
		bank5.sendKeys(Keys.DELETE);
		bank5.sendKeys("absca9802m");
		driver.findElement(By.xpath("//span[text()='Update']")).click();
		driver.findElement(By.xpath("//*//p[text()='Update About Profile']")).click();
		WebElement edit1 = driver.findElement(By.xpath("(//span[text()='Edit'])[3]"));
		js.executeScript("arguments[0].click()", edit1);
		WebElement about = driver.findElement(By.xpath("//div//textarea[contains(text(),'Good')]"));
		about.sendKeys(Keys.CONTROL + "a");
		about.sendKeys(Keys.DELETE);
		about.sendKeys("Good knowledge one");
		driver.findElement(By.xpath("//span[text()='Update']")).click();
		driver.findElement(By.xpath("//*//p[text()='Upload Profile Picture']")).click();
		WebElement edit2 = driver.findElement(By.xpath("(//span[text()='Edit'])[3]"));
		js.executeScript("arguments[0].scrollIntoView(true)", edit2);
		js.executeScript("arguments[0].click()", edit2);
		driver.findElement(By.xpath("//*//p[text()='Upload Profile Cover Picture']")).click();
		WebElement edit3 = driver.findElement(By.xpath("(//span[text()='Edit'])[4]"));
		js.executeScript("arguments[0].click()", edit3);
		WebElement addFile = driver.findElement(By.xpath("//span[text()='Upload Image']"));
		//js.executeScript("arguments[0].click()", addFile);
		//driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("ar");
	}

}
