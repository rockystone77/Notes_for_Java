package twenty_eight_of_sep;

public class SavingsAccount {
	  
	  int balance;
	  
	  public SavingsAccount(int initialBalance){
	    balance = initialBalance;
	  }
	  
	  public void checkBalance(){
	    System.out.println("Hello!");
	    System.out.println("Your balance is "+ balance);
	  }

	 public int withdraw(int amountToWithdraw){
	    balance = balance - amountToWithdraw;
	    System.out.println("You just withdrew "+ amountToWithdraw);
	    return amountToWithdraw;
	  }

	 public void deposit(int amountToDeposit){
	    balance = balance + amountToDeposit;
	    System.out.println("You just deposited "+ amountToDeposit);
	  }

	  public static void main(String[] args){
	    SavingsAccount savings = new SavingsAccount(2000);
	    
	    //Check balance:
	    savings.checkBalance();
	    
	    //Withdrawing:
	    int withdrawedMoney = savings.withdraw(300);
	    
	    //Check balance:
	    savings.checkBalance();
	    
	    //Deposit:
	    savings.deposit(600);
	    
	    //Check balance:
	    savings.checkBalance();
	    
	    //Deposit:
	    savings.deposit(600);
	    
	    //Check balance:
	    savings.checkBalance();
	    
	  }       
	}

