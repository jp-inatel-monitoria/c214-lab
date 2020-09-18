package model.arquivos;

import java.util.Date;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import model.entities.RendaFixa;
import model.interfaces.BuscaInvestimentoService;

public class BuscaInvestimento {
	
	private BuscaInvestimentoService service;
	
	public BuscaInvestimento(BuscaInvestimentoService service) {
		this.service = service;
	}

	public void setService(BuscaInvestimentoService service) {
		this.service = service;
	}

	public RendaFixa getInvestimento(String nome){
		String jsonFile = service.busca(nome);
		JsonObject jsonObject = JsonParser.parseString(jsonFile).getAsJsonObject();
				
		return new RendaFixa(
				jsonObject.get("nome").getAsString(), 
				new Date(),
				jsonObject.get("preco").getAsDouble(), 
				jsonObject.get("quantidade").getAsDouble(),
				jsonObject.get("dataVencimento").getAsString(),
				jsonObject.get("rendimento").getAsDouble());
		
	}

}
