package br.com.gmail.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.gmail.selenium.Property;
import br.com.gmail.selenium.Selenium;

public class InicialPage {

	private static final WebDriver driver;

	static {

		driver = Selenium.getDriver();
		
		new WebDriverWait(driver, 100);

	}

	public static void visita() {

		driver.get(Property.SITE_ADDRESS);

	}

	public static void login() {

		WebElement linkLogin = driver.findElement(By.id("gmail-sign-in"));
		linkLogin.click();

	}

	public static void CadastroDeNovaContaPage() {

		WebElement btnCriarUmaConta = driver.findElement(By.id("gmail-create-account"));
		btnCriarUmaConta.click();

	}

}
