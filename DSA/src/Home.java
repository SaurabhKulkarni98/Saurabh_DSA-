import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Choose a Data Structure");
		lblNewLabel.setBounds(132, 29, 193, 19);
		lblNewLabel.setForeground(new Color(255, 255, 0));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 14));
		contentPane.add(lblNewLabel);
		
		JButton array = new JButton("ARRAY");
		array.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE ARRAY WINDOW OPENINH CODE HERE
				//Array a=new Array();
				//a.setVisible(true);
				new Array().setVisible(true);
			}
		});
		array.setBounds(164, 79, 73, 23);
		array.setForeground(new Color(0, 128, 255));
		array.setFont(new Font("Constantia", Font.BOLD, 12));
		contentPane.add(array);
		
		JButton stack = new JButton("STACK");
		stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE STACK WINDOW OPENING CODE HERE
				new Stack().setVisible(true);
				
				
			}
		});
		stack.setForeground(new Color(0, 128, 255));
		stack.setFont(new Font("Constantia", Font.BOLD, 12));
		stack.setBounds(40, 123, 71, 23);
		contentPane.add(stack);
		
		JButton queue = new JButton("QUEUE");
		queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE QUEUE WINDOW OPENING CODE HERE
				new Queue().setVisible(true);
			}
		});
		queue.setForeground(new Color(0, 128, 255));
		queue.setFont(new Font("Constantia", Font.BOLD, 12));
		queue.setBounds(294, 121, 75, 23);
		contentPane.add(queue);
		
		JButton cq = new JButton("CIRCULAR QUEUE");
		cq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE CIRCULAR QUEUE WINDOW OPENING CODE HERE
				new CircularQueue().setVisible(true);
			}
		});
		cq.setForeground(new Color(0, 128, 255));
		cq.setFont(new Font("Constantia", Font.BOLD, 12));
		cq.setBounds(40, 157, 141, 23);
		contentPane.add(cq);
		
		JButton sll = new JButton("SINGLE LINKED LIST");
		sll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE SINGLE LINKED LIST WINDOW OPENING CODE HERE
				new SinglyLinkedList().setVisible(true);
			}
		});
		sll.setForeground(new Color(0, 128, 255));
		sll.setFont(new Font("Constantia", Font.BOLD, 12));
		sll.setBounds(273, 155, 153, 23);
		contentPane.add(sll);
		
		JButton dll = new JButton("DOUBLE LINKED LIST");
		dll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE DOUBLE LINKED LIST WINDOW OPENING CODE HERE
				new DoublyLinkedList().setVisible(true);
			}
		});
		dll.setForeground(new Color(0, 128, 255));
		dll.setFont(new Font("Constantia", Font.BOLD, 12));
		dll.setBounds(173, 198, 159, 23);
		contentPane.add(dll);
	}
}
