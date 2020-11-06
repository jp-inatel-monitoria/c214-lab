package model.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.factory.InvestimentoFactory;

public class Carteira {

	private double valorInvestido;
	private String corretora;

	private List<Investimento> investimentos;

	public Carteira(String corretora) {
		this.corretora = corretora;
		this.investimentos = new ArrayList<>();
	}
	
	public double getValorInvestido() {
		return valorInvestido;
	}
	
	public void setValorInvestido(double valorInvestido) {
		this.valorInvestido = valorInvestido;
	}

	public String getCorretora() {
		return corretora;
	}

	public void setCorretora(String corretora) {
		this.corretora = corretora;
	}
	
	public List<Investimento> getInvestimentos() {
		return investimentos;
	}

	
}
