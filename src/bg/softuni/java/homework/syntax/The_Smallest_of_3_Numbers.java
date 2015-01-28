package bg.softuni.java.homework.syntax;

import java.util.Scanner;

public class The_Smallest_of_3_Numbers {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		float a = scan.nextFloat();
		float b = scan.nextFloat();
		float c = scan.nextFloat();

		System.out.println(smallestNumber(a, b, c));
	}

	public static float smallestNumber(float a, float b, float c){
		float smallest;
		float temp = a;
		if (temp > b) {
			smallest = b;
		}
		else smallest = a;
		if (smallest > c) {
			smallest = c;
		}
		return smallest;
	}
}
