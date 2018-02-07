package teste;

import java.io.IOException;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import page.object.ConsumidorVencedorSaudePOM;
import page.object.ConsumidorVencedorServicosPOM;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Severity;
import ru.yandex.qatools.allure.annotations.Title;
import ru.yandex.qatools.allure.model.SeverityLevel;

@Title("Consumidor Vencedor - Produção")
public class ConsumidorVencedorServicos {

	static WebDriver driver;
	protected ConsumidorVencedorServicosPOM consumidorVencedorServicos;
	
	@Title("Consumidor Vencedor RJ - Academias e afins")
//	@Test
	@Description("Teste de acesso à todas as decisões na íntegra")
	@Severity(value = SeverityLevel.NORMAL)
	public void testAcademiasAfins() throws InterruptedException, IOException {
		
		consumidorVencedorServicos = new ConsumidorVencedorServicosPOM(driver);
		consumidorVencedorServicos.acessarPaginaPrincipal();
		consumidorVencedorServicos.selecionarEstadoDoRJ();
		consumidorVencedorServicos.acessarDecisoesAcademiasAfins();
	} 
	
	@Title("Consumidor Vencedor RJ - Assistência Jurídica")
//	@Test
	@Description("Teste de acesso à todas as decisões na íntegra")
	@Severity(value = SeverityLevel.NORMAL)
	public void testAssistênciaJuridica() throws InterruptedException, IOException {
		
		consumidorVencedorServicos = new ConsumidorVencedorServicosPOM(driver);
		consumidorVencedorServicos.acessarPaginaPrincipal();
		consumidorVencedorServicos.selecionarEstadoDoRJ();
		consumidorVencedorServicos.acessarDecisoesAssistenciaJuridica();
	} 
	
	@Title("Consumidor Vencedor RJ - Assistência Técnica")
//	@Test
	@Description("Teste de acesso à todas as decisões na íntegra")
	@Severity(value = SeverityLevel.NORMAL)
	public void testAssistênciaTecnica() throws InterruptedException, IOException {
		
		consumidorVencedorServicos = new ConsumidorVencedorServicosPOM(driver);
		consumidorVencedorServicos.acessarPaginaPrincipal();
		consumidorVencedorServicos.selecionarEstadoDoRJ();
		consumidorVencedorServicos.acessarDecisoesAssistenciaTecnica();
	} 
	
	@Title("Consumidor Vencedor RJ - Detran")
//	@Test
	@Description("Teste de acesso à todas as decisões na íntegra")
	@Severity(value = SeverityLevel.NORMAL)
	public void testDetran() throws InterruptedException, IOException {
		
		consumidorVencedorServicos = new ConsumidorVencedorServicosPOM(driver);
		consumidorVencedorServicos.acessarPaginaPrincipal();
		consumidorVencedorServicos.selecionarEstadoDoRJ();
		consumidorVencedorServicos.acessarDecisoesDetran();
	} 
	
	@Title("Consumidor Vencedor RJ - Estacionamentos")
//	@Test
	@Description("Teste de acesso à todas as decisões na íntegra")
	@Severity(value = SeverityLevel.NORMAL)
	public void testEstacionamentos() throws InterruptedException, IOException {
		
		consumidorVencedorServicos = new ConsumidorVencedorServicosPOM(driver);
		consumidorVencedorServicos.acessarPaginaPrincipal();
		consumidorVencedorServicos.selecionarEstadoDoRJ();
		consumidorVencedorServicos.acessarDecisoesEstacionamentos();
	} 
	
	@Title("Consumidor Vencedor RJ - Funerários")
//	@Test
	@Description("Teste de acesso à todas as decisões na íntegra")
	@Severity(value = SeverityLevel.NORMAL)
	public void testFunerarios() throws InterruptedException, IOException {
		
		consumidorVencedorServicos = new ConsumidorVencedorServicosPOM(driver);
		consumidorVencedorServicos.acessarPaginaPrincipal();
		consumidorVencedorServicos.selecionarEstadoDoRJ();
		consumidorVencedorServicos.acessarDecisoesFunerarios();
	} 
	
