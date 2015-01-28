package bg.softuni.java.homework.syntax;

import java.util.Scanner;

public class Decimal_to_Hex {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int decimal = scan.nextInt();
		String hex = Integer.toHexString(decimal);
		System.out.println(hex.toUpperCase());

	}

}
