package bg.softuni.java.homework.syntax;

import java.util.Scanner;

public class Points_Inside_Figure {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		float x = scan.nextFloat();
		float y = scan.nextFloat();
		if ((x >= 12.5 && x <= 22.5 && y >= 6 && y <= 8.5) ||
				(x >= 20 && x <= 22.5 && y >= 8.5 && y <= 13.5) ||
				(x >= 12.5 && x <= 17.5 && y >= 8.5 && y <= 13.5)) {
		System.out.println("Inside");
		} 
		else
		System.out.println("Outside");
	}

}
