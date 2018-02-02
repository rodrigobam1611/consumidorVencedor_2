package validacao;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ru.yandex.qatools.allure.annotations.Attachment;
import ru.yandex.qatools.allure.annotations.Step;

public class ValidacaoCamposObrigatorios {

	static WebElement element = null;
	String ids[] = {"_mprjformdenuncierj_WAR_mprjformdenuncieportlet_nome", "_mprjformdenuncierj_WAR_mprjformdenuncieportlet_nomeEmpresa", 
				    "_mprjformdenuncierj_WAR_mprjformdenuncieportlet_relato" };
	
	String names[] = {"Nome", "Nome da Empresa", "Relato"};
	
	@Step("Teste de validação das mensagens dos campos obrigatórios")
	public void validarMsgCamposObrigatorios(WebDriver driver) throws InterruptedException, IOException{
		
		for (int i = 0; i < ids.length; i++) {
			
			element = driver.findElement(By.id(ids[i]));
			element.click();
			clicarCampoTelefone(driver, element);
			System.out.println(names[i]);
			validarMsg(driver, element, "div.required", "Campo Obrigatório");
		}
		
		element = driver.findElement(By.id("_mprjformdenuncierj_WAR_mprjformdenuncieportlet_email"));
		element.click();
		clicarCampoTelefone(driver, element);
		System.out.println("Email");
		validarMsg(driver, element, "div.email", "Por favor, preencha o campo de e-mail corretamente.");
		makeScreenshotOnSuccess2(driver);
	}
	
	
	public static void validarMsg(WebDriver driver, WebElement element, String cssSelector, String msg){
		
		element = driver.findElement(By.cssSelector(cssSelector));
		System.out.println(element.getText() + "\n");
		assertEquals(element.getText(), msg);
	}
	
	
	public static void clicarCampoTelefone(WebDriver driver, WebElement element){
		
		element = driver.findElement(By.id("_mprjformdenuncierj_WAR_mprjformdenuncieportlet_telefone"));
		element.click();
	}
	
	@Attachment("Evidência de sucesso")
    public static byte[] makeScreenshotOnSuccess2(WebDriver driver) throws IOException {
    	
	   return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }
}
