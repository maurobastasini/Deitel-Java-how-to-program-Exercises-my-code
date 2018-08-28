package GUI;

import javax.swing.JFrame;

public class DrawCurvedLinesTest {

	public static void main(String[] args) {
		DrawCurvedLines panel = new DrawCurvedLines();
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(250, 250);
		application.setVisible(true);

	}

}
