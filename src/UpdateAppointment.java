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

public class UpdateAppointment extends JFrame {

	private JPanel contentPane;
	private JTextField appointIDT;
	private JTextField timeT;
	private JTextField dateT;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateAppointment frame = new UpdateAppointment();
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
	public UpdateAppointment() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel appointIDL = new JLabel("Meeting ID");
		appointIDL.setBounds(65, 47, 114, 14);
		panel.add(appointIDL);
		
		appointIDT = new JTextField();
		appointIDT.setBounds(238, 44, 86, 20);
		panel.add(appointIDT);
		appointIDT.setColumns(10);
		
		JLabel timeL = new JLabel("Enter updated Time");
		timeL.setBounds(65, 87, 114, 14);
		panel.add(timeL);
		
		timeT = new JTextField();
		timeT.setBounds(238, 84, 86, 20);
		panel.add(timeT);
		timeT.setColumns(10);
		
		JLabel dateL = new JLabel("Enter updated Date");
		dateL.setBounds(65, 126, 114, 14);
		panel.add(dateL);
		
		dateT = new JTextField();
		dateT.setBounds(238, 123, 86, 20);
		panel.add(dateT);
		dateT.setColumns(10);
		
		JLabel resultL = new JLabel("Result");
		resultL.setBounds(81, 219, 243, 14);
		panel.add(resultL);
		resultL.setVisible(false);
		
		JButton updateB = new JButton("Update");
		updateB.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String result;
				if(appointIDT.getText().equals("")|| dateT.getText().equals("")|| timeT.getText().equals(""))
				{
					result="Please enter details";
				}
				else
				{
					result=Data.updateMeeting(appointIDT.getText(),dateT.getText(), timeT.getText());
				}
				resultL.setVisible(true);
				resultL.setText(result);
			}
		});
		updateB.setBounds(150, 185, 89, 23);
		panel.add(updateB);
		
		JButton backB = new JButton("Back");
		backB.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
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
