package br.org.fatec;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JSplitPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Frm_Planeta_Object extends JFrame {

	private JPanel contentPane;
	private JTextField nomeField;
	private JTextField corField;
	private JTextField tamanhoField;
	private JTextField distanciaField;
	private JTextField habitadoField;
	private JTextField climaField;
	private ArrayList<Planeta> planetas; // criação do ArrayList Planeta

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frm_Planeta_Object frame = new Frm_Planeta_Object();
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
	
	
	public Frm_Planeta_Object() {
		
		planetas = new ArrayList<Planeta>(); // iniciando o ArrayList Planeta
		setTitle("Cadastro de Planetas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel PlLabelTitulo = new JLabel("Planeta");
		PlLabelTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		PlLabelTitulo.setFont(new Font("Algerian", Font.ITALIC, 17));
		PlLabelTitulo.setBounds(10, 27, 414, 14);
		contentPane.add(PlLabelTitulo);
		
		JLabel PlLabelNome = new JLabel("Nome");
		PlLabelNome.setBounds(10, 68, 62, 14);
		contentPane.add(PlLabelNome);
		
		JLabel PlLabelCor = new JLabel("Cor");
		PlLabelCor.setBounds(10, 93, 62, 14);
		contentPane.add(PlLabelCor);
		
		JLabel PlLabelTamanho = new JLabel("Tamanho");
		PlLabelTamanho.setBounds(10, 118, 62, 14);
		contentPane.add(PlLabelTamanho);
		
		JLabel PlLabelDistancia = new JLabel("Dist. Sol");
		PlLabelDistancia.setBounds(10, 143, 62, 14);
		contentPane.add(PlLabelDistancia);
		
		JLabel PlLabelHabitado = new JLabel("Habitado");
		PlLabelHabitado.setBounds(10, 171, 62, 14);
		contentPane.add(PlLabelHabitado);
		
		nomeField = new JTextField();
		nomeField.setDocument(new Limite_digitos(10)); // Esse é o código para limitar o número de digitos. Ele chama a classe Limite_digitos
		nomeField.setBounds(82, 68, 142, 20);
		contentPane.add(nomeField);
		nomeField.setColumns(10);
						
		corField = new JTextField();
		corField.setDocument(new Limite_digitos(10)); // Esse é o código para limitar o número de digitos. Ele chama a classe Limite_digitos
		corField.setBounds(82, 93, 142, 20);
		contentPane.add(corField);
		corField.setColumns(10);
		
		tamanhoField = new JTextField();
		tamanhoField.setDocument(new Limite_digitos_numeros(15)); // Esse é o código para limitar o número de digitos. Ele chama a classe Limite_digitos_numeros
		tamanhoField.setBounds(82, 118, 142, 20);
		contentPane.add(tamanhoField);
		tamanhoField.setColumns(10);
		
		distanciaField = new JTextField();
		distanciaField.setDocument(new Limite_digitos_numeros(15)); // Esse é o código para limitar o número de digitos. Ele chama a classe Limite_digitos_numeros
		distanciaField.setBounds(82, 143, 142, 20);
		contentPane.add(distanciaField);
		distanciaField.setColumns(10);
		
		habitadoField = new JTextField();
		habitadoField.setEditable(false);
		habitadoField.setBounds(82, 171, 142, 20);
		contentPane.add(habitadoField);
		habitadoField.setColumns(10);
		
		JButton PlButtonSalvar = new JButton("Salvar"); // Botão Salvar
		Planeta pl = new Planeta(); // método construtor
		PlButtonSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
								
				if(nomeField.getText().equals("Terra") || nomeField.getText().equals("terra")) {
					habitadoField.setText("Sim");
					}else {
						habitadoField.setText("Nao");
						}
				
				if(Integer.valueOf(distanciaField.getText()) < 150) {
					climaField.setText(pl.quente());
				}else if(Integer.valueOf(distanciaField.getText()) > 150) {
					climaField.setText(pl.frio());
				}else {
					climaField.setText("Temperatura perfeita");
				}
				
				InserirPlaneta(); // chamando o método InserirPlaneta
				
				JOptionPane.showMessageDialog(null,"Salvo com Sucesso!!!");
				//JOptionPane.showMessageDialog(null,"MENSAGEM AQUI","TITULO", JOptionPane.INFO_MESSAGE);
				//Pode-se mudar a constante INFO_MESSAGE pra WARNING_MESSAGE, ERROR_MESSAGE e outros
				
				LimparCampos(); // chamando o método LimparCampos
							
			}
		});
		
		PlButtonSalvar.setBounds(318, 64, 89, 43);
		contentPane.add(PlButtonSalvar);
		
		JButton PlButtonLimpar = new JButton("Limpar"); // Botão Limpar
		PlButtonLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LimparCampos(); // chamando o método LimparCampos
			}
		});
		
		PlButtonLimpar.setBounds(318, 186, 89, 43);
		contentPane.add(PlButtonLimpar);
		
		climaField = new JTextField();
		climaField.setEditable(false);
		climaField.setBounds(82, 199, 206, 20);
		contentPane.add(climaField);
		climaField.setColumns(10);
		
		JLabel PlLabelClima = new JLabel("Clima");
		PlLabelClima.setBounds(10, 199, 62, 14);
		contentPane.add(PlLabelClima);
		
		JButton PlButtonProcurar = new JButton("Procurar"); // Botão Procurar
		PlButtonProcurar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProcurarPlaneta(); // chamando o método ProcurarPlaneta				
			}
		});
		PlButtonProcurar.setBounds(318, 124, 89, 43);
		contentPane.add(PlButtonProcurar);
	}
		
	public void InserirPlaneta() {
		Planeta pl = new Planeta(nomeField.getText(),Integer.valueOf(distanciaField.getText()));
		pl.setCor(corField.getText());
		pl.setTamanho(tamanhoField.getText());
		pl.setHabitado(habitadoField.getText());
		planetas.add(pl);
	}
	
	public void ProcurarPlaneta() {
		Planeta pl = new Planeta();
		
		for (int i=0;i<planetas.size();i++) {
			
			pl=(Planeta)planetas.get(i);
			if(pl.getNome().equals(nomeField.getText())) {
				corField.setText(pl.getCor());
				tamanhoField.setText(pl.getTamanho());
				distanciaField.setText(String.valueOf(pl.getDistancia_sol()));
				habitadoField.setText(pl.getHabitado());
				
				// Para preencher o distanciaField:
				if(Integer.valueOf(distanciaField.getText()) < 150) {
					climaField.setText(pl.quente());
				}else if(Integer.valueOf(distanciaField.getText()) > 150) {
					climaField.setText(pl.frio());
				}else {
					climaField.setText("Temperatura perfeita");
				}
			}
		}
		
	}
	
	public void LimparCampos() {
		nomeField.setText("");
		corField.setText("");
		tamanhoField.setText("");
		distanciaField.setText("");
		habitadoField.setText("");
		climaField.setText("");
	}
}
