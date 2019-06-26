package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public final class View_Caixa extends JFrame {

	private JPanel contentPane;
	private JTextField codigoField;
	private JTextField descricaoField;
	private JTextField precoField;
	private JTextField quantidadeField;
	private JTable tabelaCaixa;

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
	 * Create the application.
	 */

	public View_Caixa() {
		setResizable(false);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(100, 100, 587, 603);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(105, 105, 105));
		contentPane.setBackground(new Color(245, 245, 245));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setType(Type.UTILITY);

		JLabel lblCodigoProduto = new JLabel("C\u00F3digo");
		lblCodigoProduto.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCodigoProduto.setBounds(10, 62, 85, 14);
		contentPane.add(lblCodigoProduto);

		codigoField = new JTextField();
		codigoField.setFont(new Font("Arial", Font.PLAIN, 16));
		codigoField.setBackground(new Color(255, 255, 240));
		codigoField.setBounds(10, 76, 138, 20);
		contentPane.add(codigoField);
		codigoField.setColumns(10);

		JLabel lblDescricaoProduto = new JLabel("Descri\u00E7\u00E3o");
		lblDescricaoProduto.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDescricaoProduto.setBounds(10, 107, 62, 14);
		contentPane.add(lblDescricaoProduto);

		descricaoField = new JTextField();
		descricaoField.setBackground(new Color(255, 255, 240));
		descricaoField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		descricaoField.setBounds(10, 123, 559, 20);
		contentPane.add(descricaoField);
		descricaoField.setColumns(10);

		precoField = new JTextField();
		precoField.setBackground(new Color(255, 255, 240));
		precoField.setFont(new Font("Arial", Font.PLAIN, 16));
		precoField.setBounds(158, 76, 135, 20);
		contentPane.add(precoField);
		precoField.setColumns(10);

		JLabel lblValor = new JLabel("Pre\u00E7o");
		lblValor.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblValor.setBounds(158, 63, 46, 14);
		contentPane.add(lblValor);

		JLabel lblQuantidade = new JLabel("Quantidade");
		lblQuantidade.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblQuantidade.setBounds(306, 63, 85, 14);
		contentPane.add(lblQuantidade);

		quantidadeField = new JTextField();
		quantidadeField.setBackground(new Color(255, 255, 240));
		quantidadeField.setForeground(new Color(0, 0, 0));
		quantidadeField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		quantidadeField.setBounds(306, 76, 142, 20);
		contentPane.add(quantidadeField);
		quantidadeField.setColumns(10);

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

		JLabel timeLabel = new JLabel("00:00");
		timeLabel.setForeground(Color.DARK_GRAY);
		timeLabel.setBackground(new Color(192, 192, 192));
		timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		timeLabel.setFont(new Font("Arial Black", Font.BOLD, 30));
		timeLabel.setBounds(452, 62, 117, 49);
		contentPane.add(timeLabel);
		Thread clock = new Thread() {
			public void run() {

				try {
					while (true) {

						Calendar cal = new GregorianCalendar();

						int minute = cal.get(Calendar.MINUTE);

						int hour = cal.get(Calendar.HOUR_OF_DAY);

						if (minute < 10) {
							timeLabel.setText(hour + ":0" + minute);
						} else {
							timeLabel.setText(hour + ":" + minute);
						}
						sleep(1000);
					}

				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		};
		clock.start();

		tabelaCaixa = new JTable();
		tabelaCaixa.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, Color.DARK_GRAY, Color.DARK_GRAY,
				Color.DARK_GRAY));
		tabelaCaixa.setFont(new Font("Courier New", Font.BOLD, 14));
		tabelaCaixa.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "A", "B", "C", "D" }));
		tabelaCaixa.getColumnModel().getColumn(0).setResizable(false);
		tabelaCaixa.setBackground(new Color(255, 255, 240));
		tabelaCaixa.setBounds(10, 213, 559, 297);
		contentPane.add(tabelaCaixa);

		JLabel lblValorTotal = new JLabel("VALOR TOTAL:");
		lblValorTotal.setBackground(new Color(0, 0, 0));
		lblValorTotal.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblValorTotal.setBounds(10, 521, 194, 42);
		contentPane.add(lblValorTotal);

		JLabel lblR = new JLabel("0");
		lblR.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblR.setBounds(170, 530, 107, 24);
		contentPane.add(lblR);

		JButton btnNewButton = new JButton("Adicionar");
		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				if (codigoField.getText().equals("") || descricaoField.getText().equals("")
						|| quantidadeField.getText().equals("") || precoField.getText().equals(""))

				{
					JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
					// return;
				} else {
					DefaultTableModel dtm = (DefaultTableModel) tabelaCaixa.getModel();
					dtm.addRow(new Object[] { " " + codigoField.getText(), " " + descricaoField.getText(),
							" " + quantidadeField.getText(), "R$ " + precoField.getText() });

					codigoField.setText("");
					descricaoField.setText("");
					quantidadeField.setText("");
					precoField.setText("");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(30, 144, 255));
		btnNewButton.setBounds(372, 154, 98, 23);
		contentPane.add(btnNewButton);

		JButton btnRemover = new JButton("Remover");
		btnRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int[] linhas = tabelaCaixa.getSelectedRows();

					System.out.println("Apagou a linha " + linhas[0]);

					DefaultTableModel dtm = (DefaultTableModel) tabelaCaixa.getModel();

					for (int i = (linhas.length - 1); i >= 0; --i) {
						dtm.removeRow(linhas[i]);
					}
				} catch (java.lang.ArrayIndexOutOfBoundsException error) {
					JOptionPane.showMessageDialog(null, "Não existe produto para remover!");
				}
			}

		});
		btnRemover.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnRemover.setForeground(Color.WHITE);
		btnRemover.setBackground(new Color(255, 102, 102));
		btnRemover.setBounds(480, 154, 89, 23);
		contentPane.add(btnRemover);

		JButton btnConfirmarCompra = new JButton("EFETUAR COMPRA");
		btnConfirmarCompra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int linhas = tabelaCaixa.getRowCount();
				if (linhas >= 1) {
					JOptionPane.showMessageDialog(null, "COMPRA EFETUADA!");

					DefaultTableModel dtm = (DefaultTableModel) tabelaCaixa.getModel();

					for (linhas = (linhas - 1); linhas >= 0; --linhas) {
						dtm.removeRow(linhas);
					}
				} else {
					JOptionPane.showMessageDialog(null, "Nenhum produto foi inserido!");
				}

			}
		});
		btnConfirmarCompra.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnConfirmarCompra.setBackground(new Color(0, 204, 51));
		btnConfirmarCompra.setForeground(Color.WHITE);
		btnConfirmarCompra.setBounds(398, 521, 171, 35);
		contentPane.add(btnConfirmarCompra);

		JPanel bar_Tabel = new JPanel();
		bar_Tabel.setBackground(Color.DARK_GRAY);
		bar_Tabel.setBounds(10, 188, 559, 25);
		contentPane.add(bar_Tabel);
		bar_Tabel.setLayout(null);

		JLabel lblDescrio = new JLabel("|           DESCRI\u00C7\u00C3O");
		lblDescrio.setHorizontalAlignment(SwingConstants.LEFT);
		lblDescrio.setForeground(Color.WHITE);
		lblDescrio.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblDescrio.setBackground(Color.LIGHT_GRAY);
		lblDescrio.setBounds(136, 0, 147, 25);
		bar_Tabel.add(lblDescrio);

		JLabel lblQuantidade_1 = new JLabel("|         QUANTIDADE");
		lblQuantidade_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblQuantidade_1.setForeground(Color.WHITE);
		lblQuantidade_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblQuantidade_1.setBackground(Color.LIGHT_GRAY);
		lblQuantidade_1.setBounds(276, 0, 147, 25);
		bar_Tabel.add(lblQuantidade_1);

		JLabel lblPreo = new JLabel("|               PRE\u00C7O");
		lblPreo.setHorizontalAlignment(SwingConstants.LEFT);
		lblPreo.setForeground(Color.WHITE);
		lblPreo.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblPreo.setBackground(Color.LIGHT_GRAY);
		lblPreo.setBounds(417, 0, 142, 25);
		bar_Tabel.add(lblPreo);

		JLabel lblNewLabel = new JLabel("C\u00D3DIGO");
		lblNewLabel.setBounds(0, 0, 131, 25);
		bar_Tabel.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 10));

	}
}
