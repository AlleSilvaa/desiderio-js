package br.com.fiap.beans;

public class PessoaFisica extends Pessoa{

	// visibilidade, tipo de dado e variavel
	private String cpf;
		
	//construtor vazio
	public PessoaFisica() {
		super();
	}

	//construtor cheio com herança
	public PessoaFisica(String nome, String email, int idade, double renda,String cpf) {
		super(nome, email, idade, renda);
		this.cpf = cpf;
	}
	
	// Setters e Getters
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String identificador() {
		return "INFORMAÇÃO PESSOA FÍSICA";
	}

	@Override
	public double pagarTaxa() {
		double taxaRenda;
		
		if(renda > 2000) {
			return taxaRenda = renda * 12/100;
		}else {
			taxaRenda = 0;
			return taxaRenda;
		}
	}
}
