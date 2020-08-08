package model.entities;

public class Produto {
	
	//Atributos
	private String nome;
	private double preco;
	
	//Construtor
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	//Métodos
	public String etiquetaPreco() {		
		return this.nome + "$ " + String.format("%.2f", preco);
	}

	//Get e Set	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
		
}
