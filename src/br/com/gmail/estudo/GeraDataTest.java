package br.com.gmail.estudo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GeraDataTest {

	public static void main(String[] args) {

	}

	public static void GeraData() {

		Date dataHoje = new Date();
		SimpleDateFormat formataData = new SimpleDateFormat("yyyyMMdd-hhmm");
		String data = formataData.format(dataHoje);

		System.out.println(data);

	}

}
