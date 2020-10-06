package br.org.fatec;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JSplitPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frm_Planeta_Object extends JFrame {

	private JPanel contentPane;
	private JTextField nomeField;
	private JTextField corField;
	private JTextField tamanhoField;
	private JTextField distanciaField;
	private JTextField habitadoField;
	private JTextField climaField;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel PlLabelTitulo = new JLabel("Planeta");
		PlLabelTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		PlLabelTitulo.setFont(new Font("Tahoma", Font.BOLD, 14));
		PlLabelTitulo.setBounds(23, 11, 401, 14);
		contentPane.add(PlLabelTitulo);
		
		JLabel PlLabelNome = new JLabel("Nome");
		PlLabelNome.setBounds(10, 52, 46, 14);
		contentPane.add(PlLabelNome);
		
		JLabel PlLabelCor = new JLabel("Cor");
		PlLabelCor.setBounds(10, 77, 46, 14);
		contentPane.add(PlLabelCor);
		
		JLabel PlLabelTamanho = new JLabel("Tamanho");
		PlLabelTamanho.setBounds(10, 102, 46, 14);
		contentPane.add(PlLabelTamanho);
		
		JLabel PlLabelDistancia = new JLabel("Dist. Sol");
		PlLabelDistancia.setBounds(10, 127, 46, 14);
		contentPane.add(PlLabelDistancia);
		
		JLabel PlLabelHabitado = new JLabel("Habitado");
		PlLabelHabitado.setBounds(10, 155, 46, 14);
		contentPane.add(PlLabelHabitado);
		
		nomeField = new JTextField();
		nomeField.setBounds(66, 49, 142, 20);
		contentPane.add(nomeField);
		nomeField.setColumns(10);
		
		corField = new JTextField();
		corField.setBounds(66, 74, 142, 20);
		contentPane.add(corField);
		corField.setColumns(10);
		
		tamanhoField = new JTextField();
		tamanhoField.setBounds(66, 99, 142, 20);
		contentPane.add(tamanhoField);
		tamanhoField.setColumns(10);
		
		distanciaField = new JTextField();
		distanciaField.setBounds(66, 124, 142, 20);
		contentPane.add(distanciaField);
		distanciaField.setColumns(10);
		
		habitadoField = new JTextField();
		habitadoField.setEditable(false);
		habitadoField.setBounds(66, 152, 142, 20);
		contentPane.add(habitadoField);
		habitadoField.setColumns(10);
		
		JButton PlButtonSalvar = new JButton("Salvar");
		PlButtonSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		PlButtonSalvar.setBounds(304, 48, 89, 43);
		contentPane.add(PlButtonSalvar);
		
		JButton PlButtonLimpar = new JButton("Limpar");
		PlButtonLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nomeField.setText("");
				corField.setText("");
				tamanhoField.setText("");
				distanciaField.setText("");
				habitadoField.setText("");
				climaField.setText("");
				
			}
		});
		PlButtonLimpar.setBounds(304, 113, 89, 43);
		contentPane.add(PlButtonLimpar);
		
		climaField = new JTextField();
		climaField.setEditable(false);
		climaField.setBounds(66, 180, 142, 20);
		contentPane.add(climaField);
		climaField.setColumns(10);
		
		JLabel PlLabelClima = new JLabel("Clima");
		PlLabelClima.setBounds(10, 183, 46, 14);
		contentPane.add(PlLabelClima);
	}
}
