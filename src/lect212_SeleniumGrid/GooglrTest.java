package lect212_SeleniumGrid;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GooglrTest {

	@Test
	public void HomePageCheck() throws IOException {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setBrowserName("chrome");
		//caps.setPlatform(Platform.WIN11);
		WebDriver driver = new RemoteWebDriver(new URL ("http://192.168.0.102:4444"), caps);
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("Pravin Parab linkedIn");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.println("Page Title : "+driver.getTitle());
		driver.close();
	}
}
