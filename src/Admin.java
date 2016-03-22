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

public class Admin extends JFrame 
{

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin frame = new Admin();
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
	public Admin() 
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
		
		//welcome labels
		JLabel welcomeL= new JLabel("Welcome Admin!");
		welcomeL.setBounds(156, 24, 105, 14);
		panel.add(welcomeL);
		
		//button for updating employee
		JButton addEmpB = new JButton("Add Employee");
		addEmpB.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				setVisible(false);
				dispose();
				
				AddEmployee ae= new AddEmployee();
				ae.setVisible(true);
			}
		});
		addEmpB.setBounds(18, 68, 151, 23);
		panel.add(addEmpB);
		
		//button for updating project
		JButton deleteEmpB = new JButton("Delete Employee");
		deleteEmpB.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				setVisible(false);
				dispose();
				
				RemoveEmployee re= new RemoveEmployee();
				re.setVisible(true);
			}
		});
		deleteEmpB.setBounds(263, 68, 137, 23);
		panel.add(deleteEmpB);
		
		//button for Employee Stats
		JButton empStatB = new JButton("Employee Statistics");
		empStatB.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				setVisible(false);
				dispose();
				
				EmpStats es = new EmpStats();
				es.setVisible(true);
			}
		});
		empStatB.setBounds(18, 143, 151, 23);
		panel.add(empStatB);
		
		//button for Project Stats
		JButton projstatsB = new JButton("Project Statistics");
		projstatsB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				setVisible(false);
				dispose();
				
				ProjStats ps= new ProjStats();
				ps.setVisible(true);
			}
		});
		projstatsB.setBounds(263, 143, 137, 23);
		panel.add(projstatsB);
		
		//button for logout 
		JButton logoutB = new JButton("Logout");
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
		logoutB .setBounds(156, 200, 89, 23);
		panel.add(logoutB);
		
		JButton addProjB = new JButton("Add Project");
		addProjB.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				setVisible(false);
				dispose();
				
				AddProject ap= new AddProject();
				ap.setVisible(true);
			}
		});
		addProjB.setBounds(18, 102, 151, 23);
		panel.add(addProjB);
		
		JButton deleteProjB = new JButton("Delete Project");
		deleteProjB.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{

				setVisible(false);
				dispose();
				
				RemoveProject rp= new RemoveProject();
				rp.setVisible(true);
			}
		});
		deleteProjB.setBounds(263, 102, 137, 23);
		panel.add(deleteProjB);
	}
}
