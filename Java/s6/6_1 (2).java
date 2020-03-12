import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class s6_1 extends JFrame implements ActionListener
{

JLabel l1,l2,l4,l6;
JTextField tf,l7,l3,l5;
JButton b;

public s6_1()
{
super("slip 6th ");
setLayout(null);

tf = new JTextField(20);
l1 = new JLabel("Decimal Number"); 
l2 = new JLabel("Binary Number"); 

l3 = new JTextField(20); 
l3.setEditable(false);

l4 = new JLabel("Octal Number");

l5 = new JTextField(20);
l5.setEditable(false);

l6 = new JLabel("Hexadecimal Number");

l7 = new JTextField(20);
l7.setEditable(false);

b = new JButton("CALCULATE");


tf.setBounds(250,20,200,30);
l1.setBounds(30,20,200,30);
l2.setBounds(30,60,200,30);
l3.setBounds(250,60,200,30); 
l4.setBounds(30,100,200,30);
l5.setBounds(250,100,200,30);
l6.setBounds(30,140,200,30);
l7.setBounds(250,140,200,30);
b.setBounds(130,180,200,30); 							


add(l1);
add(tf);
add(l2);
add(l3);
add(l4);
add(l5);
add(l6);
add(l7);

add(b);
b.addActionListener(this);

setVisible(true);
setDefaultCloseOperation(EXIT_ON_CLOSE);
setSize(500,300);

}


public void actionPerformed(ActionEvent ae)
{

	if(ae.getSource()==b)
	{
       l3.setText(Integer.toBinaryString(Integer.parseInt(tf.getText())));
	   l5.setText(Integer.toOctalString(Integer.parseInt(tf.getText())));
	   l7.setText(Integer.toHexString(Integer.parseInt(tf.getText())));

	}

}

public static void main(String args[]) 
{
new s6_1();
}


} 