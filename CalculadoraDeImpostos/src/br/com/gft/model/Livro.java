package br.com.gft.model;


import br.com.gft.main.Main;

public class Livro extends Main{
	
	
			
	String titulo;
	double valor;
	int qtdEstoque;
	String autor;
	String tema;
	int desconhecido2;
		
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		titulo = titulo;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getQtdEstoque() {
		return qtdEstoque;
	}
	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	public int getDesconhecido2() {
		return desconhecido2;
	}
	public void setDesconhecido2(int desconhecido2) {
		this.desconhecido2 = desconhecido2;
	}
	
	public Livro(String titulo, double valor, int qtdEstoque, String autor, String tema, int desconhecido2) {
			
	}
	public void calculaImpostos() {
		System.out.println("-----------------------------------------------------------------------");
		double valorDoImposto;
		if (tema == "Educativo") {
			valorDoImposto = 0;
			System.out.println("Livro educativo não tem imposto: " + Titulo);
		} else {
			valorDoImposto = 10;
			double imposto = valor - valorDoImposto/100;
			System.out.println("R$" + imposto + "de impostos sobre o livro Senhor dos Anéis.");
		}
	}
}
