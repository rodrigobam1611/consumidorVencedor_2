package teste;

import java.io.IOException;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import page.object.ConsumidorVencedorProdutosPOM;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Severity;
import ru.yandex.qatools.allure.annotations.Title;
import ru.yandex.qatools.allure.model.SeverityLevel;

@Title("Consumidor Vencedor - Produção")
public class ConsumidorVencedorProdutos {

	static WebDriver driver;
	protected ConsumidorVencedorProdutosPOM consumidorVencedorProdutos;
	
	@Title("Consumidor Vencedor RJ - Papelarias e Livros")
//	@Test
	@Description("Teste de acesso à todas as decisões na íntegra")
	@Severity(value = SeverityLevel.NORMAL)
	public void test() throws InterruptedException, IOException {
		
		consumidorVencedorProdutos = new ConsumidorVencedorProdutosPOM(driver);
		consumidorVencedorProdutos.acessarPaginaPrincipal();
		consumidorVencedorProdutos.selecionarEstadoDoRJ();
		consumidorVencedorProdutos.acessarDecisoesPapelariasLivros();
	} 
	
	@Title("Consumidor Vencedor RJ - Químicos e Biológicos")
//	@Test
	@Description("Teste de acesso à todas as decisões na íntegra")
	@Severity(value = SeverityLevel.NORMAL)
	public void testQuimicosBio() throws InterruptedException, IOException {
		
		consumidorVencedorProdutos = new ConsumidorVencedorProdutosPOM(driver);
		consumidorVencedorProdutos.acessarPaginaPrincipal();
		consumidorVencedorProdutos.selecionarEstadoDoRJ();
		consumidorVencedorProdutos.acessarDecisoesQuimicosBio();
	} 
	
	@Title("Consumidor Vencedor RJ - Veículos")
	@Test
	@Description("Teste de acesso à todas as decisões na íntegra")
	@Severity(value = SeverityLevel.NORMAL)
	public void testVeiculos() throws InterruptedException, IOException {
		
		consumidorVencedorProdutos = new ConsumidorVencedorProdutosPOM(driver);
		consumidorVencedorProdutos.acessarPaginaPrincipal();
		consumidorVencedorProdutos.selecionarEstadoDoRJ();
		consumidorVencedorProdutos.acessarDecisoesVeiculos();
	} 
	
	@After
	public void fecharNavegador(){
		
		consumidorVencedorProdutos.fecharNavegador();
	}

}
