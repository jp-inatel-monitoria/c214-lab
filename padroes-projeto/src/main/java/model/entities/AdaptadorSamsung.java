package model.entities;

public class AdaptadorSamsung implements Projetor{
	
	private ProjetorSamsung projetor;
	
	public AdaptadorSamsung(ProjetorSamsung projetor) {
		this.projetor = projetor;
	}
	
	@Override
	public void ligar() {
		projetor.turnOn();
	}
	
}
