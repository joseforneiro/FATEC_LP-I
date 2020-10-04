package br.org.fatec;

public class InstrumentoMusical {
	String nome;
	String tipo;
	String material;
	String tamanho;
	String ritmo;
	
	//Construtor
	public InstrumentoMusical(String nome, String tipo, String material, String tamanho, String ritmo) {
		this.nome = nome;
		this.tipo = tipo;
		this.material = material;
		this.tamanho = tamanho;
		this.ritmo = ritmo;
	}

	//Metodos de acesso dos tipos Getter e Setter
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getRitmo() {
		return ritmo;
	}

	public void setRitmo(String ritmo) {
		this.ritmo = ritmo;
	}
	
	//Tocar em Festa
	public void festa() {
		System.out.println("Tocando em festa");
	}
	
	//Tocar em orquestra
	public void orquestra() {
		System.out.println("Tocando em orquestra");
	}
	
	//Tocar em culto
	public void culto() {
		System.out.println("Tocando em culto");
	}
}
