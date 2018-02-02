package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Navegadores {

	static WebDriver driver;
	
	public static WebDriver GoogleChrome(String url) {
		
	  System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\Natielle\\Downloads\\ConsumidorVencedor-20180201T233220Z-001\\ConsumidorVencedor\\WebDrivers\\chromedriver.exe");
	  ChromeOptions options = new ChromeOptions();
      options.addArguments("test-type");
      options.addArguments("start-maximized");
      options.addArguments("--enable-automation");
      options.addArguments("--js-flags=--expose-gc");  
      options.addArguments("--enable-precise-memory-info"); 
      options.addArguments("test-type=browser");
      options.addArguments("disable-infobars");
	  
	  driver = new ChromeDriver(options);
	  
//	  String currentWindow = driver.getWindowHandle();
//	  driver.switchTo().window(currentWindow);
	  
	  driver.manage().window().maximize();
	  driver.get(url);
	  
	  return driver;
	}
	
	public static WebDriver InternetExplorer(String url) {
		
	  System.setProperty("webdriver.ie.driver", 
			"C:\\Users\\rodrigo.silva\\workspace_cucumber\\ConsumidorVencedor\\WebDrivers\\IEDriverServer.exe");
	  
	  driver = new InternetExplorerDriver();
	  driver.manage().window().maximize();
	  driver.get(url);
	  
	  return driver;
	}
	
	 
	
}
