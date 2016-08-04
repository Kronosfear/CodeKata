import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SquareOrNot
{
	static double calcDist(int x1, int y1, int x2, int y2)
	{
		double d;
		double dist;
		d = Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2);
		dist = Math.pow(d, 0.5);
		return dist;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		int x1, y1, x2, y2, x3, y3, x4, y4;
		double d1, d2, d3, d4;
		Scanner s = new Scanner(System.in);
		x1 = s.nextInt();
		y1 = s.nextInt();
		x2 = s.nextInt();
		y2 = s.nextInt();
		x3 = s.nextInt();
		y3 = s.nextInt();
		x4 = s.nextInt();
		y4 = s.nextInt();
		d1 = calcDist(x1, y1, x2, y2);
		d2 = calcDist(x2, y2, x3, y3);
		d3 = calcDist(x3, y3, x4, y4);
		d4 = calcDist(x4, y4, x1, y1);
		if((d1 == d2) && (d2 == d3) && (d3 == d4) && (d4 == d1))
			System.out.println("Square");
		else
			System.out.println("Not square");
		
	}
}