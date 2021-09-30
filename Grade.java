package twenty_eight_of_sep;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		int score;
		String grade;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter you score: ");
		score = in.nextInt();
		if(score>=90) {
			grade = "A";
		}
		else if(score>=80) {
			grade = "B";
		}
		else if(score>=70) {
			grade = "C";
		}
		else {
			grade = "F";
		}
		System.out.println("The score of " + score + " will get you: " + grade);
		in.close();

	}

}
