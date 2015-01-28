package bg.softuni;

import java.util.Scanner;

public class SortArrayOfStrings {
public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	short n = sc.nextShort();
	String[] town = new String[n];
	String temp;
	
	sc.nextLine(); // nextShort didn't register \n after the number
	for (int i = 0; i < n; i++) {
		town[i] = sc.nextLine();
	}
	
	for (int i = 0; i < n; i++) {
		for (int j = i + 1; j < n; j++) {
			if (town[i].compareToIgnoreCase(town[j]) > 0) {
				temp = town[i];
				town[i] = town[j];
				town[j] = temp;
			}
		}
		System.out.println(town[i]);
	}
}
}
