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

public class Queue extends JFrame {

	private JPanel contentPane;
	private JTextField sizefield;
	private JTextField element;
	private JTextField displaybox;
	 private int q[];
	 private int size;
	 private int r=-1;
	 private int f=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Queue frame = new Queue();
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
	public Queue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1006, 615);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Queue Data Structure");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 15));
		lblNewLabel.setBounds(320, 39, 289, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER QUEUE SIZE");
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 13));
		lblNewLabel_1.setForeground(new Color(0, 128, 255));
		lblNewLabel_1.setBounds(73, 127, 126, 17);
		contentPane.add(lblNewLabel_1);
		
		sizefield = new JTextField();
		sizefield.setBackground(new Color(255, 128, 64));
		sizefield.setForeground(new Color(64, 0, 0));
		sizefield.setBounds(299, 123, 510, 20);
		contentPane.add(sizefield);
		sizefield.setColumns(10);
		
		JButton queue = new JButton("CREATE QUEUE");
		queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Queue creation code
				size = Integer.valueOf(sizefield.getText());
				q=new int[size];
				String message = "Queue of size"+"size"+"created";
				JOptionPane.showMessageDialog(contentPane, message);
				
			}
		});
		queue.setBackground(new Color(255, 0, 0));
		queue.setForeground(new Color(64, 0, 0));
		queue.setFont(new Font("Constantia", Font.BOLD, 13));
		queue.setBounds(476, 183, 133, 25);
		contentPane.add(queue);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER AN ELEMENT");
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 13));
		lblNewLabel_2.setForeground(new Color(0, 255, 0));
		lblNewLabel_2.setBounds(39, 278, 131, 17);
		contentPane.add(lblNewLabel_2);
		
		element = new JTextField();
		element.setForeground(new Color(64, 0, 0));
		element.setColumns(10);
		element.setBackground(new Color(255, 128, 64));
		element.setBounds(299, 274, 289, 20);
		contentPane.add(element);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for insertion
				int elem;
				 if(r==size-1) 
				 {
					 JOptionPane.showMessageDialog(contentPane, "insertion not possible");
				 }
				 else 
				 {
					 
					 elem = Integer.valueOf(element.getText());
					 ++r;
					 q[r]=elem;
					 JOptionPane.showMessageDialog(contentPane, "Enter an element");
					 element.setText("");
				 }
			}
		});
		insert.setBackground(new Color(255, 0, 0));
		insert.setForeground(new Color(64, 0, 0));
		insert.setBounds(720, 273, 71, 23);
		contentPane.add(insert);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for deletion
				 if(r==-1||f>r) 
				 {
					 JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				 }
				 else 
				 {
					 String message = "element deleted is"+q[f];
					 JOptionPane.showMessageDialog(contentPane, message);
					 ++f;
					 
				 }
			}
		});
		delete.setFont(new Font("Constantia", Font.BOLD, 13));
		delete.setBackground(new Color(255, 0, 0));
		delete.setBounds(423, 338, 83, 25);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for display
				String msg = "";
				if(r==-1||f>r) 
				 {
					 JOptionPane.showMessageDialog(contentPane, "Display not possible");
				 }
				 else 
				 {
					 for(int i=f;i<=r;i++) 
					 {
						 msg = msg+" "+q[i];
					 }
					 displaybox.setText(msg);
				 }
			}
		});
		display.setBackground(new Color(255, 0, 0));
		display.setFont(new Font("Constantia", Font.BOLD, 13));
		display.setBounds(423, 399, 89, 25);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setForeground(new Color(64, 0, 0));
		displaybox.setColumns(10);
		displaybox.setBackground(new Color(255, 128, 64));
		displaybox.setBounds(229, 446, 510, 20);
		contentPane.add(displaybox);
	}
}
