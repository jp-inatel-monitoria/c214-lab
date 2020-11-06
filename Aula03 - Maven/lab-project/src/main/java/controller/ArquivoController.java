package controller;

import model.arquivos.ArquivoContexto;

public class ArquivoController {
	
	private static ArquivoContexto arquivoContexto;
	
	private static ArquivoContexto criarArquivo() {
		if (arquivoContexto == null) {
			arquivoContexto = new ArquivoContexto();
		}
		return arquivoContexto;
	}
	
	public static void gerar() {
		criarArquivo();
		arquivoContexto.gerar(CarteiraController.getCarteira().getInvestimentos());
	}
	
	public static ArquivoContexto getArquivo() {
		return arquivoContexto;
	}
	
}
