package page.object;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.output.ByteArrayOutputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import browsers.Navegadores;
import decisoes.produtos.TodasDecisoesProdutos;
import decisoes.saude.TodasDecisoesSaude;
import decisoes.servicos.TodasDecisoesServicos;
import ru.yandex.qatools.allure.annotations.Attachment;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class ConsumidorVencedorServicosPOM{
	
	static WebElement element = null;
	static WebDriver driver;
	static String BASE_URL = "http://consumidorvencedor.mp.br/";
	static String BASE_URL_RJ = "http://h-jbossweblr01.pgj.rj.gov.br:8080/web/consumidorvencedor-rj/home";
	
	public ConsumidorVencedorServicosPOM(WebDriver driver) {
	
		this.driver = driver;
	}
	
	public void acessarPaginaPrincipal(){
		
		this.driver = Navegadores.GoogleChrome(BASE_URL);
	}
	
	public void selecionarEstadoDoRJ(){
		
		//abre a lista de opções de Estados
		element = driver.findElement(By.id("ul-lista"));
		element.click();
		
		//seleciona o Estado do Rio de Janeiro
		element = driver.findElement(By.xpath("//li[@class='link-estado'][15]/a"));
		element.click();
//		driver.navigate().to(BASE_URL_RJ);
	}
	
	public void acessarDecisoesAcademiasAfins() throws InterruptedException, IOException{
		
		TodasDecisoesServicos academiasAfins = new TodasDecisoesServicos(driver);
		academiasAfins.decisoesIntegraAcademiasAfins();
	}
	
	public void acessarDecisoesAssistenciaJuridica() throws InterruptedException, IOException{
		
		TodasDecisoesServicos assistenciaJuridica = new TodasDecisoesServicos(driver);
		assistenciaJuridica.decisoesIntegraAssistenciaJuridica();
	}
	
	public void acessarDecisoesAssistenciaTecnica() throws InterruptedException, IOException{
		
		TodasDecisoesServicos assistenciaTecnica = new TodasDecisoesServicos(driver);
		assistenciaTecnica.decisoesIntegraAssistenciaTecnica();
	}
	
	public void acessarDecisoesDetran() throws InterruptedException, IOException{
		
		TodasDecisoesServicos detran = new TodasDecisoesServicos(driver);
		detran.decisoesIntegraDetran();
	}
	
	public void acessarDecisoesEstacionamentos() throws InterruptedException, IOException{
		
		TodasDecisoesServicos estacionamentos = new TodasDecisoesServicos(driver);
		estacionamentos.decisoesIntegraEstacionamentos();
	}
	
	public void acessarDecisoesFunerarios() throws InterruptedException, IOException{
		
		TodasDecisoesServicos funerarios = new TodasDecisoesServicos(driver);
		funerarios.decisoesIntegraFunerarios();
	}
	
	public void acessarDecisoesGas() throws InterruptedException, IOException{
		
		TodasDecisoesServicos gas = new TodasDecisoesServicos(driver);
		gas.decisoesIntegraGas();
	}
	
	public void acessarDecisoesLuz() throws InterruptedException, IOException{
		
		TodasDecisoesServicos luz = new TodasDecisoesServicos(driver);
		luz.decisoesIntegraLuz();
	}
	
	public void acessarDecisoesPostal() throws InterruptedException, IOException{
		
		TodasDecisoesServicos postal = new TodasDecisoesServicos(driver);
		postal.decisoesIntegraPostal();
	}
	
	public void acessarDecisoesProconVigSanitaria() throws InterruptedException, IOException{
		
		TodasDecisoesServicos proconVigSanitaria = new TodasDecisoesServicos(driver);
		proconVigSanitaria.decisoesIntegraProconVigSanitaria();
	}
	
	public void acessarDecisoesSAC() throws InterruptedException, IOException{
		
		TodasDecisoesServicos sac = new TodasDecisoesServicos(driver);
		sac.decisoesIntegraSAC();
	}
	
	public void acessarDecisoesServicosOnline() throws InterruptedException, IOException{
		
		TodasDecisoesServicos servicosOnline = new TodasDecisoesServicos(driver);
		servicosOnline.decisoesIntegraServicosOnline();
	}

	public void acessarDecisoesAgua() throws InterruptedException, IOException{
		
		TodasDecisoesServicos agua = new TodasDecisoesServicos(driver);
		agua.decisoesIntegraAgua();
	}
		
	public void fecharNavegador(){
		
		driver.quit();
	}
	
	
	@Attachment("Evidência de sucesso")
    public static byte[] makeScreenshotOnSuccess() throws IOException {

	   return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }
	
	@Attachment("Evidência de erro")
    public static byte[] makeScreenshotOnFail() throws IOException {
		
	   return captureScreenShot();
    }
	
	private static byte[] captureScreenShot() {
	    try {
	        BufferedImage image  = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(100)).takeScreenshot(driver).getImage();
	        ByteArrayOutputStream baos = new ByteArrayOutputStream();
	        ImageIO.write(image, "png", baos);
	        baos.flush();
	        byte[] imageInByte = baos.toByteArray();
	        baos.close();
	        
	        return imageInByte;
	    
	    }catch(IOException e){
	    
	    	e.printStackTrace();
	    }
	    
	    return "Attachment Content Empty, can't create screenshot".getBytes();
	}
	
	@Attachment(value = "URL da página com erro")
    public static String attachURLerro(String url){
        
		return url;
    }
}
