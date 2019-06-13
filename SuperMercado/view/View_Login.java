package view;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class View_Login extends JFrame{

	
	Container container;
	JTextField txtUsuario, txtSenha;
	JLabel lblUsuario, lblSenha;
	JButton btnEntrar, btnSair;
	
	public View_Login() {
		super ("Mercado Java's - LOGIN CAIXA");
		setSize(350,200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		container = getContentPane();
		container.setLayout(null);
		
		//***************Usuario*****************8
		lblUsuario =  new JLabel("Usuário:");
		lblUsuario.setBounds(5, 5, 80, 20);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(65, 5, 150, 20);
			
		//*************Senha***************
		lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(5, 35, 80, 20);
		
		txtSenha = new JTextField();
		txtSenha.setBounds(65, 35, 150, 20);
		
		//****************botões Entrar*****************
		
		btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(10, 95, 100, 30);
		btnEntrar.setToolTipText("Entrar na Aplicação");
		
		//****************botões Sair*****************
		
		btnSair = new JButton("Sair");
		btnSair.setBounds(120, 95, 100, 30);
		btnSair.setToolTipText("Sair da Aplicação");
		
		add(lblUsuario);
		add(txtUsuario);
		
		add(lblSenha);
		add(txtSenha);
		
		add(btnEntrar);
		add(btnSair);
		
		eventos();
		
	}
	
	private void eventos() {
		
		btnEntrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (txtUsuario.getText().equals("admin") || txtSenha.getText().equals("admin")) {
					JOptionPane.showMessageDialog(null, "Bem-Vindo!");
					View_Caixa janelaCaixa = new View_Caixa();
					janelaCaixa.setVisible(true);
					if (janelaCaixa.isVisible()==(true)){
					View_Login loginCaixa = new View_Login();
					loginCaixa.setVisible(false);
					}
				
					//return;
				}else {
					JOptionPane.showMessageDialog(null, "Usuário ou Senha Incorretos");
				}
				
			}
		});
		
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Encerrando Aplicação");
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		View_Login janelalogin = new View_Login();
		janelalogin.setVisible(true);
		
		
	}

}
