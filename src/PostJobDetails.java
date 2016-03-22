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

public class PostJobDetails extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PostJobDetails frame = new PostJobDetails();
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
	public PostJobDetails() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel leaveL = new JLabel("Enter dates on which you are on leave");
		leaveL.setBounds(114, 42, 226, 14);
		panel.add(leaveL);
		
		JTextArea dateT = new JTextArea();
		dateT.setBounds(114, 91, 178, 44);
		panel.add(dateT);
		
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
		backB.setBounds(325, 11, 89, 23);
		panel.add(backB);
		
		
		JLabel resultL = new JLabel("");
		resultL.setBounds(121, 226, 188, 14);
		panel.add(resultL);
		resultL.setVisible(false);
		
		JButton postB = new JButton("Post");
		postB.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				String text= dateT.getText();
				String result;
				if(text.equals(""))
				{
					result="Please enter your job details";
				}
				
				else
				{
					result="Successfully Posted!";
				}
				resultL.setVisible(true);
				resultL.setText(result);
			}
		});
		postB.setBounds(155, 171, 89, 23);
		panel.add(postB);
		
		
	}

}
