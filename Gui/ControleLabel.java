package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ControleLabel extends JFrame {
	public ControleLabel() {
		super("Labels");

		JLabel simples = new JLabel("Label Simples");
		simples.setToolTipText("Olá!");
		Font fonte = new Font("serif", Font.BOLD | Font.ITALIC, 18);

		JLabel label = new JLabel("LABEL");
		label.setFont(fonte);
		label.setForeground(Color.CYAN);

		ImageIcon icon = new ImageIcon(getClass().getResource("Imagens/interrogacao.png"));
		JLabel imagem = new JLabel(icon);

		JButton btnimg1 = new JButton("Imagem 1");
		JButton btnimg2 = new JButton("Imagem 2");
		JButton btnimg3 = new JButton("Imagem 3");
		JButton btnimg4 = new JButton("Imagem 4");
		JButton btnimg5 = new JButton("Imagem 5");

		Container c = getContentPane();
		c.setLayout(new BorderLayout(5, 5));
		c.add(BorderLayout.NORTH, simples);
		c.add(BorderLayout.NORTH, label);
		c.add(BorderLayout.CENTER, imagem);

		Container c2 = new JPanel();
		c2.setLayout(new GridLayout(1, 5));
		c2.add(btnimg1);
		c2.add(btnimg2);
		c2.add(btnimg3);
		c2.add(btnimg4);
		c2.add(btnimg5);
		c.add(BorderLayout.SOUTH, c2);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 500);
		setVisible(true);

		btnimg1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("BT 1");
				imagem.setIcon(new ImageIcon(getClass().getResource("Imagens/tigre.jpg")));
			}
		});

		btnimg2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("BT 2");
				imagem.setIcon(new ImageIcon(getClass().getResource("Imagens/lobo.jpg")));
			}
		});

		btnimg3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("BT 3");
				imagem.setIcon(new ImageIcon(getClass().getResource("Imagens/pomba.jpg")));
			}
		});

		btnimg4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("BT 4");
				imagem.setIcon(new ImageIcon(getClass().getResource("Imagens/gato.jpg")));
			}
		});

		btnimg5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("BT 5");
				imagem.setIcon(new ImageIcon(getClass().getResource("Imagens/coelho.jpg")));
			}
		});

	}

	public static void main(String[] args) {
		new ControleLabel();
	}

}
