package view;

import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class View_Vendas extends JFrame {

	JScrollPane scrollPane;
	JTable tabela;
	Container container;
	JButton btnAtualizar;
	DefaultTableModel dtm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View_Vendas frame = new View_Vendas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public View_Vendas() {
		super("JAVA'S SUPERMARKET - OPERADOR 1 - VENDAS");
		setBackground(Color.DARK_GRAY);
		setResizable(false);
		getContentPane().setBackground(Color.DARK_GRAY);
		setType(Type.UTILITY);
		setSize(663, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		container = getContentPane();
		container.setLayout(null);

//	---------------------TABELA---------------------

		dtm = new DefaultTableModel(new String[] { "Ord.Venda", "Funcionário", "Valor Total", "DATA/HORA", }, 0) {
			public boolean isCellEditable(int row, int col) {
				return false;
			}
		};

		tabela = new JTable(dtm);
		tabela.setBackground(new Color(240, 248, 255));

//	-----------------MOVIMENTAÇÃO----------------------

		tabela.getTableHeader().setReorderingAllowed(false);

//	----------TAMANHO/DIMENSIONAMENTO DA COLUNAS--------------	

		tabela.getColumnModel().getColumn(0).setPreferredWidth(60);
		tabela.getColumnModel().getColumn(0).setResizable(false);

		tabela.getColumnModel().getColumn(1).setPreferredWidth(150);
		tabela.getColumnModel().getColumn(1).setResizable(false);

		tabela.getColumnModel().getColumn(2).setPreferredWidth(350);
		tabela.getColumnModel().getColumn(2).setResizable(false);

		tabela.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

//	-----------------ALINHAMENTO-----------------------

		DefaultTableCellRenderer alinhaDireita = new DefaultTableCellRenderer();
		alinhaDireita.setHorizontalAlignment(SwingConstants.RIGHT);

		scrollPane = new JScrollPane(tabela);
		scrollPane.setBounds(10, 11, 637, 308);

//	-----------------BANCO DE DADOS-----------------------

		final String URL = "jdbc:mysql://localhost:3306/db_supermercado?useTimezone=true&serverTimezone=UTC";
		final String USER = "root";
		final String PASSWORD = "etec";

		try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD)) {
			String sql1 = "select * from tbl_vendas";
			PreparedStatement stm = con.prepareStatement(sql1);
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

		}

//	--------------REMOVER--------------------

		btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setBackground(new Color(102, 153, 204));
		btnAtualizar.setForeground(Color.WHITE);
		btnAtualizar.setBounds(10, 330, 637, 30);

		getContentPane().add(scrollPane);

		getContentPane().add(btnAtualizar);

		eventos();

	}

	private void eventos() {

		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				setVisible(true);
			}
		});

	}

}
