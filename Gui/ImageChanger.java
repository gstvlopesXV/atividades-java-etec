package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileNameExtensionFilter;


public class ImageChanger extends JFrame {

	public ImageChanger() {

		super("JAVA'S IMAGE CHANGER");
		System.out.println("====================== LOG JAVA'S IMAGE CHANGER ======================\n");
			  
		Container containerImg = getContentPane();
		Container labelButtons = new JPanel();

		JButton bttnInserirImg = new JButton("Inserir Imagem");
		JButton bttnTrocarImg = new JButton("Trocar Imagem");
		JButton bttnImage1 = new JButton("1");
		JButton bttnImage2 = new JButton("2");
		JButton bttnImage3 = new JButton("3");
		JButton bttnImage4 = new JButton("4");
		JButton bttnImage5 = new JButton("5");

		containerImg.setLayout(new BorderLayout(5, 5));
		labelButtons.setLayout(new FlowLayout());

		labelButtons.add(bttnImage1);
		labelButtons.add(bttnImage2);
		labelButtons.add(bttnImage3);
		labelButtons.add(bttnImage4);
		labelButtons.add(bttnImage5);
		labelButtons.add(bttnTrocarImg);

		containerImg.add(BorderLayout.CENTER, bttnInserirImg);
		containerImg.add(BorderLayout.SOUTH, labelButtons);

		containerImg.setBackground(Color.BLACK);

		labelButtons.setBackground(Color.GRAY);

		bttnTrocarImg.setBackground(Color.RED);
		bttnTrocarImg.setForeground(Color.WHITE);

		bttnInserirImg.setBackground(Color.WHITE);
		bttnInserirImg.setForeground(Color.BLACK);

		bttnImage1.setBackground(Color.BLACK);
		bttnImage1.setForeground(Color.WHITE);

		bttnImage2.setBackground(Color.BLACK);
		bttnImage2.setForeground(Color.WHITE);

		bttnImage3.setBackground(Color.BLACK);
		bttnImage3.setForeground(Color.WHITE);

		bttnImage4.setBackground(Color.BLACK);
		bttnImage4.setForeground(Color.WHITE);

		bttnImage5.setBackground(Color.BLACK);
		bttnImage5.setForeground(Color.WHITE);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setSize(500, 500);
		setMinimumSize(new Dimension(500, 500));

		setVisible(true);

		bttnInserirImg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("[Button] 'Inserir Imagem' foi clicado !");
				
				JFileChooser chooser = new JFileChooser();
				FileNameExtensionFilter filter = new FileNameExtensionFilter("Imagens JPG & PNG", "jpg", "png");

				chooser.setFileFilter(filter);
				System.out.println("[JFileChooser] 'Inserir Imagem' foi aberto!");
				int returnVal = chooser.showOpenDialog(null);
				
				if (returnVal == JFileChooser.APPROVE_OPTION) {
					System.out.println("[JFileChooser] PNG/JPG importado com sucesso! ARQUIVO: " + chooser.getSelectedFile().getName());
				}

			}
		});

		bttnTrocarImg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("[Button] 'Trocar Imagem' foi clicado !");
				
				JFileChooser chooser = new JFileChooser();
				FileNameExtensionFilter filter = new FileNameExtensionFilter("Imagens JPG & PNG", "jpg", "png");

				chooser.setFileFilter(filter);
				System.out.println("[JFileChooser] 'Trocar Imagem' foi aberto!");
				int returnVal = chooser.showOpenDialog(null);
				
				if (returnVal == JFileChooser.APPROVE_OPTION) {
					System.out.println("[JFileChooser] PNG/JPG importado com sucesso! ARQUIVO: "+ chooser.getSelectedFile().getName());
				}
			}
		});
	
	}
	public static void main(String[] args) {
		new ImageChanger();

	}
}
