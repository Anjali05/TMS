import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

/*
 * @author Anjali
 */

public class Login extends JFrame 
{
	private JTextField usernameT;
	private JPasswordField passwordT;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() 
	{
		
		ArrayList<String> username = new ArrayList<String>();
		ArrayList<String> password = new ArrayList<String>();
		
		username.add("Test");
		password.add("test");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		//label for username
		JLabel userL = new JLabel("Username ");
		userL.setBounds(84, 89, 68, 14);
		panel.add(userL);
		
		//Label for welcome text
		JLabel welcomeL = new JLabel("Welcome to TMS Login");
		welcomeL.setBounds(148, 11, 140, 14);
		panel.add(welcomeL);
		
		//label for password
		JLabel passwordL = new JLabel("Password");
		passwordL.setBounds(84, 140, 68, 14);
		panel.add(passwordL);
		
		//input for username 
		usernameT = new JTextField();
		usernameT.setBounds(222, 86, 86, 20);
		panel.add(usernameT);
		usernameT.setColumns(10);
		
		//input for password
		passwordT = new JPasswordField();
		passwordT.setBounds(222, 140, 86, 17);
		panel.add(passwordT);
		
		JLabel resultL = new JLabel("");
		resultL.setBounds(84, 180, 224, 14);
		panel.add(resultL);
		resultL.setVisible(false);
	
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0)
			{
				String user = usernameT.getText();
				String pass = passwordT.getText();
				
				//Secretary login
				 if(user.equals("Secretary")&& pass.equals("secretary"))
				 {
					 setVisible(false);
					 dispose();
					 
					 Secretary s = new Secretary();
					 s.setVisible(true);
					 //navigate to secretary home frame
				 }
				 
				 else if(user.equals("Admin")&& pass.equals("admin"))
				 {
					 setVisible(false);
					 dispose();
					 
					 Admin a = new Admin();
					 a.setVisible(true);
					 //navigate to secretary home frame
				 }
				 
				 //Test executive
				 else if(user.equals("Test")&& pass.equals("test"))
				 {
					 setVisible(false);
					 dispose();
					 
					 Executive e = new Executive();
					 e.setVisible(true);
				 }
				 else
				 {
					 
					 String result=Data.checkLogin(user, pass);
					 /*Iterator<String> itr1 = username.iterator();
					 Iterator<String> itr2 = password.iterator();
					 int flag=0;
				     while(itr1.hasNext()&& itr2.hasNext())
				        {
				    	 if(user.equals(itr1.next().toString())&& pass.equals(itr2.next().toString()))
				    	 {
				    		 flag=1;
				    		 break;
				    	 }
				            
				        }*/
				     
				     if(result.equals("Fail"))
				     {
				    	 resultL.setVisible(true);
				    	 resultL.setText("Wrong credentials. Please try again.");
				     }
				     else
				     {
				    	 setVisible(false);
			    		 dispose();
			    		 
			    		 Executive e = new Executive();
			    		 e.setVisible(true);
			    		 
				     }
				 }
				 
				 
			}
		});
		btnLogin.setBounds(155, 216, 76, 23);
		panel.add(btnLogin);
		
		
		
	
	}
}
