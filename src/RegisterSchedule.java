import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/*
 * @author Anjali
 */

public class RegisterSchedule extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterSchedule frame = new RegisterSchedule();
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
	public RegisterSchedule() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel scheduleL = new JLabel("Today's Schedule");
		scheduleL.setBounds(139, 31, 165, 14);
		panel.add(scheduleL);
		
		JTextArea registerT = new JTextArea();
		registerT.setBounds(117, 75, 140, 70);
		panel.add(registerT);
		
		JLabel resultL = new JLabel("");
		resultL.setBounds(110, 226, 249, 14);
		panel.add(resultL);
		resultL.setVisible(false);
		
		JButton registerB = new JButton("Register");
		registerB.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String text= registerT.getText();
				String result;
				if(text.equals(""))
				{
					result="Please enter your schedule";
				}
				
				else
				{
					result="Schedule registered!";
				}
				resultL.setVisible(true);
				resultL.setText(result);
			}
		});
		registerB.setBounds(139, 180, 89, 23);
		panel.add(registerB);
		
		JButton backB = new JButton("Back");
		backB.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				setVisible(false);
				dispose();
				
				Executive ex = new Executive();
				ex.setVisible(true);
			}
		});
		backB.setBounds(314, 11, 89, 23);
		panel.add(backB);
		
		
	}
}
