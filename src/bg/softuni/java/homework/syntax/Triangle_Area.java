package bg.softuni.java.homework.syntax;

import java.awt.Point;
import java.util.Scanner;

public class Triangle_Area {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		Point firstPoint = new Point(scan.nextInt(), scan.nextInt());
		Point secondPoint = new Point(scan.nextInt(), scan.nextInt());
		Point thirdPoint = new Point(scan.nextInt(), scan.nextInt());

		if(isTriangle(firstPoint, secondPoint, thirdPoint)){
			int area = Math.abs((firstPoint.x * (secondPoint.y - thirdPoint.y) + secondPoint.x * (thirdPoint.y - firstPoint.y) + thirdPoint.x * (firstPoint.y - secondPoint.y)) / 2);
			System.out.println(area);
		}
		else System.out.println(false);
	}

	public static boolean isTriangle(Point a, Point b, Point c) {
		int distAB = (int) a.distance(b);
		int distBC = (int) b.distance(c);
		int distAC = (int) a.distance(c);
		
		if (distAB + distAC > distBC &&
				distAC + distBC > distAB &&
				distAB + distBC > distAC) {
			return true;
		}
		else
		return false;
	}
}
