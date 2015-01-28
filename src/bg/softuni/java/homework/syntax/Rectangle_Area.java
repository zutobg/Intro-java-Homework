package bg.softuni.java.homework.syntax;

import java.util.Scanner;

public class Rectangle_Area {

	public static void main(String[] args) {
		System.out.println("The rectangle area is: " + rectArea());
	}
	
	public static int rectArea () {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		return (a * b);
	}

}
