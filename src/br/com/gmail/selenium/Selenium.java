package br.com.gmail.selenium;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/*
 * Classe para identificar qual o browser foi escolhido e o inicializa apenas uma vez por execu��o
 */
public class Selenium {

	private static WebDriver driver = null;

	public static WebDriver getDriver() {

		String browser = Property.BROWSER_NAME;

		if (driver == null) {
			if (Browser.IE.equals(browser)) {
				File file = new File(Property.IE_DRIVE_PATH);
				System.setProperty("webdriver.ie.driver", file.getAbsolutePath());

				DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
				cap.setCapability("ie.ensureCleanSession", true);
				cap.setPlatform(org.openqa.selenium.Platform.WINDOWS);
				cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
				cap.setCapability(InternetExplorerDriver.ENABLE_ELEMENT_CACHE_CLEANUP, true);
				cap.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);

				driver = new InternetExplorerDriver(cap);

			} else if (Browser.FIREFOX.equals(browser)) {

				ProfilesIni profile = new ProfilesIni();
				FirefoxProfile firefoxProfile = profile.getProfile("default");

				driver = new FirefoxDriver(firefoxProfile);

			} else if (Browser.CHROME.equals(browser)) {
				File file = new File(Property.CHROME_DRIVE_PATH);

				System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, file.getAbsolutePath());

				ChromeOptions options = new ChromeOptions();
				options.addArguments("start-maximized");
				driver = new ChromeDriver(options);

			} else if (Browser.HTMLUnitDriver.equals(browser)) {
				driver = new HtmlUnitDriver();

			} else if (Browser.PHANTOMJS.equals(browser)) {
				DesiredCapabilities dCaps = new DesiredCapabilities();
				dCaps.setJavascriptEnabled(true);
				dCaps.setCapability("takesScreenshot", true);
				dCaps.setCapability("phantomjs.binary.path", "../phantomjs.exe");

				driver = new PhantomJSDriver(dCaps);
			}
		}
		return driver;
	}
}
