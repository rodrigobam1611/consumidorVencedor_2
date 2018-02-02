package testes.novas.acoes;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import org.apache.commons.io.output.ByteArrayOutputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ru.yandex.qatools.allure.annotations.Attachment;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import validacao.AssertCamposRJ;
import validacao.ValidacaoCamposObrigatoriosRJ;

public class Test_TF_001_NovasAcoes extends ValidacaoCamposObrigatoriosRJ{

	static WebElement element = null;
	static WebDriver driver;
	static String BASE_URL_RJ = "http://h-jbossweblr01.pgj.rj.gov.br:8080/web/consumidorvencedor-rj/home";
	
	
	public Test_TF_001_NovasAcoes(WebDriver driver){
	
		this.driver = driver;
	}
	
	public void acessarNovasAcoes(){
		
		//seleciona o link "Summer Parking" no box Novas Ações
		element = driver.findElement(By.xpath("//div[@class='novas-acoes-home-1'][1]/a"));
		element.click();
	}
	
	public void acessarFormularioProblema() throws InterruptedException{
		
		//seleciona o link "Summer Parking" no box Novas Ações
		Thread.sleep(100);
		element = driver.findElement(By.id("btn-problema"));
		element.click();
		
		//rola a página para baixo
		((JavascriptExecutor)driver).executeScript("scroll(0,1600)");
		
		//troca o instância do driver para o iframe
		driver.switchTo().frame(0);
	}
	
	public void validacaoFormularioProblema() throws InterruptedException, IOException{
		
		AssertCamposRJ.assertTodosCampos(driver);
		validarMsgCamposObrigatorios(driver);
	}
	
	public void acessarNovasVitorias() throws InterruptedException, IOException{
		
		driver.navigate().to(BASE_URL_RJ);
		
		element = driver.findElement(By.xpath("//div[@class='provisorias-home-1'][1]/a"));
		element.click();
		
		element = driver.findElement(By.id("btn-integra"));
		element.click();
		
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
	    Thread.sleep(1000);
	    makeScreenshotOnSuccess();
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
}
