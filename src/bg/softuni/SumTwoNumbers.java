package bg.softuni;
import java.util.Scanner;


public class SumTwoNumbers {
public static void main(String[] args) {
	
	@SuppressWarnings("resource")
	Scanner scanInput = new Scanner(System.in);
	
	int a = scanInput.nextInt();
	int b = scanInput.nextInt();
	int sum = a + b;
	
	/*Q: How to display double/float data types w/out
		 numbers after decimal like 7 + 8 = 15.0? :)*/ 
	System.out.println(sum);
}
}
