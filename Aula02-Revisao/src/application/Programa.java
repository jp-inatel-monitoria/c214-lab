package application;

import model.entities.Camiseta;
import model.entities.Notebook;
import model.entities.Produto;
import model.factory.ProdutoFactory;

public class Programa {

	public static void main(String[] args) {
		
		Produto notebook = ProdutoFactory.createNotebook();
		notebook.calculaTaxa();
		
		Produto camiseta = ProdutoFactory.createCamiseta();
		camiseta.calculaTaxa();
		
		System.out.println(notebook.etiquetaPreco());

		System.out.println(camiseta.etiquetaPreco());

		// Editando as informações
		if (notebook instanceof Notebook) {
			Notebook notebookAux = (Notebook) notebook;
			notebookAux.setProcessador("Intel core i5");
		}
		
		System.out.println(notebook.etiquetaPreco());
		
		if (camiseta instanceof Camiseta) {
			Camiseta camisetaAux = (Camiseta) camiseta;
			camisetaAux.setCor("Branca");
		}

		// Calculando as taxas novamente
		notebook.calculaTaxa();
		camiseta.calculaTaxa();

		// Mostrando as infos
		System.out.println(notebook.etiquetaPreco());
		System.out.println(camiseta.etiquetaPreco());
	}

}
