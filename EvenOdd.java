package twenty_eight_of_sep;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		int number;
		Scanner input = new Scanner(System.in);
		System.out.println("input number : ");
		number = input.nextInt();
		if(number % 2 ==0) {
			System.out.println("even number.");
		} else {
			System.out.println("odd number.");
		}
		input.close();
		System.out.println("done!");
	}

}