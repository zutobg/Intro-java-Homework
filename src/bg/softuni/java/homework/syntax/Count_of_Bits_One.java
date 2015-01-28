package bg.softuni.java.homework.syntax;

import java.util.Scanner;

public class Count_of_Bits_One {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int mask;
		int count = 0;

		String binary = String.format("%16s",Integer.toBinaryString(number)).replace(' ', '0');
		for (int i = 0; i < binary.length(); i++) {
			mask = 1 << i;
			if ((mask & number) == mask) {
			count++;
			}
			}
			System.out.println(count);
	}

}
