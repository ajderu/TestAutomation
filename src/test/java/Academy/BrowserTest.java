package Academy;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class BrowserTest {

	
	@Test
	public void getData()
	{
		System.out.println("Hello Guys");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://aj-webapp-yaml.azurewebsites.net/");
		String text =driver.findElement(By.cssSelector("h2")).getText();
		System.out.println(text);
		Assert.assertTrue(text.equalsIgnoreCase("Hello World! ajderu/pipelines-java repo"));
		driver.close();
	
		
		
	}
}
