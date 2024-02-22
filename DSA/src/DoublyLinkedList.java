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

public class DoublyLinkedList extends JFrame {

	private JPanel contentPane;
//	private JTextField sizefield_1;
	private JTextField element_1;
	//private JTextField sizeField_2;
	private JTextField element_2;
	private JTextField displaybox;
	private Node first;

	/**
	 * Launch the application.
	 */
	
	class Node
	 {
		 Node prelink;
		 int data;
		 Node nextlink;
	 }
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoublyLinkedList frame = new DoublyLinkedList();
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
	public DoublyLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1046, 697);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 0, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DOUBLY LINKED LIST DATASTRUCTURE");
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel.setBounds(361, 62, 275, 18);
		contentPane.add(lblNewLabel);
		
		
		
		JButton insertrear = new JButton("INSERT REAR");
		insertrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				Node temp;
				int elem;
        		elem = Integer.valueOf(element_1.getText());
				 Node newnode=new Node();
				 newnode.data=elem;
				 newnode.prelink=null;
				 if(first == null) 
				 {
					first=newnode; 
				 }
				 else 
				 {
					 temp=first;
					 while(temp.nextlink!=null) 
					 {
						 temp=temp.nextlink;
					 }
					 temp.nextlink=newnode;
				 }
				 JOptionPane.showMessageDialog(contentPane, "Element inserted successfully.");
				}catch (NumberFormatException ex) {
		            JOptionPane.showMessageDialog(contentPane, "Invalid input: Please enter an integer.");
		        }
			}
		});
		insertrear.setFont(new Font("Constantia", Font.BOLD, 13));
		insertrear.setBounds(746, 127, 119, 25);
		contentPane.add(insertrear);
		
		JLabel lblNewLabe2 = new JLabel("ENTER THE ELEMENT");
		lblNewLabe2.setForeground(new Color(255, 0, 0));
		lblNewLabe2.setFont(new Font("Constantia", Font.BOLD, 13));
		lblNewLabe2.setBounds(152, 141, 140, 17);
		contentPane.add(lblNewLabe2);
		
		element_1 = new JTextField();
		element_1.setBounds(336, 137, 152, 20);
		contentPane.add(element_1);
		element_1.setColumns(10);
		
		JButton insertfront = new JButton("INSERT FRONT");
		insertfront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
               try {
				int elem;
            	elem = Integer.valueOf(element_2.getText());
				 Node newnode=new Node();
				 newnode.data=elem;
				 newnode.nextlink=null;
				 newnode.prelink=null;
				 if(first==null) 
				 {
					first=newnode; 
				 } 
				 else 
				 {
					 newnode.nextlink=first;
					 first.prelink=newnode;
					 first=newnode;
				 }
				 JOptionPane.showMessageDialog(contentPane, "Element inserted successfully.");
               }catch (NumberFormatException ex) {
		            JOptionPane.showMessageDialog(contentPane, "Invalid input: Please enter an integer.");
		        }
			}
		});
		insertfront.setFont(new Font("Constantia", Font.BOLD, 13));
		insertfront.setBounds(617, 194, 129, 25);
		contentPane.add(insertfront);
		
		JLabel lblNewLabe3 = new JLabel("ENTER THE ELEMENT");
		lblNewLabe3.setForeground(Color.RED);
		lblNewLabe3.setFont(new Font("Constantia", Font.BOLD, 13));
		lblNewLabe3.setBounds(152, 181, 140, 17);
		contentPane.add(lblNewLabe3);
		
		element_2 = new JTextField();
		element_2.setBounds(336, 177, 152, 20); // Adjusted bounds to position it separately
		contentPane.add(element_2);
		element_2.setColumns(10);
		
		JButton deleterear = new JButton("DELETE REAR");
		deleterear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Node temp;
				 if(first==null) 
				 {
					 JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				 }
				 else if(first.nextlink==null) 
				 {
					 String message = "Element deleted is" +first.data;
						JOptionPane.showMessageDialog(contentPane, message);
						first = null;
				 }
				 else 
				 {
					 temp=first;
					 while(temp.nextlink.nextlink!=null) 
					 {
						 temp.nextlink=null;
					 }
					 String message = "Element deleted is" +temp.nextlink.data;
						JOptionPane.showMessageDialog(contentPane, message);
						temp.nextlink=null;
				 }	
			}
		});
		deleterear.setFont(new Font("Constantia", Font.BOLD, 13));
		deleterear.setBounds(339, 297, 121, 25);
		contentPane.add(deleterear);
		
		JButton deletefront = new JButton("DELETE FRONT");
		deletefront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				 Node temp;
				 if(first==null) 
				 {
					 JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				 }
				 else if(first.nextlink==null) 
				 {
					 String message = "Element deleted is" +first.data;
						JOptionPane.showMessageDialog(contentPane, message);
					 first=null;
				 }
				 else 
				 {
					 String message = "Element deleted is" +first.prelink.data;
						JOptionPane.showMessageDialog(contentPane, message);
					 first.prelink=null;
				 }
			}
		});
		deletefront.setFont(new Font("Constantia", Font.BOLD, 13));
		deletefront.setBounds(327, 373, 133, 25);
		contentPane.add(deletefront);
		
		JButton displayforward = new JButton("DISPLAY FORWARD");
		displayforward.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Node temp;
				String msg = "";
                Node temp = first;
				if(first==null) 
				{
					JOptionPane.showMessageDialog(contentPane,"Display not possible");
				}
				else 
				{
					temp=first;
					while(temp!=null) 
					{
						msg = msg + " " + temp.data;
						temp=temp.nextlink;
					}
					displaybox.setText(msg);
					
				}
			}
		});
		displayforward.setFont(new Font("Constantia", Font.BOLD, 13));
		displayforward.setBounds(241, 445, 163, 25);
		contentPane.add(displayforward);
		
		JButton displayreverse = new JButton("DISPLAY REVERSE");
		displayreverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg = "";
                Node temp = first;
				 if(first==null) 
				 {
					 JOptionPane.showMessageDialog(contentPane,"Display not possible");
				 }
				 else if(first.nextlink==null) 
				 {
					 JOptionPane.showMessageDialog(contentPane, first.data); 
				 }
				 else 
				 {
					 temp=first;
					 while(temp.nextlink!=null) 
					 {
						 temp=temp.nextlink;
					 }
					 while(temp!=null) 
					 {
						 msg = msg + " " + temp.data+"";
						temp=temp.prelink;
					 }
					 displaybox.setText(msg);
				 }
			}
		});
		displayreverse.setFont(new Font("Constantia", Font.BOLD, 13));
		displayreverse.setBounds(468, 444, 151, 25);
		contentPane.add(displayreverse);
		
		displaybox = new JTextField();
		displaybox.setBounds(72, 555, 797, 20);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}

}