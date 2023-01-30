package Graphics;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;

import java.awt.*;
import java.awt.event.*;

public class CurrencyConverter extends JFrame {
	
	JTextField text = new JTextField(30);
	JComboBox fromCB = new JComboBox(new Object[]{"from","US Dollar","NIGERIA Naira","INDIA Rupee","ALGERIA Dinar","CAMEROON Franc","EGYPT Pound","LIBYA Dinar","SIERRA LEONE Leone","ZIMBABWE Dollar"});
	JComboBox toCB = new JComboBox(new Object[]{"to","US Dollar","NIGERIA Naira","INDIA Rupee","ALGERIA Dinar","CAMEROON Franc","EGYPT Pound","LIBYA Dinar","SIERRA LEONE Leone","ZIMBABWE Dollar"});
	JLabel answer = new JLabel("0.00");
	JButton convert = new JButton("Convert");
	
	JButton one = new JButton("1");
	JButton two = new JButton("2");
	JButton three = new JButton("3");
	JButton four = new JButton("4");
	JButton five = new JButton("5");
	JButton six = new JButton("6");
	JButton seven = new JButton("7");
	JButton eight = new JButton("8");
	JButton nine = new JButton("9");
	JButton zero = new JButton("0");
	JButton Clear = new JButton("CE");
	
	Handler listener = new Handler();
	
	public static String number;
	public static double answers;
	
