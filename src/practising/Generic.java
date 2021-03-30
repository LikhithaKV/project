package practising;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Generic {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void login() {
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions opt=new FirefoxOptions();
		 driver=new FirefoxDriver(opt);
		opt.addPreference("dom.webnotifications.enabled", false);
        driver.get("http://localhost:8888");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
	}
	
	@AfterMethod
	public void closeApp() {
		driver.quit();
	}

}
