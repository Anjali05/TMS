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

public class RemoveEmployee extends JFrame {

	private JPanel contentPane;
	private JTextField empIDT;
	private JTextField usernameT;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RemoveEmployee frame = new RemoveEmployee();
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
	public RemoveEmployee() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel employeeIDL = new JLabel("Enter Employee ID");
		employeeIDL.setBounds(74, 94, 120, 14);
		panel.add(employeeIDL);
		
		empIDT = new JTextField();
		empIDT.setBounds(238, 91, 86, 20);
		panel.add(empIDT);
		empIDT.setColumns(10);
		
		
		JLabel resultL = new JLabel("");
		resultL.setBounds(114, 172, 190, 14);
		panel.add(resultL);
		resultL.setVisible(false);
		
		JLabel lblNewLabel = new JLabel("Enter username");
		lblNewLabel.setBounds(74, 127, 120, 14);
		panel.add(lblNewLabel);
		
		usernameT = new JTextField();
		usernameT.setBounds(238, 122, 86, 20);
		panel.add(usernameT);
		usernameT.setColumns(10);
		
		JButton deleteB = new JButton("Delete");
		deleteB.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				String result = Data.removeEmp(empIDT.getText(), usernameT.getText());
				resultL.setVisible(true);
				resultL.setText(result);
			}
		});
		deleteB.setBounds(162, 204, 89, 23);
		panel.add(deleteB);
		
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
		backB.setBounds(310, 11, 89, 23);
		panel.add(backB);
		
		
		
		
	}
}
