package br.com.fiap.beans;

public class Produto {
	
	private String tipo;
	private String marca;
	private int qunatidade;
	private double valor;
	
	public Produto() {
		super();
	}

	public Produto(String tipo, String marca, int qunatidade, double valor) {
		super();
		this.tipo = tipo;
		this.marca = marca;
		this.qunatidade = qunatidade;
		this.valor = valor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getQunatidade() {
		return qunatidade;
	}

	public void setQunatidade(int qunatidade) {
		this.qunatidade = qunatidade;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	

}
