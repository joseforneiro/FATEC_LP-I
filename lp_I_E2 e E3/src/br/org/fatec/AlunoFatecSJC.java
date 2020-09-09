package br.org.fatec;

public class AlunoFatecSJC {
	String aluno;
	int ra;
	String curso;
	String periodo;
	String transporte;
	
	//Construtor
	public AlunoFatecSJC(String aluno, int ra, String curso, String periodo, String transporte) {
		this.aluno = aluno;
		this.ra = ra;
		this.curso = curso;
		this.periodo = periodo;
		this.transporte = transporte;
	}

	//Metodos de acesso dos tipos Getter e Setter
	public String getAluno() {
		return aluno;
	}

	public void setAluno(String aluno) {
		this.aluno = aluno;
	}

	public int getRa() {
		return ra;
	}

	public void setRa(int ra) {
		this.ra = ra;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public String getTransporte() {
		return transporte;
	}

	public void setTransporte(String transporte) {
		this.transporte = transporte;
	}
	
	//Estudar
	public void estudar() {
		System.out.println("Estude bastante.");
	}
	
	//Matar aula
	public void matar_aula() {
		System.out.println("Nao mate aula.");
	}
	
	//Programar
	public void programar() {
		System.out.println("Programar e muito bom.");
	}
	
	

}
