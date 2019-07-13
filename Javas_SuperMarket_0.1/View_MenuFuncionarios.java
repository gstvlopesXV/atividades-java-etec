package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class View_MenuFuncionarios extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View_MenuFuncionarios frame = new View_MenuFuncionarios();
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
	public View_MenuFuncionarios() {
		setResizable(false);
		setBackground(Color.DARK_GRAY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 399, 426);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setForeground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setType(Type.UTILITY);

		JButton btnMostrarFuncionarios = new JButton("MOSTRAR");
		btnMostrarFuncionarios.setForeground(Color.WHITE);
		btnMostrarFuncionarios.setBackground(new Color(102, 153, 204));
		btnMostrarFuncionarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				View_CadastrarMostrarFuncionarios funcionarios = new View_CadastrarMostrarFuncionarios();
				funcionarios.setVisible(true);
			}
		});
		btnMostrarFuncionarios.setBounds(28, 105, 326, 74);
		contentPane.add(btnMostrarFuncionarios);

		JButton btnNewButton = new JButton("REMOVER");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final String URL = "jdbc:mysql://localhost:3306/db_supermercado?useTimezone=true&serverTimezone=UTC";
				final String USER = "root";
				final String PASSWORD = "";

				try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD)) {
					System.out.println("banco conectado");

					String sql = "DELETE FROM tbl_login where usuario=?";

					PreparedStatement stm = con.prepareStatement(sql);

					String usuario = JOptionPane.showInputDialog(null, "Remover o acesso: ",
							"Java's SuperMarket - REMOVER ACESSO", JOptionPane.QUESTION_MESSAGE);

					stm.setString(1, usuario);
					stm.executeUpdate();

					System.out.println(usuario);

				} catch (SQLException error) {
					dispose();
					System.out.println("Erro SQL: " + error);
				}
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(102, 153, 204));
		btnNewButton.setBounds(28, 190, 326, 74);
		contentPane.add(btnNewButton);

		JButton btnAlterarSenha = new JButton("ALTERAR SENHA");
		btnAlterarSenha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAlterarSenha.setForeground(Color.WHITE);
		btnAlterarSenha.setBackground(new Color(102, 153, 204));
		btnAlterarSenha.setBounds(28, 275, 326, 74);
		contentPane.add(btnAlterarSenha);

		JLabel lblOperador = new JLabel("OPERADOR 1");
		lblOperador.setForeground(new Color(169, 169, 169));
		lblOperador.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 38));
		lblOperador.setHorizontalAlignment(SwingConstants.CENTER);
		lblOperador.setBounds(10, 11, 373, 59);
		contentPane.add(lblOperador);

		JLabel lblNewLabel = new JLabel("FUNCION\u00C1RIOS");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Bahnschrift", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(115, 62, 163, 22);
		contentPane.add(lblNewLabel);
	}
}
