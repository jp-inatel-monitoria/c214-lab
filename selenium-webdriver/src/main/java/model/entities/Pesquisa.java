package model.entities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pesquisa {

	private WebDriver driver;
	private String title;
	
	public Pesquisa() {
		driver = new FirefoxDriver();
	}

	public String pesquisaGoogle(String word) {
		driver.get("http://www.google.com");
		WebElement campoPesquisado = driver.findElement(By.name("q"));
		campoPesquisado.clear();
		campoPesquisado.sendKeys(word);

		title = driver.getTitle();
		System.out.println(title);
		
		campoPesquisado.submit();

		(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver objDriver) {
				return objDriver.getTitle().toLowerCase().startsWith(word.toLowerCase());
			}
		});

		title = driver.getTitle();
		System.out.println(title);

		driver.quit();
		
		return title;
		
	}

}
