import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/*
 * @author Anjali
 */

public class CheckMeetingDetails extends JFrame {

	private JPanel contentPane;
	private JTextField meetT;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckMeetingDetails frame = new CheckMeetingDetails();
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
	public CheckMeetingDetails() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel meetL = new JLabel("Meeting ID");
		meetL.setBounds(97, 44, 80, 14);
		panel.add(meetL);
		
		meetT = new JTextField();
		meetT.setBounds(213, 41, 86, 20);
		panel.add(meetT);
		meetT.setColumns(10);
		

		JLabel resultL = new JLabel("");
		resultL.setBounds(69, 138, 299, 102);
		panel.add(resultL);
		resultL.setVisible(false );
		
		JButton getB = new JButton("Show");
		getB.addActionListener(new ActionListener()
		
		{
			public void actionPerformed(ActionEvent e)
			{
				String meetid= meetT.getText();
				String result;
				int index=Data.meetingID.indexOf(meetid);
				if(index>=0)
				{
					String d= Data.date.get(index);
					String t= Data.time.get(index);
					result= "Meeting is scheduled at " +t+" hrs on "+d+".";
				}
				else
				{
					result="Invalid MeetingID.";
				}
				
				resultL.setVisible(true);
				resultL.setText(result);
			}
		});
		getB.setBounds(161, 88, 89, 23);
		panel.add(getB);
		
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
		
	}

}
