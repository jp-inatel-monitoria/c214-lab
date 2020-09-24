package model.entities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Login {

	private WebDriver driver;
	private String result;

	public Login() {
		driver = new FirefoxDriver();
	}

	public String pesquisaGoogle(String email, String senha) {
		driver.get("https://pt.overleaf.com/login");

		// Elementos
		WebElement emailField = driver.findElement(By.name("email"));
		WebElement passwordField = driver.findElement(By.name("password"));
		WebElement login = driver.findElement(By.xpath("/html/body/div/main/div/form/div[3]/button"));
		WebElement loginNotifier = driver.findElement(By.xpath("/html/body/div/main/div/form/form-messages/div[1]"));
		
		
		emailField.sendKeys(email);
		passwordField.sendKeys(senha);

		login.click();

		result = loginNotifier.getText();
		
		driver.quit();
		
		return result;

	}

}
