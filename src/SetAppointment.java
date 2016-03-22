import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;

/*
 * @author Anjali
 */
public class SetAppointment extends JFrame {

	private JPanel contentPane;
	private JTextField meetIDT;
	private JTextField timeT;
	private JTextField dateT;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() 
			{
				try {
					SetAppointment frame = new SetAppointment();
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
	public SetAppointment() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel appointmentIIDL = new JLabel("MeetingID");
		appointmentIIDL.setBounds(82, 44, 86, 14);
		panel.add(appointmentIIDL);
		
		DateFormat format = new SimpleDateFormat("MM/DD/YYYY"); //display your format.
	    Date date = new Date();
		
	    
		meetIDT = new JTextField();
		meetIDT.setBounds(218, 41, 86, 20);
		panel.add(meetIDT);
		meetIDT.setColumns(10);
		
		JLabel dateL = new JLabel("Enter Date");
		dateL.setBounds(82, 78, 86, 14);
		panel.add(dateL);
		
		JLabel lblNewLabel = new JLabel("Enter Time");
		lblNewLabel.setBounds(82, 109, 86, 14);
		panel.add(lblNewLabel);
		
		timeT = new JTextField();
		timeT.setBounds(218, 106, 86, 20);
		panel.add(timeT);
		timeT.setColumns(10);
		

		JLabel resultL = new JLabel("");
		resultL.setBounds(98, 214, 253, 14);
		panel.add(resultL);
		resultL.setVisible(false);
		
		JButton setB = new JButton("Set");
		setB.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				String result;
				if(meetIDT.getText().equals("")|| dateT.getText().equals("")|| timeT.getText().equals(""))
				{
					result="Please enter details";
				}
				else
				{
					result= Data.addMeeting(meetIDT.getText(),dateT.getText(),timeT.getText());
				}
				
				resultL.setText(result);
				resultL.setVisible(true);
			}
		});
		setB.setBounds(167, 165, 89, 23);
		panel.add(setB);
		
		JLabel lblSetAppointment = new JLabel("Set Appointment");
		lblSetAppointment.setBounds(158, 11, 146, 14);
		panel.add(lblSetAppointment);
		
		dateT = new JTextField();
		dateT.setBounds(218, 75, 86, 20);
		panel.add(dateT);
		dateT.setColumns(10);
		
		JButton backB = new JButton("Back");
		backB.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				setVisible(false);
				dispose();
				
				Secretary s= new Secretary();
				s.setVisible(true);
			}
		});
		backB.setBounds(325, 7, 89, 23);
		panel.add(backB);
		
		
		
	}
}
