package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		//background
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledSquare(0.5, 0.5, 1);

		//stem
		StdDraw.setPenColor(56, 32, 25);
		StdDraw.filledRectangle(0.5, 0.8, 0.05, 0.1 );

		//apple
		StdDraw.setPenColor(140, 0, 21);
		StdDraw.filledCircle(0.5, 0.5, 0.3);

		//eyes
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledEllipse(0.4, 0.55, 0.05, 0.03);
		StdDraw.filledEllipse(0.6, 0.55, 0.05, 0.03);

		//tongue
		StdDraw.setPenColor(224, 132, 138);
		StdDraw.filledEllipse(0.5, 0.4, 0.067, 0.1);
		StdDraw.setPenColor(140, 0, 21);
		StdDraw.filledRectangle(0.5, 0.48, 0.06, 0.038);

		//eye sparkle

		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledCircle(0.37, 0.56, 0.01);
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledCircle(0.59, 0.56, 0.01);

		




		
	}
}