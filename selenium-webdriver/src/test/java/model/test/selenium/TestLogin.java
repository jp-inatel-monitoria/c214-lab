package model.test.selenium;


import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

import model.entities.Login;

public class TestLogin {
	
	private Login calculadora;
	
	@Before
	public void beforeTest() {
		calculadora = new Login();
	}
	
	@Test
	public void pesquisaPalavraQueijo() {
		boolean login = true;
		
		String expected = "Seu email ou senha estão incorretos";
		String result = calculadora.pesquisaGoogle("joao@gmail.com", "123");
		
		if(result.contains(expected)) {
			login = false;
		}
		
		assertFalse(login);
		
	}
	
	
	
}
