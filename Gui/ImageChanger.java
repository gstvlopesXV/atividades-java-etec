package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileNameExtensionFilter;


public class ImageChanger extends JFrame {
	String local = "Imagens/"; 

	public ImageChanger() {

		super("JAVA'S IMAGE SHOWCASE");
		System.out.println("====================== LOG JAVA'S IMAGE SHOWCASE ======================\n");
		
		ImageIcon icon = new ImageIcon(getClass().getResource("Imagens/interrogacao.png"));
		JLabel image = new JLabel(icon);
		JLabel image1 = new JLabel(icon);
		JLabel image2 = new JLabel(icon);
		JLabel image3 = new JLabel(icon);
		JLabel image4 = new JLabel(icon);
		JLabel image5 = new JLabel(icon);
		
		Container containerImg = getContentPane();
		Container labelButtons = new JPanel();

		
		JButton bttnInserirImg = new JButton("Inserir Imagem");
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
		labelButtons.add(bttnInserirImg);

		containerImg.add(BorderLayout.CENTER, image);
		containerImg.add(BorderLayout.SOUTH, labelButtons);

		containerImg.setBackground(Color.WHITE);
		
		labelButtons.setBackground(Color.GRAY);

		bttnInserirImg.setBackground(Color.RED);
		bttnInserirImg.setForeground(Color.WHITE);

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
				System.out.println("[Button] 'Trocar Imagem' foi clicado !");
				
				JFileChooser chooser = new JFileChooser();
				FileNameExtensionFilter filter = new FileNameExtensionFilter("Imagens JPG & PNG", "jpg", "png");

				chooser.setFileFilter(filter);
				
				System.out.println("[JFileChooser] 'Trocar Imagem' foi aberto!");
				
				int returnVal = chooser.showOpenDialog(null);
			
				if (returnVal == JFileChooser.APPROVE_OPTION){
					System.out.println("[JFileChooser] PNG/JPG importado com sucesso! ARQUIVO: "+ chooser.getSelectedFile().getName());
					
				}
			}
		});
		
		bttnImage1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("BT 1");
				image1.setIcon(new ImageIcon(getClass().getResource("Imagens/img1.png")));
			}
		});

		bttnImage2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("BT 2");
				image2.setIcon(new ImageIcon(getClass().getResource("Imagens/img2.png")));
			}
		});

		bttnImage3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("BT 3");
				image3.setIcon(new ImageIcon(getClass().getResource("Imagens/img3.png")));
			}
		});

		bttnImage4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("BT 4");
				image4.setIcon(new ImageIcon(getClass().getResource("Imagens/img4.png")));
			}
		});

		bttnImage5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("BT 5");
				image5.setIcon(new ImageIcon(getClass().getResource("Imagens/img5.png")));
			}
		});


		
	

	}
	
	
	public static void main(String[] args) {
		new ImageChanger();

	}
}
