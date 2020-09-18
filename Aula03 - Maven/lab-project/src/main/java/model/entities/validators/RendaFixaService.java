package model.entities.validators;

import model.entities.RendaFixa;
import model.interfaces.RendaFixaRepository;

public class RendaFixaService {
	
	private RendaFixaRepository rendaRepository;

	public RendaFixaService(RendaFixaRepository rendaRepository) {
		this.rendaRepository = rendaRepository;
	}
	
	public void insert(RendaFixa rendaFixa) {
		validaCampos(rendaFixa);
		rendaRepository.save(rendaFixa);
	}
	
	public void validaCampos(RendaFixa rendaFixa) {
		if(rendaFixa.getNome() == null || rendaFixa.getQuantidade() <= 0) {
			throw new RuntimeException("Campos vazios...");
		}
	}
	
}
