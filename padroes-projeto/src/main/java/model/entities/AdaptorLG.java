package model.entities;

public class AdaptorLG implements Projetor{

	private ProjetorLG projetor;
	
	public AdaptorLG(ProjetorLG projetor) {
		this.projetor = projetor;
	}
	
	@Override
	public void ligar() {
		projetor.enable(3);
	}
}
