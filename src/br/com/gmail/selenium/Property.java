package br.com.gmail.selenium;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

/*
 * Classe que define o caminho dos diferentes browsers e retorna as configurações definidas no config.properties
 */
public class Property {
	
	public static String IE_DRIVE_PATH;
	public static String FIREFOX_DRIVE_PATH;
	public static String CHROME_DRIVE_PATH;
	public static String PHANTOMJS_DRIVE_PATH;
	public static String HTML_UNIT_DRIVE_PATH;

	public static final String PROPERTIES_FILE = "br/com/gmail/config.properties";
	public static final String BROWSER_NAME;
	public static final String SITE_ADDRESS;
	public static final String USERNAME;
	public static final String PASSWORD;
	public static final String CONNECT_STRING;
	public static final String CAMINHO_EVIDENCIA;
	public static final String FORMATO;
	
	static {

		IE_DRIVE_PATH = new File("../").getAbsolutePath() + "\\IEDriverServer32.exe";
		FIREFOX_DRIVE_PATH = new File("").getAbsolutePath() + "\\Applications\\Firefox.app";
		CHROME_DRIVE_PATH = new File("../").getAbsolutePath() + "\\Applications\\Google Chrome.app";
		PHANTOMJS_DRIVE_PATH = new File("../").getAbsolutePath() + "\\phantomjs.exe";

		BROWSER_NAME = get("browser.name");
		SITE_ADDRESS = get("site.address");
		USERNAME = get("username");
		PASSWORD = get("password");
		CONNECT_STRING = get("");
		CAMINHO_EVIDENCIA = get("caminho.evidencia");
		FORMATO = get("formato");

	}

	/*
	 * Metodo para carregar o valor de alguma propriedade no arquivo
	 * config.properties
	 */
	private static String get(String name) {
		Properties properties = new Properties();
		String value = null;

		try {
			properties.load(Property.class.getClassLoader().getResourceAsStream(PROPERTIES_FILE));
			value = properties.getProperty(name);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}
}