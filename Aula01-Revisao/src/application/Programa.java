package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.entities.Camiseta;
import model.entities.Notebook;
import model.entities.Produto;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		List<Produto> produtos = new ArrayList<>();
		
		System.out.println("Numero de produtos");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Produto #" + (i+1));
			System.out.println("Notebook ou Camiseta? (n/c)");
			char tipo = sc.next().charAt(0);
			
			sc.nextLine();
			
			System.out.println("Entre com o nome do produto");
			String nome = sc.nextLine();

			System.out.println("Entre com o preço do produto");
			double preco = sc.nextDouble();
			
			if(tipo == 'n') {
				System.out.println("Entre com o armazenamento do Notebook");
				double armazenamento = sc.nextDouble();
				
				sc.nextLine();
				
				System.out.println("Entre com a GPU Notebook");
				String gpu = sc.nextLine();
				
				System.out.println("Entre com o processador do Notebook");
				String processador = sc.nextLine();
				
				produtos.add(new Notebook(nome, preco, armazenamento, gpu, processador));
			}else {
				sc.nextLine();
				System.out.println("Entre com a cor da Camiseta");
				String cor = sc.nextLine();
				
				System.out.println("Entre com o tamanho da Camiseta");
				String tamanho = sc.nextLine();
				
				produtos.add(new Camiseta(nome, preco, cor, tamanho));
			}
			
		}
		
		System.out.println();
		System.out.println("Etiquetas: ");
		for (Produto produto : produtos) {
			System.out.println(produto.etiquetaPreco());
		}
		
		sc.close();

	}

}
