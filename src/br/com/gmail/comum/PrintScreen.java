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

public class PrintScreen {

	@Test
	public static void geraEvidenciaDeTeste() throws AWTException, IOException {

		Date dataHoje = new Date();

		SimpleDateFormat formataData = new SimpleDateFormat("yyyyMMdd-HHmmss");
		String dataHoraDaExecucao = formataData.format(dataHoje);

		Robot robot = new Robot();
		
		int y = Toolkit.getDefaultToolkit().getScreenSize().width;
		int x = Toolkit.getDefaultToolkit().getScreenSize().height;
		
		// Implementar codigo para extrair nome da classe de teste para a nomenclatura do arquivo de evidencia.
		String nomeDoArquivoDeEvidencia = dataHoraDaExecucao + " Evidência de teste." + Property.FORMATO;

		// Captura a tela na área definida pelo retângulo define as posições
		// x/y.
		BufferedImage bi = robot.createScreenCapture(new Rectangle(0, 0, y, x));

		// Salva a imagem
		ImageIO.write(bi, Property.FORMATO, new File(Property.CAMINHO_EVIDENCIA + nomeDoArquivoDeEvidencia));
		
		robot.delay(1000);
		
	}
}
