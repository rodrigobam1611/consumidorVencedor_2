package decisoes.transporte;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TodasDecisoesTransporte {

	static WebElement element = null;
	static WebDriver driver;
	
	DecisoesAereo aereo;
	DecisoesBarcas barcas;
	
	public TodasDecisoesTransporte(WebDriver driver) {
		
		aereo = new DecisoesAereo(driver);
		barcas = new DecisoesBarcas(driver);
	}
	
	public void decisoesIntegraAereo() throws InterruptedException, IOException{
		
		aereo.acessarSecaoAereo();
		aereo.acessarDecisoesIntegraAereo();
	}
	
	public void decisoesIntegraBarcas() throws InterruptedException, IOException{
		
		barcas.acessarSecaoBarcas();
		barcas.acessarDecisoesIntegraBarcas();
	}
	
}
