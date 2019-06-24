package view;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import db.DB_Login;

import java.awt.Color;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;


import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;

public class View_Login extends JFrame {

	private JPanel contentPane;
	private JTextField usernameField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View_Login frame = new View_Login();
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
	public View_Login() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 658, 361);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBackground(new Color(60, 179, 113));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 274, 332);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblSupermarket = new JLabel("SUPERMARKET");
		lblSupermarket.setForeground(new Color(60, 179, 113));
		lblSupermarket.setHorizontalAlignment(SwingConstants.CENTER);
		lblSupermarket.setFont(new Font("Verdana", Font.BOLD, 26));
		lblSupermarket.setBounds(31, 147, 219, 43);
		panel.add(lblSupermarket);
		
		JLabel lblJavas = new JLabel("JAVA'S");
		lblJavas.setBackground(new Color(255, 51, 51));
		lblJavas.setForeground(new Color(255, 51, 51));
		lblJavas.setFont(new Font("Verdana", Font.BOLD, 26));
		lblJavas.setBounds(89, 109, 101, 43);
		panel.add(lblJavas);
		
		JButton btnLogin = new JButton("Entrar");
		btnLogin.setFont(new Font("Arial", Font.BOLD, 12));
		btnLogin.setBackground(new Color(255, 51, 51));
		btnLogin.setForeground(Color.WHITE);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DB_Login pro = new DB_Login();
				pro.createConnection();
				
			}
		});
		btnLogin.setBounds(502, 230, 92, 31);
		contentPane.add(btnLogin);
		
		setUsernameField(new JTextField());
		getUsernameField().setBackground(new Color(245, 245, 245));
		getUsernameField().setFont(new Font("Arial Black", Font.PLAIN, 14));
		getUsernameField().setHorizontalAlignment(SwingConstants.LEFT);
		getUsernameField().setBounds(327, 79, 267, 31);
		contentPane.add(getUsernameField());
		getUsernameField().setColumns(10);
		
		setPasswordField(new JPasswordField());
		getPasswordField().setEchoChar('*');
		getPasswordField().setBackground(new Color(245, 245, 245));
		getPasswordField().setFont(new Font("Arial Black", Font.PLAIN, 14));
		getPasswordField().setBounds(327, 157, 267, 31);
	
		contentPane.add(getPasswordField());
		getPasswordField().setColumns(10);
		
		
		JLabel lblUsuario = new JLabel("Usu\u00E1rio");
		lblUsuario.setForeground(new Color(255, 255, 255));
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblUsuario.setBounds(327, 54, 67, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setForeground(new Color(255, 255, 255));
		lblSenha.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblSenha.setBounds(327, 132, 67, 14);
		contentPane.add(lblSenha);
		
		JCheckBox checkBoxVisualizar = new JCheckBox("Visualizar");
		checkBoxVisualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(checkBoxVisualizar.isSelected()) {
					getPasswordField().setEchoChar((char)0);
					
				}else 
					getPasswordField().setEchoChar('*');
				{
				
				}
			}
		});
		checkBoxVisualizar.setForeground(new Color(255, 255, 255));
		checkBoxVisualizar.setFont(new Font("Arial", Font.BOLD, 12));
		checkBoxVisualizar.setBackground(new Color(46, 139, 87));
		checkBoxVisualizar.setBounds(327, 197, 86, 23);
		contentPane.add(checkBoxVisualizar);
	}

	public JTextField getUsernameField() {
		return usernameField;
	}

	public void setUsernameField(JTextField usernameField) {
		this.usernameField = usernameField;
	}

	public JPasswordField getPasswordField() {
		return passwordField;
	}

	public void setPasswordField(JPasswordField passwordField) {
		this.passwordField = passwordField;
	}
}
