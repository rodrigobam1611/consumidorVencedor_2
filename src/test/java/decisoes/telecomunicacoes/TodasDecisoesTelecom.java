package decisoes.telecomunicacoes;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TodasDecisoesTelecom {

	static WebElement element = null;
	static WebDriver driver;
	
	DecisoesInternet internet;
	DecisoesTVAssinatura tvAssinatura;
	DecisoesTelefonia telefonia;
	
	public TodasDecisoesTelecom(WebDriver driver) {
		
		internet = new DecisoesInternet(driver);
		tvAssinatura = new DecisoesTVAssinatura(driver);
		telefonia = new DecisoesTelefonia(driver);
	}
	
	public void decisoesIntegraInternet() throws InterruptedException, IOException{
		
		internet.acessarSecaoInternet();
		internet.acessarDecisoesIntegraInternet();
	}
	
	public void decisoesIntegraTVAssinatura() throws InterruptedException, IOException{
		
		tvAssinatura.acessarSecaoTVAssinatura();
		tvAssinatura.acessarDecisoesIntegraTVAssinatura();
	}
	
	public void decisoesIntegraTelefonia() throws InterruptedException, IOException{
		
		telefonia.acessarSecaoTelefonia();
		telefonia.acessarDecisoesIntegraTelefonia();
	}
}
