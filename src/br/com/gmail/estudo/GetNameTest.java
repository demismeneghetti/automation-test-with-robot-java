package br.com.gmail.estudo;

public class GetNameTest {

	public static void main(String[] args) {

		System.out.println(getNomeClasse());
		System.out.println(getNomeMetodo());

	}

	public static String getNomeClasse() {

		String className = Thread.currentThread().getStackTrace()[2].getFileName();
		className = Thread.currentThread().getStackTrace()[1].getFileName();
		return className;

	}

	public static String getNomeMetodo() {

		String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
		methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		return methodName;

	}

}
