package model.teste.arquivo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import model.arquivos.BuscaInvestimento;
import model.entities.RendaFixa;
import model.interfaces.BuscaInvestimentoService;
import model.teste.consts.RendaFixaConst;

@RunWith(MockitoJUnitRunner.class)
public class TestBuscaInvestimento {
	
	@Mock
	private BuscaInvestimentoService service;
	
	@InjectMocks
	private BuscaInvestimento buscaInvestimento;
	
	@Before
	public void beforeTest() {
		/*
		buscaInvestimento = new BuscaInvestimento();
		buscaInvestimento.setService(service);*/
	}

	@Test
	public void testBuscaRendaFixaNome() {
		
		String nome = "Tesouro Selic";
		
		//Simula a implementação do do metodo busca, retornando a constante
		Mockito.when(service.busca(nome)).thenReturn(RendaFixaConst.RENDA_FIXA);

		RendaFixa investimento = buscaInvestimento.getInvestimento(nome);
		
		assertEquals(2.75, investimento.getRendimento(), 0.01);
		assertEquals("Tesouro Selic", investimento.getNome());
		assertEquals("20/12/2025", investimento.getDataVencimento());
		assertEquals(78.65, investimento.getPreco(), 0.01);
		assertEquals(50.0, investimento.getQuantidade(), 0.01);
		
	}

}
