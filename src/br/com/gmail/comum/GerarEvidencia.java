package br.com.gmail.comum;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.testng.annotations.Test;

import br.com.gmail.selenium.Property;

public class GerarEvidencia {

	@Test
	public static void print() throws AWTException, IOException {

		Date dataHoje = new Date();

		SimpleDateFormat formataData = new SimpleDateFormat("yyyyMMdd-HHmmss");
		String dataHoraDaExecucao = formataData.format(dataHoje);

		Robot robot = new Robot();
		
		int y = Toolkit.getDefaultToolkit().getScreenSize().width;
		int x = Toolkit.getDefaultToolkit().getScreenSize().height;
		
		robot.delay(3000);
		
		// Implementar codigo para extrair nome da classe de teste para a nomenclatura do arquivo de evidencia.
		String nomeDoArquivoDeEvidencia = dataHoraDaExecucao + " Evidência de teste." + Property.FORMATO;

		// Captura a tela na àrea definida pelo retângulo define as posições
		// x/y.
		robot.delay(3000);
		BufferedImage bi = robot.createScreenCapture(new Rectangle(0, 0, y, x));
		robot.delay(3000);
		
		// Salva a imagem
		ImageIO.write(bi, Property.FORMATO, new File(Property.CAMINHO_EVIDENCIA + nomeDoArquivoDeEvidencia));
		
	}
}
