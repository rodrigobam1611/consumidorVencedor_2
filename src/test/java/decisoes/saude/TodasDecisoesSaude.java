package decisoes.saude;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.sun.glass.ui.Robot;

public class TodasDecisoesSaude {

	static WebElement element = null;
	static WebDriver driver;
	
	DecisoesFarmaciasDrogarias farmaciasDrogarias;
	DecisoesHospitaisClinicas hospitaisClinicas;
	DecisoesMedicamentosCosmeticos medicamentosCosmeticos;
	DecisoesPlanosSaude planosSaude;
	DecisoesProfissionaisLiberais profissionaisLiberais;
	
	public TodasDecisoesSaude(WebDriver driver) {
		
		farmaciasDrogarias = new DecisoesFarmaciasDrogarias(driver);
		hospitaisClinicas = new DecisoesHospitaisClinicas(driver);
		medicamentosCosmeticos = new DecisoesMedicamentosCosmeticos(driver);
		planosSaude = new DecisoesPlanosSaude(driver);
		profissionaisLiberais = new DecisoesProfissionaisLiberais(driver);
	}
	
	public void decisoesIntegraFarmaDrogarias() throws InterruptedException, IOException{
		
		farmaciasDrogarias.acessarSecaoFarmaciasDrogarias();
		farmaciasDrogarias.acessarDecisoesIntegraFarmaciasDrogarias();
	}
	
	public void decisoesIntegraHospitaisClinicas() throws InterruptedException, IOException{
		
		hospitaisClinicas.acessarSecaoHospitaisClinicas();
		hospitaisClinicas.acessarDecisoesIntegraHospitaisClinicas();
	}
	
	public void decisoesIntegraMedicamentosCosmeticos() throws InterruptedException, IOException{
		
		medicamentosCosmeticos.acessarSecaoMedicamentosCosmeticos();
		medicamentosCosmeticos.acessarDecisoesIntegraMedicamentosCosmeticos();
	}
	
	public void decisoesIntegraPlanosSaude() throws InterruptedException, IOException{
		
		planosSaude.acessarSecaoPlanosSaude();
		planosSaude.acessarDecisoesIntegraPlanosSaude();
	}
	
	public void decisoesIntegraProfissionaisLiberais() throws InterruptedException, IOException{
		
		profissionaisLiberais.acessarSecaoProfissionaisLiberais();
		profissionaisLiberais.acessarDecisoesIntegraProfissionaisLiberais();
	}
	
}
