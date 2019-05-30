package LoginCadastroProdutos;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ViewLogin extends JFrame {
	JScrollPane scrollPane;
	JTable tabela;
	Container container;
	JTextField txtCodigo, txtUsuario, txtSenha, txtTelefone;
	JLabel lblCodigo, lblUsuario, lblSenha, lblTelefone;
	JButton btnEntrar, btnSair;
	DefaultTableModel dtm;

	public ViewLogin() {
		super("Painel ADM");
		setSize(250, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		container = getContentPane();
		container.setLayout(null);

		// *************Usuário***************
		lblUsuario = new JLabel("Usuário");
		lblUsuario.setBounds(15, 35, 80, 20);

		txtUsuario = new JTextField();
		txtUsuario.setBounds(65, 35, 160, 20);

		// ************Senha*************]

		lblSenha = new JLabel("Senha");
		lblSenha.setBounds(19, 65, 80, 20);

		txtSenha = new JTextField();
		txtSenha.setBounds(65, 65, 160, 20);

		// ****************botões ENTRAR*****************

		btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(15, 110, 100, 27);
		btnEntrar.setToolTipText("Adiciona Clientes");

		// ****************botões SAIR*****************

		btnSair = new JButton("Sair");
		btnSair.setBounds(124, 110, 100, 27);
		btnSair.setToolTipText("Remove Clientes");

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

			public void actionPerformed(ActionEvent e) {
				if (txtUsuario.getText().equals("admin") || txtSenha.getText().equals("admin")) {

					ViewProduto viewProduto = new ViewProduto();

					viewProduto.setVisible(true);

				}
			}
		});

		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});
	}

	public static void main(String[] args) {
		ViewLogin viewLogin = new ViewLogin();
		ViewProduto viewProduto = new ViewProduto();

		viewLogin.setVisible(true);

	}

}
