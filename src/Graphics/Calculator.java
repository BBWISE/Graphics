package Graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Calculator extends JFrame {
	public double S, label1; String label2="+",number;
	JButton equalTo = new JButton("=");
	JTextField text = new JTextField(8);
	JButton plus = new JButton("+");
	JButton minus = new JButton("-");
	JLabel L1 = new JLabel("l1");
	JLabel L2 = new JLabel("l2");
	JButton division = new JButton("/");
	JButton mult=new JButton("*");
	JButton one=new JButton("1");
	JButton two=new JButton("2");
	JButton three=new JButton("3");
	JButton four=new JButton("4");
	JButton five=new JButton("5");
	JButton six=new JButton("6");
	JButton seven=new JButton("7");
	JButton eight=new JButton("8");
	JButton nine=new JButton("9");
	JButton zeroa=new JButton("0");
	JButton dota=new JButton(".");
	
	
	public void CalFrame() {
		
		fHandler handles = new fHandler();
		
		
		JPanel fPanel = new JPanel();
		fPanel.setLayout(new GridLayout(4,4));
		
		one.addActionListener(handles);
		fPanel.add(one);
		two.addActionListener(handles);
		fPanel.add(two);
		three.addActionListener(handles);
		fPanel.add(three);
		four.addActionListener(handles);
		fPanel.add(four);
		five.addActionListener(handles);
		fPanel.add(five);
		six.addActionListener(handles);
		fPanel.add(six);
		seven.addActionListener(handles);
		fPanel.add(seven);
		eight.addActionListener(handles);
		fPanel.add(eight);
		nine.addActionListener(handles);
		fPanel.add(nine);
		mult.addActionListener(handles);
		mult.setBackground(Color.red);
		mult.setForeground(Color.green);
		mult.setFont(new Font("Calibril", Font.BOLD,22));
		fPanel.add(mult);
		
		plus.addActionListener(handles);
		plus.setBackground(Color.red);
		plus.setForeground(Color.green);
		plus.setFont(new Font("Calibril", Font.BOLD,22));
		fPanel.add(plus);
		
		minus.addActionListener(handles);
		minus.setBackground(Color.red);
		minus.setForeground(Color.green);
		minus.setFont(new Font("Calibril", Font.BOLD,22));
		fPanel.add(minus);
		zeroa.addActionListener(handles);
		dota.addActionListener(handles);
		fPanel.add(zeroa);
		
		
		fPanel.add(dota);
		
		division.addActionListener(handles);
		division.setBackground(Color.red);
		division.setForeground(Color.green);
		division.setFont(new Font("Calibril", Font.BOLD,22));
		fPanel.add(division);
		
		equalTo.setToolTipText("This will sumup the values");
		equalTo.setBackground(Color.blue);
		equalTo.setFont(new Font("Calibril", Font.BOLD, 22));
		equalTo.addActionListener(handles);
		fPanel.add(equalTo);
		
		JPanel sPanel = new JPanel();
		sPanel.setLayout(new BorderLayout());
		sPanel.add(new JLabel("BB WISE CALCULATOR"), BorderLayout.NORTH);
		sPanel.add(L1);
		sPanel.add(L2);
		text.addActionListener(handles);
		text.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		sPanel.add(text, BorderLayout.CENTER);
		
		
		add(sPanel, BorderLayout.NORTH);
		add(fPanel, BorderLayout.CENTER);
		
	}
	
	public static void main(String [] args) {
		
		Calculator frame = new Calculator();
		frame.CalFrame();
		
		frame.setTitle("BBWISE");
		frame.setSize(230,280);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		frame.setVisible(true);
	}
	class fHandler implements ActionListener {
	 public void actionPerformed(ActionEvent event) {
		 if (event.getSource()== equalTo) {
			 
			 L2.setText(label2);
			 if (label2.contentEquals("+")) {
				 label1 += Double.parseDouble(text.getText());
			 }
			 else if(label2.contentEquals("-")) {
				 label1 -= Double.parseDouble(text.getText());
			 }
			 else if (label2.contentEquals("/")) {
				 label1 /= Double.parseDouble(text.getText());
			 }
			 else
			 {
				 label1 *= Double.parseDouble(text.getText());
			 }
			 
			 String m = Double.toString(label1);
			 text.setText(m);
			 label1=0;
			 System.out.println(label1+" "+label2);
			 label2 = "+";
			 
			 
			 double texta;
			 texta = Double.parseDouble(text.getText());
			 System.out.println("Equals button clicked at exactly ");
			 JOptionPane.showMessageDialog(null, "The answer is:  " + texta);
			 
		 }
		 else if (event.getSource() == text) {
			 double Text = Double.parseDouble(text.getText());
			 System.out.println("You press enter on TextField");
			 JOptionPane.showMessageDialog(null, "You just entered " +Text+ " in the TextField above");
			 
		 }
		 else if (event.getSource() == plus) {
			 
			 L2.setText(label2);
			 if (label2.contentEquals("+")) {
				 label1 += Double.parseDouble(text.getText());
				 
			 }
			 else if(label2.contentEquals("-")) {
				 label1 -= Double.parseDouble(text.getText());
				 
			 }
			 else if (label2.contentEquals("/")) {
				 label1 /= Double.parseDouble(text.getText());
				 
			 }
			 else
			 {
				 label1 *= Double.parseDouble(text.getText());
				 
			 }
			 
			 String m = Double.toString(label1);
			 text.setText(null);
			 System.out.println(label1+" "+label2);
			 label2 = String.format(plus.getText());
		 }
		 else if (event.getSource() == minus) {
			 
			 L2.setText(label2);
			 if (label2.contentEquals("+")) {
				 label1 += Double.parseDouble(text.getText());
			 }
			 else if(label2.contentEquals("-")) {
				 label1 -= Double.parseDouble(text.getText());
			 }
			 else if (label2.contentEquals("/")) {
				 label1 /= Double.parseDouble(text.getText());
			 }
			 else
			 {
				 label1 *= Double.parseDouble(text.getText());
			 }
			 
			 String m = Double.toString(label1);
			 text.setText(null);
			 System.out.println(label1+" "+label2);
			 label2 = String.format(minus.getText());
		 }
 else if (event.getSource() == mult) {
			 
			 L2.setText(label2);
			 if (label2.contentEquals("+")) {
				 label1 += Double.parseDouble(text.getText());
			 }
			 else if(label2.contentEquals("-")) {
				 label1 -= Double.parseDouble(text.getText());
			 }
			 else if (label2.contentEquals("/")) {
				 label1 /= Double.parseDouble(text.getText());
			 }
			 else
			 {
				 label1 *= Double.parseDouble(text.getText());
			 }
			 
			 String m = Double.toString(label1);
			 text.setText(null);
			 System.out.println(label1+" "+label2);
			 label2 = String.format(mult.getText());
		 }
 else if (event.getSource() == division) {
			 
			 L2.setText(label2);
			 if (label2.contentEquals("+")) {
				 label1 += Double.parseDouble(text.getText());
			 }
			 else if(label2.contentEquals("-")) {
				 label1 -= Double.parseDouble(text.getText());
			 }
			 else if (label2.contentEquals("/")) {
				 label1 /= Double.parseDouble(text.getText());
			 }
			 else
			 {
				 label1 *= Double.parseDouble(text.getText());
			 }
			 
			 String m = Double.toString(label1);
			 text.setText(null);
			 System.out.println(label1+" "+label2);
			 label2 = String.format(division.getText());
		 
 }
 else if (event.getSource() == one) {
	 number = String.format(one.getText());
	 text.setText(text.getText()+number);
	 
 }
 else if (event.getSource() == two) {
	 number = String.format(two.getText());
	 text.setText(text.getText()+number);
	 
 }
 else if (event.getSource() == three) {
	 number = String.format(three.getText());
	 text.setText(text.getText()+number);
	 
 }
 else if (event.getSource() == four) {
	 number = String.format(four.getText());
	 text.setText(text.getText()+number);
	 
 }
 else if (event.getSource() == five) {
	 number = String.format(five.getText());
	 text.setText(text.getText()+number);
	 
 }

 else if (event.getSource() == six) {
	 number = String.format(six.getText());
	 text.setText(text.getText()+number);
	 
 }
 else if (event.getSource() == seven) {
	 number = String.format(seven.getText());
	 text.setText(text.getText()+number);
	 
 }
 else if (event.getSource() == eight) {
	 number = String.format(eight.getText());
	 text.setText(text.getText()+number);
	 
 }
 else if (event.getSource() == nine) {
	 number = String.format(nine.getText());
	 
	 text.setText(text.getText()+number);
	 
 }
 else if (event.getSource() == zeroa) {
	 number = String.format(zeroa.getText());
	 
	 text.setText(text.getText()+number);
	 
 }
 else if (event.getSource() == dota) {
	 number = String.format(dota.getText());
	 
	 text.setText(text.getText()+number);
	 
 }
 
	 }
	}
}
