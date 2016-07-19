package br.com.gmail.estudo;

public class AbreExecutavelTest {

	public static void main(String[] args) {

		try {

			Process process = Runtime.getRuntime().exec("%windir%/system32/calc.exe");

			if (process.exitValue() == 0) {
				System.out.println("Programa terminou normalmente");
			}

		} catch (Exception e) {

		}

	}
}
