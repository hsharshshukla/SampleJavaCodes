package ASimulatorSystem;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
	JLabel L1,L2,L3; // 
	JTextField tf1;
	JPasswordField pf2;
	JButton b1,b2,b3;
	
	Login(){
		setFont(new Font("System",Font.BOLD,22));
		Font f = getFont();
		FontMetrics fm = getFontMetrics(f);
		int x = fm.stringWidth("AUTOMATED TELLER MACHINE");
		int y = fm.stringWidth(" ");
		int z = getWidth() - x;
		int w = z/y;
		String pad ="";
		pad = String.format("%"+w+"s",pad);
		setTitle(pad+"AUTOMATED TELLER MACHINE");
				
		L1 = new JLabel("WELCOME TO ATM");
		L1.setFont(new Font("Osward",Font.BOLD,38));
		
		L2 = new JLabel("Card No:");
		L2.setFont(new Font("Raleway",Font.BOLD,28));
		
		L3 = new JLabel("PIN:");
		L3.setFont(new Font("Raleway",Font.BOLD,28));
		
		tf1  = new JTextField(15);
		pf2  = new JPasswordField(15);
		
		b1 = new JButton("SIGN IN");
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		
		b2 = new JButton("CLEAR");
		b2.setBackground(Color.black);
		b2.setForeground(Color.white);
		
		b3 = new JButton("SIGN UP");
		b3.setBackground(Color.black);
		b3.setForeground(Color.white);
		
		//Set Layout and configure font,locatin,size of all items on layout
		setLayout(null);
		
		L1.setBounds(175,50,450,200);
		add(L1);
		
		L2.setBounds(125,125,375,200);
		add(L2);
		
		L3.setBounds(125,220,375,200);
		add(L3);
		
		tf1.setFont(new Font("Arial",Font.BOLD,14));
		tf1.setBounds(300,215,230,30);
		add(tf1);
		
		pf2.setFont(new Font("Arial",Font.BOLD,14));
		pf2.setBounds(300,310,230,30);
		add(pf2);
		
		b1.setFont(new Font("Arial",Font.BOLD,14));
		b1.setBounds(300,400,100,30);
		add(b1);
		
		b2.setFont(new Font("Arial",Font.BOLD,14));
		b2.setBounds(430,400,100,30);
		add(b2);
		
		b3.setFont(new  Font("Arial",Font.BOLD,14));
		b3.setBounds(365,450,100,30);
		add(b3);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		getContentPane().setBackground(Color.white);
		
		
		setSize(750,750);//Seting frame size
		setLocation(500,200);
		setVisible(true);

	}
	public void actionPerformed(ActionEvent ae) {
		try {
			conn c1 = new conn();
			String a = tf1.getText();
			String b = pf2.getText();
			String q = "Select * from login where cardno = ' "+ a+" ' and pin = ' "+ b + " ' ";
			
			ResultSet rs =c1.s.executeQuery(q);
			
			if(ae.getSource()==b1) {
				if(rs.next()) {// login found
					new Transactions().setVisible(true);//this is to open new Transcation frame 
					setVisible(false); //to close current frame
				}
				else {
					JOptionPane.showMessageDialog(null,"Incorrect Card Number or Password");
				}
			}
			else if (ae.getSource()==b2) {//Clear button
				tf1.setText("");
				pf2.setText("");
			}
			else if(ae.getSource()==b3) {
				new Signup().setVisible(true);
				setVisible(false);
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	  public static void main(String[] args){
	        new Login().setVisible(true);
	    }

}
