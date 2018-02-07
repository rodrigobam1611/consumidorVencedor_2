package teste;

import java.io.IOException;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import page.object.ConsumidorVencedorSaudePOM;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Severity;
import ru.yandex.qatools.allure.annotations.Title;
import ru.yandex.qatools.allure.model.SeverityLevel;

@Title("Consumidor Vencedor - Produção")
public class ConsumidorVencedorSaude {

	static WebDriver driver;
	protected ConsumidorVencedorSaudePOM consumidorVencedorSaude;
	
	@Title("Consumidor Vencedor RJ - Farmácias e Drogarias")
//	@Test
	@Description("Teste de acesso à todas as decisões na íntegra")
	@Severity(value = SeverityLevel.NORMAL)
	public void testFarmaciasDrogarias() throws InterruptedException, IOException {
		
		consumidorVencedorSaude = new ConsumidorVencedorSaudePOM(driver);
		consumidorVencedorSaude.acessarPaginaPrincipal();
		consumidorVencedorSaude.selecionarEstadoDoRJ();
		consumidorVencedorSaude.acessarDecisoesFarmaDrogarias();
	} 
	
	@Title("Consumidor Vencedor RJ - Hospitais e Clínicas")
//	@Test
	@Description("Teste de acesso à todas as decisões na íntegra")
	@Severity(value = SeverityLevel.NORMAL)
	public void testHospitaisClinicas() throws InterruptedException, IOException {
		
		consumidorVencedorSaude = new ConsumidorVencedorSaudePOM(driver);
		consumidorVencedorSaude.acessarPaginaPrincipal();
		consumidorVencedorSaude.selecionarEstadoDoRJ();
		consumidorVencedorSaude.acessarDecisoesHospitaisClinicas();
	} 
	
	@Title("Consumidor Vencedor RJ - Medicamentos e Cosméticos")
//	@Test
	@Description("Teste de acesso à todas as decisões na íntegra")
	@Severity(value = SeverityLevel.NORMAL)
	public void testMedicamentosCosmeticos() throws InterruptedException, IOException {
		
		consumidorVencedorSaude = new ConsumidorVencedorSaudePOM(driver);
		consumidorVencedorSaude.acessarPaginaPrincipal();
		consumidorVencedorSaude.selecionarEstadoDoRJ();
		consumidorVencedorSaude.acessarDecisoesMedicamentosCosmeticos();
	} 
	
	@Title("Consumidor Vencedor RJ - Planos de Saúde")
//	@Test
	@Description("Teste de acesso à todas as decisões na íntegra")
	@Severity(value = SeverityLevel.NORMAL)
	public void testPlanosSaude() throws InterruptedException, IOException {
		
		consumidorVencedorSaude = new ConsumidorVencedorSaudePOM(driver);
		consumidorVencedorSaude.acessarPaginaPrincipal();
		consumidorVencedorSaude.selecionarEstadoDoRJ();
		consumidorVencedorSaude.acessarDecisoesPlanosSaude();
	} 
	
	@Title("Consumidor Vencedor RJ - Profissionais Liberais")
	@Test
	@Description("Teste de acesso à todas as decisões na íntegra")
	@Severity(value = SeverityLevel.NORMAL)
	public void testProfissionaisLiberais() throws InterruptedException, IOException {
		
		consumidorVencedorSaude = new ConsumidorVencedorSaudePOM(driver);
		consumidorVencedorSaude.acessarPaginaPrincipal();
		consumidorVencedorSaude.selecionarEstadoDoRJ();
		consumidorVencedorSaude.acessarDecisoesProfissionaisLiberais();
	} 
	
	@After
	public void fecharNavegador(){
		
		consumidorVencedorSaude.fecharNavegador();
	}

}
