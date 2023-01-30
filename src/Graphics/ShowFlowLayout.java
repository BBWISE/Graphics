package Graphics;

import javax.swing.*;
import java.awt.*;

public class ShowFlowLayout extends JFrame{

	public void secondFrame() {
		
		JPanel Panel1 = new JPanel();
		Panel1.setLayout(new GridLayout(4,3));
		for (int i=1; i<=9; i++)
		{
			Panel1.add(new JButton("" + i));
		}
		JButton Start = new JButton("Start");
		Start.setBackground(new Color(0,250,0));
		Start.setFont(new Font("Calibril", Font.BOLD, 16));
		Start.setToolTipText("This will start the process");
		Panel1.add(Start);
		Panel1.add(new JButton("0"));
		JButton Stop = new JButton("Stop");
		Stop.setFont(new Font("Calibril", Font.BOLD + Font.ITALIC, 16));
		Stop.setBackground(new Color(250,0,0));
		Stop.setToolTipText("This will stop the process");
		Panel1.add(Stop);
		
		JPanel Panel2 = new JPanel();
		Panel2.setLayout(new BorderLayout());
		Panel2.add(new JTextField("Time to be displayed here", 9), BorderLayout.NORTH);
		Panel2.add(Panel1, BorderLayout.CENTER);
		
		JLabel label1 = new JLabel("Food to be displayed here");
		label1.setForeground(Color.red);
		
		ImageIcon Image1 = new ImageIcon("C:/Users/B.BLESSING/Pictures/bbwise.png");
		
		JPanel Panel3 = new JPanel();
		
		Panel3.setLayout(new BorderLayout());
		//Panel3.setLayout(new FlowLayout(FlowLayout.LEFT,5,5));
		Panel3.add(label1, BorderLayout.NORTH);
		Panel3.add(new JLabel(Image1), BorderLayout.CENTER);
		
			
		
		add(Panel3, BorderLayout.WEST);
		add(Panel2, BorderLayout.CENTER);
				
	}
	
	public void MyFrame() {
		setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
		
		add(new JMenuItem("File"));
		add(new JMenuItem("Edit"));
		add(new JLabel("First Name:"));
		add(new JTextField(8));
		add(new JLabel("Please give a short note"));
		add(new JTextField("Enter it here",(20)));
		add(new JButton("OK"));
		add(new JCheckBox("Yes"));
		add(new JCheckBox("No"));
		
		
		
		JCheckBox ch1,ch2,ch3;
		JPanel p = new JPanel();
		p.add(ch1= new JCheckBox("ch1"));
		p.add(ch2= new JCheckBox("ch2"));
		p.add(ch3= new JCheckBox("ch3"));
		
		ButtonGroup g = new ButtonGroup();
		g.add(ch1);
		g.add(ch2);
		g.add(ch3);
		
		add(p);
		
		JRadioButton JSee, JSaw;
		JPanel radioButton = new JPanel();
		radioButton.add(JSee = new JRadioButton("See"));
		radioButton.add(JSaw = new JRadioButton("Saw"));
		
		ButtonGroup group = new ButtonGroup();
		group.add(JSee);
		group.add(JSaw);
		
		add(radioButton);
		
		List lst = new List(2);
		lst.addItem("Male");
		lst.addItem("Female");
		lst.addItem("Hamaphordite");
		lst.addItem("I don't know");
		lst.addItem("None");
		add(lst);
		add(new JTextArea("This is it here", 30,100));
			
	}
	
		public static void main(String [] args) {
						
		ShowFlowLayout frame = new ShowFlowLayout();
		frame.MyFrame();
		frame.setSize(1137, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("B.B. WISE New Work");
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		
		ShowFlowLayout frame2 = new ShowFlowLayout();
		frame2.secondFrame();
		frame2.setTitle("The Second Frame Work");
		frame2.setSize(510,250);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setLocationRelativeTo(null);
		frame2.setVisible(true);
		
	}
}