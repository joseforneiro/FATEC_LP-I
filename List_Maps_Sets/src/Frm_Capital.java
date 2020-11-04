import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.HashMap;


public class Frm_Capital extends JFrame {
	private JTextField tF_Sigla;
	private JTextField tF_Capital;
	private HashMap hm; // criação do HashMap hm

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frm_Capital frame = new Frm_Capital();
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
	public Frm_Capital() {
		
		hm = new HashMap(); // iniciando o HashMap hm
		CadastrarCapital(); // Chamando o Método CadastrarCapital
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Capitais do Pa\u00EDs");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 23, 414, 22);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Sigla");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(171, 86, 43, 15);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Capital");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(171, 138, 52, 14);
		getContentPane().add(lblNewLabel_2);
		
		tF_Sigla = new JTextField();
		tF_Sigla.setDocument(new Limite_digitos(2)); // Esse é o código para limitar o número de digitos. Ele chama a classe Limite_digitos
		tF_Sigla.setBounds(171, 107, 52, 20);
		getContentPane().add(tF_Sigla);
		tF_Sigla.setColumns(10);
		
		tF_Capital = new JTextField();
		tF_Capital.setEditable(false);
		tF_Capital.setBounds(171, 157, 132, 20);
		getContentPane().add(tF_Capital);
		tF_Capital.setColumns(10);
		
		JButton BProcurar = new JButton("Procurar");
		BProcurar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tF_Capital.setText((String) hm.get(tF_Sigla.getText()));
				System.out.println(hm.get(tF_Sigla.getText()));
			}
			
		});
		BProcurar.setBounds(109, 211, 89, 23);
		getContentPane().add(BProcurar);
		
		JButton BLimpar = new JButton("Limpar");
		BLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LimparCampos();
			}
		});
		BLimpar.setBounds(260, 211, 89, 23);
		getContentPane().add(BLimpar);
	}
	
	public void LimparCampos() {
		tF_Sigla.setText("");
		tF_Capital.setText("");
	}
	
	public void CadastrarCapital() {
		hm.put("AC","Rio Branco");
		hm.put("AL","Maceio");
		hm.put("AP","Amapá");
		hm.put("AM","Manaus");
		hm.put("BA","Salvador");
		hm.put("CE","Fortaleza");
		hm.put("DF","Brasilia");
		hm.put("ES","Vitoria");
		hm.put("AC","Rio Branco");
		hm.put("MA","Sao Luis");
		hm.put("MT","Cuiaba");
		hm.put("MS","Campo Grande");
		hm.put("MG","Belo Horizonte");
		hm.put("PA","Belem");
		hm.put("PB","Joao Pessoa");
		hm.put("PR","Curitiba");
		hm.put("PE","Recife");
		hm.put("PI","Teresina");
		hm.put("RJ","Rio de Janeiro");
		hm.put("RN","Natal");
		hm.put("RS","Porto Alegre");
		hm.put("RO","Porto Velho");
		hm.put("SC","Florianopolis");
		hm.put("SP","Sao Paulo");
		hm.put("SE","Aracaju");
		hm.put("TO","Tocantins");
	}
	
}
