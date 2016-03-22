import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;

/*
 * @author Anjali
 */

public class ScheduleMeeting extends JFrame 
{

	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScheduleMeeting frame = new ScheduleMeeting();
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
	public ScheduleMeeting() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel appointL = new JLabel("Choose Meeying ID");
		appointL.setBounds(77, 86, 145, 14);
		panel.add(appointL);
		
		JLabel employeeIDL = new JLabel("Choose Employee ID");
		employeeIDL.setBounds(77, 140, 129, 14);
		panel.add(employeeIDL);
		
		ArrayList<String> meeting= new ArrayList<String>();
		meeting=Data.getMeetingID();
		Iterator<String> itr1 = meeting.iterator();
		
		JComboBox meetC = new JComboBox();
		meetC.setBounds(253, 83, 86, 20);
		panel.add(meetC);
		
		while(itr1.hasNext())
		{
			meetC.addItem(itr1.next());
		}
		
		JComboBox empC = new JComboBox();
		empC.setBounds(253, 137, 86, 20);
		panel.add(empC);
		
		ArrayList<String> emp= new ArrayList<String>();
		emp=Data.getEmpID();
		Iterator<String> itr2 = emp.iterator();
		
		while(itr2.hasNext())
		{
			empC.addItem(itr2.next());
		}
		
		
		JLabel resultL = new JLabel("");
		resultL.setBounds(120, 42, 205, 14);
		panel.add(resultL);
		resultL.setVisible(false);
		
		JButton scheduleB = new JButton("Schedule");
		scheduleB.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				String result;
				if(empC.getItemCount()!=0 && meetC.getItemCount()!=0)
				{
					String empid= empC.getSelectedItem().toString();
					String meetid= meetC.getSelectedItem().toString();
				    result= Data.addMeetingDetails(empid, meetid);
				}
				else
				{
					result="Add Meeting/Employee first!";
				}
				
				resultL.setVisible(true);
				resultL.setText(result);
			}
		});
		scheduleB.setBounds(183, 199, 89, 23);
		panel.add(scheduleB);
		
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
		backB.setBounds(314, 0, 89, 23);
		panel.add(backB);
		
		
		
		
	}
}
