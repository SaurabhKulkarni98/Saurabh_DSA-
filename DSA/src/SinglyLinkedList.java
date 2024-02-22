import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//import LinkedList.Node;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JTextField;
import javax.swing.JButton;

public class SinglyLinkedList extends JFrame {

    private JPanel contentPane;
   // private JTextField sizeField_1;
    private JTextField element_1;
    //private JTextField sizeField_2;
    private JTextField element_2;
    private JTextField displaybox;
    private Node first;
	private Scanner scan;
    //Scanner scan=new Scanner(System.in);

    class Node {
        int data;
        Node link;
     }

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
    	//public SinglyLinkedList() {
    	    //Scanner scan = new Scanner(System.in);
    	    // Rest of your constructor code...
    	

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    SinglyLinkedList frame = new SinglyLinkedList();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
       // public SinglyLinkedList() {
           // Scanner scan = new Scanner(System.in);
            // Your constructor code...
        }
    

    /**
     * Create the frame.
     */
    public SinglyLinkedList() {
    	
        scan = new Scanner(System.in);

		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 829, 576);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SINGLY LINKED LIST DATASTRUCTURE");
		lblNewLabel.setForeground(new Color(255, 255, 0));
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel.setBounds(273, 49, 267, 18);
		contentPane.add(lblNewLabel);
		
		
		
		
		
		//sizeField_1 = new JTextField();
		//sizeField_1.setBounds(336, 137, 152, 20);
		//contentPane.add(sizeField_1);
		//sizeField_1.setColumns(10);
		
		
		
		
		
		//sizeField_2 = new JTextField();
		//sizeField_2.setColumns(10);
		//sizeField_2.setBounds(336, 177, 152, 20);
		//contentPane.add(sizeField_2);
		
		JButton insertrear = new JButton("INSERT REAR");
		insertrear.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	 //JOptionPane.showMessageDialog(contentPane, "Enter an element:");
		        //String input = JOptionPane.showInputDialog(contentPane, "Enter an element:");
		        try {
		            //if (input != null) 
		        	
		        		Node temp;
		        		int elem;
		        		elem = Integer.valueOf(element_1.getText());
		        		//Node temp;   
		            	//elem = Integer.valueOf( element_1.getText());
		              //int elem = Integer.parseInt(input);
		        		//int elem=scan.nextInt();
		                Node newnode = new Node();
		                newnode.data = elem;
		                newnode.link = null;
		                if (first == null) {
		                    first = newnode;
		                } else {
		                    //Node temp = first;
		                	temp=first;
		                    while (temp.link != null) {
		                        temp = temp.link;
		                    }
		                    temp.link = newnode;
		                }
		                JOptionPane.showMessageDialog(contentPane, "Element inserted successfully.");
		                // Update display after insertion
		                //displaybox(); // Assuming displayList method updates the GUI
		                
		            
		        } catch (NumberFormatException ex) {
		            JOptionPane.showMessageDialog(contentPane, "Invalid input: Please enter an integer.");
		        }
		    }
		});
		insertrear.setFont(new Font("Constantia", Font.BOLD, 13));
		insertrear.setBounds(617, 136, 119, 25);
		contentPane.add(insertrear);
		
		JLabel lblNewLabel2 = new JLabel("ENTER THE ELEMENT");
		lblNewLabel2.setForeground(new Color(255, 0, 0));
		//lblNewLabe2.setBackground(new Color(255, 0, 0));
		lblNewLabel2.setFont(new Font("Constantia", Font.BOLD, 13));
		lblNewLabel2.setBounds(152, 141, 140, 17);
		contentPane.add(lblNewLabel2);
		
		element_1 = new JTextField();
		element_1.setBounds(336, 137, 152, 20);
		contentPane.add(element_1);
		element_1.setColumns(10);
		
		JButton insertfront = new JButton("INSERT FRONT");
		insertfront.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        //String input = JOptionPane.showInputDialog(contentPane, "Enter an element:");
		        try 
		            //if (input != null) 
		            {
		            	int elem;
		            	elem = Integer.valueOf(element_2.getText());
		            	//elem = Integer.valueOf(element_2.getText());

		                Node newnode = new Node();
		                newnode.data = elem;
		                newnode.link = first;
		                first = newnode;
		                JOptionPane.showMessageDialog(contentPane, "Element inserted successfully at the front.");
		                // Update display after insertion
		               // displaybox(); // Assuming displayList method updates the GUI
		            
		            }
		         catch (NumberFormatException ex) {
		            JOptionPane.showMessageDialog(contentPane, "Invalid input: Please enter an integer.");
		        }
		    }
		});
		insertfront.setFont(new Font("Constantia", Font.BOLD, 13));
		insertfront.setBounds(617, 194, 129, 25);
		contentPane.add(insertfront);
		
		JLabel lblNewLabel3 = new JLabel("ENTER THE ELEMENT");
		lblNewLabel3.setForeground(Color.RED);
		lblNewLabel3.setFont(new Font("Constantia", Font.BOLD, 13));
		lblNewLabel3.setBounds(152, 181, 140, 17);
		contentPane.add(lblNewLabel3);
		
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
				else if(first.link==null) 
				{
					String message = "Element deleted is" +first.data;
					JOptionPane.showMessageDialog(contentPane, message);
					first = null;
				}
				else 
				{
					temp=first;
					while(temp.link.link!=null) 
					{
						temp=temp.link;
					}
					String message = "Element deleted is" +temp.link.data;
					JOptionPane.showMessageDialog(contentPane, message);
					temp.link=null;
				}
			}
		});
		deleterear.setFont(new Font("Constantia", Font.BOLD, 13));
		deleterear.setBounds(336, 252, 121, 25);
		contentPane.add(deleterear);
		

		JButton deletefront = new JButton("DELETE FRONT");
		deletefront.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        if (first == null) {
		            JOptionPane.showMessageDialog(contentPane, "Deletion not possible: List is empty");
		        } else {
		            // Construct a message indicating the element that will be deleted
		            String message = "Element deleted is " + first.data;
		            // Display the message in a dialog box
		            JOptionPane.showMessageDialog(contentPane, message);
		            // Update first to point to the next node
		            first = first.link;
		        }
		    }
		});
		deletefront.setFont(new Font("Constantia", Font.BOLD, 13));
		deletefront.setBounds(336, 316, 133, 25);
		contentPane.add(deletefront);


        // Other GUI components...

		JButton display = new JButton("DISPLAY");
        display.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	String msg = "";
                Node temp = first; // Start from the first node
                if (temp == null) {
                    // If the list is empty, display a message dialog
                    JOptionPane.showMessageDialog(contentPane, "List is empty");
                } 
              //  else if(first.link==null) 
       		// {
                	//JOptionPane.showMessageDialog(contentPane, first.data); 
                	//msg = msg + " " + first.data;
                	//System.out.println(first.data);
       		// }
                else {
                	temp=first;
                    // If the list is not empty, construct the message containing all elements
                    while (temp != null) {
                        msg = msg + " " + temp.data; // Append the data of each node to the message
                        temp = temp.link; // Move to the next node
                    }
                    // Display the constructed message in a dialog box
                    displaybox.setText(msg);
                }
            }
        });
        display.setFont(new Font("Constantia", Font.BOLD, 13));
        display.setBounds(338, 385, 89, 25);
        contentPane.add(display);

        displaybox = new JTextField();
        displaybox.setBounds(152, 453, 584, 20);
        contentPane.add(displaybox);
        displaybox.setColumns(10);

    }

    //public void displaybox() 
    
        
    
}
