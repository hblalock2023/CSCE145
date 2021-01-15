/*
 * 10.30.2019
 * In-Class Example
 */

import java.awt.*;
import javax.swing.*;

public class ShapeFrontEnd extends JPanel {

	private Shape[] shapes;
	public ShapeFrontEnd()
	{
		// super();
		shapes = new Shape[3];
		shapes[0] = new SimpleShape(0, 0, Color.blue);
	}
	
	public static void main(String[] args) {
		// this is the window
		JFrame frame = new JFrame("Shape Drawer");
		frame.setSize(500, 500);
		ShapeFrontEnd fe = new ShapeFrontEnd();
		
		frame.add(fe);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}
	
	// this is called by frame
	public void paint(Graphics g)
	{
		super.paint(g);
		draw(shapes, g);
	}

	private void draw(Shape[] shapes, Graphics g)
	{
		// for each loop
		for (Shape s : shapes)
		{
			if (s = null)
			{
				continue;
			}
			int[][] points = s.getPoints();
			g.setColor(s.geteColor());
			g.fillPolygon(points[0], points[1], points[0].length);
		}
	}
}
