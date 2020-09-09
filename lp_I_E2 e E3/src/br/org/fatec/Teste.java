package br.org.fatec;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Array Classe Lugar
		Lugar[] Lug = new Lugar[5];
		Lug[0] = new Lugar("Brasil", "Florianópolis", 600, "Frio", "Museus");
		Lug[1] = new Lugar("Brasil", "São Paulo", 800, "Ameno", "Ibirapuera");
		Lug[2] = new Lugar("Brasil", "Rio de Janeiro", 0, "Quente", "Praia");
		Lug[3] = new Lugar("Brasil", "Campos do Jordão", 1600, "Frio", "Morro do Elefante");
		Lug[4] = new Lugar("Brasil", "Rio Grande do Sul", 1000, "Frio", "Rota dos Vinhos");
		
		System.out.println("\n************************** Classe Lugar ***************************\n");
		
		for (int i=0; i<5; i++) {
			System.out.println("País..............: " + Lug[i].getPais());
			System.out.println("Cidade............: " + Lug[i].getCidade());
			System.out.println("Altitude..........: " + Lug[i].getAltitude());
			System.out.println("Clima.............: " + Lug[i].getClima());
			System.out.println("Pontos Turísticos.: " + Lug[i].getPontos_turisticos());
			
			if(Lug[i].getClima()=="Frio") {
				System.out.println("");
				Lug[i].comer();
			}else {
				System.out.println("");
				Lug[i].passeiar();
			}
			System.out.println("-----------------------------------");
		}
		
		
		//Array Classe Pessoa
		Pessoa[] Pes = new Pessoa[5];
		Pes[0] = new Pessoa("Junior", "1.8", "80 kg", "masculino", "pretos");
		Pes[1] = new Pessoa("Julia", "1.6", "50 kg", "feminino", "loiros");
		Pes[2] = new Pessoa("Pedro", "1.9", "100 kg", "masculino", "pretos");
		Pes[3] = new Pessoa("Thiago", "1.5", "50 kg", "masculino", "castanho");
		Pes[4] = new Pessoa("Catarina", "1.7", "60 kg", "feminino", "ruivos");
		
		System.out.println("\n************************** Classe Pessoa **************************\n");
		
		for (int i=0; i<5; i++) {
			
			System.out.println(Pes[i].getNome() + " tem " + Pes[i].getAltura() + "m de altura, pesa " + Pes[i].getPeso() + ". É do sexo " + Pes[i].getSexo() + " e tem cabelos " + Pes[i].getCor_cabelo());
		}
		
		//Array Classe AlunoFatecSJC
		AlunoFatecSJC[] Alu = new AlunoFatecSJC[5];
		Alu[0] = new AlunoFatecSJC("Junior", 0, "Banco de Dados", "Noturno", "Carro");
		Alu[1] = new AlunoFatecSJC("Pedro", 1, "ADS", "Matutino", "Van");
		Alu[2] = new AlunoFatecSJC("Vanessa", 2, "Logistica", "Noturno", "Onibus");
		Alu[3] = new AlunoFatecSJC("Ricardo", 3, "Banco de Dados", "Noturno", "Van");
		Alu[4] = new AlunoFatecSJC("Julia", 4, "ADS", "Matutino", "Carro");
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o RA do aluno"));
		
		System.out.println("\n*********************** Classe AlunoFatecSJC **********************\n");
		
		for (int i=0; i<5; i++) {
			if(Alu[i].getRa() == a) {
				System.out.println("\nAluno.............: " + Alu[i].getAluno());
				System.out.println("RA................: " + Alu[i].getRa());
				System.out.println("Curso.............: " + Alu[i].getCurso());
				System.out.println("Periodo...........: " + Alu[i].getPeriodo());
				System.out.println("Transporte........: " + Alu[i].getTransporte());
				if (Alu[i].getTransporte() == "Carro") {
					Alu[i].matar_aula();
				}else {
					Alu[i].estudar();
				}		
			}
		}
		
		//Array Classe InstrumentoMusical
		InstrumentoMusical[] Inst = new InstrumentoMusical[5];
		Inst[0] = new InstrumentoMusical("Violão", "corda", "madeira", "médio", "sertanejo");
		Inst[1] = new InstrumentoMusical("Violino", "corda", "madeira", "pequeno", "clássica");
		Inst[2] = new InstrumentoMusical("Violoncelo ", "corda", "madeira", "grande", "clássica");
		Inst[3] = new InstrumentoMusical("Saxofone", "sopro", "metal", "médio", "Jazz");
		Inst[4] = new InstrumentoMusical("Clarinete", "sopro", "metral", "pequeno", "clássica");
		
		System.out.println("\n******************** Classe InstrumentoMusical ********************\n");
		
		for (int i=0; i<5; i++) {
			System.out.println("O " + Inst[i].getNome() + " é um instrummento de " + Inst[i].getTipo() + " feito em " + Inst[i].getMaterial() + " de tamanho " + Inst[i].getTamanho() + " e pode tocar música " + Inst[i].getRitmo());
			if (Inst[i].getRitmo() == "clássica") {
				Inst[i].orquestra();
			}
		}
		
		//Array Classe Profissional
		Profissional[] Prof = new Profissional[5];
		Prof[0] = new Profissional("Psicólogo", "humanas", "Consultório", "Superior", 6);
		Prof[1] = new Profissional("Médico", "biológicas", "Hospital", "Superior", 6);
		Prof[2] = new Profissional("Engenheiro", "exatas", "Obras", "Superior", 5);
		Prof[3] = new Profissional("Advogado", "humanas", "Escritório", "Superior", 5);
		Prof[4] = new Profissional("Mestre de Obras", "exatas", "Obras", "Técnico", 2);
		
		System.out.println("\n*********************** Classe Profissional ***********************\n");
		
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 1 a 5"));
		
		if (b > 0 && b <=5) {
			System.out.println("Você escolheu imprimir " + b + " profissão(ões).\n");
			for (int i=0; i<b; i++) {
				System.out.println("Profissão.........: " + Prof[i].getProfissao());
				System.out.println("Área..............: " + Prof[i].getArea());
				System.out.println("Local Trabalho....: " + Prof[i].getLocal_trabalho());
				System.out.println("Graduação.........: " + Prof[i].getGraduacao());
				System.out.println("Anos de estudo....: " + Prof[i].getAnos_estudos());
				
				if(Prof[i].getLocal_trabalho()=="Consultório" || Prof[i].getLocal_trabalho()=="Escritório") {
					System.out.println("");
					Prof[i].escritorio();
				}
				if(Prof[i].getLocal_trabalho()=="Obras") {
					System.out.println("");
					Prof[i].rua();
				}
				if(Prof[i].getLocal_trabalho()=="Hospital") {
					System.out.println("");
					Prof[i].hospital();
				}
				
				System.out.println("-----------------------------------");
			}
			
		}else {
			System.out.println("Você digitou um número diferente de 1 a 5");
		}
		
		//Array Calcado
		Calcado[] Cal = new Calcado[5];
		Cal[0] = new Calcado("Social", "Masculino", 40, "Preto", "Sim");
		Cal[1] = new Calcado("Esporte", "Masculino", 42, "Branco", "Não");
		Cal[2] = new Calcado("Social", "Feminino", 36, "Prata", "Sim");
		Cal[3] = new Calcado("Esporte", "Feminino", 35, "Preto", "Sim");
		Cal[4] = new Calcado("Social", "Masculino", 41, "Marrom", "Sim");
				
		System.out.println("\n************************* Classe Calcado **************************\n");
		
		int cont1=0, cont2=0, cont3=0, cont4=0;
		
		for (int i=0; i<5; i++) {
			if(Cal[i].getGenero() == "Masculino") {
				cont1 += 1;
			}
			if(Cal[i].getGenero() == "Feminino") {
				cont2 += 1;
			}
			if(Cal[i].getModelo() == "Social") {
				cont3 += 1;
			}
			if(Cal[i].getModelo() == "Esporte") {
				cont4 += 1;
			}
		}
		System.out.println("Sápatos Masculinos Cadastrados...: " + cont1);
		System.out.println("Sápatos Femininos Cadastrados....: " + cont2);
		System.out.println("Sápatos Sociais Cadastrados......: " + cont3);
		System.out.println("Sápatos Esportes Cadastrados.....: " + cont4);
		
	}
}
