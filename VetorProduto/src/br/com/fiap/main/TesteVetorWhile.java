package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;

public class TesteVetorWhile {

	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(0));
	}
	
	
	static double valorTotal(Produto[] p, int i) {
		double total = 0;
		
		for (int c = 0; c < i; c ++)  {
			total += p[c].getValor() * p[c].getQunatidade();
		}
		
		return total;
	}
	
	
	public static void main(String[] args) {
		
		Produto[] vetorProduto = new Produto[3];
		
		int indice = 0;
		int continuar = 0;
		
		while( continuar == 0) {
			
			vetorProduto[indice] = new Produto();
			vetorProduto[indice].setTipo(texto("Tipo"));
			vetorProduto[indice].setMarca(texto("Marca"));
			vetorProduto[indice].setQunatidade(inteiro("Quantidade"));
			vetorProduto[indice].setValor(real("valor: "));
			
			indice ++;
			
			continuar = JOptionPane.showConfirmDialog(null, "Adicionar Produto?", "Carrinho de Compras", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		}
		
		for (int contador = 0; contador < indice; contador++) {
			
			System.out.println("Tipo: "+ vetorProduto[contador].getTipo() +
					"\nMarca: "+ vetorProduto[contador].getMarca() +
					"nQuantidade: "+ vetorProduto[contador].getQunatidade() +
					"nValor: "+ vetorProduto[contador].getValor());
		}

		System.out.println("\nValor Total: " + valorTotal(vetorProduto, indice));
		
	}

}
