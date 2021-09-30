package twenty_eight_of_sep;

import java.util.Scanner;

public class Bouns {

	public static void main(String[] args) {
		final int target = 1000;
		int mysales;
		int bonus;
		String results;
		
		Scanner in = new Scanner(System.in);
		System.out.println("enter performance");
		mysales = in.nextInt();
		
		if(mysales >= target) {
			results = "performace accepted";
			bonus = (mysales - target) / 10;
		}else {
			results = "performance not good enough";
			bonus = 0;
		}
		System.out.println(results + "\n" + "보너스: " + bonus);
		in.close();
	}

}
