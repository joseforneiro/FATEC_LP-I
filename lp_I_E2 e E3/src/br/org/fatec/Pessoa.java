package br.org.fatec;

public class Pessoa {
	String nome;
	String altura;
	String peso;
	String sexo;
	String cor_cabelo;
	
	//Construtor
	public Pessoa(String nome, String altura, String peso, String sexo, String cor_cabelo) {
		this.nome = nome;
		this.altura = altura;
		this.peso = peso;
		this.sexo = sexo;
		this.cor_cabelo = cor_cabelo;
	}

	//Métodos de acesso dos tipos Getter e Setter
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAltura() {
		return altura;
	}

	public void setAltura(String altura) {
		this.altura = altura;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCor_cabelo() {
		return cor_cabelo;
	}

	public void setCor_cabelo(String cor_cabelo) {
		this.cor_cabelo = cor_cabelo;
	}
	
	//Falar
	public void falar() {
		System.out.println("Fale baixo para não atrapalhar.");
	}
	
	//Sorrir
	public void sorrir() {
		System.out.println("Sorrir faz bem.");
	}

	//Ouvir
	public void ouvir() {
		System.out.println("Ouça com atenção.");
	}
	

}
