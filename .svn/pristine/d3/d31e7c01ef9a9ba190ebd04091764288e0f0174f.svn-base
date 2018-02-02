package teste;

import java.io.IOException;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import ru.yandex.qatools.allure.annotations.Description;
import page.object.ConsumidorVencedorPOM;
import ru.yandex.qatools.allure.annotations.Severity;
import ru.yandex.qatools.allure.annotations.Title;
import ru.yandex.qatools.allure.model.SeverityLevel;

@Title("Homologação  - Consumidor Vencedor")
public class ConsumidorVencedor {

	static WebDriver driver;
	protected ConsumidorVencedorPOM consumidorVencedor;
	
	@Title("Consumidor Vencedor - Novas Ações")
//	@Test
	@Description("Teste de validação de renderização de todos os campos disponíveis e exibição das mensagens dos campos obrigatórios")
	@Severity(value = SeverityLevel.NORMAL)
	public void test() throws InterruptedException, IOException {
		
		consumidorVencedor = new ConsumidorVencedorPOM(driver);
		consumidorVencedor.acessarPaginaPrincipal();
		consumidorVencedor.selecionarEstadoDoRJ();
		consumidorVencedor.acessarFormularioProblema();
	} 
	
	@Title("Consumidor Vencedor RJ - Vitórias")
//	@Test
	@Description("Teste de acesso a todas as decisões na íntegra")
	@Severity(value = SeverityLevel.NORMAL)
	public void testeVitorias() throws InterruptedException, IOException{
		
		consumidorVencedor = new ConsumidorVencedorPOM(driver);
		consumidorVencedor.acessarPaginaPrincipal();
		consumidorVencedor.selecionarEstadoDoRJ();
		consumidorVencedor.decisoesLanchoneteRestaurantes();
	}
	
	@Title("Consumidor Vencedor SP - Vitórias")
//	@Test
	@Description("Teste de validação dos formulários Denuncie o Descumprimento e Teve o mesmo problema com outra empresa?")
	@Severity(value = SeverityLevel.NORMAL)
	public void testeVitoriasSP() throws InterruptedException, IOException{
		
		consumidorVencedor = new ConsumidorVencedorPOM(driver);
		consumidorVencedor.acessarPaginaPrincipal();
		consumidorVencedor.acessarFormulariosNovasVitoriasSP();
	}
	
	
	@Title("Consumidor Vencedor RJ - Lanchonetes e Restaurantes")
//	@Test
	@Description("Teste de acesso a todas as decisões na íntegra")
	@Severity(value = SeverityLevel.NORMAL)
	public void decisoesIntegraLanchonetesRestaurantes() throws InterruptedException, IOException{
		
		consumidorVencedor = new ConsumidorVencedorPOM(driver);
		consumidorVencedor.acessarPaginaPrincipal();
		consumidorVencedor.selecionarEstadoDoRJ();
		consumidorVencedor.decisoesLanchoneteRestaurantes();
	}
	
	
	@Title("Consumidor Vencedor RJ - Lojas Físicas")
//	@Test
	@Description("Teste de acesso a todas as decisões na íntegra")
	@Severity(value = SeverityLevel.NORMAL)
	public void decisoesIntegraLojasFisicas() throws InterruptedException, IOException{
		
		consumidorVencedor = new ConsumidorVencedorPOM(driver);
		consumidorVencedor.acessarPaginaPrincipal();
		consumidorVencedor.selecionarEstadoDoRJ();
		consumidorVencedor.acessarDecisoesLojasFisicas();
	}
	
	@Title("Consumidor Vencedor RJ - Supermercados e Mercearias")
	@Test
	@Description("Teste de acesso a todas as decisões na íntegra")
	@Severity(value = SeverityLevel.NORMAL)
	public void decisoesIntegraMercadosMercearias() throws InterruptedException, IOException{
		
		consumidorVencedor = new ConsumidorVencedorPOM(driver);
		consumidorVencedor.acessarPaginaPrincipal();
		consumidorVencedor.selecionarEstadoDoRJ();
		consumidorVencedor.acessarDecisoesMercadosMercearias();
	}
	
	
	@After
	public void fecharNavegador(){
		
		consumidorVencedor.fecharNavegador();
	}

}
