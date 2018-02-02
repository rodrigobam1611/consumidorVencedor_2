package testes.novas.acoes;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ru.yandex.qatools.allure.annotations.Step;
import validacao.AssertivasCamposSP;
import validacao.ValidacaoCamposObrigatoriosSP;

public class Test_TF_002_NovasAcoesSP {

	static WebElement element = null;
	static WebDriver driver;
	static String BASE_URL_SP = "http://h-jbossweblr01.pgj.rj.gov.br:8080/web/sp/home";
	
	public Test_TF_002_NovasAcoesSP(WebDriver driver) {
	
		this.driver = driver;
		driver.navigate().to(BASE_URL_SP);
	}
	
	public void acessarNovasAcoes(){
		
		element = driver.findElement(By.xpath("//div[@class='provisorias-home-1'][1]/a"));
		element.click();
	}
	
	public void acessarFormularioDenuncieDescumprimento() throws InterruptedException{
		
		Thread.sleep(100);
		element = driver.findElement(By.id("btn-denuncie"));
		element.click();
		
		//rola a página para baixo
		((JavascriptExecutor)driver).executeScript("scroll(0,1600)");
		
		//troca o instância do driver para o iframe
		driver.switchTo().frame(0);
	}
	
	@Step("Denuncie o Descumprimento")
	public void validacaoFormDenuncieDescumprimentoSP() throws InterruptedException, IOException{
		
		AssertivasCamposSP.assertTodosCampos(driver);
		
		ValidacaoCamposObrigatoriosSP validaCampos_SP = new ValidacaoCamposObrigatoriosSP();
		validaCampos_SP.validarMsgCamposObrigatorios(driver);
		
	}
	
	@Step("Teve o mesmo problema com outra empresa?")
	public void validacaoFormJaTeveMesmoProblemaSP() throws InterruptedException, IOException{

		driver.switchTo().window(driver.getWindowHandle());
		driver.findElement(By.id("btn-problema")).click();
		driver.switchTo().frame(1);
		
		AssertivasCamposSP._assertTodosCampos(driver);
		
		ValidacaoCamposObrigatoriosSP validaCampos_SP = new ValidacaoCamposObrigatoriosSP();
		validaCampos_SP._validarMsgCamposObrigatorios(driver);
		
	}
	
}
