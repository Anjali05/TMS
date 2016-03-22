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

public class CheckSchedule extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckSchedule frame = new CheckSchedule();
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
	public CheckSchedule() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel employeeIDL = new JLabel("Enter EmployeeID");
		employeeIDL.setBounds(60, 39, 103, 14);
		panel.add(employeeIDL);
		
		textField = new JTextField();
		textField.setBounds(199, 36, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel resultL = new JLabel("Result");
		resultL.setBounds(155, 115, 46, 14);
		panel.add(resultL);
		resultL.setVisible(false);
		
		JButton checkB = new JButton("Check");
		
		//displays results on clicking
		checkB.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				resultL.setVisible(true);
			}
		});
		checkB.setBounds(134, 182, 89, 23);
		panel.add(checkB);
	}

}
