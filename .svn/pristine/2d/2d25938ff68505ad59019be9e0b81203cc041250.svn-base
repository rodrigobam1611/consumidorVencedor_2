package decisoes.integra;

import static org.junit.Assert.fail;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

import org.apache.commons.io.output.ByteArrayOutputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ru.yandex.qatools.allure.annotations.Attachment;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class DecisoesLojasFisicas {

	static WebElement element = null;
	static WebDriver driver;
	
	public DecisoesLojasFisicas(WebDriver driver){
	
		this.driver = driver;
	}
	
	public void acessarSecaoLojasFisicas() throws InterruptedException{
		
		driver.navigate().to("http://rj.consumidorvencedor.mp.br/vitorias");
		
		element = driver.findElement(By.xpath("//div[@class='home-vitorias']/div[@class='box-comercio box-vitorias-home']"));
		element.click();
		
		element = driver.findElement(By.xpath("//ul[@class='lista-quadrado']/li[1]/a"));
		element.click();
	}
	
	@Step("Acesso às Decisões na Ìntegra - Lojas Físicas em geral")
	public void acessarDecisoesIntegraLojasFisicas() throws InterruptedException, IOException{
		
	   try{
		   
		   Integer totalArquivosErro = 0;
		   
		   List<WebElement> divs = driver.findElements(By.xpath("//div[@id='lista-decisoes-container']"));
		   
		   for (int i = 1; i < divs.size() + 1; i++) {
		   
			   driver.findElement(By.xpath("//div[@id='lista-decisoes-container'][" + i + "]/div[@class='botoes-decisao']/div[@id='btn-integra']/a/div[@class='imagem-btn']")).click();
			   
			   ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
			   driver.switchTo().window(tabs.get(1));
		      
			   if(driver.getPageSource().contains("O recurso requisitado não foi encontrado.")){
				   
				   totalArquivosErro++;
				   makeScreenshotOnFail();
				   attachURLerro(driver.getCurrentUrl());
				  
			   }else{
				    	
				   Thread.sleep(2000);
				   makeScreenshotOnSuccess();
			   }
				    
			   driver.close();
			   driver.switchTo().window(tabs.get(0));
			 }
		   
		    attachTotalArquivos(totalArquivosErro.toString());

		}catch(Exception e){
			
			makeScreenshotOnFail();
			attachURLerro(driver.getCurrentUrl());
			fail("Ocorreu um erro: " + e.getMessage());
		}
			
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
	
	@Attachment(value = "Total de arquivos inexistentes")
    public static String attachTotalArquivos(String url){
        
		return url;
    }
}
