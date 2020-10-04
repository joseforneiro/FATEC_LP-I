package br.org.fatec;

public class Profissional {
	String profissao;
	String area;
	String local_trabalho;
	String graduacao;
	int anos_estudos;
	
	//Construtor
	public Profissional(String profissao, String area, String local_trabalho, String graduacao, int anos_estudos) {
		this.profissao = profissao;
		this.area = area;
		this.local_trabalho = local_trabalho;
		this.graduacao = graduacao;
		this.anos_estudos = anos_estudos;
	}

	//Metodos de acesso dos tipos Getter e Setter
	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getLocal_trabalho() {
		return local_trabalho;
	}

	public void setLocal_trabalho(String local_trabalho) {
		this.local_trabalho = local_trabalho;
	}

	public String getGraduacao() {
		return graduacao;
	}

	public void setGraduacao(String graduacao) {
		this.graduacao = graduacao;
	}

	public int getAnos_estudos() {
		return anos_estudos;
	}

	public void setAnos_estudos(int anos_estudos) {
		this.anos_estudos = anos_estudos;
	}
	
	//trabalhar_escritorio
	public void escritorio() {
		System.out.println("Nao fique muito sentado");
	}
	
	//trabalhar_hospital
	public void hospital() {
		System.out.println("Trate muito bem os doentes");
	}
	
	//trabalhar_rua
	public void rua() {
		System.out.println("dirija com atencao");
	}
		
		
}
