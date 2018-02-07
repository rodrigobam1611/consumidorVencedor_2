package teste;

import java.io.IOException;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import page.object.ConsumidorVencedorTelecomPOM;
import page.object.ConsumidorVencedorTransportePOM;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Severity;
import ru.yandex.qatools.allure.annotations.Title;
import ru.yandex.qatools.allure.model.SeverityLevel;

@Title("Consumidor Vencedor - Produção")
public class ConsumidorVencedorTransporte {

	static WebDriver driver;
	protected ConsumidorVencedorTransportePOM consumidorVencedorTransporte;
	
	@Title("Consumidor Vencedor RJ - Aéreo")
//	@Test
	@Description("Teste de acesso à todas as decisões na íntegra")
	@Severity(value = SeverityLevel.NORMAL)
	public void testAereo() throws InterruptedException, IOException {
		
		consumidorVencedorTransporte = new ConsumidorVencedorTransportePOM(driver);
		consumidorVencedorTransporte.acessarPaginaPrincipal();
		consumidorVencedorTransporte.selecionarEstadoDoRJ();
		consumidorVencedorTransporte.acessarDecisoesAereo();
	} 
	
	@Title("Consumidor Vencedor RJ - Barcas")
	@Test
	@Description("Teste de acesso à todas as decisões na íntegra")
	@Severity(value = SeverityLevel.NORMAL)
	public void testBarcas() throws InterruptedException, IOException {
		
		consumidorVencedorTransporte = new ConsumidorVencedorTransportePOM(driver);
		consumidorVencedorTransporte.acessarPaginaPrincipal();
		consumidorVencedorTransporte.selecionarEstadoDoRJ();
		consumidorVencedorTransporte.acessarDecisoesBarcas();
	} 
	
	
	@After
	public void fecharNavegador(){
		
		consumidorVencedorTransporte.fecharNavegador();
	}

}
