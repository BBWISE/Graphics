import javax.swing.*;

import Graphics.Main;

import java.awt.*; import java.awt.event.*; import java.util.*; import java.io.*;
public class Text extends JFrame {


		JTextArea text = new JTextArea(30,50);
		JButton open = new JButton("Open");
		public static String fileText;
		public void frame() {setLayout(new FlowLayout(FlowLayout.LEFT));
			JPanel panel = new JPanel();
			
			panel.add(open);
			panel.add(text);
			
		}
		
		public void TheOpener() throws Exception{
			JFileChooser chooser = new JFileChooser();
			if (chooser.showOpenDialog(null)==JFileChooser.APPROVE_OPTION) {
				
				File file = chooser.getSelectedFile();
				Scanner scan = new Scanner(file);
				int i =1;
				while (i>=1 && scan.hasNext()) {
					
					fileText =scan.nextLine();	
					
					System.out.println(fileText);
			}}}
		public static void main(String[] args) {
			Text frame1 = new Text();
			
			
			frame1.frame();
			frame1.setTitle("BB_WISE text_editor: ");
			frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame1.setSize(576,615);
			frame1.setLocationRelativeTo(null);
			frame1.setResizable(false);
			frame1.setVisible(true);
	}}

