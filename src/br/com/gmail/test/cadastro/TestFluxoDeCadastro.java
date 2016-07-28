package br.com.gmail.test.cadastro;

import java.awt.AWTException;

import org.testng.annotations.Test;

import br.com.gmail.pages.CadastroDeNovaContaPage;
import br.com.gmail.pages.InicialPage;

public class TestFluxoDeCadastro {

	@Test
	public static void cadastroValido() throws AWTException {

		InicialPage.visita();
		InicialPage.CadastroDeNovaContaPage();
		CadastroDeNovaContaPage.cadastra("João", "Silva", "email20160728", "senha20160728", "senha20160728", "30",
				"Novembro", "1980", "11988776655", "emailatual@teste.com.br");

		
		
	}

	@Test
	public static void cadastroSemPrimeiroNova() {

	}

	@Test
	public static void cadastroSemUserName() {

	}

	@Test
	public static void cadsatroSemPassword() {

	}

	@Test
	public static void cadastroSemConfirmacaoDePassword() {

	}

	@Test
	public static void cadastroSemMesDeNascimeto() {

	}

	@Test
	public static void cadastroSemDiaDeNascimeto() {

	}

	@Test
	public static void cadastroSemAnoDeNascimeto() {

	}

	@Test
	public static void cadastroSemGenero() {

	}

	@Test
	public static void cadastroSemTelefone() {

	}

	@Test
	public static void cadastroSemEmailAtual() {

	}

}
