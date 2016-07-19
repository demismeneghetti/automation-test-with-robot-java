package br.com.gmail.estudo;

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

public class PrintScreenTest {

	public static String getNomeClasse() {

		String className = Thread.currentThread().getStackTrace()[2].getFileName();
		className = Thread.currentThread().getStackTrace()[1].getFileName();
		return className;

	}

	public static void main(String[] args) throws AWTException, IOException {

		try {

			Date dataHoje = new Date();

			SimpleDateFormat formataData = new SimpleDateFormat("yyyyMMdd-HHmmss");
			String dataHoraDaExecucao = formataData.format(dataHoje);

			Robot robot = new Robot();

			String formatoArquivoDeEvidencia = "jpg";
			String nomeDoArquivoDeEvidencia = dataHoraDaExecucao + " Evidência de teste." + formatoArquivoDeEvidencia;

			// Captura toda extensão da tela.
			int y = Toolkit.getDefaultToolkit().getScreenSize().width;
			int x = Toolkit.getDefaultToolkit().getScreenSize().height;

			// Captura a tela na àrea definida pelo retângulo define as posições
			// x/y.
			BufferedImage bi = robot.createScreenCapture(new Rectangle(0, 0, y, x));

			// Salva a imagem
			ImageIO.write(bi, formatoArquivoDeEvidencia,
					new File("C://Users//br3dm7//Desktop//" + nomeDoArquivoDeEvidencia));

		}

		catch (AWTException | IOException ex) {
			System.err.println(ex);

		}
	}
}
