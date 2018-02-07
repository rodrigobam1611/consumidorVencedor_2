package decisoes.servicos;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TodasDecisoesServicos {

	static WebElement element = null;
	static WebDriver driver;
	
	DecisoesAcademiasAfins academiasAfins;
	DecisoesAssitenciaJuridica assitenciaJuridica;
	DecisoesAssitenciaTecnica assitenciaTecnica;
	DecisoesDetran detran;
	DecisoesEstacionamentos estacionamentos;
	DecisoesFunerarios funerarios;
	DecisoesGas gas;
	DecisoesLuz luz;
	DecisoesPostal postal;
	DecisoesProconVigSanitaria proconVigSanitaria;
	DecisoesSAC sac;
	DecisoesServicosOnline servicosOnline;
	DecisoesAgua agua;
	
	public TodasDecisoesServicos(WebDriver driver) {
		
		academiasAfins = new DecisoesAcademiasAfins(driver);
		assitenciaJuridica = new DecisoesAssitenciaJuridica(driver);
		assitenciaTecnica = new DecisoesAssitenciaTecnica(driver);
		detran = new DecisoesDetran(driver);
		estacionamentos = new DecisoesEstacionamentos(driver);
		funerarios = new DecisoesFunerarios(driver);
		gas = new DecisoesGas(driver);
		luz = new DecisoesLuz(driver);
		postal = new DecisoesPostal(driver);
		proconVigSanitaria = new DecisoesProconVigSanitaria(driver);
		sac = new DecisoesSAC(driver);
		servicosOnline = new DecisoesServicosOnline(driver);
		agua = new DecisoesAgua(driver);
	}
	
	public void decisoesIntegraAcademiasAfins() throws InterruptedException, IOException{
		
		academiasAfins.acessarSecaoAcademiasAfins();
		academiasAfins.acessarDecisoesIntegraAcademiasAfins();
	}
	
	public void decisoesIntegraAssistenciaJuridica() throws InterruptedException, IOException{
		
		assitenciaJuridica.acessarSecaoAssistenciaJuridica();
		assitenciaJuridica.acessarDecisoesIntegraAssistenciaJuridica();
	}
	
	public void decisoesIntegraAssistenciaTecnica() throws InterruptedException, IOException{
		
		assitenciaTecnica.acessarSecaoAssistenciaTecnica();
		assitenciaTecnica.acessarDecisoesIntegraAssistenciaTecnica();
	}
	
	public void decisoesIntegraDetran() throws InterruptedException, IOException{
		
		detran.acessarSecaoDetran();
		detran.acessarDecisoesIntegraDetran();
	}
	
	public void decisoesIntegraEstacionamentos() throws InterruptedException, IOException{
		
		estacionamentos.acessarSecaoEstacionamentos();
		estacionamentos.acessarDecisoesIntegraEstacionamentos();
	}
	
	public void decisoesIntegraFunerarios() throws InterruptedException, IOException{
		
		funerarios.acessarSecaoFunerarios();
		funerarios.acessarDecisoesIntegraFunerarios();
	}
	
	public void decisoesIntegraGas() throws InterruptedException, IOException{
		
		gas.acessarSecaoGas();
		gas.acessarDecisoesIntegraGas();
	}
	
	public void decisoesIntegraLuz() throws InterruptedException, IOException{
		
		luz.acessarSecaoLuz();
		luz.acessarDecisoesIntegraLuz();
	}
	
	public void decisoesIntegraPostal() throws InterruptedException, IOException{
		
		postal.acessarSecaoPostal();
		postal.acessarDecisoesIntegraPostal();
	}
	
	public void decisoesIntegraProconVigSanitaria() throws InterruptedException, IOException{
		
		proconVigSanitaria.acessarSecaoProconVigSanitaria();
		proconVigSanitaria.acessarDecisoesIntegraProconVigSanitaria();
	}
	
	public void decisoesIntegraSAC() throws InterruptedException, IOException{
		
		sac.acessarSecaoSAC();
		sac.acessarDecisoesIntegraSAC();
	}
	
	public void decisoesIntegraServicosOnline() throws InterruptedException, IOException{
		
		servicosOnline.acessarSecaoServicosOnline();
		servicosOnline.acessarDecisoesIntegraServicosOnline();
	}
	
	public void decisoesIntegraAgua() throws InterruptedException, IOException{
		
		agua.acessarSecaoAgua();
		agua.acessarDecisoesIntegraAgua();
	}
}
