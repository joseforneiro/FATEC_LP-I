import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.util.HashMap;
import java.util.HashSet;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frm_Cpf extends JFrame {
	private JTextField tF_CPF;
	private JTextField tF_CPFd;
	private JTextField tF_CPFc;
	private HashSet hs; // criação do HashSet hs
	
	int cont = 0;
	int cont1 = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frm_Cpf frame = new Frm_Cpf();
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
	public Frm_Cpf() {
		
		hs = new HashSet(); // iniciando o HashSet hs
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastro de CPF");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 22, 414, 22);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CPF");
		lblNewLabel_1.setBounds(64, 84, 46, 14);
		getContentPane().add(lblNewLabel_1);
		
		tF_CPF = new JTextField();
		tF_CPF.setDocument(new Limite_digitos_numeros(11)); // Esse é o código para limitar o número de digitos. Ele chama a classe Limite_digitos
		tF_CPF.setBounds(95, 81, 119, 20);
		getContentPane().add(tF_CPF);
		tF_CPF.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("CPF Digitado");
		lblNewLabel_2.setBounds(64, 112, 80, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("CPF Cadastrado");
		lblNewLabel_3.setBounds(64, 137, 96, 14);
		getContentPane().add(lblNewLabel_3);
		
		tF_CPFd = new JTextField();
		tF_CPFd.setHorizontalAlignment(SwingConstants.CENTER);
		tF_CPFd.setEditable(false);
		tF_CPFd.setBounds(168, 109, 46, 20);
		getContentPane().add(tF_CPFd);
		tF_CPFd.setColumns(10);
		
		tF_CPFc = new JTextField();
		tF_CPFc.setHorizontalAlignment(SwingConstants.CENTER);
		tF_CPFc.setEditable(false);
		tF_CPFc.setBounds(170, 134, 44, 20);
		getContentPane().add(tF_CPFc);
		tF_CPFc.setColumns(10);
		
		JButton BCadastrar = new JButton("Cadastrar");
		BCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastrarCPF();
			}
		});
		BCadastrar.setBounds(64, 204, 96, 23);
		getContentPane().add(BCadastrar);
		
		JButton BLimpar = new JButton("Limpar");
		BLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LimparCampos();
			}
		});
		BLimpar.setBounds(274, 204, 96, 23);
		getContentPane().add(BLimpar);
	}
	
	public void LimparCampos() {
		tF_CPF.setText("");
		tF_CPFd.setText("");
		tF_CPFc.setText("");
	}
	
	public void CadastrarCPF() {
		hs.add(tF_CPF.getText());
		cont += 1;
		tF_CPFd.setText(Integer.toString(cont));
		tF_CPFc.setText(Integer.toString(hs.size()));
	}	
	
}