	public void Frame() {
		setLayout(new GridLayout(2,1,3,0));
		
		convert.setBackground(Color.blue);
		convert.setForeground(Color.white);
		convert.setFont(new Font("Calibril",Font.BOLD,14));
		
		text.setFont(new Font("Calibril",Font.BOLD,14));
		
		Clear.setBackground(Color.red);
		Clear.setForeground(Color.white);
		Clear.setFont(new Font("Calibril",Font.BOLD,14));
		
		one.addActionListener(listener);
		two.addActionListener(listener);
		three.addActionListener(listener);
		four.addActionListener(listener);
		five.addActionListener(listener);
		six.addActionListener(listener);
		seven.addActionListener(listener);
		eight.addActionListener(listener);
		nine.addActionListener(listener);
		zero.addActionListener(listener);
		Clear.addActionListener(listener);
		convert.addActionListener(listener);
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(5,3));
		panel.add(new JLabel(""));
		panel.add(Clear);
		panel.add(new JLabel(""));
		panel.add(one);
		panel.add(two);
		panel.add(three);
		panel.add(four);
		panel.add(five);
		panel.add(six);
		panel.add(seven);
		panel.add(eight);
		panel.add(nine);
		panel.add(new JLabel(""));
		panel.add(zero);
		panel.add(new JLabel(""));
		JTextArea Gloria = new JTextArea("\tADEMU GLORIA ELEOJO\n\t        CSC/2017/1018");
		Gloria.setEditable(false);
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(7,1,0,3));
		panel2.add(new JLabel("Enter the amount to be converted"));
		panel2.add(text);
		panel2.add(fromCB);
		panel2.add(toCB);
		panel2.add(answer);
		panel2.add(convert);
		panel2.add(Gloria);
		add(panel2);
		add(panel);
		
	}

	public static void main(String[] args) {
		CurrencyConverter display = new CurrencyConverter();
		display.Frame();
		display.setTitle("Currency Converter");
		display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		display.setSize(353,500);
		display.setLocationRelativeTo(null);
		display.setVisible(true);
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void NairaToDollar(){
		double dollar,rate=411.46;
		dollar = Double.parseDouble(number);
		
		answers = dollar/rate;
		
	}
	public void DollarToNaira(){
		double naira,rate=411.46;
		naira = Double.parseDouble(number);
		
		answers = naira*rate;
		
	}
	public void RupeeToDollar(){
		double dollar,rate=76.11;
		dollar = Double.parseDouble(number);
		
		answers = dollar/rate;
		
	}
	public void DollarToRupee(){
		double naira,rate=76.11;
		naira = Double.parseDouble(number);
		
		answers = naira*rate;
		
	}
	public void ADinarToDollar(){
		double dollar,rate=128.45;
		dollar = Double.parseDouble(number);
		
		answers = dollar/rate;
		
	}
	public void DollarToADinar(){
		double naira,rate=128.45;
		naira = Double.parseDouble(number);
		
		answers = naira*rate;
		
	}
	public void FrancToDollar(){
		double dollar,rate=583;
		dollar = Double.parseDouble(number);
		
		answers = dollar/rate;
		
	}
	public void DollarToFranc(){
		double naira,rate=583;
		naira = Double.parseDouble(number);
		
		answers = naira*rate;
		
	}
	public void PoundToDollar(){
		double dollar,rate=16.19;
		dollar = Double.parseDouble(number);
		
		answers = dollar/rate;
		
	}
	public void DollarToPound(){
		double naira,rate=16.19;
		naira = Double.parseDouble(number);
		
		answers = naira*rate;
		
	}
	public void LDinarToDollar(){
		double dollar,rate=1.40;
		dollar = Double.parseDouble(number);
		
		answers = dollar/rate;
		
	}
	public void DollarToLDinar(){
		double naira,rate=1.40;
		naira = Double.parseDouble(number);
		
		answers = naira*rate;
		
	}
	public void LeoneToDollar(){
		double dollar,rate=9750;
		dollar = Double.parseDouble(number);
		
		answers = dollar/rate;
		
	}
	public void DollarToLeone(){
		double naira,rate=9750;
		naira = Double.parseDouble(number);
		
		answers = naira*rate;
		
	}
	public void ZDollarToDollar(){
		double dollar,rate=361.900;
		dollar = Double.parseDouble(number);
		
		answers = dollar/rate;
		
	}
	public void DollarToZDollar(){
		double naira,rate=361.900;
		naira = Double.parseDouble(number);
		
		answers = naira*rate;
		
	}
	
	
	
	class Handler implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			
			 if (event.getSource() == one) {
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
			 else if (event.getSource() == zero) {
				 number = String.format(zero.getText());
				 
				 text.setText(text.getText()+number);
				 
			 }
			 else if (event.getSource() == Clear) {
				 text.setText("");
				 answer.setText("");
				 
			 }
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 else if(event.getSource()==convert) {
				 String f = fromCB.getSelectedItem().toString();
				 String t = toCB.getSelectedItem().toString();
	//DOLLAR			 
				 if(f.contentEquals("US Dollar") && t.contentEquals("NIGERIA Naira")) {
				 number = text.getText();
				 
				 CurrencyConverter convert =new CurrencyConverter();
				 convert.DollarToNaira();
				 String take = Double.toString(answers);
				 answer.setText("NGN "+take);
				 }
				 else if(f.contentEquals("US Dollar") && t.contentEquals("INDIA Rupee")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.DollarToRupee();
					 String take = Double.toString(answers);
					 answer.setText("INR "+take);
				 }
				 else if(f.contentEquals("US Dollar") && t.contentEquals("ALGERIA Dinar")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.DollarToADinar();
					 String take = Double.toString(answers);
					 answer.setText("DZD "+take);
				 }
				 else if(f.contentEquals("US Dollar") && t.contentEquals("CAMEROON Franc")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.DollarToFranc();
					 String take = Double.toString(answers);
					 answer.setText("XAF "+take);
				 }
				 else if(f.contentEquals("US Dollar") && t.contentEquals("EGYPT Pound")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.DollarToPound();
					 String take = Double.toString(answers);
					 answer.setText("EGP "+take);
				 }
				 else if(f.contentEquals("US Dollar") && t.contentEquals("LIBYA Dinar")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.DollarToLDinar();
					 String take = Double.toString(answers);
					 answer.setText("LYD "+take);
				 }
				 else if(f.contentEquals("US Dollar") && t.contentEquals("SIERRA LEONE Leone")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.DollarToLeone();
					 String take = Double.toString(answers);
					 answer.setText("SLL "+take);
				 }
				 else if(f.contentEquals("US Dollar") && t.contentEquals("ZIMBABWE Dollar")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.DollarToZDollar();
					 String take = Double.toString(answers);
					 answer.setText("ZWD "+take);
				 }	 
				 
	//NAIRA			
				 else if(f.contentEquals("NIGERIA Naira") && t.contentEquals("US Dollar")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.NairaToDollar();
					 String take = Double.toString(answers);
					 answer.setText("USD "+take);
				 }
				 else if(f.contentEquals("NIGERIA Naira") && t.contentEquals("INDIA Rupee")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.NairaToDollar();
					 String take = Double.toString(answers);
					 number = take;
					 CurrencyConverter converter = new CurrencyConverter();
					 converter.DollarToRupee();
					 take = Double.toString(answers);
					 answer.setText("INR "+take);
				 }
				 else if(f.contentEquals("NIGERIA Naira") && t.contentEquals("ALGERIA Dinar")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.NairaToDollar();
					 String take = Double.toString(answers);
					 number = take;
					 CurrencyConverter converter = new CurrencyConverter();
					 converter.DollarToADinar();
					 take = Double.toString(answers);
					 answer.setText("DZD "+take);
				 }
				 else if(f.contentEquals("NIGERIA Naira") && t.contentEquals("CAMEROON Franc")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.NairaToDollar();
					 String take = Double.toString(answers);
					 number = take;
					 CurrencyConverter converter = new CurrencyConverter();
					 converter.DollarToFranc();
					 take = Double.toString(answers);
					 answer.setText("XAF "+take);
				 }
				 else if(f.contentEquals("NIGERIA Naira") && t.contentEquals("EGYPT Pound")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.NairaToDollar();
					 String take = Double.toString(answers);
					 number = take;
					 CurrencyConverter converter = new CurrencyConverter();
					 converter.DollarToPound();
					 take = Double.toString(answers);
					 answer.setText("EGP "+take);
				 }
				 else if(f.contentEquals("NIGERIA Naira") && t.contentEquals("LIBYA Dinar")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.NairaToDollar();
					 String take = Double.toString(answers);
					 number = take;
					 CurrencyConverter converter = new CurrencyConverter();
					 converter.DollarToLDinar();
					 take = Double.toString(answers);
					 answer.setText("LYD "+take);
				 }
				 else if(f.contentEquals("NIGERIA Naira") && t.contentEquals("SIERRA LEONE Leone")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.NairaToDollar();
					 String take = Double.toString(answers);
					 number = take;
					 CurrencyConverter converter = new CurrencyConverter();
					 converter.DollarToLeone();
					 take = Double.toString(answers);
					 answer.setText("SLL "+take);
				 }
				 else if(f.contentEquals("NIGERIA Naira") && t.contentEquals("ZIMBABWE Dollar")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.NairaToDollar();
					 String take = Double.toString(answers);
					 number = take;
					 CurrencyConverter converter = new CurrencyConverter();
					 converter.DollarToZDollar();
					 take = Double.toString(answers);
					 answer.setText("ZWD "+take);
				 }
	//RUPEE
				 else if(f.contentEquals("INDIA Rupee") && t.contentEquals("US Dollar")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.RupeeToDollar();
					 String take = Double.toString(answers);
					 answer.setText("USD "+take);
				 }
				 else if(f.contentEquals("INDIA Rupee") && t.contentEquals("NIGERIA Naira")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.RupeeToDollar();
					 String take = Double.toString(answers);
					 number = take;
					 CurrencyConverter converter = new CurrencyConverter();
					 converter.DollarToNaira();
					 take = Double.toString(answers);
					 answer.setText("NGN "+take);
				 }
				 else if(f.contentEquals("INDIA Rupee") && t.contentEquals("ALGERIA Dinar")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.RupeeToDollar();
					 String take = Double.toString(answers);
					 number = take;
					 CurrencyConverter converter = new CurrencyConverter();
					 converter.DollarToADinar();
					 take = Double.toString(answers);
					 answer.setText("DZD "+take);
				 }
				 else if(f.contentEquals("INDIA Rupee") && t.contentEquals("CAMEROON Franc")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.RupeeToDollar();
					 String take = Double.toString(answers);
					 number = take;
					 CurrencyConverter converter = new CurrencyConverter();
					 converter.DollarToFranc();
					 take = Double.toString(answers);
					 answer.setText("XAF "+take);
				 }
				 else if(f.contentEquals("INDIA Rupee") && t.contentEquals("EGYPT Pound")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.RupeeToDollar();
					 String take = Double.toString(answers);
					 number = take;
					 CurrencyConverter converter = new CurrencyConverter();
					 converter.DollarToPound();
					 take = Double.toString(answers);
					 answer.setText("EGP "+take);
				 }
				 else if(f.contentEquals("INDIA Rupee") && t.contentEquals("LIBYA Dinar")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.RupeeToDollar();
					 String take = Double.toString(answers);
					 number = take;
					 CurrencyConverter converter = new CurrencyConverter();
					 converter.DollarToLDinar();
					 take = Double.toString(answers);
					 answer.setText("LYD "+take);
				 }
				 else if(f.contentEquals("INDIA Rupee") && t.contentEquals("SIERRA LEONE Leone")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.RupeeToDollar();
					 String take = Double.toString(answers);
					 number = take;
					 CurrencyConverter converter = new CurrencyConverter();
					 converter.DollarToLeone();
					 take = Double.toString(answers);
					 answer.setText("SLL "+take);
				 }
				 else if(f.contentEquals("INDIA Rupee") && t.contentEquals("ZIMBABWE Dollar")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.RupeeToDollar();
					 String take = Double.toString(answers);
					 number = take;
					 CurrencyConverter converter = new CurrencyConverter();
					 converter.DollarToZDollar();
					 take = Double.toString(answers);
					 answer.setText("ZWD "+take);
				 }
	//ADINAR
				 else if(f.contentEquals("ALGERIA Dinar") && t.contentEquals("US Dollar")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.ADinarToDollar();
					 String take = Double.toString(answers);
					 answer.setText("USD "+take);
				 }
				 else if(f.contentEquals("ALGERIA Dinar") && t.contentEquals("NIGERIA Naira")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.ADinarToDollar();
					 String take = Double.toString(answers);
					 number = take;
					 CurrencyConverter converter = new CurrencyConverter();
					 converter.DollarToNaira();
					 take = Double.toString(answers);
					 answer.setText("NGN "+take);
				 }
				 else if(f.contentEquals("ALGERIA Dinar") && t.contentEquals("INDIA Rupee")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.ADinarToDollar();
					 String take = Double.toString(answers);
					 number = take;
					 CurrencyConverter converter = new CurrencyConverter();
					 converter.DollarToRupee();
					 take = Double.toString(answers);
					 answer.setText("INR "+take);
				 }
				 else if(f.contentEquals("ALGERIA Dinar") && t.contentEquals("CAMEROON Franc")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.ADinarToDollar();
					 String take = Double.toString(answers);
					 number = take;
					 CurrencyConverter converter = new CurrencyConverter();
					 converter.DollarToFranc();
					 take = Double.toString(answers);
					 answer.setText("XAF "+take);
				 }
				 else if(f.contentEquals("ALGERIA Dinar") && t.contentEquals("EGYPT Pound")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.ADinarToDollar();
					 String take = Double.toString(answers);
					 number = take;
					 CurrencyConverter converter = new CurrencyConverter();
					 converter.DollarToPound();
					 take = Double.toString(answers);
					 answer.setText("EGP "+take);
				 }
				 else if(f.contentEquals("ALGERIA Dinar") && t.contentEquals("LIBYA Dinar")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.ADinarToDollar();
					 String take = Double.toString(answers);
					 number = take;
					 CurrencyConverter converter = new CurrencyConverter();
					 converter.DollarToLDinar();
					 take = Double.toString(answers);
					 answer.setText("LYD "+take);
				 }
				 else if(f.contentEquals("ALGERIA Dinar") && t.contentEquals("SIERRA LEONE Leone")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.ADinarToDollar();
					 String take = Double.toString(answers);
					 number = take;
					 CurrencyConverter converter = new CurrencyConverter();
					 converter.DollarToLeone();
					 take = Double.toString(answers);
					 answer.setText("SLL "+take);
				 }
				 else if(f.contentEquals("ALGERIA Dinar") && t.contentEquals("ZIMBABWE Dollar")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.ADinarToDollar();
					 String take = Double.toString(answers);
					 number = take;
					 CurrencyConverter converter = new CurrencyConverter();
					 converter.DollarToZDollar();
					 take = Double.toString(answers);
					 answer.setText("ZWD "+take);
				 }
	//Franc
				 else if(f.contentEquals("CAMEROON Franc") && t.contentEquals("US Dollar")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.FrancToDollar();
					 String take = Double.toString(answers);
					 answer.setText("USD "+take);
				 }
				 else if(f.contentEquals("CAMEROON Franc") && t.contentEquals("NIGERIA Naira")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.FrancToDollar();
					 String take = Double.toString(answers);
					 number = take;
					 CurrencyConverter converter = new CurrencyConverter();
					 converter.DollarToNaira();
					 take = Double.toString(answers);
					 answer.setText("NGN "+take);
				 }
				 else if(f.contentEquals("CAMEROON Franc") && t.contentEquals("INDIA Rupee")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.FrancToDollar();
					 String take = Double.toString(answers);
					 number = take;
					 CurrencyConverter converter = new CurrencyConverter();
					 converter.DollarToRupee();
					 take = Double.toString(answers);
					 answer.setText("INR "+take);
				 }
				 else if(f.contentEquals("CAMEROON Franc") && t.contentEquals("ALGERIA Dinar")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.FrancToDollar();
					 String take = Double.toString(answers);
					 number = take;
					 CurrencyConverter converter = new CurrencyConverter();
					 converter.DollarToADinar();
					 take = Double.toString(answers);
					 answer.setText("DZD "+take);
				 }
				 else if(f.contentEquals("CAMEROON Franc") && t.contentEquals("EGYPT Pound")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.FrancToDollar();
					 String take = Double.toString(answers);
					 number = take;
					 CurrencyConverter converter = new CurrencyConverter();
					 converter.DollarToPound();
					 take = Double.toString(answers);
					 answer.setText("EGP "+take);
				 }
				 else if(f.contentEquals("CAMEROON Franc") && t.contentEquals("LIBYA Dinar")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.FrancToDollar();
					 String take = Double.toString(answers);
					 number = take;
					 CurrencyConverter converter = new CurrencyConverter();
					 converter.DollarToLDinar();
					 take = Double.toString(answers);
					 answer.setText("LYD "+take);
				 }
				 else if(f.contentEquals("CAMEROON Franc") && t.contentEquals("SIERRA LEONE Leone")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.FrancToDollar();
					 String take = Double.toString(answers);
					 number = take;
					 CurrencyConverter converter = new CurrencyConverter();
					 converter.DollarToLeone();
					 take = Double.toString(answers);
					 answer.setText("SLL "+take);
				 }
				 else if(f.contentEquals("CAMEROON Franc") && t.contentEquals("ZIMBABWE Dollar")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.FrancToDollar();
					 String take = Double.toString(answers);
					 number = take;
					 CurrencyConverter converter = new CurrencyConverter();
					 converter.DollarToZDollar();
					 take = Double.toString(answers);
					 answer.setText("ZWD "+take);
				 }
	//Pound
				 else if(f.contentEquals("EGYPT Pound") && t.contentEquals("US Dollar")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.PoundToDollar();
					 String take = Double.toString(answers);
					 answer.setText("USD "+take);
				 }
				 else if(f.contentEquals("EGYPT Pound") && t.contentEquals("NIGERIA Naira")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.PoundToDollar();
					 String take = Double.toString(answers);
					 number = take;
					 CurrencyConverter converter = new CurrencyConverter();
					 converter.DollarToNaira();
					 take = Double.toString(answers);
					 answer.setText("NGN "+take);
				 }
				 else if(f.contentEquals("EGYPT Pound") && t.contentEquals("INDIA Rupee")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.PoundToDollar();
					 String take = Double.toString(answers);
					 number = take;
					 CurrencyConverter converter = new CurrencyConverter();
					 converter.DollarToRupee();
					 take = Double.toString(answers);
					 answer.setText("INR "+take);
				 }
				 else if(f.contentEquals("EGYPT Pound") && t.contentEquals("ALGERIA Dinar")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.PoundToDollar();
					 String take = Double.toString(answers);
					 number = take;
					 CurrencyConverter converter = new CurrencyConverter();
					 converter.DollarToADinar();
					 take = Double.toString(answers);
					 answer.setText("DZD "+take);
				 }
				 else if(f.contentEquals("EGYPT Pound") && t.contentEquals("CAMEROON Franc")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.PoundToDollar();
					 String take = Double.toString(answers);
					 number = take;
					 CurrencyConverter converter = new CurrencyConverter();
					 converter.DollarToFranc();
					 take = Double.toString(answers);
					 answer.setText("XAF "+take);
				 }
				 else if(f.contentEquals("EGYPT Pound") && t.contentEquals("LIBYA Dinar")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.PoundToDollar();
					 String take = Double.toString(answers);
					 number = take;
					 CurrencyConverter converter = new CurrencyConverter();
					 converter.DollarToLDinar();
					 take = Double.toString(answers);
					 answer.setText("LYD "+take);
				 }
				 else if(f.contentEquals("EGYPT Pound") && t.contentEquals("SIERRA LEONE Leone")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.PoundToDollar();
					 String take = Double.toString(answers);
					 number = take;
					 CurrencyConverter converter = new CurrencyConverter();
					 converter.DollarToLeone();
					 take = Double.toString(answers);
					 answer.setText("SLL "+take);
				 }
				 else if(f.contentEquals("EGYPT Pound") && t.contentEquals("ZIMBABWE Dollar")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.PoundToDollar();
					 String take = Double.toString(answers);
					 number = take;
					 CurrencyConverter converter = new CurrencyConverter();
					 converter.DollarToZDollar();
					 take = Double.toString(answers);
					 answer.setText("ZWD "+take);
				 }
	//LDinar
				 else if(f.contentEquals("LIBYA Dinar") && t.contentEquals("US Dollar")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.LDinarToDollar();
					 String take = Double.toString(answers);
					 answer.setText("USD "+take);
				 }
				 else if(f.contentEquals("LIBYA Dinar") && t.contentEquals("NIGERIA Naira")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.LDinarToDollar();
					 String take = Double.toString(answers);
					 number = take;
					 CurrencyConverter converter = new CurrencyConverter();
					 converter.DollarToNaira();
					 take = Double.toString(answers);
					 answer.setText("NGN "+take);
				 }
				 else if(f.contentEquals("LIBYA Dinar") && t.contentEquals("INDIA Rupee")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.LDinarToDollar();
					 String take = Double.toString(answers);
					 number = take;
					 CurrencyConverter converter = new CurrencyConverter();
					 converter.DollarToRupee();
					 take = Double.toString(answers);
					 answer.setText("INR "+take);
				 }
				 else if(f.contentEquals("LIBYA Dinar") && t.contentEquals("ALGERIA Dinar")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.LDinarToDollar();
					 String take = Double.toString(answers);
					 number = take;
					 CurrencyConverter converter = new CurrencyConverter();
					 converter.DollarToADinar();
					 take = Double.toString(answers);
					 answer.setText("DZD "+take);
				 }
				 else if(f.contentEquals("LIBYA Dinar") && t.contentEquals("CAMEROON Franc")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.LDinarToDollar();
					 String take = Double.toString(answers);
					 number = take;
					 CurrencyConverter converter = new CurrencyConverter();
					 converter.DollarToFranc();
					 take = Double.toString(answers);
					 answer.setText("XAF "+take);
				 }
				 else if(f.contentEquals("LIBYA Dinar") && t.contentEquals("EGYPT Pound")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.LDinarToDollar();
					 String take = Double.toString(answers);
					 number = take;
					 CurrencyConverter converter = new CurrencyConverter();
					 converter.DollarToPound();
					 take = Double.toString(answers);
					 answer.setText("EGP "+take);
				 }
				 else if(f.contentEquals("LIBYA Dinar") && t.contentEquals("SIERRA LEONE Leone")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.LDinarToDollar();
					 String take = Double.toString(answers);
					 number = take;
					 CurrencyConverter converter = new CurrencyConverter();
					 converter.DollarToLeone();
					 take = Double.toString(answers);
					 answer.setText("SLL "+take);
				 }
				 else if(f.contentEquals("LIBYA Dinar") && t.contentEquals("ZIMBABWE Dollar")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.LDinarToDollar();
					 String take = Double.toString(answers);
					 number = take;
					 CurrencyConverter converter = new CurrencyConverter();
					 converter.DollarToZDollar();
					 take = Double.toString(answers);
					 answer.setText("ZWD "+take);
				 }
	//Leone
				 else if(f.contentEquals("SIERRA LEONE Leone") && t.contentEquals("US Dollar")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.LeoneToDollar();
					 String take = Double.toString(answers);
					 answer.setText("USD "+take);
				 }
				 else if(f.contentEquals("SIERRA LEONE Leone") && t.contentEquals("NIGERIA Naira")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.LeoneToDollar();
					 String take = Double.toString(answers);
					 number = take;
					 CurrencyConverter converter = new CurrencyConverter();
					 converter.DollarToNaira();
					 take = Double.toString(answers);
					 answer.setText("NGN "+take);
				 }
				 else if(f.contentEquals("SIERRA LEONE Leone") && t.contentEquals("INDIA Rupee")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.LeoneToDollar();
					 String take = Double.toString(answers);
					 number = take;
					 CurrencyConverter converter = new CurrencyConverter();
					 converter.DollarToRupee();
					 take = Double.toString(answers);
					 answer.setText("INR "+take);
				 }
				 else if(f.contentEquals("SIERRA LEONE Leone") && t.contentEquals("ALGERIA Dinar")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.LeoneToDollar();
					 String take = Double.toString(answers);
					 number = take;
					 CurrencyConverter converter = new CurrencyConverter();
					 converter.DollarToADinar();
					 take = Double.toString(answers);
					 answer.setText("DZD "+take);
				 }
				 else if(f.contentEquals("SIERRA LEONE Leone") && t.contentEquals("CAMEROON Franc")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.LeoneToDollar();
					 String take = Double.toString(answers);
					 number = take;
					 CurrencyConverter converter = new CurrencyConverter();
					 converter.DollarToFranc();
					 take = Double.toString(answers);
					 answer.setText("XAF "+take);
				 }
				 else if(f.contentEquals("SIERRA LEONE Leone") && t.contentEquals("EGYPT Pound")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.LeoneToDollar();
					 String take = Double.toString(answers);
					 number = take;
					 CurrencyConverter converter = new CurrencyConverter();
					 converter.DollarToPound();
					 take = Double.toString(answers);
					 answer.setText("EGP "+take);
				 }
				 else if(f.contentEquals("SIERRA LEONE Leone") && t.contentEquals("LIBYA Dinar")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.LeoneToDollar();
					 String take = Double.toString(answers);
					 number = take;
					 CurrencyConverter converter = new CurrencyConverter();
					 converter.DollarToLDinar();
					 take = Double.toString(answers);
					 answer.setText("LYD "+take);
				 }
				 else if(f.contentEquals("SIERRA LEONE Leone") && t.contentEquals("ZIMBABWE Dollar")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.LeoneToDollar();
					 String take = Double.toString(answers);
					 number = take;
					 CurrencyConverter converter = new CurrencyConverter();
					 converter.DollarToZDollar();
					 take = Double.toString(answers);
					 answer.setText("ZWD "+take);
				 }
	//ZDollar
				 else if(f.contentEquals("ZIMBABWE Dollar") && t.contentEquals("US Dollar")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.ZDollarToDollar();
					 String take = Double.toString(answers);
					 answer.setText("USD "+take);
				 }
				 else if(f.contentEquals("ZIMBABWE Dollar") && t.contentEquals("NIGERIA Naira")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.ZDollarToDollar();
					 String take = Double.toString(answers);
					 number = take;
					 CurrencyConverter converter = new CurrencyConverter();
					 converter.DollarToNaira();
					 take = Double.toString(answers);
					 answer.setText("NGN "+take);
				 }
				 else if(f.contentEquals("ZIMBABWE Dollar") && t.contentEquals("INDIA Rupee")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.ZDollarToDollar();
					 String take = Double.toString(answers);
					 number = take;
					 CurrencyConverter converter = new CurrencyConverter();
					 converter.DollarToRupee();
					 take = Double.toString(answers);
					 answer.setText("INR "+take);
				 }
				 else if(f.contentEquals("ZIMBABWE Dollar") && t.contentEquals("ALGERIA Dinar")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.ZDollarToDollar();
					 String take = Double.toString(answers);
					 number = take;
					 CurrencyConverter converter = new CurrencyConverter();
					 converter.DollarToADinar();
					 take = Double.toString(answers);
					 answer.setText("DZD "+take);
				 }
				 else if(f.contentEquals("ZIMBABWE Dollar") && t.contentEquals("CAMEROON Franc")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.ZDollarToDollar();
					 String take = Double.toString(answers);
					 number = take;
					 CurrencyConverter converter = new CurrencyConverter();
					 converter.DollarToFranc();
					 take = Double.toString(answers);
					 answer.setText("XAF "+take);
				 }
				 else if(f.contentEquals("ZIMBABWE Dollar") && t.contentEquals("EGYPT Pound")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.ZDollarToDollar();
					 String take = Double.toString(answers);
					 number = take;
					 CurrencyConverter converter = new CurrencyConverter();
					 converter.DollarToPound();
					 take = Double.toString(answers);
					 answer.setText("EGP "+take);
				 }
				 else if(f.contentEquals("ZIMBABWE Dollar") && t.contentEquals("LIBYA Dinar")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.ZDollarToDollar();
					 String take = Double.toString(answers);
					 number = take;
					 CurrencyConverter converter = new CurrencyConverter();
					 converter.DollarToLDinar();
					 take = Double.toString(answers);
					 answer.setText("LYD "+take);
				 }
				 else if(f.contentEquals("ZIMBABWE Dollar") && t.contentEquals("SIERRA LEONE Leone")) {
					 number = text.getText();
					 
					 CurrencyConverter convert =new CurrencyConverter();
					 convert.ZDollarToDollar();
					 String take = Double.toString(answers);
					 number = take;
					 CurrencyConverter converter = new CurrencyConverter();
					 converter.DollarToLeone();
					 take = Double.toString(answers);
					 answer.setText("SLL "+take);
				 }
			 }
			 
		}
	}

}
