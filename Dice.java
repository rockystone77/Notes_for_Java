package twenty_eight_of_sep;

public class Dice {

	public static void main(String[] args) {
		while (true) {
		    int dice1=(int)(Math.random()*6+1);
		    int dice2=(int)(Math.random()*6+1);
		    int sum = dice1 + dice2;

		    System.out.println("Roll: total = " + sum); 

		    if (sum==2 || sum==3 || sum==12) {
		        System.out.println("Sorry with a " + sum + " You LOSE :(");
		        break;
		    } else if(sum==7 || sum==11) { 
		        System.out.println("Woah!!! With a " + sum + " You WIN!!!!!!!");
		        break; 
		    }

		    // If you wanted, you could wait here for the user to confirm (e.g. with a key press)
		}

	}

}
