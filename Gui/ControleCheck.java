package gui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ControleCheck extends JFrame{
	JTextField text;
	JCheckBox bold, italic, grow;
	
	public ControleCheck() {
		super("CONTROLE CHECK");
		text = new JTextField("mudando a fonte.", 30);
		text.setFont(new Font("Serif", Font.PLAIN, 14) );
		bold = new JCheckBox("Negrito");
		bold.addItemListener(new Ouvinte());
		italic = new JCheckBox("Itálico");
		italic.addItemListener(new Ouvinte());
		grow = new JCheckBox("Grow");
		grow.addItemListener(new Ouvinte());
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(text);
		c.add(bold);
		c.add(italic);
		c.add(grow);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 200);
		setVisible(true);
		
		
	}
	
	class Ouvinte implements ItemListener{
        public void itemStateChanged(ItemEvent event) {
        	
        	if (bold.isSelected() && italic.isSelected()) {
        		 text.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 14));
        		 System.out.println("Negrito e Itálico");
        	}
        	else if(bold.isSelected()){
                text.setFont(new Font("Serif", Font.BOLD, 14));
                System.out.println("Negrito");
            }
        	else if(italic.isSelected()){
                text.setFont(new Font("Serif", Font.ITALIC, 14));
                System.out.println("Italico");
            }else {
                text.setFont(new Font("Serif",Font.PLAIN,14));
                System.out.println("Normal");
            } 
        	if (grow.isSelected()) {
        		text.setText(text.getText().toUpperCase());
        		System.out.println("Maiúsculo");
        	}else {
        		text.setText(text.getText().toLowerCase());
        		System.out.println("Minúsculo");
        	}
        }
	}

	public static void main(String[] args) {
		new ControleCheck();

	}
}

