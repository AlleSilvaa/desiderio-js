package br.com.fiap.beans;

public class PessoaJuridica extends Pessoa{
	
	// visibilidade, tipo de dado e variavel
	private String cnpj;
	
	//construtor vazio
	public PessoaJuridica() {
		super();
	}

	//construtor cheio com herança
	public PessoaJuridica(String nome, String email, int idade, double renda,String cnpj) {
		super(nome, email, idade, renda);
		this.cnpj = cnpj;
	}

	// Setters e Getters
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String identificador() {
		return "INFORMAÇÕES PESSOA JURÍDICA";
	}
	@Override
	public double pagarTaxa() {
		double taxaRenda;
		
		if (renda > 2000) {
			return taxaRenda = renda * 20/100;
		}else {
			taxaRenda = 0;
			return taxaRenda;
		}
	}
}
