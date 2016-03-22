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

public class AddEmployee extends JFrame {

	private JPanel contentPane;
	private JTextField employeeIDT;
	private JTextField usernameT;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddEmployee frame = new AddEmployee();
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
	public AddEmployee() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel employeeIDL = new JLabel("Enter new Employee ID");
		employeeIDL.setBounds(51, 61, 151, 14);
		panel.add(employeeIDL);
		
		employeeIDT = new JTextField();
		employeeIDT.setBounds(234, 58, 86, 20);
		panel.add(employeeIDT);
		employeeIDT.setColumns(10);
		
		JLabel usernameL = new JLabel("Enter Username");
		usernameL.setBounds(51, 120, 151, 14);
		panel.add(usernameL);
		
		usernameT = new JTextField();
		usernameT.setBounds(234, 117, 86, 20);
		panel.add(usernameT);
		usernameT.setColumns(10);
		
		JLabel resultL = new JLabel("");
		resultL.setBounds(113, 159, 196, 14);
		panel.add(resultL);
		resultL.setVisible(false);
		
		
		JButton addB = new JButton("Add");
		addB.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String result;
				if(employeeIDT.getText().equals("")|| usernameT.getText().equals(""))
				{
					result="Please enter details";
				}
				else
				{
					result= Data.addEmp(employeeIDT.getText(), usernameT.getText());
				}
				
				resultL.setVisible(true);
				resultL.setText(result);
			}
		});
		addB.setBounds(153, 204, 89, 23);
		panel.add(addB);
		
		JButton backB = new JButton("Back");
		backB.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				setVisible(false);
				dispose();
				
				Admin a= new Admin();
				a.setVisible(true);
			}
		});
		backB.setBounds(325, 11, 89, 23);
		panel.add(backB);
		
		
	}

}
