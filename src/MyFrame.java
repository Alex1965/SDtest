
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.text.JTextComponent;
import javax.xml.crypto.Data;


public class MyFrame extends JFrame {

	JTextComponent tc;
	String fileName;
	
	MyFrame() {
	 this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	 this.setLayout(null);
	 this.setBounds(0,0,464,312);
	 
	 tc = new JTextPane();
	 tc.setBounds(0,520,450,50);
	 tc.setPreferredSize(new Dimension(450,50));
	 
	 JScrollPane sp = new JScrollPane(tc);
	 
	 JMenuBar mb = new JMenuBar();
	 JMenu fm = new JMenu("File");
	 JMenuItem loadItem = new JMenuItem("Load file");
	   loadItem.addActionListener(e -> {tc.setText("loading"+"\n");
	   									SDprocess();});
	   fm.add(loadItem);
	   mb.add(fm);
	   
	 MyPanel p1 = new MyPanel();
	   p1.setBounds(0,0,450,200);
	   p1.setPreferredSize(new Dimension(450,200));
	   
	 JPanel p2 = new JPanel();
	   p2.setBounds(0,200,450,50);
	   p2.setPreferredSize(new Dimension(450,50));
	   p2.add(sp);
	   
	 this.setJMenuBar(mb);  
	 this.add(p1);
	 this.add(p2);
	 this.setResizable(false);
	 this.setVisible(true); 
	}
	
	
	public void SDprocess() {
	
		File fr = null;
		
		
		
		JFileChooser fc = new JFileChooser();
		int result = fc.showOpenDialog(this);
	   if (result == JFileChooser.APPROVE_OPTION) {
			
			fr = fc.getSelectedFile();
			fileName=fr.getName();					
			System.out.println(fileName);
		}	
		try {
			Scanner sc = new Scanner(fr);
				tc.setText(fileName +" loading\n");
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				
			// ...
			// rest of code to get the x and y data for drawing
			// lines using  drawLine(x1,y1,x2,y2) method. 
		    //
			// at this point I need to call this drawLine method but how ???
			// i just don't know how to call this method from this point and how to 
			// and update the graphics panel p1 after adding the data....
			}
		sc.close();
		} catch (IOException e) {
        e.printStackTrace();
      }
    }
	
}
