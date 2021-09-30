package twenty_eight_of_sep;

import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
		final int STUDENTS = 5;
		int total = 0;
		Scanner sc = new Scanner(System.in);
		int [] scores = new int[STUDENTS];
		
		for(int i=0;i <scores.length;i++) {
			System.out.println("성정 입력");
			scores[i] = sc.nextInt();
			total += scores[i];
		}
		System.out.println("average is: " + total / STUDENTS + "  done");
		sc.close();
	}

}
