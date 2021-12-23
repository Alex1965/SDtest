import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class MyPanel extends JPanel {

	Graphics2D g2D;
	
	MyPanel() {
		this.setPreferredSize(new Dimension (450,200));
	}
    public void paint (Graphics g) {
		
		g2D = (Graphics2D) g;
		g2D.setStroke(new BasicStroke(1));
		g2D.setPaint(Color.blue);
		g2D.drawLine(5, 5, 445,5);
		g2D.drawLine(445, 5, 445,195);
		g2D.drawLine(445, 195, 5,195);
		g2D.drawLine(5, 195, 5,5);			
	}

	
}
