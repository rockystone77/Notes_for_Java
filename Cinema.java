package twenty_eight_of_sep;

import java.util.Scanner;

public class Cinema {

	public static String[] seats = { "00", "01" , "02" , "03" , "04" , "05" , "06" , "07" , "08" , "09" , "10"
			, "11" , "12" , "13" , "14" , "15" , "16" , "17" , "18" , "19" , "20" , "21"
			, "22" , "23" , "24" , "25" , "26" , "27" , "28" , "29"};

	public static void getSeats() {
		for(int a = 0; a < 30; a++ ){
			System.out.printf("%s\t", seats[a]);
			if (a % 5 == 4){
				System.out.printf("\n");
			}
		}
	}
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);

		int booking;
		String name;
		int suggestion = 0;
		boolean check1 = true;
		String check2 = "_";
		String check11 = "_";

		//create array
		final int ARRAY_LENGTH = 30;
		int[] array = new int[ARRAY_LENGTH];

		
		System.out.println("Hi, what is your name?");
		name = input.nextLine();

		System.out.printf("Welcome,%s!\n",name);

		System.out.println("*********************");
		System.out.println("CINEMA 1 SEATING PLAN");
		System.out.println("*********************");


		
		System.out.println("Which seat do you want?");
		booking = input.nextInt();
		
		seats[booking] = "**";
		
		



		input.close();

		//end main
	}
}