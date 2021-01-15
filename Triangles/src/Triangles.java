/*
 * Homework 04
 * Written by Hadley Blalock
 * 04.03.2020
 * CSCE 146 
 * Section 007
 */

import java.awt.*;
import javax.swing.*;

public class Triangles extends Canvas {

	public static final int SIZE = 500;
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Triangles");
		frame.setSize(SIZE, SIZE);
		
		Triangles t = new Triangles();
		frame.add(t);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // closes methods when window closes
		frame.setVisible(true); // displays window
	}
	
	public void paint(Graphics g)
	{
		// initializes the first triangle's info and draws it
		int height = (int) Math.round(SIZE * Math.sqrt(3.0) / 2.0);
        Point p1 = new Point(0, height);
        Point p2 = new Point(SIZE / 2, 0);
        Point p3 = new Point(SIZE, height);
        drawTriangles(6, g, p1, p2, p3);
	}
	
	public static void drawTriangles(int depth, Graphics g, Point p1, Point p2, Point p3) 
	{
		if (depth == 1) // default triangle 
		{
			Polygon p = new Polygon();
			p.addPoint(p1.x, p1.y);
			p.addPoint(p2.x, p2.y);
			p.addPoint(p3.x, p3.y);
			g.fillPolygon(p);
		} 
		else 
		{
			// splits into three triangles
			Point p4 = midpoint(p1, p2);
			Point p5 = midpoint(p2, p3);
			Point p6 = midpoint(p1, p3);

			// recursive for each triangle
			drawTriangles(depth - 1, g, p1, p4, p6);
			drawTriangles(depth - 1, g, p4, p2, p5);
			drawTriangles(depth - 1, g, p6, p5, p3);
		}
		
	}
	
	public static Point midpoint(Point p1, Point p2)
	{
		// calculates midpoint
		return new Point((p1.x + p2.x) / 2, (p1.y + p2.y) / 2); 
	}
}
