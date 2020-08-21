package model.factory;

import model.entities.Camiseta;
import model.entities.Notebook;

public class ProdutoFactory {
	
	public static Notebook createNotebook() {
		return new Notebook("Notebook Dell", 3500.00, 1000, "GTX 1050", "Intel core i7");
	}
	
	public static Camiseta createCamiseta() {
		return new Camiseta("Camiseta Nike", 80.00, "Preta", "P");
	}
	
}
