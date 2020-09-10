package model.teste.arquivo;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import model.arquivos.Arquivo;
import model.entities.Carteira;
import model.entities.RendaFixa;

public class TestArquivo {
	
	private Carteira carteira;
	private RendaFixa rendaFixa;
	private File jsonFile;
	private File csvFile;
		
	@Before
	public void criaRecursos() {
		carteira = new Carteira("Rico Investimento");
		rendaFixa = new RendaFixa("Tesouro Selic", new Date(), 78.65, 50, "20/12/2025", 2.75);
		jsonFile = new File("investimentos.json");
		csvFile = new File("investimentos.csv");
	}
		
	@Test
	public void testeExisteArquivoJson() {	
		boolean exists = jsonFile.exists();
		assertTrue(exists);	
	}
	
	@Test
	public void testeExisteArquivoCsv() {
		boolean exists = csvFile.exists();
		assertTrue(exists);
	}
	
	@Test
	public void testeGerouArquivoJson() {
		carteira.getInvestimentos().add(rendaFixa);
		Arquivo.gerarJson(carteira.getInvestimentos());
		
		assertNotNull(Arquivo.getFileWriter());
	}
	
	@Test
	public void testeGerouArquivoCsv() {	
		carteira.getInvestimentos().add(rendaFixa);
		Arquivo.gerarCsv(carteira.getInvestimentos());
		
		assertNotNull(Arquivo.getFile().exists());
	}
	
	
}
