package com.practiceseleniumproject.test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.practiceseleniumproject.app.CheckOutPage;
import com.practiceseleniumproject.app.LetsTalkTeaPage;
import com.practiceseleniumproject.app.MenuPage;
import com.practiceseleniumproject.app.OurPassionPage;
import com.practiceseleniumproject.app.Practiceselenium;
import com.practiceseleniumproject.app.WelcomePage;

public class NavigationByLinksTest {

	private WelcomePage onWelcomePage;
	private OurPassionPage onOurPassionPage;
	private MenuPage onMenuPage;
	private CheckOutPage onCheckOutPage;
	private LetsTalkTeaPage onLetsTalkTeaPage;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\temp\\chromedriver.exe");
	}
	
	@BeforeMethod
	public void WelcomePage() {
		onWelcomePage = Practiceselenium.openWelcomePage();
		
	}
	
	@Test
	public void testOurPassionLink() {
		onOurPassionPage = onWelcomePage.clickOurPassionLink();
		
		assertEquals(onOurPassionPage.getCurrentUrl(), "http://www.practiceselenium.com/our-passion.html",
				"Incorrect URL after click on 'Our passion' link");
	}
	
	@Test
	public void testMenuLink() {
		onMenuPage = onWelcomePage.clickMenuLink();
		
		assertEquals(onMenuPage.getCurrentUrl(), "http://www.practiceselenium.com/menu.html",
				"Incorrect URL after click on 'Menu' link");
	}
	
	@Test
	public void navigationLetsTalkTeaPage() {
		onLetsTalkTeaPage = onWelcomePage.clickLetsTalkTeaLink();
		
		assertEquals(onLetsTalkTeaPage.getCurrentUrl(), "http://www.practiceselenium.com/let-s-talk-tea.html",
				"Incorrect URL after click on 'Let's talk tea' link");
	}
	
	@Test
	public void navigationCheckOutPage() {
		onCheckOutPage = onWelcomePage.clickCheckOutLink();
		
		assertEquals(onCheckOutPage.getCurrentUrl(), "http://www.practiceselenium.com/check-out.html",
				"Incorrect URL after click on 'Check out' link");
	}
	
	@AfterMethod
	public void tearDown() {
		Practiceselenium.close();
	}
}