	@Title("Consumidor Vencedor RJ - Gás")
//	@Test
	@Description("Teste de acesso à todas as decisões na íntegra")
	@Severity(value = SeverityLevel.NORMAL)
	public void testGas() throws InterruptedException, IOException {
		
		consumidorVencedorServicos = new ConsumidorVencedorServicosPOM(driver);
		consumidorVencedorServicos.acessarPaginaPrincipal();
		consumidorVencedorServicos.selecionarEstadoDoRJ();
		consumidorVencedorServicos.acessarDecisoesGas();
	} 
	
	@Title("Consumidor Vencedor RJ - Luz")
//	@Test
	@Description("Teste de acesso à todas as decisões na íntegra")
	@Severity(value = SeverityLevel.NORMAL)
	public void testLuz() throws InterruptedException, IOException {
		
		consumidorVencedorServicos = new ConsumidorVencedorServicosPOM(driver);
		consumidorVencedorServicos.acessarPaginaPrincipal();
		consumidorVencedorServicos.selecionarEstadoDoRJ();
		consumidorVencedorServicos.acessarDecisoesLuz();
	} 
	
	@Title("Consumidor Vencedor RJ - Postal")
//	@Test
	@Description("Teste de acesso à todas as decisões na íntegra")
	@Severity(value = SeverityLevel.NORMAL)
	public void testPostal() throws InterruptedException, IOException {
		
		consumidorVencedorServicos = new ConsumidorVencedorServicosPOM(driver);
		consumidorVencedorServicos.acessarPaginaPrincipal();
		consumidorVencedorServicos.selecionarEstadoDoRJ();
		consumidorVencedorServicos.acessarDecisoesPostal();
	}
	
	@Title("Consumidor Vencedor RJ - Procons e Vigilância Sanitária (Criação e Estruturação)")
//	@Test
	@Description("Teste de acesso à todas as decisões na íntegra")
	@Severity(value = SeverityLevel.NORMAL)
	public void testProconVigSanitaria() throws InterruptedException, IOException {
		
		consumidorVencedorServicos = new ConsumidorVencedorServicosPOM(driver);
		consumidorVencedorServicos.acessarPaginaPrincipal();
		consumidorVencedorServicos.selecionarEstadoDoRJ();
		consumidorVencedorServicos.acessarDecisoesProconVigSanitaria();
	}
	
	@Title("Consumidor Vencedor RJ - SAC")
//	@Test
	@Description("Teste de acesso à todas as decisões na íntegra")
	@Severity(value = SeverityLevel.NORMAL)
	public void testSAC() throws InterruptedException, IOException {
		
		consumidorVencedorServicos = new ConsumidorVencedorServicosPOM(driver);
		consumidorVencedorServicos.acessarPaginaPrincipal();
		consumidorVencedorServicos.selecionarEstadoDoRJ();
		consumidorVencedorServicos.acessarDecisoesSAC();
	}
	
	@Title("Consumidor Vencedor RJ - Serviços On-line(E-mails, Aplicativos, Redes Sociais, Hospedagem, etc.)")
//	@Test
	@Description("Teste de acesso à todas as decisões na íntegra")
	@Severity(value = SeverityLevel.NORMAL)
	public void testServicosOnline() throws InterruptedException, IOException {
		
		consumidorVencedorServicos = new ConsumidorVencedorServicosPOM(driver);
		consumidorVencedorServicos.acessarPaginaPrincipal();
		consumidorVencedorServicos.selecionarEstadoDoRJ();
		consumidorVencedorServicos.acessarDecisoesServicosOnline();
	}
	
	@Title("Consumidor Vencedor RJ - Água")
	@Test
	@Description("Teste de acesso à todas as decisões na íntegra")
	@Severity(value = SeverityLevel.NORMAL)
	public void testAgua() throws InterruptedException, IOException {
		
		consumidorVencedorServicos = new ConsumidorVencedorServicosPOM(driver);
		consumidorVencedorServicos.acessarPaginaPrincipal();
		consumidorVencedorServicos.selecionarEstadoDoRJ();
		consumidorVencedorServicos.acessarDecisoesAgua();
	}
	
	
	@After
	public void fecharNavegador(){
		
		consumidorVencedorServicos.fecharNavegador();
	}

}
