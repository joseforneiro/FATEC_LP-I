package br.org.fatec;

public class Calcado {
	String modelo;
	String genero;
	int numero;
	String cor;
	String salto;
	
	//Construtor
	public Calcado(String modelo, String genero, int numero, String cor, String salto) {
		this.modelo = modelo;
		this.genero = genero;
		this.numero = numero;
		this.cor = cor;
		this.salto = salto;
	}
	
	//Métodos de acesso dos tipos Getter e Setter
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getSalto() {
		return salto;
	}

	public void setSalto(String salto) {
		this.salto = salto;
	}
	
	//Correr
	public void correr() {
		System.out.println("Boas praticas de esporte.");
	}
	
	//Dancar
	public void dancar() {
		System.out.println("Dance muito");
	}
	
	//Trabalhar
	public void trabalhar() {
		System.out.println("Bom trabalho.");
	}

}
