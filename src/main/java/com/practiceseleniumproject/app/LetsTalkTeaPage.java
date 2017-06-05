package com.practiceseleniumproject.app;

import static org.openqa.selenium.support.ui.ExpectedConditions.urlContains;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LetsTalkTeaPage extends AbstractPage{

private WebDriver driver;
	
	public LetsTalkTeaPage (WebDriver driver) {
		super(driver);
		this.driver = driver;
		new WebDriverWait(driver, 10).until(urlContains("talk"));
			
	}
	
}
