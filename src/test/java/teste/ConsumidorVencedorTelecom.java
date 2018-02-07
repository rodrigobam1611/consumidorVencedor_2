package teste;

import java.io.IOException;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import page.object.ConsumidorVencedorTelecomPOM;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Severity;
import ru.yandex.qatools.allure.annotations.Title;
import ru.yandex.qatools.allure.model.SeverityLevel;

@Title("Consumidor Vencedor - Produção")
public class ConsumidorVencedorTelecom {

	static WebDriver driver;
	protected ConsumidorVencedorTelecomPOM consumidorVencedorTelecom;
	
	@Title("Consumidor Vencedor RJ - Internet")
//	@Test
	@Description("Teste de acesso à todas as decisões na íntegra")
	@Severity(value = SeverityLevel.NORMAL)
	public void testAcademiasAfins() throws InterruptedException, IOException {
		
		consumidorVencedorTelecom = new ConsumidorVencedorTelecomPOM(driver);
		consumidorVencedorTelecom.acessarPaginaPrincipal();
		consumidorVencedorTelecom.selecionarEstadoDoRJ();
		consumidorVencedorTelecom.acessarDecisoesInternet();
	} 
	
	@Title("Consumidor Vencedor RJ - TV por Assinatura")
//	@Test
	@Description("Teste de acesso à todas as decisões na íntegra")
	@Severity(value = SeverityLevel.NORMAL)
	public void testTVassinatura() throws InterruptedException, IOException {
		
		consumidorVencedorTelecom = new ConsumidorVencedorTelecomPOM(driver);
		consumidorVencedorTelecom.acessarPaginaPrincipal();
		consumidorVencedorTelecom.selecionarEstadoDoRJ();
		consumidorVencedorTelecom.acessarDecisoesTVAssinatura();
	}
	
	@Title("Consumidor Vencedor RJ - Telefonia (Fixa e Móvel)")
	@Test
	@Description("Teste de acesso à todas as decisões na íntegra")
	@Severity(value = SeverityLevel.NORMAL)
	public void testTelefonia() throws InterruptedException, IOException {
		
		consumidorVencedorTelecom = new ConsumidorVencedorTelecomPOM(driver);
		consumidorVencedorTelecom.acessarPaginaPrincipal();
		consumidorVencedorTelecom.selecionarEstadoDoRJ();
		consumidorVencedorTelecom.acessarDecisoesTelefonia();
	}
	
	@After
	public void fecharNavegador(){
		
		consumidorVencedorTelecom.fecharNavegador();
	}

}
