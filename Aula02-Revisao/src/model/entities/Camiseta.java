package model.entities;

public class Camiseta extends Produto{
	
	private String cor;
	private String tamanho;
	
	public Camiseta(String nome, double preco, String cor, String tamanho) {
		super(nome, preco);
		this.cor = cor;
		this.tamanho = tamanho;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	@Override
	public String etiquetaPreco() {
		System.out.println("--- [CAMISETA] ---");
		return 	"Nome: " + getNome() + "\n" + 
				"R$ " + String.format("%.2f", getPreco()) + "\n" +
				"Cor: " + cor + "\n" +
				"Tamanho: " + tamanho + "\n" +
				"Total: " + getTotal();
	}

	@Override
	public void calculaTaxa() {
		setTotal(getPreco() * 1.10); 
	}
	
	
}
