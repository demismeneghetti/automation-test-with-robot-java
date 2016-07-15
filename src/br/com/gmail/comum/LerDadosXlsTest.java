package br.com.gmail.comum;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class LerDadosXlsTest {

	public static void main(String[] args) throws BiffException, IOException {

		/*** Carrega a planilha ***/
		Workbook workbook = Workbook.getWorkbook(new File("input\\teste.xls"));

		/***
		 * Aqui � feito o controle de qual aba do xls ser� realizada a leitura
		 * dos dados
		 ***/
		Sheet sheet = workbook.getSheet(0);

		/*** Numero de linhas com dados do xls ***/
		int linhas = sheet.getRows();

		for (int i = 1; i < linhas; i++) {

			Cell coluna1 = sheet.getCell(0, i);
			Cell coluna2 = sheet.getCell(1, i);
			Cell coluna3 = sheet.getCell(2, i);
			Cell coluna4 = sheet.getCell(3, i);
			Cell coluna5 = sheet.getCell(4, i);

			String conteudoCelula1 = coluna1.getContents();
			String conteudoCelula2 = coluna2.getContents();
			String conteudoCelula3 = coluna3.getContents();
			String conteudoCelula4 = coluna4.getContents();
			String conteudoCelula5 = coluna5.getContents();

			System.out.println("Conte�do da c�lula 1: " + conteudoCelula1);
			System.out.println("Conte�do da c�lula 2: " + conteudoCelula2);
			System.out.println("Conte�do da c�lula 3: " + conteudoCelula3);
			System.out.println("Conte�do da c�lula 4: " + conteudoCelula4);
			System.out.println("Conte�do da c�lula 5: " + conteudoCelula5);

		}

	}

}
