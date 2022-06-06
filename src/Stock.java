import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.UIManager;

public class Stock {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextArea textArea_3;
	ArrayList<String> p;
	ArrayList<Integer> q;
	ArrayList<Integer> a;
	String dis="";  //for gettting a data to calculating a billing process
	int options=1,x=0; 
	private JTextField disp;
	
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stock window = new Stock();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Stock() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * 
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 909, 586);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		p = new ArrayList<String>();
		p.add("DAIRYMILK");
		p.add("HATSUNMILK");
		p.add("CORNATTO");
		p.add("BINGO");
		p.add("HIMALAYAOIL");
		q= new ArrayList<Integer>();
		q.add(100);
		q.add(200);
		q.add(100);
		q.add(50);
		q.add(20);
		a = new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(05);
		a.add(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(169, 169, 169));
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_2.setBounds(234, 0, 659, 547);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Enter the Product Name ");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_5.setBounds(36, 93, 236, 39);
		panel_2.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Enter the Quantity ");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_6.setBounds(36, 208, 236, 39);
		panel_2.add(lblNewLabel_6);
		
    	JLabel lblNewLabel_7 = new JLabel("Enter the Amount");
    	lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 20));
    	lblNewLabel_7.setBounds(36, 326, 236, 39);
    	panel_2.add(lblNewLabel_7);
    	
    	textField_1 = new JTextField();
    	textField_1.setBackground(new Color(255, 248, 220));
    	textField_1.setBounds(305, 220, 210, 20);
    	panel_2.add(textField_1);
    	textField_1.setColumns(10);
    	
    	textField_2 = new JTextField();
    	textField_2.setBackground(new Color(255, 248, 220));
    	textField_2.setBounds(305, 338, 210, 20);
    	panel_2.add(textField_2);
    	textField_2.setColumns(10);
    	
    	JButton btnNewButton = new JButton("Submit");
    	btnNewButton.setBackground(new Color(0, 0, 0));
    	btnNewButton.addMouseListener(new MouseAdapter() {
    		@Override
    		
    		public void mouseClicked(MouseEvent arg0) {
    			disp.setText("PRODUCT ADDED");
    			int flag=0;
    			if(options==1) {
    				for(int i=0;i<p.size();i++) {
    					if(textField.getText().toUpperCase().equals(p.get(i))) { 
    						q.set(i,q.get(i)+(Integer.parseInt(textField_1.getText())));
    						flag=1;
    					}	
    				}	
    				//System.out.println(textField.getText());
    				if(flag==0) {
    				p.add(textField.getText().toUpperCase());
        			q.add(Integer.parseInt(textField_1.getText()));
        			a.add(Integer.parseInt(textField_2.getText()));
    				}
    			}
    			else if(options==2) {
    				/*if(textField.getText()=="chocolate") {
    					q.set(1,textField.getText());
    				}
    				else if(textField.getText()=="milk") {
    					q.set(2,textField.getText());
    				}
    				else if(textField.getText()=="ice") {
    					q.set(3,textField.getText());
    				}
    				else if(textField.getText()=="chips") {
    					q.set(4,textField.getText());
    				}*/
    				
    			disp.setText("PRODUCT REMOVED");	
    			int a1=p.indexOf(textField.getText().toUpperCase());
    				if(a1 != -1) {
    					p.remove(a1);
    					//System.out.println(a1);
   						q.remove(a1);
   						a.remove(a1);
    				}
    				
    			}
    		}
    	});
    	
    	btnNewButton.setBounds(426, 412, 89, 23);
    	panel_2.add(btnNewButton);
    	
    	disp = new JTextField();
    	disp.setForeground(Color.RED);
    	disp.setBackground(new Color(224, 255, 255));
    	disp.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
    	disp.setBounds(38, 413, 172, 20);
    	panel_2.add(disp);
    	disp.setColumns(10);
    	
   
    	
    	textField = new JTextField();
    	textField.setBackground(new Color(255, 248, 220));
    	textField.setBounds(305, 105, 210, 20);
    	panel_2.add(textField);
    	textField.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(169, 169, 169));
		panel_3.setBounds(234, 0, 659, 547);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_11 = new JLabel("PRODUCT");
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_11.setBounds(41, 64, 134, 24);
		panel_3.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("QUANTITY");
		lblNewLabel_12.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_12.setBounds(254, 64, 140, 24);
		panel_3.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("AMOUNT");
		lblNewLabel_13.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_13.setBounds(497, 64, 113, 24);
		panel_3.add(lblNewLabel_13);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textArea.setBackground(new Color(224, 255, 255));
		textArea.setBounds(10, 99, 176, 377);
		panel_3.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textArea_1.setBackground(new Color(224, 255, 255));
		textArea_1.setBounds(236, 99, 176, 377);
		panel_3.add(textArea_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textArea_2.setBackground(new Color(224, 255, 255));
		textArea_2.setBounds(462, 99, 176, 377);
		panel_3.add(textArea_2);
		panel_3.setVisible(false);		
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(169, 169, 169));
		panel_4.setBounds(234, 0, 659, 547);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		panel_4.setVisible(false);
		
		JLabel lblNewLabel_8 = new JLabel("Enter the Product Name");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_8.setBounds(35, 129, 222, 20);
		panel_4.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Enter the Quantity");
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_9.setBounds(35, 209, 222, 17);
		panel_4.add(lblNewLabel_9);
		
		textField_3 = new JTextField();
		textField_3.setBackground(new Color(255, 248, 220));
		textField_3.setBounds(295, 129, 154, 20);
		panel_4.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBackground(new Color(255, 248, 220));
		textField_4.setBounds(295, 210, 154, 20);
		panel_4.add(textField_4);
		textField_4.setColumns(10);
		
		JButton Button_1 = new JButton("add");
		Button_1.setBackground(new Color(0, 0, 0));
		Button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				for(int i=0;i<p.size();i++) {
					if(textField_3.getText().toUpperCase().contentEquals(p.get(i))) { 
						x=Integer.parseInt(textField_4.getText())*a.get(i)+x;
						q.set(i,q.get(i)-(Integer.parseInt(textField_4.getText())));
						dis=dis+textField_3.getText().toUpperCase()+"-"+textField_4.getText()+"*"+a.get(i)+"="+Integer.parseInt(textField_4.getText())*a.get(i)+"\n";
						textArea_3.setText(dis);
					}
				}
			}
		});
		
		Button_1.setBounds(168, 295, 89, 23);
		panel_4.add(Button_1);
		
		JButton Button_2 = new JButton("bill");
		Button_2.setBackground(new Color(0, 0, 0));
		Button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				textField_5.setText(String.valueOf(x));
			}
		});
		
		Button_2.setBounds(360, 295, 89, 23);
		panel_4.add(Button_2);
		
		JLabel lblNewLabel_10 = new JLabel("Your Bill Is");
		lblNewLabel_10.setBackground(Color.YELLOW);
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_10.setBounds(35, 391, 222, 14);
		panel_4.add(lblNewLabel_10);
		
		textField_5 = new JTextField();
		textField_5.setBackground(new Color(224, 255, 255));
		textField_5.setBounds(151, 391, 86, 20);
		panel_4.add(textField_5);
		textField_5.setColumns(10);
		
		textArea_3 = new JTextArea();
		textArea_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textArea_3.setBackground(new Color(255, 248, 220));
		textArea_3.setBounds(335, 366, 222, 154);
		panel_4.add(textArea_3);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 236, 670);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1_1_3 = new JPanel();
		panel_1_1_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				options=5;
				System.exit(0);			}
		});
		
		JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				options=4;
				panel_2.setVisible(false);
				panel_3.setVisible(false);
				panel_4.setVisible(true);
				textField_3.getText();
				textField_4.getText();
			}
		});
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				options=3;
				panel_2.setVisible(false);
				panel_3.setVisible(true);
				panel_4.setVisible(false);
				textArea.setText("");
				textArea_1.setText("");
				textArea_2.setText("");
				for(int i=0;i<p.size();i++) {
					textArea.setText(textArea.getText()+"\n"+p.get(i).toUpperCase());
					textArea_1.setText(textArea_1.getText()+"\n"+q.get(i));
					textArea_2.setText(textArea_2.getText()+"\n"+a.get(i));
				}
			}
		});
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				options=2;
				panel_2.setVisible(true);
				panel_3.setVisible(false);
				panel_4.setVisible(false);
				lblNewLabel_6.setVisible(false);
				textField_1.setVisible(false);
				lblNewLabel_7.setVisible(false);
				textField_2.setVisible(false);
			}
		});
		
		JPanel panel_1 = new JPanel();
		panel_1.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				options=1;
				panel_2.setVisible(true);
				panel_3.setVisible(false);
				panel_4.setVisible(false);
				lblNewLabel_6.setVisible(true);
				textField_1.setVisible(true);
				lblNewLabel_7.setVisible(true);
				textField_2.setVisible(true);
			}
		});
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel_1.setBackground(new Color(192, 192, 192));
		panel_1.setBounds(0, 0, 236, 111);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("UPDATE");
		lblNewLabel.setFont(new Font("Courier New", Font.BOLD, 30));
		lblNewLabel.setBounds(64, 38, 118, 43);
		panel_1.add(lblNewLabel);
		panel_1_1.setBackground(new Color(192, 192, 192));
		panel_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel_1_1.setBounds(0, 110, 236, 111);
		panel.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("REMOVE");
		lblNewLabel_1.setFont(new Font("Courier New", Font.BOLD, 30));
		lblNewLabel_1.setBounds(62, 28, 115, 53);
		panel_1_1.add(lblNewLabel_1);
		panel_1_1_1.setBackground(new Color(192, 192, 192));
		panel_1_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel_1_1_1.setBounds(0, 220, 236, 111);
		panel.add(panel_1_1_1);
		panel_1_1_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("DISPLAY");
		lblNewLabel_2.setFont(new Font("Courier New", Font.BOLD, 30));
		lblNewLabel_2.setBounds(53, 24, 131, 62);
		panel_1_1_1.add(lblNewLabel_2);
		panel_1_1_2.setBackground(new Color(192, 192, 192));
		panel_1_1_2.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel_1_1_2.setBounds(0, 331, 236, 111);
		panel.add(panel_1_1_2);
		panel_1_1_2.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("BILL");
		lblNewLabel_3.setFont(new Font("Courier New", Font.BOLD, 30));
		lblNewLabel_3.setBounds(83, 24, 72, 64);
		panel_1_1_2.add(lblNewLabel_3);
		panel_1_1_3.setBackground(new Color(192, 192, 192));
		panel_1_1_3.setForeground(new Color(255, 255, 255));
		panel_1_1_3.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel_1_1_3.setBounds(0, 442, 236, 111);
		panel.add(panel_1_1_3);
		panel_1_1_3.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("EXIT");
		lblNewLabel_4.setFont(new Font("Courier New", Font.BOLD, 30));
		lblNewLabel_4.setBounds(83, 25, 77, 57);
		panel_1_1_3.add(lblNewLabel_4);
		
		
	}
}