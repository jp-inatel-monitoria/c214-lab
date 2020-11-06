package model.factory;

import java.util.Date;
import java.util.Scanner;

import model.entities.Carteira;
import model.entities.RendaFixa;

public class InvestimentoFactory {
		
	public static RendaFixa createRendaFixa(Carteira c, String nome, double preco, double quantidade, String dataVencimento, double rendimento) {
		if(c != null) {		
			return new RendaFixa(nome, new Date(), preco, quantidade, dataVencimento, rendimento);
		}else {
			return null;
		}
	}
	
}
