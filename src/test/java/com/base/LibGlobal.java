package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LibGlobal {
	public static WebDriver driver;

	public void click(WebElement ele) {
		ele.click();
	}
	public void fill(WebElement ele,String name) {
		ele.sendKeys(name);
	}
}
