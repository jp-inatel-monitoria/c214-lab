package model.entities;

public class Notebook extends Produto{

	private double armazenamento;
	private String gpu;
	private String processador;
	
	public Notebook(String nome, double preco, double armazenamento, String gpu, String processador) {
		super(nome, preco);
		this.armazenamento = armazenamento;
		this.gpu = gpu;
		this.processador = processador;
	}

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

	@Override
	public String etiquetaPreco() {
		System.out.println("--- [NOTEBOOK] ---");
		return 	"Nome: " + getNome() + "\n" +
				"R$" + String.format("%.2f", getPreco()) + "\n" +
				"Armazenamento: " + armazenamento + "\n" +
				"GPU: " + gpu + "\n" +
				"Processador: " + processador + "\n" +
				"Total: " + getTotal();
	}

	@Override
	public void calculaTaxa() {
		setTotal(getPreco() * 1.01);
	}	
	
}
