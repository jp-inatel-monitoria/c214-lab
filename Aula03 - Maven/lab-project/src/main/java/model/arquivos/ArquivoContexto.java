package model.arquivos;

import java.util.List;

import model.entities.Investimento;

public class ArquivoContexto {
	
	private ArquivoStrategy arquivoStrategy;
	
	public ArquivoContexto() {
		arquivoStrategy = new JsonStrategy();
	}
	
	public void setArquivoStrategy(ArquivoStrategy arquivoStrategy) {
		this.arquivoStrategy = arquivoStrategy;
	}
	
	public void gerar(List<Investimento> investimentos){
		arquivoStrategy.gerar(investimentos);
	}

	public ArquivoStrategy getArquivoStrategy() {
		return arquivoStrategy;
	}
	
}
