package model.test.selenium;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import model.entities.Pesquisa;

public class TestPaginaGoogle {
	
	private Pesquisa pesquisa;
	
	@Before
	public void beforeTest() {
		pesquisa = new Pesquisa();
	}
	
	@Test
	public void pesquisaPalavraQueijo() {
		String title = pesquisa.pesquisaGoogle("Queijo");
		assertEquals("Queijo - Pesquisa Google", title);
	}
	
	@Test
	public void pesquisaPorE2E() {
		String title = pesquisa.pesquisaGoogle("E2E");
		assertEquals("E2E - Pesquisa Google", title);
	}
	
}
