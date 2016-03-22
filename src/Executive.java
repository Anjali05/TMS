import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Button;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/*
 * @author Anjali
 */

public class Executive extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Executive frame = new Executive();
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
	public Executive() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		//welcome for executive
		JLabel welcomeL = new JLabel("Welcome Executive");
		welcomeL.setBounds(169, 11, 150, 14);
		panel.add(welcomeL);
		
		//button for update appointment
		JButton postJobDetailsB = new JButton("Post Job details");
		
		//navigate to update appointment on button click
		postJobDetailsB.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0)
			{
				setVisible(false);
				dispose();
				
				PostJobDetails pjd= new PostJobDetails();
				pjd.setVisible(true);
			}
		});
		postJobDetailsB.setBounds(143, 36, 150, 23);
		panel.add(postJobDetailsB);
		
		//button for checking meeting schedule
		JButton checkMeetingB = new JButton("Check Meeting Details");
		checkMeetingB.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				setVisible(false);
				dispose();
				
				CheckMeetingDetails cmd= new CheckMeetingDetails();
				cmd.setVisible(true);
			}
		});
		checkMeetingB.setBounds(143, 70, 150, 23);
		panel.add(checkMeetingB);
		
		//button for posting engagement
		JButton registerB = new JButton("Register Daily Schedule");
		registerB.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				setVisible(false);
				dispose();
				
				RegisterSchedule rs= new RegisterSchedule();
				rs.setVisible(true);
			}
		});
		registerB.setBounds(143, 138, 150, 23);
		panel.add(registerB);
		
		//button for logout
		JButton logoutB  = new JButton("Logout");
		
		//navigate to login page on logout click
		logoutB.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				setVisible(false);
				dispose();
				
				Login l= new Login();
				l.setVisible(true);
				
			}
		});
		logoutB.setBounds(172, 224, 89, 23);
		panel.add(logoutB);
		
		JButton modifyACB = new JButton("Modify Account");
		modifyACB.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				setVisible(false);
				dispose();
				
				ModifyAccount ma= new ModifyAccount();
				ma.setVisible(true);
			}
		});
		modifyACB.setBounds(143, 104, 150, 23);
		panel.add(modifyACB);
		
		JButton notificationB = new JButton("View Notifications");
		notificationB.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				setVisible(false);
				dispose();
				
				Notification n= new Notification();
				n.setVisible(true);
			}
		});
		notificationB.setBounds(142, 179, 151, 23);
		panel.add(notificationB);
	}
}
