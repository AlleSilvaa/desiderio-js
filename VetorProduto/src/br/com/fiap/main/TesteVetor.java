package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;

public class TesteVetor {
	
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

		Produto[] vetProd = new Produto[5];
		
		int indice = 0;
		
		do {
			
			vetProd[indice] = new Produto();
			vetProd[indice].setTipo(texto("tipo"));
			vetProd[indice].setMarca(texto("Marca"));
			vetProd[indice].setQunatidade(inteiro("Qunatidade"));
			vetProd[indice].setValor(real("Valor"));
			
			indice ++;
			
		} while( JOptionPane.showConfirmDialog(null, "Adicionar Produto?", 
				"Carinho de Compras", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
		


		for (int contador =0; contador < indice; contador++) {
			
			System.out.println("Tipo: "+ vetProd[contador].getTipo() +
					"\nMarca: "+ vetProd[contador].getMarca() +
					"nQuantidade: "+ vetProd[contador].getQunatidade() +
					"nValor: "+ vetProd[contador].getValor());
			
		}
	
		System.out.println("\nValor Total: " + valorTotal(vetProd, indice));
		
	}

}
