package Graphics;

import java.util.*; import java.io.*; import javax.swing.*; import java.awt.*; import java.awt.event.*;

public class Main extends JFrame{
	
	JButton save = new JButton("Save");
	JButton open = new JButton("Open");
	JButton cancle= new JButton("Exit");
	JTextArea text = new JTextArea(26,88);
	JTextField name= new JTextField("Untitled",25);
	JTextField format = new JTextField(".txt",5);
	
	public static String nameOfFile="Untittled",fileFormat, fileText;
	
	public void fFrame() {
		
		Function listener = new Function();
		
		save.addActionListener(listener);
		
		save.setBorder(null);
		save.setToolTipText("Click on the button to save all your works");
		open.addActionListener(listener);
		open.setBorderPainted(false);
		open.setOpaque(false);
		open.setToolTipText("Click on the button to open your recent works");
		cancle.addActionListener(listener);
		cancle.setBorderPainted(false);
		cancle.setToolTipText("Click to exit this page");
		name.setToolTipText("Enter the name of your file here");
		format.setToolTipText("The file type will be written here such as \".txt\", \".doc\", etc.");
		text.setFont(new Font("Calibril",Font.PLAIN ,14));
		text.setMargin(new Insets(3,6,3,3));
	
		setLayout(new FlowLayout(FlowLayout.LEFT,1,1));
		
			JPanel fPanel = new JPanel();
			JPanel sPanel = new JPanel();
			sPanel.setLayout(new GridLayout(1,0));
			fPanel.setLayout(new FlowLayout());
			sPanel.add(save);
			sPanel.add(open);
			sPanel.add(cancle);
			fPanel.add(sPanel);
			fPanel.add(name);
			fPanel.add(format);
			
			ButtonGroup bg = new ButtonGroup();
			bg.add(open);
			bg.add(save);
			bg.add(cancle);
			
			JLabel label = new JLabel("This is a text editor available for you to write and read your text files.");
			label.setFont(new Font("Calibril",Font.BOLD,16));
			label.setForeground(Color.blue);
			JScrollPane jsp = new JScrollPane(text);
			
			add(label);
			add(fPanel);
			add(jsp);
		}
//
	public void TheSaver() throws Exception{
		File file = new File("C:\\Users\\B.BLESSING\\Desktop\\MyWork\\"+nameOfFile+fileFormat);
		
		PrintWriter fSend = new PrintWriter(file);
		if(file.exists()) {
		fSend.print(fileText); fSend.close();
		}
		JOptionPane.showMessageDialog(null,"The file  "+nameOfFile+fileFormat+"  successfully saved\n\nFile path:\n\tC:/Users/B.BLESSING/Desktop/MyWork/"+nameOfFile+fileFormat);
	}
	public void TheOpener(){
		JFileChooser chooser = new JFileChooser();
		chooser.showOpenDialog(null);
		File file = chooser.getSelectedFile();
		fileText = file.getAbsolutePath();
		
	}

//
	public static void main(String []args)  {
		
		Main frame1 = new Main();
		frame1.fFrame();
		frame1.setTitle("BB_WISE text_editor: ");
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setSize(1000,600);
		frame1.setLocationRelativeTo(null);
		frame1.setResizable(false);
		frame1.setVisible(true);
	}
	public class Function implements ActionListener {
		public void actionPerformed (ActionEvent event) {
			if (event.getSource()==save) {
				
				nameOfFile = String.format(name.getText());
				fileFormat = String.format(format.getText());
				fileText = String.format(text.getText());
				
				Main call = new Main();
				try {
					call.TheSaver();
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("Task Saved");
			}
			else if (event.getSource()==open) {
				System.out.println("Open button clicked");
				
				Main call = new Main();
				call.TheOpener();
				try {
					FileReader reader = new FileReader (fileText);
					BufferedReader buffered = new BufferedReader(reader);
					text.read(buffered, null);
					buffered.close();
				}
				catch(Exception e) {
					JOptionPane.showMessageDialog(null,e);
				}
				
			}
			else if(event.getSource()==cancle) {
				System.out.println("Exit button clicked");
				System.exit(0);
				
			}
			
		}
	}
	
}