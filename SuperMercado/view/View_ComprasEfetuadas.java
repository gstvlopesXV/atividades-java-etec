package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

import java.awt.Container;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
import java.awt.Window.Type;
import java.awt.Color;
import java.awt.Dialog.ModalExclusionType;

public class View_ComprasEfetuadas extends JFrame{
	JScrollPane scrollPane;
	JTable tabela;
	Container container;
	JButton btnEditar, btnSair;
	DefaultTableModel dtm;
	
	public View_ComprasEfetuadas() {
	super ("Cadastro e Visualização de Produtos");
	getContentPane().setBackground(new Color(255, 255, 255));
	setResizable(false);
	setType(Type.UTILITY);
	setSize(663,400);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	container = getContentPane();
	container.setLayout(null);
		

	
//	---------------------TABELA---------------------

	dtm = new DefaultTableModel(new String[] {"Código", "Nome", "Descrição","Preço"},0)
	{
		public boolean isCellEditable(int row,int col){
			return false;
		}};
		
	tabela = new JTable(dtm);
	
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
	scrollPane.setBounds(10, 11, 647, 278);
	
//	-----------------BANCO DE DADOS-----------------------

	String servidor = "jdbc:mysql://localhost:3306/db_supermercado";
	String usuario = "root";
	String senha = "";
	ProdutoCRUD crud = new ProdutoCRUD();
    ArrayList<Produto> lista = new ArrayList<Produto>();
	try (Connection con = DriverManager.getConnection(servidor, usuario, senha)){
		String sql1 = "select cod_produto, nome_produto, descricao_produto,  valor_produto from produto";
		PreparedStatement stm = con.prepareStatement(sql1);
			 ResultSet rs = stm.executeQuery(); // Loop com o ResultSet transferindo os dados para o modelo
			 java.sql.ResultSetMetaData rsmd = rs.getMetaData();
			 int colNo = rsmd.getColumnCount();
			 while(rs.next()){
			 Object[] objects = new Object[colNo];
			 for(int i = 0; i < colNo; i++) {
			   objects[i] = rs.getObject(i+1);
			   }
			 dtm.addRow(objects);
			 }
			 tabela.setModel(dtm);

        rs.close();
        stm.close();
        con.close();
	}catch (SQLException error) {
		
	}
	
	
//	--------------REMOVER--------------------
	
	btnEditar = new JButton("Editar");
	btnEditar.setBounds(25, 316, 130, 30);
	btnEditar.setToolTipText("Editar Produtos");
	
//	--------------SAIR------------------
	btnSair = new JButton("Voltar");
	btnSair.setBounds(503, 316, 130, 30);
	btnSair.setToolTipText("Sair da Aplicação");
	
	getContentPane().add(scrollPane);

	getContentPane().add(btnEditar);
	getContentPane().add(btnSair);
	
	eventos();
	
	}
	
	private void eventos() {
		
		
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				View_Menu menu = new View_Menu();
				menu.setVisible(true);
				dispose();
			}
		});
	
	}

	}


