package twenty_eight_of_sep;

public class MethodOverriding {
	// Parent class 
	class Animal {
	  public void eating() {
	    System.out.println("The animal is eating.");
	  }
	}
	 
	// Child class 
	class Dog extends Animal {
	  // Dog's eating method overrides Animal's eating method
	    @Override
	  public void eating() {
	    System.out.println("The dog is eating.");
	  }
	}
	
	public static void main(String[] args) {
//		Animal animal = new Dog();
//		animal.eating();

	}

}
