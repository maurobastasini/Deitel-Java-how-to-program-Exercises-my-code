package GUI;

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawLines extends JPanel{

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		int width = getWidth();
		int height = getHeight();
		int stepWidth = width / 5;
		int stepHeight = height / 5;
		int x = width;
		int y = 0;
		while (x >= 0 || y <= height){
			x -= stepWidth;
			y += stepHeight;
			g.drawLine(0, 0, x, y);

		}
		x = 0;
		y = 0;
		while (x <= width || y <= height){
			x += stepWidth;
			y += stepHeight;
			g.drawLine(0, height, x, y);

		}
		
		x = 0;
		y = height;
		while (x <= width || y >= 0){
			x += stepWidth;
			y -= stepHeight;
			g.drawLine(width, height, x, y);

		}
		x = 0;
		y = 0;
		while (x <= width || y <= height){
			x += stepWidth;
			y += stepHeight;
			g.drawLine(width, 0, x, y);

		}
			
		
		
		
	}
		
		
		
		
		

	
}
