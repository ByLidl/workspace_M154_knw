package ch.ilv.test.crm.web;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class WebTest {

	@Test
	public void testCreateProduct() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\DevTools\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        WebDriver driver=new ChromeDriver(options);
		
		driver.get("http://localhost:7070/");
		String title = driver.getTitle();
		assertTrue(title.contains("CRM App"));

		WebElement forename = driver.findElement(By.xpath("/html/body/form[1]/input[1]"));
		forename.sendKeys("Michael");

		WebElement name = driver.findElement(By.xpath("/html/body/form[1]/input[2]"));
		name.sendKeys("Hauck");

		WebElement button = driver.findElement(By.xpath("/html/body/form[1]/p/input"));
		
		Thread.sleep(5000);
		
		button.click();

		WebElement username = driver.findElement(By.xpath("/html/body/span"));

		assertTrue(username.getText().trim().contains("Michael Hauck"));
	}

}
