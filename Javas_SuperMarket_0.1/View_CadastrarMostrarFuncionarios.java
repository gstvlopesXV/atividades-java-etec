package view;

import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class View_CadastrarMostrarFuncionarios extends JFrame {

	JScrollPane scrollPane;
	JTable tabela;
	Container container;
	JButton btnAtualizar;
	DefaultTableModel dtm;
	private JTextField NomeCompletoField;
	private JTextField UsuarioField;
	private JTextField SenhaField;
	private JTextField ConfirmarSenhaField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View_CadastrarMostrarFuncionarios frame = new View_CadastrarMostrarFuncionarios();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public View_CadastrarMostrarFuncionarios() {
		super("JAVA'S SUPERMARKET - OPERADOR 1 - FUNCIONÁRIOS");
		setResizable(false);
		getContentPane().setBackground(Color.DARK_GRAY);
		setType(Type.UTILITY);
		setSize(800, 676);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		container = getContentPane();
		container.setLayout(null);

//	---------------------TABELA---------------------

		dtm = new DefaultTableModel(new String[] { "Funcionario", "Login", "Senha", "Ult.Acesso", }, 0) {
			public boolean isCellEditable(int row, int col) {
				return false;
			}
		};

		tabela = new JTable(dtm);
		tabela.setBackground(new Color(255, 255, 255));

//	-----------------MOVIMENTAÇÃO----------------------

		tabela.getTableHeader().setReorderingAllowed(false);

//	----------TAMANHO/DIMENSIONAMENTO DA COLUNAS--------------	

		tabela.getColumnModel().getColumn(0).setPreferredWidth(261);
		tabela.getColumnModel().getColumn(0).setResizable(false);

		tabela.getColumnModel().getColumn(1).setPreferredWidth(170);
		tabela.getColumnModel().getColumn(1).setResizable(false);

		tabela.getColumnModel().getColumn(2).setPreferredWidth(170);
		tabela.getColumnModel().getColumn(2).setResizable(false);

		tabela.getColumnModel().getColumn(3).setPreferredWidth(170);
		tabela.getColumnModel().getColumn(3).setResizable(false);

		tabela.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

//	-----------------ALINHAMENTO-----------------------

		DefaultTableCellRenderer alinhaDireita = new DefaultTableCellRenderer();
		alinhaDireita.setHorizontalAlignment(SwingConstants.RIGHT);

		scrollPane = new JScrollPane(tabela);
		scrollPane.setBounds(10, 339, 774, 256);

//	-----------------BANCO DE DADOS-----------------------

		final String URL = "jdbc:mysql://localhost:3306/db_supermercado?useTimezone=true&serverTimezone=UTC";
		final String USER = "root";
		final String PASSWORD = "";

		try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD)) {
			System.out.println("banco conectado");

			String sql = "select NomeCompleto, Usuario, Senha from tbl_login";
			PreparedStatement stm = con.prepareStatement(sql);

			System.out.println(sql);

			ResultSet rs = stm.executeQuery();
			java.sql.ResultSetMetaData rsmd = rs.getMetaData();
			int colNo = rsmd.getColumnCount();

			while (rs.next()) {
				Object[] objects = new Object[colNo];
				for (int i = 0; i < colNo; i++) {
					objects[i] = rs.getObject(i + 1);
				}
				dtm.addRow(objects);

			}
			tabela.setModel(dtm);
			rs.close();
			stm.close();
			con.close();

		} catch (SQLException error) {
			JOptionPane.showMessageDialog(null, "Problemas na conexão com o banco\n" + error);
		}

