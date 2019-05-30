package guiExercicio;

	import java.awt.Container;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
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

	public class ViewProduto extends JFrame{
		JScrollPane scrollPane;
		JTable tabela;
		Container container;
		JTextField txtCodigo, txtDescricao, txtPreco;
		JLabel lblCodigo, lblDescricao, lblPreco;
		JButton btnCadastrar, btnRemover, btnSair;
		DefaultTableModel dtm;
		
		public ViewProduto() {
		super ("Cadastro e Visualização de Produtos");
		setSize(500,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		container = getContentPane();
		container.setLayout(null);
			
		//***************codigo*****************8
		lblCodigo =  new JLabel("Código:");
		lblCodigo.setBounds(5, 5, 80, 20);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(65, 5, 35, 20);
			
		//*************Descricao***************
		lblDescricao = new JLabel("Descição:");
		lblDescricao.setBounds(5, 35, 80, 20);
		
		txtDescricao = new JTextField();
		txtDescricao.setBounds(65, 35, 360, 20);
		
		//************preço*************]
		
		lblPreco = new JLabel("Preço:");
		lblPreco.setBounds(5, 65, 80, 20);
		
		txtPreco = new JTextField();
		txtPreco.setBounds(65, 65, 80, 20);
		
		//---------------------TABELA---------------------//
		
		dtm = new DefaultTableModel(new String[] {"Código", "Descrição","Preço"},0)
		{
			public boolean isCellEditable(int row,int col){
				return false;
			}};
			
		tabela = new JTable(dtm);
		
		//************MOVIMENTAÇÃO**************	
		
		tabela.getTableHeader().setReorderingAllowed(false);
		
		
		//************TAMANHO/DIMENSIONAMENTO DA COLUNAS**************	
		
		tabela.getColumnModel().getColumn(0).setPreferredWidth(60);
		tabela.getColumnModel().getColumn(0).setResizable(false);
		
		tabela.getColumnModel().getColumn(1).setPreferredWidth(350);
		tabela.getColumnModel().getColumn(1).setResizable(false);
		
		tabela.getColumnModel().getColumn(2).setPreferredWidth(80);
		tabela.getColumnModel().getColumn(2).setResizable(false);
				
		tabela.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  // não permite redimensionamento automático
				
		//************ALINHAMENTO**************
		
		DefaultTableCellRenderer alinhaDireita = new DefaultTableCellRenderer();
		alinhaDireita.setHorizontalAlignment(SwingConstants.RIGHT);
			
		scrollPane = new JScrollPane(tabela);
		scrollPane.setBounds(0, 150, 480, 105);
			
		//****************botões CADASTRAR*****************
		
		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(10, 300, 130, 30);
		btnCadastrar.setToolTipText("Adiciona Clientes");
		
		//****************botões REMOVER*****************
		
		btnRemover = new JButton("Remover");
		btnRemover.setBounds(150, 300, 130, 30);
		btnRemover.setToolTipText("Remove Clientes");
		
		//****************botões SAIR*****************

		btnSair = new JButton("Sair");
		btnSair.setBounds(350, 300, 130, 30);
		btnSair.setToolTipText("Sair da Aplicação");
		
		
		add(lblCodigo);
		add(txtCodigo);
		
		add(lblDescricao);
		add(txtDescricao);
		
		add(lblPreco);
		add(txtPreco);
		
		add(scrollPane);

		add(btnCadastrar);
		add(btnRemover);
		add(btnSair);
		
		eventos();
		
		}
		
		private void eventos() {
			
			btnCadastrar.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					if (txtCodigo.getText().equals("") || txtDescricao.getText().equals("") || txtPreco.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
						//return;
					}
					if (txtCodigo.getText().length() >= 1) {
					DefaultTableModel dtm = (DefaultTableModel) tabela.getModel();
					dtm.addRow(new Object[] {txtCodigo.getText(), txtDescricao.getText(), " R$ " + txtPreco.getText()+",00"  });
			
					txtCodigo.setText("");
					txtDescricao.setText(""); 
					txtPreco.setText(""); 
					}
				}
			});
			
			btnRemover.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
					int[] linhas = tabela.getSelectedRows();
									
					System.out.println("Apagou a linha " + linhas[0]);
					
					DefaultTableModel dtm = (DefaultTableModel) tabela.getModel();
					
					for (int i = (linhas.length - 1);i>=0;--i) {
						dtm.removeRow(linhas[i]);
					}
					}catch(java.lang.ArrayIndexOutOfBoundsException error) {
						JOptionPane.showMessageDialog(null, "Não Existe Produto para Remover");
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
	
}
