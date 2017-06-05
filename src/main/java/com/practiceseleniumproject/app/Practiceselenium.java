package com.practiceseleniumproject.app;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.practiceseleniumproject.app.WelcomePage;
import com.practiceseleniumproject.tools.Browser;

import ru.yandex.qatools.allure.annotations.Attachment;
import ru.yandex.qatools.allure.annotations.Step;

public class Practiceselenium {

	private static final String BASE_URL = "http://www.practiceselenium.com/welcome.html";

	private static WebDriver driver;

	@Step("Open Welcome page by URL: " + BASE_URL)
	public static WelcomePage openWelcomePage() {
		driver = Browser.open();
		// driver.manage().window().maximize();
		driver.get(BASE_URL);
		return new WelcomePage(driver);

	}

	@Step("Close Browser")
	public static void close() {
		if (driver != null)
			driver.close();
		driver = null;

	}

	@Attachment("ScreenShot")
	public static byte[] takeScreenshot() {
		if (driver != null) {
			TakesScreenshot TakesScreenshot = TakesScreenshot.class.cast(driver);
			return TakesScreenshot.getScreenshotAs(OutputType.BYTES);
		}
		return new byte[0];
	}

}