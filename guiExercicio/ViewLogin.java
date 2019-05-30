package guiExercicio;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ViewLogin extends JFrame{

	
	Container container;
	JTextField txtUsuario, txtSenha;
	JLabel lblUsuario, lblSenha;
	JButton btnEntrar, btnSair;
	
	public ViewLogin() {
		super ("Login");
		setSize(250,200);
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
					ViewProduto produto = new ViewProduto();
					produto.setVisible(true);
					if (produto.isVisible()==(true)){
					ViewLogin janelalogin = new ViewLogin();
					janelalogin.setVisible(false);
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
		ViewLogin janelalogin = new ViewLogin();
		janelalogin.setVisible(true);

	}

}
