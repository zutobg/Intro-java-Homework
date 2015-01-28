package bg.softuni.java.homework.syntax;

import java.util.Scanner;

public class Formattin_Numbers {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int firstNumb = scan.nextInt();
		float secondNumb = scan.nextFloat();
		float thirdNumb = scan.nextFloat();
		System.out.println("|" + String.format("%1$-10s", Integer.toHexString(firstNumb).toUpperCase()) +
				"|" + String.format("%1$10s", Integer.toBinaryString(firstNumb)).replace(' ', '0') +
				"|" + String.format("%1$10s", String.format("%.2f", secondNumb)) +
				"|" + String.format("%1$-10s", String.format("%.3f", thirdNumb)) + "|");

	}

}
