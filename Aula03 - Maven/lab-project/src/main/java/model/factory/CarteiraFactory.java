package model.factory;

import model.entities.Carteira;

public class CarteiraFactory {
		
	public static Carteira createCarteira(String nome) {	
		return new Carteira(nome);
	}
	
}
