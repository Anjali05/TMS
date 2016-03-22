import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * @author Anjali
 */

public class ModifyAccount extends JFrame {

	private JPanel contentPane;
	private JTextField usernameT;
	private JTextField oldPT;
	private JTextField newPT;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModifyAccount frame = new ModifyAccount();
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
	public ModifyAccount() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
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
		
		JLabel usernameL = new JLabel("Enter username");
		usernameL.setBounds(48, 55, 101, 14);
		panel.add(usernameL);
		
		usernameT = new JTextField();
		usernameT.setBounds(195, 52, 86, 20);
		panel.add(usernameT);
		usernameT.setColumns(10);
		
		JLabel oldPL = new JLabel("Enter Old Password");
		oldPL.setBounds(48, 98, 121, 14);
		panel.add(oldPL);
		
		oldPT = new JTextField();
		oldPT.setBounds(195, 95, 86, 20);
		panel.add(oldPT);
		oldPT.setColumns(10);
		
		JLabel newPL = new JLabel("Enter new Password");
		newPL.setBounds(48, 141, 121, 14);
		panel.add(newPL);
		
		newPT = new JTextField();
		newPT.setBounds(195, 138, 86, 20);
		panel.add(newPT);
		newPT.setColumns(10);
		
		JLabel resultL = new JLabel("");
		resultL.setBounds(93, 182, 150, 14);
		panel.add(resultL);
		resultL.setVisible(false);
		
		JButton updateB = new JButton("Update");
		updateB.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				String result="";
				String username= usernameT.getText();
				String oldpass= oldPT.getText();
				
				if(username.equals("")||oldpass.equals("")||newPT.getText().equals(""))
				{
					result="Please enter details";
				}
				
				else
				{
					int index= Data.username.indexOf(username);
					if(index>=0)
					{
						String checkUsername = Data.username.get(index).toString();
						String checkPassword = Data.empID.get(index).toString();
						if(username.equals(checkUsername)&& oldpass.equals(checkPassword))
						{	
							Data.empID.add(index, newPT.getText());
							result="Successful update";
						}
						else
						{
							result="Wrong username/password";
						}
						
					}
					else
					{
						result="User does not exist";
					}
				}
				
				
				resultL.setVisible(true);
				resultL.setText(result);
			}
		});
		updateB.setBounds(135, 217, 89, 23);
		panel.add(updateB);
	}

}
