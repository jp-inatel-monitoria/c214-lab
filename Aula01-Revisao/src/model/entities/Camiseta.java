package model.entities;

public class Camiseta extends Produto{
	
	//Atributos
	private String cor;
	private String tamanho;
	
	//Construtor
	public Camiseta(String nome, double preco, String cor, String tamanho) {
		super(nome, preco);
		this.cor = cor;
		this.tamanho = tamanho;
	}

	@Override
	public String etiquetaPreco() {
		return getNome() + " $" + String.format("%.2f", getPreco()) + " " + cor + " " + tamanho;
	}

	//Get e Set
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
	
	
	
	
	
}
