/*
 * 02.27.2020
 * In-Class Example
 */

import java.awt.*;
import java.util.*;
import javax.swing.*;

public class SierpenskiCarpet extends Canvas {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Sierpenski Carpet");
		frame.setSize(800, 800);
		
		SierpenskiCarpet sp = new SierpenskiCarpet();
		frame.add(sp);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // closes methods when window closes
		frame.setVisible(true); // displays window
	}
	
	public void paint(Graphics g)
	{
		drawGasket(0, 0, getSize().height, g);
	}
	
	public void drawGasket(int x, int y, int side, Graphics g)
	{
		int sub = side / 3;
		g.fillRect(x+sub, y+sub, sub, sub);
		
		if (sub >= 3)
		{
			// top
			drawGasket(x, y, sub, g); // left
			drawGasket(x+sub, y, sub, g); // middle
			drawGasket(x+sub*2, y, sub, g); // right			
			
			// middle
			drawGasket(x, y+sub, sub, g); // left
			drawGasket(x+sub*2, y+sub, sub, g); // right	
			
			// bottom
			drawGasket(x, y+sub*2, sub, g); // left
			drawGasket(x+sub, y+sub*2, sub, g); // middle
			drawGasket(x+sub*2, y+sub*2, sub, g); // right		
		}
	}
}
