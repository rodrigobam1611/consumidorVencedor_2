package validacao;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;

import org.apache.commons.io.output.ByteArrayOutputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ru.yandex.qatools.allure.annotations.Attachment;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class AssertCamposRJ {

	static WebElement element = null;
	
	@Step("Teste de renderização de todos os campos disponíveis")
	public static void assertTodosCampos(WebDriver driver) throws IOException, InterruptedException{
	
	  //espera até 1 segundo para que o campo 'Nome' apareça antes de iniciar os asserts nos campos	
	  WebDriverWait wait = new WebDriverWait(driver, 1);
	  wait.until(ExpectedConditions.elementToBeClickable((driver.findElement(By.id("_mprjformdenuncierj_WAR_mprjformdenuncieportlet_nome")))));
	  
	  assertTrue(driver.findElement(By.id("_mprjformdenuncierj_WAR_mprjformdenuncieportlet_nome")).isDisplayed());
	  
	  element = driver.findElement(By.id("_mprjformdenuncierj_WAR_mprjformdenuncieportlet_relato"));
	  
	  new Actions(driver).moveToElement(element).click().perform();
	  ((JavascriptExecutor)driver).executeScript("scroll(0,2800)");
	  
	  List<WebElement> radioButtons = driver.findElements(By.name("_mprjformdenuncierj_WAR_mprjformdenuncieportlet_sexo"));
	  
	  //varre todos os radioButtons e garente que eles estão aparecendo
	  for (int i = 0; i < radioButtons.size(); i++) {
		  
		  Thread.sleep(100);
		  assertTrue(radioButtons.get(i).isDisplayed());
	  }
	  
	  assertTrue(driver.findElement(By.id("_mprjformdenuncierj_WAR_mprjformdenuncieportlet_telefone")).isDisplayed());
	  assertTrue(driver.findElement(By.id("_mprjformdenuncierj_WAR_mprjformdenuncieportlet_telefoneCel")).isDisplayed());
	  assertTrue(driver.findElement(By.id("_mprjformdenuncierj_WAR_mprjformdenuncieportlet_email")).isDisplayed());
	  assertTrue(driver.findElement(By.id("ufComunicante")).isDisplayed());
	  assertTrue(driver.findElement(By.id("cidadeComunicante")).isDisplayed());
	  assertTrue(driver.findElement(By.id("bairroComunicante")).isDisplayed());
	  assertTrue(driver.findElement(By.id("_mprjformdenuncierj_WAR_mprjformdenuncieportlet_processo")).isDisplayed());
	  assertFalse(driver.findElement(By.id("_mprjformdenuncierj_WAR_mprjformdenuncieportlet_processo")).isEnabled());
	  assertTrue(driver.findElement(By.id("_mprjformdenuncierj_WAR_mprjformdenuncieportlet_arquivo")).isDisplayed());
	  assertTrue(driver.findElement(By.id("ufFato")).isDisplayed());
	  assertTrue(driver.findElement(By.id("cidadeFato")).isDisplayed());
	  assertTrue(driver.findElement(By.id("bairroFato")).isDisplayed());
	  assertTrue(driver.findElement(By.id("_mprjformdenuncierj_WAR_mprjformdenuncieportlet_protocolo")).isDisplayed());
	  assertTrue(driver.findElement(By.id("_mprjformdenuncierj_WAR_mprjformdenuncieportlet_orgao")).isDisplayed());
	  assertTrue(driver.findElement(By.xpath("//button[contains(text(),'Enviar')]")).isDisplayed());
	  assertTrue(driver.findElement(By.xpath("//button[contains(text(),'Limpar')]")).isDisplayed());
	  makeScreenshotOnSuccess2(driver);
	}
	
	@Attachment("Evidência de sucesso")
    public static byte[] makeScreenshotOnSuccess2(WebDriver driver) throws IOException {
    	
	   return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }
	
	@Attachment("Evidência de sucesso")
    public static byte[] makeScreenshotOnSuccess(WebDriver driver) throws IOException {
    	
	   return captureScreenShot(driver);
    }
	
	private static byte[] captureScreenShot(WebDriver driver) {
		
	    try {
	    	
	        BufferedImage image  = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver).getImage();
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
