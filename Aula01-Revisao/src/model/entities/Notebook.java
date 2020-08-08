package model.entities;

public class Notebook extends Produto {
	
	//Atributos
	private double armazenamento;
	private String gpu;
	private String processador;
	
	//Construtor
	public Notebook(String nome, double preco, double armazenamento, String gpu, String processador) {
		super(nome, preco);
		this.armazenamento = armazenamento;
		this.gpu = gpu;
		this.processador = processador;
	}

	@Override
	public String etiquetaPreco() {
		return getNome() + " $" + String.format("%.2f", getPreco()) + " " + armazenamento + " " + gpu + " " + processador;
	}
	
	//Get e Set
	public double getArmazenamento() {
		return armazenamento;
	}

	public void setArmazenamento(double armazenamento) {
		this.armazenamento = armazenamento;
	}

	public String getGpu() {
		return gpu;
	}

	public void setGpu(String gpu) {
		this.gpu = gpu;
	}

	public String getProcessador() {
		return processador;
	}

	public void setProcessador(String processador) {
		this.processador = processador;
	}

	
	
	
}
