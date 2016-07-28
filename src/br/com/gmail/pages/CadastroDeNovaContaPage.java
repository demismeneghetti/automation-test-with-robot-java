package br.com.gmail.pages;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.gmail.comum.TecladoVirtual;
import br.com.gmail.selenium.Selenium;

public class CadastroDeNovaContaPage {

	private static final WebDriver driver;

	static {

		driver = Selenium.getDriver();

		new WebDriverWait(driver, 100);

	}

	public static void cadastra(String primeironome, String ultimonome, String emailgmail, String senha,
			String confirmasenha, String dianascimento, String mesnascimento, String anonascimento, String telefone,
			String emailatual) throws AWTException {

		WebElement txtPrimeiroNome = driver.findElement(By.id("FirstName"));
		WebElement txtUltimoNome = driver.findElement(By.id("LastName"));
		WebElement txtEmailGmail = driver.findElement(By.id("GmailAddress"));
		WebElement txtSenha = driver.findElement(By.id("Passwd"));
		WebElement txtConfirmaSenha = driver.findElement(By.id("PasswdAgain"));
		WebElement txtDiaNascimento = driver.findElement(By.id("BirthDay"));
		WebElement txtAnoNascimento = driver.findElement(By.id("BirthYear"));
		WebElement txtTelefone = driver.findElement(By.id("RecoveryPhoneNumber"));
		WebElement txtEmailAtual = driver.findElement(By.id("RecoveryEmailAddress"));
		WebElement btProximaEtapa = driver.findElement(By.id("submitbutton"));
		WebElement btConcordo = driver.findElement(By.id("iagreebutton"));

		txtPrimeiroNome.sendKeys(primeironome);
		txtUltimoNome.sendKeys(ultimonome);
		txtEmailGmail.sendKeys(emailgmail);
		txtSenha.sendKeys(senha);
		txtConfirmaSenha.sendKeys(confirmasenha);
		txtDiaNascimento.sendKeys(dianascimento);
		selecionaComboMesNascimento();
		txtAnoNascimento.sendKeys(anonascimento);
		selecionaComboSexo();
		txtTelefone.sendKeys(telefone);
		txtEmailAtual.sendKeys(emailatual);
		btProximaEtapa.click();
		TecladoVirtual.END();
		btConcordo.click();

	}
	
	public static void selecionaComboMesNascimento() throws AWTException{
		
		TecladoVirtual.TAB();
		TecladoVirtual.UP();
		TecladoVirtual.UP();
		TecladoVirtual.UP();
		TecladoVirtual.ENTER();
		
	}
	
	public static void selecionaComboSexo() throws AWTException{
		
		TecladoVirtual.TAB();
		TecladoVirtual.UP();
		TecladoVirtual.UP();
		TecladoVirtual.UP();
		TecladoVirtual.UP();
		TecladoVirtual.ENTER();
		
	}
	
}
