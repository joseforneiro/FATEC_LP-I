package br.org.fatec;

public class Lugar {
	private String pais;
	private String cidade;
	private int altitude;
	private String clima;
	private String pontos_turisticos;
	
	//Construtor
	public Lugar(String pais, String cidade, int altitude, String clima, String pontos_turisticos) {
		this.pais = pais;
		this.cidade = cidade;
		this.altitude = altitude;
		this.clima = clima;
		this.pontos_turisticos = pontos_turisticos;
	}
		
	//Métodos de acesso dos tipos Getter e Setter	
	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public int getAltitude() {
		return altitude;
	}

	public void setAltitude(int altitude) {
		this.altitude = altitude;
	}

	public String getClima() {
		return clima;
	}

	public void setClima(String clima) {
		this.clima = clima;
	}

	public String getPontos_turisticos() {
		return pontos_turisticos;
	}

	public void setPontos_turisticos(String pontos_turisticos) {
		this.pontos_turisticos = pontos_turisticos;
	}

	// Comer
	public void comer() {
		System.out.println("Vá a bons restaurantes");
	}
		
	// Trabalhar
	public void trabalhar() {
		System.out.println("Mantenha o foco");
	}
	
	// Passeiar
	public void passeiar() {
		System.out.println("Aproveite a viagem");
	}
	
	
}
