package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class View_Caixa extends JFrame {

	private JPanel contentPane;
	private JTextField CodigoField;
	private JTextField DescricaoField;
	private JTextField ValorField;
	private JTextField QuantidadeField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View_Caixa frame = new View_Caixa();
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
	public View_Caixa() {
		setResizable(false);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 587, 521);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(105, 105, 105));
		contentPane.setBackground(new Color(245, 245, 245));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCodigoProduto = new JLabel("C\u00F3digo");
		lblCodigoProduto.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCodigoProduto.setBounds(10, 62, 85, 14);
		contentPane.add(lblCodigoProduto);
		
		CodigoField = new JTextField();
		CodigoField.setFont(new Font("Arial", Font.PLAIN, 16));
		CodigoField.setBackground(new Color(220, 220, 220));
		CodigoField.setBounds(10, 76, 138, 20);
		contentPane.add(CodigoField);
		CodigoField.setColumns(10);
		
		JLabel lblDescricaoProduto = new JLabel("Descri\u00E7\u00E3o");
		lblDescricaoProduto.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDescricaoProduto.setBounds(10, 107, 62, 14);
		contentPane.add(lblDescricaoProduto);
		
		DescricaoField = new JTextField();
		DescricaoField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		DescricaoField.setBounds(10, 123, 559, 20);
		contentPane.add(DescricaoField);
		DescricaoField.setColumns(10);
		
		ValorField = new JTextField();
		ValorField.setFont(new Font("Arial", Font.PLAIN, 16));
		ValorField.setBounds(158, 76, 135, 20);
		contentPane.add(ValorField);
		ValorField.setColumns(10);
		
		JLabel lblValor = new JLabel("Valor");
		lblValor.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblValor.setBounds(158, 63, 46, 14);
		contentPane.add(lblValor);
		
		JLabel lblQuantidade = new JLabel("Quantidade");
		lblQuantidade.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblQuantidade.setBounds(306, 63, 85, 14);
		contentPane.add(lblQuantidade);
		
		QuantidadeField = new JTextField();
		QuantidadeField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		QuantidadeField.setBounds(306, 76, 142, 20);
		contentPane.add(QuantidadeField);
		QuantidadeField.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 581, 56);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblJavas = new JLabel("JAVA'S");
		lblJavas.setForeground(new Color(255, 51, 51));
		lblJavas.setBounds(147, 14, 90, 32);
		lblJavas.setFont(new Font("Tahoma", Font.BOLD, 26));
		panel.add(lblJavas);
		
		JLabel lblSupermarket = new JLabel("SUPERMARKET");
		lblSupermarket.setForeground(new Color(60, 179, 113));
		lblSupermarket.setBounds(247, 12, 236, 35);
		lblSupermarket.setFont(new Font("Verdana", Font.BOLD, 26));
		panel.add(lblSupermarket);
		
		JLabel label = new JLabel("12:03");
		label.setForeground(Color.DARK_GRAY);
		label.setBackground(new Color(192, 192, 192));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Arial Black", Font.BOLD, 30));
		label.setBounds(452, 62, 117, 49);
		contentPane.add(label);
		
		table = new JTable();
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"C\u00F3digo", "Descri\u00E7\u00E3o", "Quantidade", "Valor"},
			},
			new String[] {
				"A", "B", "C", "D"
			}
		));
		table.getColumnModel().getColumn(0).setResizable(false);
		table.setBackground(Color.WHITE);
		table.setBounds(10, 188, 559, 254);
		contentPane.add(table);
		
		JLabel lblValorTotal = new JLabel("VALOR TOTAL:");
		lblValorTotal.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblValorTotal.setBounds(10, 447, 142, 35);
		contentPane.add(lblValorTotal);
		
		JLabel lblR = new JLabel("R$200,00");
		lblR.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblR.setBounds(143, 453, 107, 24);
		contentPane.add(lblR);
		
		JButton btnNewButton = new JButton("Adicionar");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(64, 64, 64));
		btnNewButton.setBounds(372, 154, 98, 23);
		contentPane.add(btnNewButton);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnRemover.setForeground(Color.WHITE);
		btnRemover.setBackground(Color.DARK_GRAY);
		btnRemover.setBounds(480, 154, 89, 23);
		contentPane.add(btnRemover);
		
		JButton btnConfirmarCompra = new JButton("CONFIRMAR COMPRA");
		btnConfirmarCompra.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnConfirmarCompra.setBackground(new Color(60, 179, 113));
		btnConfirmarCompra.setForeground(Color.WHITE);
		btnConfirmarCompra.setBounds(398, 453, 171, 23);
		contentPane.add(btnConfirmarCompra);
	}
}
