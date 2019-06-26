package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class View_Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View_Menu frame = new View_Menu();

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
	public View_Menu() {
		setResizable(false);
		setTitle("JAVA'S SUPERMARKET - OPERADOR 1");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 750, 531);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setType(Type.UTILITY);

		JButton btnNewButton = new JButton("CAIXA");
		btnNewButton.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 32));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(50, 205, 50));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				View_Caixa janelacaixa = new View_Caixa();
				janelacaixa.setVisible(true);
			}
		});
		btnNewButton.setBounds(50, 88, 315, 231);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("VENDAS");
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 32));
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(new Color(255, 102, 102));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				View_Vendas vendas = new View_Vendas();
				vendas.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(379, 88, 315, 231);
		contentPane.add(btnNewButton_1);

		JLabel lblJavas = new JLabel("OPERADOR 1");
		lblJavas.setVerticalAlignment(SwingConstants.TOP);
		lblJavas.setHorizontalAlignment(SwingConstants.CENTER);
		lblJavas.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 38));
		lblJavas.setForeground(new Color(169, 169, 169));
		lblJavas.setBounds(50, 22, 644, 66);
		contentPane.add(lblJavas);

		JButton btnFuncionarios = new JButton("FUNCION\u00C1RIOS");
		btnFuncionarios.setBackground(SystemColor.textHighlight);
		btnFuncionarios.setForeground(Color.WHITE);
		btnFuncionarios.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 32));
		btnFuncionarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				View_MenuFuncionarios funcionario = new View_MenuFuncionarios();
				funcionario.setVisible(true);
			}
		});
		btnFuncionarios.setBounds(50, 332, 644, 123);
		contentPane.add(btnFuncionarios);
	}
}
