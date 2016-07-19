package br.com.gmail.test.login;

import org.testng.annotations.Test;

import br.com.gmail.pages.Inicial;

public class TestFluxoLogin {

	@Test
	public static void loginValido() {

		Inicial.visita();
		Inicial.login();
		
	}

	@Test
	public static void loginInvalido() {

	}

	@Test
	public static void loginEmBranco() {

	}

	@Test
	public static void loginSemUsuario() {

	}

	@Test
	public static void loginSemSenha() {

	}

}
