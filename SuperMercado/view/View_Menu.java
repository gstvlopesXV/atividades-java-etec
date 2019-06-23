package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

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
		setTitle("JAVA'S SUPERMARKET");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 514);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(192, 192, 192));
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		btnNewButton.setBounds(36, 78, 320, 372);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("REGISTRO");
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 32));
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(new Color(165, 42, 42));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				View_ComprasEfetuadas janelaComprasEfetuadas = new View_ComprasEfetuadas();			
				janelaComprasEfetuadas.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(393, 78, 320, 372);
		contentPane.add(btnNewButton_1);
		
		JLabel lblSuperMarket = new JLabel("SUPERMARKET");
		lblSuperMarket.setVerticalAlignment(SwingConstants.TOP);
		lblSuperMarket.setBackground(new Color(0, 0, 0));
		lblSuperMarket.setHorizontalAlignment(SwingConstants.LEFT);
		lblSuperMarket.setForeground(new Color(60, 179, 113));
		lblSuperMarket.setFont(new Font("Verdana", Font.BOLD, 26));
		lblSuperMarket.setBounds(314, 22, 230, 32);
		contentPane.add(lblSuperMarket);
		
		JLabel lblJavas = new JLabel("JAVA'S");
		lblJavas.setVerticalAlignment(SwingConstants.TOP);
		lblJavas.setHorizontalAlignment(SwingConstants.RIGHT);
		lblJavas.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblJavas.setForeground(new Color(255, 51, 51));
		lblJavas.setBounds(129, 23, 175, 31);
		contentPane.add(lblJavas);
	}
}
