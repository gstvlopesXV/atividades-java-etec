package LoginCadastroProdutos;

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

public class ViewProduto extends JFrame {
	JScrollPane scrollPane;
	JTable tabela;
	Container container;
	JTextField txtCodigo, txtDescricao, txtPreco, txtTelefone;
	JLabel lblCodigo, lblDescricao, lblPreco, lblTelefone;
	JButton btnCadastrar, btnRemover;
	DefaultTableModel dtm;

	public ViewProduto() {
		super("Tabela com Dados do JTextField");
		setSize(500, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		container = getContentPane();
		container.setLayout(null);

		// ***************codigo*****************8
		lblCodigo = new JLabel("C�digo:");
		lblCodigo.setBounds(5, 5, 80, 20);

		txtCodigo = new JTextField();
		txtCodigo.setBounds(65, 5, 35, 20);

		// *************descri��o***************
		lblDescricao = new JLabel("Descri��o:");
		lblDescricao.setBounds(5, 35, 80, 20);

		txtDescricao = new JTextField();
		txtDescricao.setBounds(65, 35, 260, 20);

		// ************pre�o*************]

		lblPreco = new JLabel("Pre�o:");
		lblPreco.setBounds(5, 65, 80, 20);

		txtPreco = new JTextField();
		txtPreco.setBounds(65, 65, 260, 20);

		// ---------------------TABELA---------------------//

		dtm = new DefaultTableModel(new String[] { "C�digo", "Descri��o", "Pre�o" }, 0) {

			public boolean isCellEditable(int row, int col) {
				return false;
			}
		};

		// para travamento
		// DefaultTableModel dtm = new DefaultTableModel(new Object[][]
		// {{"02","Manuel","Rua Vasques","66656-6546"}}, new String[]
		// {"C�digo","Descri��o", "Endere�o"})

		// ************EDI��O DA C�LULAS**************
		/*
		 * { public boolean isCellEditable(int row,int col){ return false; } };
		 */

		tabela = new JTable(dtm);

		// ************MOVIMENTA��O**************

		tabela.getTableHeader().setReorderingAllowed(false);

		// ************TAMANHO/DIMENSIONAMENTO DA COLUNAS**************

		tabela.getColumnModel().getColumn(0).setPreferredWidth(45);
		tabela.getColumnModel().getColumn(0).setResizable(false);

		tabela.getColumnModel().getColumn(1).setPreferredWidth(180);
		tabela.getColumnModel().getColumn(1).setResizable(false);

		tabela.getColumnModel().getColumn(2).setPreferredWidth(180);
		tabela.getColumnModel().getColumn(2).setResizable(false);

		tabela.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); // n�o permite redimensionamento autom�tico

		// ************ALINHAMENTO**************

		DefaultTableCellRenderer alinhaDireita = new DefaultTableCellRenderer();
		alinhaDireita.setHorizontalAlignment(SwingConstants.RIGHT);

		scrollPane = new JScrollPane(tabela);
		scrollPane.setBounds(0, 150, 480, 105);

		// ****************bot�es CADASTRAR*****************

		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(50, 300, 130, 30);
		btnCadastrar.setToolTipText("Adiciona Clientes");

		// ****************bot�es REMOVER*****************

		btnRemover = new JButton("Remover");
		btnRemover.setBounds(250, 300, 130, 30);
		btnRemover.setToolTipText("Remove Clientes");

		add(lblCodigo);
		add(txtCodigo);

		add(lblDescricao);
		add(txtDescricao);

		add(lblPreco);
		add(txtPreco);

		add(scrollPane);

		add(btnCadastrar);
		add(btnRemover);

		eventos();

	}

	private void eventos() {

		btnCadastrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (txtCodigo.getText().equals("") || txtDescricao.getText().equals("")
						|| txtPreco.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
					// return;
				}
				DefaultTableModel dtm = (DefaultTableModel) tabela.getModel();
				dtm.addRow(new Object[] { txtCodigo.getText(), txtDescricao.getText(), txtPreco.getText() });

				txtCodigo.setText("");
				txtDescricao.setText("");
				txtPreco.setText("");

			}
		});

		btnRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int[] linhas = tabela.getSelectedRows(); // retorna qual a linha selecionada"

				System.out.println("Apagou a linha " + linhas[0]);

				DefaultTableModel dtm = (DefaultTableModel) tabela.getModel();

				for (int i = (linhas.length - 1); i >= 0; --i) {
					dtm.removeRow(linhas[i]);
				}
			}
		});
	}

	public static void main(String[] args) {

	}

}
