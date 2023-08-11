package br.com.fiap.main;

import javax.swing.JOptionPane;
import br.com.fiap.beans.PessoaFisica;
import br.com.fiap.beans.PessoaJuridica;
public class TesteHeranca {
	
	//texto
	static String texto (String j) {
		return JOptionPane.showInputDialog(j);
	}
	//inteiro
	static int inteiro (String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	//real
	static double real (String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	public static void main(String[] args) {
		
		//Instanciar objetos
		PessoaFisica objPf = new PessoaFisica(texto("Informe o nome da pessoa fisica"),
												texto("informe o email"),
												inteiro("informe a idade"),
												real("Informe a renda"),
												texto("Informe o CPF"));
		
		PessoaJuridica objPj = new PessoaJuridica(texto("Informe o nome da pessoa juridica"),
													texto("informe o email da empresa"),
													inteiro("informe a idade da empresa"),
													real("Informe a renda"),
													texto("Informe o CNPJ"));
		
		System.out.println(objPf.identificador());
		System.out.println("nome: " + objPf.getNome()+
							"\nCPF: " + objPf.getCpf()+
							"\nTaxa a Pagar: " + objPf.pagarTaxa()
							);
		
		System.out.println(objPj.identificador());
		System.out.println("nome da empresa: " + objPj.getNome()+
							"\nCNPJ: " + objPj.getCnpj()+
							"\nTaxa a Pagar: " + objPj.pagarTaxa()
							);
		

	}

}
