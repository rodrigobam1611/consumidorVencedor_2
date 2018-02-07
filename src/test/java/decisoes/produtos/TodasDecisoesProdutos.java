package decisoes.produtos;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TodasDecisoesProdutos {

	static WebElement element = null;
	static WebDriver driver;
	DecisoesPapelariasLivros papelariasLivros;
	DecisoesQuimicosBiologicos quimicosBiologicos;
	DecisoesVeiculos veiculos;
	
	public TodasDecisoesProdutos(WebDriver driver) {
		
		papelariasLivros = new DecisoesPapelariasLivros(driver);
		quimicosBiologicos = new DecisoesQuimicosBiologicos(driver);
		veiculos = new DecisoesVeiculos(driver);
	}
	
	public void decisoesIntegraPapelariasLivros() throws InterruptedException, IOException{
		
		papelariasLivros.acessarSecaoPapelariasLivros();
		papelariasLivros.acessarDecisoesIntegraPapelariasLivros();
	}
	
	public void decisoesIntegraQuimicosBio() throws InterruptedException, IOException{
		
		quimicosBiologicos.acessarSecaoQuimicosBio();
		quimicosBiologicos.acessarDecisoesIntegraQuimicosBio();
	}
	
	public void decisoesIntegraVeiculos() throws InterruptedException, IOException{
		
		veiculos.acessarSecaoVeiculos();
		veiculos.acessarDecisoesIntegraVeiculos();
	}
	
}
