package GUI;

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawCurvedLines extends JPanel {
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		int width = getWidth();
		int height = getHeight();
		int stepWidth = width / 25;
		int stepHeight = height / 25;
		int x = 0;
		int y = 0;	
		while (x <= width || y <= height){
			x += stepWidth;
			g.drawLine(0, y, x, height);
			y += stepHeight;

		}
					
		x = 0;
		y = 0;	
		while (x <= width || y <= height){
			x += stepWidth;
			g.drawLine(x, 0, width, y);
			y += stepHeight;

		}
		x = 0;
		y = height;	
		while (x <= width || y >= 0){
			x += stepWidth;
		
			g.drawLine(0, y, x, 0);
			y -= stepHeight;

		}
		x = 0;
		y = height;	
		while (x <= width || y >= 0){
			x += stepWidth;
			g.drawLine(x, height, width, y);
			y -= stepHeight;

		}
		
		
		
	}
	
}
