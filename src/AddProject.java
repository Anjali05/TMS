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

public class AddProject extends JFrame {

	private JPanel contentPane;
	private JTextField projIDT;
	private JTextField descT;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddProject frame = new AddProject();
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
	public AddProject() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel projIDL = new JLabel("Enter Project ID");
		projIDL.setBounds(41, 47, 118, 14);
		panel.add(projIDL);
		
		projIDT = new JTextField();
		projIDT.setBounds(190, 44, 86, 20);
		panel.add(projIDT);
		projIDT.setColumns(10);
		
		JLabel descriptionL = new JLabel("Enter description");
		descriptionL.setBounds(41, 87, 118, 14);
		panel.add(descriptionL);
		
		descT = new JTextField();
		descT.setBounds(190, 87, 86, 20);
		panel.add(descT);
		descT.setColumns(10);
		
		JLabel resultL = new JLabel("");
		resultL.setBounds(104, 143, 172, 14);
		panel.add(resultL);
		resultL.setVisible(false);
		
		JButton addB = new JButton("Add");
		addB.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				String result;
				if(projIDT.getText().equals("")|| descT.getText().equals(""))
				{
					result="Please enter details";
				}
				else
				{

					result= Data.addProj(projIDT.getText(), descT.getText());
				}
				
				resultL.setVisible(true);
				resultL.setText(result);
			}
		});
		addB.setBounds(145, 195, 89, 23);
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
