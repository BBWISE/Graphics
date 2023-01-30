package Graphics;

import java.util.*; import java.io.*; import javax.swing.*;

public class MyWork {
	public static String write,write2, nameOfSecFile,nameOfFstFile,printable;
	public static void main(String [] args) throws Exception{
		System.out.print("Please enter the name of the first and second file to be saved: ");Scanner Work = new Scanner(System.in); nameOfFstFile = Work.nextLine(); File fFile = new File("C:\\Users\\B.BLESSING\\Desktop\\MyWork\\"+nameOfFstFile+".txt"); File sFile = new File("C:\\Users\\B.BLESSING\\Desktop\\MyWork\\"+nameOfSecFile+".txt");
		System.out.println("\nEnter the your text here");Scanner take = new Scanner(System.in);write=take.nextLine();
		PrintWriter fSend = new PrintWriter(fFile);
		if(fFile.exists()) {
		fSend.print(write);System.out.println("File "+nameOfFstFile+" "+nameOfSecFile+" had been saved successfully."); fSend.close();
		System.out.print("Loading");for(int i = 0; i<=5; i++) {Thread.sleep(1000);System.out.print(".");}
		System.out.print("\n");
		JFileChooser selection = new JFileChooser();
		if (selection.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
			File file = selection.getSelectedFile();
		Scanner readThroughFile = new Scanner(file); 
		int i = 1;
		while( i>=1 && readThroughFile.hasNext())
		{
			
			write2 = readThroughFile.nextLine();i++;
		System.out.println(write2); 
		}
		readThroughFile.close();take.close();
		}
		}
		else {
			System.out.println("File does not exist");
			MyWork obj = new MyWork();
			obj.main(args);
		}
		
		
		
	}
}
