import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/*
 * @author Anjali
 */

public class Secretary extends JFrame 
{
	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Secretary frame = new Secretary();
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
	public Secretary() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		//welcome label 
		JLabel welcomeL = new JLabel("Welcome Secretary!");
		welcomeL.setBounds(147, 11, 122, 14);
		panel.add(welcomeL);
		
		//button for updating appointment
		JButton updateAppointB = new JButton("Update Appointment");
		
		//update appointment
		updateAppointB.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				setVisible(false);
				dispose();
				
				UpdateAppointment u=new UpdateAppointment();
				u.setVisible(true);
			}
		});
		updateAppointB.setBounds(127, 49, 156, 23);
		panel.add(updateAppointB);
		
		//button for scheduling meeting
		JButton scheduleB = new JButton("Schedule Meeting");
		scheduleB.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				setVisible(false);
				dispose();
				ScheduleMeeting sm= new ScheduleMeeting();
				sm.setVisible(true);
			}
		});
		scheduleB.setBounds(127, 140, 156, 23);
		panel.add(scheduleB);
		
		//button for logout
		JButton logoutB = new JButton("Logout");
		
		//return to login page on logout
		logoutB.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				setVisible(false);
				dispose();
				
				Login l = new Login();
				l.setVisible(true);
			}
		});
		logoutB.setBounds(151, 192, 89, 23);
		panel.add(logoutB);
		
		JButton btnNewButton = new JButton("Set Appointment");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0)
			{
				setVisible(false);
				dispose();
				
				SetAppointment sa = new SetAppointment();
				sa.setVisible(true);
			}
		});
		btnNewButton.setBounds(127, 94, 156, 23);
		panel.add(btnNewButton);
		
		
		
	}

}
