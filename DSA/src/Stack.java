import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Stack extends JFrame {

	private JPanel contentpane;
	private JTextField sizefield;
	private JTextField element;
	private JTextField displaybox;
	private int s[];
	private int size;
	private int top=-1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stack frame = new Stack();
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
	public Stack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 875, 609);
		contentpane = new JPanel();
		contentpane.setBackground(new Color(255, 0, 0));
		contentpane.setForeground(new Color(255, 0, 0));
		contentpane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentpane);
		contentpane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STACK DATA STRUCTURE");
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel.setBounds(229, 11, 258, 18);
		contentpane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER THE STACK SIZE");
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1.setBounds(161, 47, 159, 18);
		contentpane.add(lblNewLabel_1);
		
		sizefield = new JTextField();
		sizefield.setBounds(405, 44, 96, 20);
		contentpane.add(sizefield);
		sizefield.setColumns(10);
		
		JButton stack = new JButton("CREATE STACK");
		stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//stack creation code
				size = Integer.valueOf(sizefield.getText());
				s=new int[size];
				String message = "Stack of size"+size+"Created";
				JOptionPane.showMessageDialog(contentpane, message);
				
				
			}
		});
		stack.setBounds(287, 76, 89, 23);
		contentpane.add(stack);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER AN ELEMENT");
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_2.setBounds(74, 119, 140, 18);
		contentpane.add(lblNewLabel_2);
		
		element = new JTextField();
		element.setBounds(280, 116, 96, 20);
		contentpane.add(element);
		element.setColumns(10);
		
		JButton push = new JButton("PUSH");
		push.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//push code
				int elem;
				if(top==size-1) 
				{
					JOptionPane.showMessageDialog(contentpane, "push not possible");
					
				}
				else 
				{
					 elem = Integer.valueOf(element.getText());
					++top;
					s[top]=elem;
					JOptionPane.showMessageDialog(contentpane, "push Sucessful");
					element.setText("");
				}
			}
		});
		push.setBounds(426, 115, 89, 23);
		contentpane.add(push);
		
		JButton pop = new JButton("POP");
		pop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//pop code
				if(top==-1) 
				{
					JOptionPane.showMessageDialog(contentpane, "Pop not possible");
				
				}
				else 
				{
					String message = "Element deleted is: "+s[top];
					JOptionPane.showConfirmDialog(contentpane, message);
					--top;
				}
			}
		});
		pop.setBounds(287, 162, 89, 23);
		contentpane.add(pop);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//display code
				String msg = "";
				if(top==-1) 
				{
					JOptionPane.showMessageDialog(contentpane, "Display not possible");
				}
				else 
				{
					for(int i=top;i>=0;i--) 
					{
						msg = msg+" "+s[i];
					}
					displaybox.setText(msg);
				}
			}
		});
		display.setBounds(287, 220, 89, 23);
		contentpane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBounds(95, 291, 602, 20);
		contentpane.add(displaybox);
		displaybox.setColumns(10);
	}
}
