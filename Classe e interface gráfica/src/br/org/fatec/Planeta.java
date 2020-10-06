package br.org.fatec;

public class Planeta {
	String nome;
	String cor;
	String tamanho;
	Float distancia_sol;
	String habitado;
	
	//Construtor
	public Planeta(String nomeplaneta, Float distancia_sol) {
		nome = nomeplaneta;
		this.distancia_sol = distancia_sol;
	}
	
	//Metodos de acesso dos tipos Getter e Setter
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public Float getDistancia_sol() {
		return distancia_sol;
	}

	public void setDistancia_sol(Float distancia_sol) {
		this.distancia_sol = distancia_sol;
	}

	public String getHabitado() {
		return habitado;
	}

	public void setHabitado(String habitado) {
		this.habitado = habitado;
	}
	
	// Frio
	public void frio() {
		System.out.println("Esse planeta é muito frio para ser habitado");
	}
	
	// Quente
		public void quente() {
			System.out.println("Esse planeta é muito frio para ser habitado");
		}
}
