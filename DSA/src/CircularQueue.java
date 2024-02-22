import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CircularQueue extends JFrame {

	private JPanel contentPane;
	private JTextField sizefield;
	private JTextField element;
	private JTextField displaybox;
	private int cq[];
	 private int size;
	 private int r=-1;
	 private int f=0;
	 private int count=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CircularQueue frame = new CircularQueue();
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
	public CircularQueue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 832, 675);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CIRCULAR QUEUE DATASTRUCTURE");
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel.setForeground(new Color(255, 128, 0));
		lblNewLabel.setBounds(286, 65, 251, 18);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER QUEUE SIZE");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 13));
		lblNewLabel_1.setBackground(new Color(255, 0, 0));
		lblNewLabel_1.setBounds(145, 159, 126, 17);
		contentPane.add(lblNewLabel_1);
		
		sizefield = new JTextField();
		sizefield.setBackground(new Color(128, 0, 0));
		sizefield.setBounds(357, 155, 354, 20);
		contentPane.add(sizefield);
		sizefield.setColumns(10);
		
		JButton circularqueue = new JButton("CREATE QUEUE");
		circularqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CircularQueue creation code
				size = Integer.valueOf(sizefield.getText());
				cq=new int[size];
				String message = "Circular Queue of size"+"size"+"created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		circularqueue.setFont(new Font("Constantia", Font.BOLD, 13));
		circularqueue.setForeground(new Color(64, 0, 0));
		circularqueue.setBackground(new Color(0, 128, 0));
		circularqueue.setBounds(275, 210, 133, 25);
		contentPane.add(circularqueue);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER AN ELEMENT");
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 13));
		lblNewLabel_2.setBounds(145, 275, 131, 17);
		contentPane.add(lblNewLabel_2);
		
		element = new JTextField();
		element.setBackground(new Color(128, 0, 0));
		element.setBounds(371, 271, 147, 20);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for insertion
				int elem;
				if(count==size) 
				{
					JOptionPane.showMessageDialog(contentPane, "insertion not possible");
					
				}
				else 
				{
					elem = Integer.valueOf(element.getText());
					r=(r+1)%size;
					cq[r]=elem;
					count++;
					JOptionPane.showMessageDialog(contentPane, "Enter an element");
					element.setText("");
				}
			}
		});
		insert.setFont(new Font("Constantia", Font.BOLD, 13));
		insert.setBounds(610, 271, 81, 25);
		contentPane.add(insert);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for deletion
				if(count==0) 
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				else 
				{
					String message = "element deleted is"+cq[f];
					JOptionPane.showMessageDialog(contentPane, message);
					f=(f+1)%size;
					count--;
				}
			}
		});
		delete.setFont(new Font("Constantia", Font.BOLD, 13));
		delete.setBounds(345, 351, 83, 25);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for display
				String msg ="";
				int f1=f;
				 if(count==0) 
				 {
					 JOptionPane.showMessageDialog(contentPane, "Display not possible");
				 }
				 else 
				 {
					 for(int i=1;i<=count;i++) 
					 {
						msg = msg+" "+cq[i];
						f1=(f1+1)%size;
					 }
					 displaybox.setText(msg);
				 }
			}
		});
		display.setFont(new Font("Constantia", Font.BOLD, 13));
		display.setBounds(345, 430, 89, 25);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBackground(new Color(128, 0, 0));
		displaybox.setBounds(186, 520, 421, 20);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}
}
