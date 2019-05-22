package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ImageChanger extends JFrame {

	public ImageChanger(){
		
		super("Java's Image Changer");
		
		Container containerImg = getContentPane();
		Container labelButtons = new JPanel();
		
		JButton bttnInserirImg = new JButton("Inserir Imagem");
		JButton bttnTrocarImg = new JButton("Trocar Imagem");
		JButton bttnImage1 = new JButton("1");
		JButton bttnImage2 = new JButton("2");
		JButton bttnImage3 = new JButton("3");
		JButton bttnImage4 = new JButton("4");
		JButton bttnImage5 = new JButton("5");
		
		containerImg.setLayout(new BorderLayout(5,5));
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
				
	}
	public static void main(String[] args) {
		new ImageChanger();
	//Java How To: JFileChooser
	//https://www.youtube.com/watch?v=9VrtranTJnc
	}
}
