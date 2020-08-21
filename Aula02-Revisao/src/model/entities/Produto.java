package model.entities;

import model.interfaces.Taxa;

public abstract class Produto implements Taxa{
	
	//Atributos
	private String nome;
	private double preco;
	
	private double total;
	
	//Construtor
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
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
	
	public double getTotal() {
		return total;
	}
	
	public void setTotal(double total) {
		this.total = total;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	//Método abstrato
	public abstract String etiquetaPreco();
	
}
