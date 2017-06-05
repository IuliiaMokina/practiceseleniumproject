package com.practiceseleniumproject.app;

import static org.openqa.selenium.support.ui.ExpectedConditions.urlToBe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.practiceseleniumproject.app.CheckOutPage;
import com.practiceseleniumproject.app.LetsTalkTeaPage;
import com.practiceseleniumproject.app.MenuPage;
import com.practiceseleniumproject.app.OurPassionPage;

import ru.yandex.qatools.allure.annotations.Step;

public class WelcomePage extends AbstractPage {

	@FindBy(css = ".wsb-navigation-rendered-top-level-menu > li:nth-child(2)")
	private WebElement ourPassionLink;

	@FindBy(css = ".wsb-navigation-rendered-top-level-menu > li:nth-child(3)")
	private WebElement menuLink;

	@FindBy(css = ".wsb-navigation-rendered-top-level-menu > li:nth-child(4)")
	private WebElement letsTalkTeaLink;

	@FindBy(css = ".wsb-navigation-rendered-top-level-menu > li:nth-child(5)")
	private WebElement checkOutLink;

	private WebDriver driver;

	public WelcomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		new WebDriverWait(driver, 10).until(urlToBe("http://www.practiceselenium.com/welcome.html"));
	}

	@Step("Click 'Our passion' link")
	public OurPassionPage clickOurPassionLink() {
		ourPassionLink.click();
		return new OurPassionPage(driver);
	}

	@Step("Click 'Menu' link")
	public MenuPage clickMenuLink() {
		menuLink.click();
		return new MenuPage(driver);
	}

	@Step("Click 'Let's talk tea' link")
	public LetsTalkTeaPage clickLetsTalkTeaLink() {
		letsTalkTeaLink.click();
		return new LetsTalkTeaPage(driver);
	}

	@Step("Click 'Check out' link")
	public CheckOutPage clickCheckOutLink() {
		checkOutLink.click();
		return new CheckOutPage(driver);
	}

}