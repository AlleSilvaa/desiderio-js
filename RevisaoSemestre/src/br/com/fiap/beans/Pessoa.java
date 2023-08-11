package br.com.fiap.beans;

public abstract class Pessoa {
	
	// modificador, tipo de dado e variavel
	private String nome;
	private String email;
	private int idade;
	protected double renda;
	
	//construtor vazio
	public Pessoa() {
		super();
	}
	
	//construtor cheio
	public Pessoa(String nome, String email, int idade, double renda) {
		super();
		this.nome = nome;
		this.email = email;
		this.idade = idade;
		this.renda = renda;
	}

	// Setters e Getters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getRenda() {
		return renda;
	}
	public void setRenda(double renda) {
		this.renda = renda;
	}
	
	public abstract String identificador();
	public abstract double pagarTaxa();
	

}
