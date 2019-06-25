package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Clock_TEST extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Clock_TEST frame = new Clock_TEST();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Clock_TEST() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel clockLabel = new JLabel("New label");
		clockLabel.setFont(new Font("Tahoma", Font.PLAIN, 42));
		clockLabel.setHorizontalAlignment(SwingConstants.CENTER);
		clockLabel.setBounds(5, 5, 394, 251);
		contentPane.add(clockLabel);

		Thread clock = new Thread() {
			public void run() {
				try {
					while (true) {
						Calendar cal = new GregorianCalendar();
						int minute = cal.get(Calendar.MINUTE);
						int hour = cal.get(Calendar.HOUR);

						clockLabel.setText(hour + ":" + minute);
						sleep(1000);
					}

				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		clock.start();
	}
}
