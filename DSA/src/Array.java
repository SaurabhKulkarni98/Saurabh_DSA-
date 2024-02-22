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

public class Array extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField deletepos;
	private JTextField insertposition;
	private JTextField displaybox;
	private int arr[];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
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
	public Array() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 853, 612);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ARRAY DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(0, 0, 64));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 14));
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setBounds(281, 11, 201, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER LENGTH OF ARRAY");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 12));
		lblNewLabel_1.setBounds(146, 56, 155, 64);
		contentPane.add(lblNewLabel_1);
		
		length = new JTextField();
		length.setBounds(348, 75, 225, 23);
		contentPane.add(length);
		length.setColumns(10);
		
		JButton create = new JButton("CREATE ARRAY");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for creating array
				int len =Integer.valueOf(length.getText());
				arr = new int[len];
				String message = "Array of length" +len+"Created";
				JOptionPane.showMessageDialog(contentPane, message);
				
			}
		});
		create.setForeground(new Color(255, 0, 0));
		create.setFont(new Font("Constantia", Font.BOLD, 12));
		create.setBounds(238, 120, 192, 23);
		contentPane.add(create);
		
		JLabel lblNewLabel_2 = new JLabel("INSERT AN INTEGER ELEMENT");
		lblNewLabel_2.setForeground(new Color(255, 255, 0));
		lblNewLabel_2.setBackground(new Color(255, 255, 0));
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_2.setBounds(166, 192, 210, 18);
		contentPane.add(lblNewLabel_2);
		
		element = new JTextField();
		element.setBounds(417, 189, 96, 20);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for insertion
				int elem=Integer.valueOf(element.getText());
				int pos=Integer.valueOf(insertposition.getText());
				arr[pos]=elem;
				String message="Element"+elem+"Inserted @ position"+pos;
				JOptionPane.showInternalMessageDialog(contentPane, message);
				element.setText("");
				insertposition.setText("");
			
				
			}
		});
		insert.setForeground(new Color(255, 128, 0));
		insert.setFont(new Font("Constantia", Font.BOLD, 14));
		insert.setBounds(746, 188, 83, 27);
		contentPane.add(insert);
		
		JLabel deleteposition = new JLabel("DELETE POSITION");
		deleteposition.setForeground(new Color(0, 255, 0));
		deleteposition.setFont(new Font("Constantia", Font.BOLD, 14));
		deleteposition.setBounds(226, 264, 126, 18);
		contentPane.add(deleteposition);
		
		deletepos = new JTextField();
		deletepos.setBounds(417, 261, 96, 20);
		contentPane.add(deletepos);
		deletepos.setColumns(10);
		
		insertposition = new JTextField();
		insertposition.setBounds(640, 189, 96, 20);
		contentPane.add(insertposition);
		insertposition.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("POSITION");
		lblNewLabel_3.setForeground(new Color(128, 64, 0));
		lblNewLabel_3.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_3.setBounds(542, 192, 69, 18);
		contentPane.add(lblNewLabel_3);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for deletion
				int pos = Integer.valueOf(deletepos.getText());
				arr[pos]=0;
				String message = "Element Deleted @ the position"+ pos;
				JOptionPane.showInternalMessageDialog(contentPane, message);
				deletepos.setText("");
				
			}
		});
		delete.setFont(new Font("Constantia", Font.BOLD, 14));
		delete.setForeground(new Color(128, 255, 255));
		delete.setBounds(556, 260, 87, 27);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for display
				String msg ="";
				for(int i=0;i<=arr.length-1;i++)
				{
					msg= msg+" "+arr[i];
				}
				displaybox.setText(msg);
			}
		});
		display.setForeground(new Color(255, 0, 0));
		display.setFont(new Font("Constantia", Font.BOLD, 14));
		display.setBounds(424, 359, 91, 27);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBackground(new Color(0, 255, 0));
		displaybox.setBounds(166, 432, 536, 20);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}
}
