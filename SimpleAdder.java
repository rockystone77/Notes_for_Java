package twenty_eight_of_sep;

import java.util.Scanner;

public class SimpleAdder {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("input first number");
		int x = in.nextInt();
		System.out.println("input second number");
		int y = in.nextInt();
		
		if(x>y)
			System.out.println(x + "is bigger");
		else
			System.out.println(y + "is bigger");
		in.close();
	}

}
