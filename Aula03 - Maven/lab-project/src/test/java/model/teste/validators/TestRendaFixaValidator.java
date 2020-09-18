package model.teste.validators;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import model.entities.RendaFixa;
import model.entities.validators.RendaFixaService;
import model.interfaces.RendaFixaRepository;

@RunWith(MockitoJUnitRunner.class)
public class TestRendaFixaValidator {
	
	private RendaFixa rendaFixaValido;
	private RendaFixa rendaFixaInvalido;
	
	@Before
	public void beforeTest() {
		rendaFixaValido = new RendaFixa("Tesouro Selic", new Date(), 78.65, 50, "20/12/2025", 2.75);
		rendaFixaInvalido = new RendaFixa(null, new Date(), 78.65, 50, "20/12/2025", 2.75);
	}
	
	@Mock
	private RendaFixaRepository rendaFixaRepository;
	
	@InjectMocks
	private RendaFixaService rendaFixaService;
	
	@Test
	public void testSalvoComSucesso() {
		rendaFixaService.insert(rendaFixaValido);
		verify(rendaFixaRepository, times(1)).save(rendaFixaValido);
	}
	
	@Test(expected = Exception.class)
	public void testCamposObrigado() {
		rendaFixaService.insert(rendaFixaInvalido);
	}

}
