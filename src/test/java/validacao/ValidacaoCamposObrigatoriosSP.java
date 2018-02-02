package validacao;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import ru.yandex.qatools.allure.annotations.Attachment;
import ru.yandex.qatools.allure.annotations.Step;

public class ValidacaoCamposObrigatoriosSP {

	static WebElement element = null;

	String ids[] = {"_mprjformdenuncie_WAR_mprjformdenuncieportlet_nome", "_mprjformdenuncie_WAR_mprjformdenuncieportlet_email", 
	"estado", "cidade", "_mprjformdenuncie_WAR_mprjformdenuncieportlet_resumo" };

	String _ids[] = {"_mprjformdenuncie_WAR_mprjformdenuncieportlet_nome"};
	
	String names[] = {"Nome", "Nome da Empresa", "Relato"};

	@Step("Teste de validação das mensagens dos campos obrigatórios")
	public void validarMsgCamposObrigatorios(WebDriver driver) throws InterruptedException, IOException{

		for (int i = 0; i < ids.length; i++) {

			if(i == 2){
				
				element = driver.findElement(By.xpath("//button[contains(text(),'Enviar')]"));
				element.click();
			}
			
			element = driver.findElement(By.id(ids[i]));
			element.click();
			clicarCampoTelefone(driver, element);
		}
		
		element = driver.findElement(By.xpath("//button[contains(text(),'Enviar')]"));
		new Actions(driver).moveToElement(element).click().perform();
		makeScreenshotOnSuccess2(driver);
	}
	
	@Step("Teste de validação das mensagens dos campos obrigatórios")
	public void _validarMsgCamposObrigatorios(WebDriver driver) throws InterruptedException, IOException{

		for (int i = 0; i < ids.length; i++) {

			if(i == 2){
				
				element = driver.findElement(By.xpath("//button[contains(text(),'Enviar')]"));
				element.click();
			}
			
			element = driver.findElement(By.id(ids[i]));
			element.click();
			clicarCampoTelefone(driver, element);
		}
		
		element = driver.findElement(By.xpath("//button[contains(text(),'Enviar')]"));
		new Actions(driver).moveToElement(element).click().perform();
		makeScreenshotOnSuccess2(driver);
	}


	public static void validarMsg(WebDriver driver, WebElement element, String cssSelector, String msg){

		element = driver.findElement(By.cssSelector(cssSelector));
		System.out.println(element.getText() + "\n");
		assertEquals(element.getText(), msg);
	}


	public static void clicarCampoTelefone(WebDriver driver, WebElement element){

		element = driver.findElement(By.id("_mprjformdenuncie_WAR_mprjformdenuncieportlet_telefone"));
		element.click();
	}

	@Attachment("Evidência de sucesso")
	public static byte[] makeScreenshotOnSuccess2(WebDriver driver) throws IOException {

		return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	}
}
