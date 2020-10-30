package application;

import model.entities.AdaptorLG;
import model.entities.ControleProjetores;
import model.entities.ProjetorLG;

public class Main {

	public static void main(String[] args) {
		
		ControleProjetores controle = new ControleProjetores();
		
		controle.init(new AdaptorLG(new ProjetorLG()));
		
	}

}
