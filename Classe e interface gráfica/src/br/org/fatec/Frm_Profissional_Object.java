package br.org.fatec;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frm_Profissional_Object extends JFrame {
	private JTextField profissaoField;
	private JTextField areaField;
	private JTextField localField;
	private JTextField graduacaoField;
	private JTextField anosField;
	private ArrayList<Profissional> profissionais; // criação do ArrayList Profissional

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frm_Profissional_Object frame = new Frm_Profissional_Object();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Frm_Profissional_Object() {
		
		profissionais = new ArrayList<Profissional>(); // iniciando o ArrayList Profissional
		setTitle("Cadastro de Profissional");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel PrLabelProfissao = new JLabel("Profiss\u00E3o");
		PrLabelProfissao.setBounds(22, 71, 79, 14);
		getContentPane().add(PrLabelProfissao);
		
		JLabel PrLabelArea = new JLabel("\u00C1rea");
		PrLabelArea.setBounds(22, 96, 79, 14);
		getContentPane().add(PrLabelArea);
		
		profissaoField = new JTextField();
		profissaoField.setDocument(new Limite_digitos(10)); // Esse é o código para limitar o número de digitos. Ele chama a classe Limite_digitos
		profissaoField.setBounds(111, 68, 142, 20);
		getContentPane().add(profissaoField);
		profissaoField.setColumns(10);
		
		areaField = new JTextField();
		areaField.setDocument(new Limite_digitos(10)); // Esse é o código para limitar o número de digitos. Ele chama a classe Limite_digitos
		areaField.setBounds(111, 93, 142, 20);
		getContentPane().add(areaField);
		areaField.setColumns(10);
		
		JLabel PrLabelLocal = new JLabel("Local Trab");
		PrLabelLocal.setBounds(22, 121, 79, 14);
		getContentPane().add(PrLabelLocal);
		
		JLabel PrLabelGraduacao = new JLabel("Gradua\u00E7\u00E3o");
		PrLabelGraduacao.setBounds(22, 146, 79, 14);
		getContentPane().add(PrLabelGraduacao);
		
		JLabel PrLabelAnos = new JLabel("Anos Estudos");
		PrLabelAnos.setBounds(22, 171, 79, 14);
		getContentPane().add(PrLabelAnos);
		
		localField = new JTextField();
		localField.setDocument(new Limite_digitos(10)); // Esse é o código para limitar o número de digitos. Ele chama a classe Limite_digitos
		localField.setBounds(111, 118, 142, 20);
		getContentPane().add(localField);
		localField.setColumns(10);
		
		graduacaoField = new JTextField();
		graduacaoField.setDocument(new Limite_digitos(10)); // Esse é o código para limitar o número de digitos. Ele chama a classe Limite_digitos
		graduacaoField.setBounds(111, 143, 142, 20);
		getContentPane().add(graduacaoField);
		graduacaoField.setColumns(10);
		
		anosField = new JTextField();
		anosField.setDocument(new Limite_digitos_numeros(1)); // Esse é o código para limitar o número de digitos. Ele chama a classe Limite_digitos_numeros
		anosField.setBounds(111, 168, 142, 20);
		getContentPane().add(anosField);
		anosField.setColumns(10);
		
		JButton PrButtonSalvar = new JButton("Salvar"); // Botão Salvar
		PrButtonSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				InserirProfissao(); // chamando o método InserirProfissao
				
				JOptionPane.showMessageDialog(null,"Salvo com Sucesso!!!");
				//JOptionPane.showMessageDialog(null,"MENSAGEM AQUI","TITULO", JOptionPane.INFO_MESSAGE);
				//Pode-se mudar a constante INFO_MESSAGE pra WARNING_MESSAGE, ERROR_MESSAGE e outros
				
				LimparCampos(); // chamando o método LimparCampos
				
			}
		});
		Profissional pr = new Profissional(); // método construtor
		PrButtonSalvar.setBounds(323, 57, 89, 43);
		getContentPane().add(PrButtonSalvar);
		
		JButton PrButtonProcurar = new JButton("Procurar"); // Botão Procurar
		PrButtonProcurar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProcurarProfissao(); // chamando o método ProcurarProfissao
			}
		});
		PrButtonProcurar.setBounds(323, 117, 89, 43);
		getContentPane().add(PrButtonProcurar);
		
		JButton PrButtonLimpar = new JButton("Limpar"); // Botão Limpar
		PrButtonLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LimparCampos(); // chamando o método LimparCampos
			}
		});
		PrButtonLimpar.setBounds(323, 177, 89, 43);
		getContentPane().add(PrButtonLimpar);
		
		JLabel lblNewLabel = new JLabel("Profissional");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Algerian", Font.ITALIC, 17));
		lblNewLabel.setBounds(22, 21, 390, 14);
		getContentPane().add(lblNewLabel);
	}
	public void InserirProfissao() {
		Profissional pr = new Profissional(profissaoField.getText(),areaField.getText(),localField.getText(),graduacaoField.getText(),Integer.valueOf(anosField.getText()));
		profissionais.add(pr);
	}
	
	public void ProcurarProfissao() {
		Profissional pr = new Profissional();
		
		for (int i=0;i<profissionais.size();i++) {
			
			pr=(Profissional)profissionais.get(i);
			if(pr.getProfissao().equals(profissaoField.getText())) {
				areaField.setText(pr.getArea());
				localField.setText(pr.getLocal_trabalho());
				graduacaoField.setText(pr.getGraduacao());
				anosField.setText(String.valueOf(pr.getAnos_estudos()));	
			}
		}
		
	}
	
	public void LimparCampos() {
		profissaoField.setText("");
		areaField.setText("");
		localField.setText("");
		graduacaoField.setText("");
		anosField.setText("");
	}
	
}
