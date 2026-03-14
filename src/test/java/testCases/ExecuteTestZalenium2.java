package testCases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ExecuteTestZalenium2 {

	@SuppressWarnings("deprecation")
	@Test
	public void loginToApp2() throws MalformedURLException, InterruptedException {
		System.out.println("Thread which is running: " +Thread.currentThread().getId());
		FirefoxOptions options = new FirefoxOptions();
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);
		driver.get("https://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
