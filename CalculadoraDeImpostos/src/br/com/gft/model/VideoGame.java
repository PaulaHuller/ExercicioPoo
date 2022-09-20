package br.com.gft.model;

import br.com.gft.main.Main;

public class VideoGame extends Main {
	String titulo;
	double valor;
	int qtdEstoque;
	String marca;
	String modelo;
	boolean usado;
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double preco) {
		this.valor = valor;
	}

	public int getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isUsado() {
		return usado;
	}

	public void setUsado(boolean usado) {
		this.usado = usado;
	}

	public VideoGame(String titulo, double preco, int qtdEstoque, String marca, String modelo, boolean usado) {
		
	}

	public void calculaImpostos() {
		double valorDoImposto;
		if (usado == false) {
			valorDoImposto = 45;
			double imposto = valor - valorDoImposto/100;
			System.out.println("Imposto" + titulo + " " + modelo + " R$" + imposto + ".");
		} else {
			valorDoImposto = 25;
			double imposto = valor - valorDoImposto/100;
			System.out.println("Imposto" + titulo + " " + modelo + "usado, R$" + imposto + ".");
		}
		System.out.println("-----------------------------------------------------------------------");
		
	}

}

