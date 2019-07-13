package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;

public class View_AlterarSenhaFuncionario extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View_AlterarSenhaFuncionario frame = new View_AlterarSenhaFuncionario();
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
	public View_AlterarSenhaFuncionario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 337);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(39, 53, 363, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblUsurio = new JLabel("Usu\u00E1rio");
		lblUsurio.setBounds(39, 38, 46, 14);
		contentPane.add(lblUsurio);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(39, 99, 363, 20);
		contentPane.add(textField_1);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(39, 84, 46, 14);
		contentPane.add(lblSenha);
		
		textField_2 = new JTextField();
		textField_2.setBounds(39, 144, 363, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNovaSenha = new JLabel("Nova Senha");
		lblNovaSenha.setBounds(39, 129, 70, 14);
		contentPane.add(lblNovaSenha);
		
		textField_3 = new JTextField();
		textField_3.setBounds(39, 189, 363, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblConfirmarNovaSenha = new JLabel("Confirmar Nova Senha");
		lblConfirmarNovaSenha.setBounds(39, 175, 145, 14);
		contentPane.add(lblConfirmarNovaSenha);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setForeground(new Color(0, 0, 0));
		btnEnviar.setBackground(new Color(204, 204, 204));
		btnEnviar.setBounds(39, 234, 363, 35);
		contentPane.add(btnEnviar);
	}
}
