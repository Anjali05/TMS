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

public class RemoveProject extends JFrame {

	private JPanel contentPane;
	private JTextField projIDT;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RemoveProject frame = new RemoveProject();
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
	public RemoveProject() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel projID = new JLabel("Enter Project ID");
		projID.setBounds(54, 73, 104, 14);
		panel.add(projID);
		
		projIDT = new JTextField();
		projIDT.setBounds(220, 70, 86, 20);
		panel.add(projIDT);
		projIDT.setColumns(10);
		
		JLabel resultL = new JLabel("");
		resultL.setBounds(117, 137, 167, 14);
		panel.add(resultL);
		resultL.setVisible(false);
		
		JButton removeB = new JButton("Remove");
		removeB.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String result= Data.removeProj(projIDT.getText());
				resultL.setVisible(true);
				resultL.setText(result);
			}
		});
		removeB.setBounds(143, 172, 89, 23);
		panel.add(removeB);
		
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