//	--------------ATUALIZAR--------------------

		btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setForeground(new Color(255, 255, 255));
		btnAtualizar.setBounds(10, 606, 774, 30);
		btnAtualizar.setBackground(new Color(102, 153, 204));
		getContentPane().add(scrollPane);

		getContentPane().add(btnAtualizar);

		NomeCompletoField = new JTextField();
		NomeCompletoField.setBounds(66, 54, 648, 20);
		getContentPane().add(NomeCompletoField);
		NomeCompletoField.setColumns(10);

		JLabel lblNomeCompleto = new JLabel("Nome Completo");
		lblNomeCompleto.setForeground(new Color(255, 255, 255));
		lblNomeCompleto.setFont(new Font("Arial", Font.BOLD, 14));
		lblNomeCompleto.setBounds(66, 29, 136, 14);
		getContentPane().add(lblNomeCompleto);

		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NomeCompletoField.setText("");
				UsuarioField.setText("");
				SenhaField.setText("");
				ConfirmarSenhaField.setText("");

			}
		});
		btnLimpar.setBackground(new Color(102, 153, 204));
		btnLimpar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnLimpar.setForeground(new Color(255, 255, 255));
		btnLimpar.setBounds(588, 279, 126, 38);
		getContentPane().add(btnLimpar);

		UsuarioField = new JTextField();
		UsuarioField.setBounds(66, 115, 648, 20);
		getContentPane().add(UsuarioField);
		UsuarioField.setColumns(10);

		JLabel lblUsuarioDeAcesso = new JLabel("Usu\u00E1rio");
		lblUsuarioDeAcesso.setForeground(Color.WHITE);
		lblUsuarioDeAcesso.setFont(new Font("Arial", Font.BOLD, 14));
		lblUsuarioDeAcesso.setBounds(66, 90, 136, 14);
		getContentPane().add(lblUsuarioDeAcesso);

		SenhaField = new JTextField();
		SenhaField.setColumns(10);
		SenhaField.setBounds(66, 171, 648, 20);
		getContentPane().add(SenhaField);

		ConfirmarSenhaField = new JTextField();
		ConfirmarSenhaField.setColumns(10);
		ConfirmarSenhaField.setBounds(66, 232, 648, 20);
		getContentPane().add(ConfirmarSenhaField);

		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setForeground(Color.WHITE);
		lblSenha.setFont(new Font("Arial", Font.BOLD, 14));
		lblSenha.setBounds(66, 146, 136, 14);
		getContentPane().add(lblSenha);

		JLabel lblConfirmarSenha = new JLabel("Confirmar Senha");
		lblConfirmarSenha.setForeground(Color.WHITE);
		lblConfirmarSenha.setFont(new Font("Arial", Font.BOLD, 14));
		lblConfirmarSenha.setBounds(66, 207, 136, 14);
		getContentPane().add(lblConfirmarSenha);

		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				final String URL = "jdbc:mysql://localhost:3306/db_supermercado?useTimezone=true&serverTimezone=UTC";
				final String USER = "root";
				final String PASSWORD = "";

				try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD)) {
					System.out.println("banco conectado");

					String sql = "INSERT INTO tbl_login (NomeCompleto, Usuario, Senha) VALUES (?,?,?)";

					PreparedStatement stm = con.prepareStatement(sql);

					if (NomeCompletoField.getText().equals("") || UsuarioField.getText().equals("")
							|| SenhaField.getText().equals("") || ConfirmarSenhaField.getText().equals(""))

					{
						JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
						// return;
					}

					else if (ConfirmarSenhaField.getText().equals(SenhaField.getText())) {
						stm.setString(1, NomeCompletoField.getText());
						stm.setString(2, UsuarioField.getText());
						stm.setString(3, SenhaField.getText());
						stm.executeUpdate();
						JOptionPane.showMessageDialog(null, "Cadastrado efetuado !");
					} else {
						JOptionPane.showMessageDialog(null, "Campo de confirmação de\nsenha e senha estão diferentes");
					}

				} catch (SQLException error) {
					dispose();
					System.out.println("Erro SQL: " + error);
				}

			}
		});
		btnEnviar.setBounds(450, 279, 126, 38);
		getContentPane().add(btnEnviar);
		btnEnviar.setBackground(new Color(102, 153, 204));
		btnEnviar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEnviar.setForeground(new Color(255, 255, 255));

		eventos();
	}

	private void eventos() {

		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
// ----------- APAGAR OS DADOS DA TABELA   ---------------/
				int linhas = tabela.getRowCount();
				if (linhas >= 1) {
					DefaultTableModel dtm = (DefaultTableModel) tabela.getModel();

					for (linhas = (linhas - 1); linhas >= 0; --linhas) {
						dtm.removeRow(linhas);
					}
				}
// ----------- PUXAR DADOS ATUALIZADOS  ---------------/
				final String URL = "jdbc:mysql://localhost:3306/db_supermercado?useTimezone=true&serverTimezone=UTC";
				final String USER = "root";
				final String PASSWORD = "";

				try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD)) {
					System.out.println("banco conectado");

					String sql = "select NomeCompleto, Usuario, Senha from tbl_login";
					PreparedStatement stm = con.prepareStatement(sql);

					System.out.println(sql);

					ResultSet rs = stm.executeQuery();
					java.sql.ResultSetMetaData rsmd = rs.getMetaData();
					int colNo = rsmd.getColumnCount();

					while (rs.next()) {
						Object[] objects = new Object[colNo];
						for (int i = 0; i < colNo; i++) {
							objects[i] = rs.getObject(i + 1);
						}
						dtm.addRow(objects);

					}
					tabela.setModel(dtm);
					rs.close();
					stm.close();
					con.close();

				} catch (SQLException error) {
					JOptionPane.showMessageDialog(null, "Problemas na conexão com o banco\n" + error);
				}

				dispose();
				setVisible(true);
			}
			
		});

	}
}
