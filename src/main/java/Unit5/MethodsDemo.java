package Unit5;
/**
 * 
 * @author Mohith Nagendra
 * 4/5/2021
 * Learn about static methods
 */
public class MethodsDemo {
	
	// methods
	// Have methods at the top of the program
	// Method definition (declaration)
	public static void printMessage() {
		// method body
		// print a positive message for April
		System.out.println("Just Do It!");
	}
	
	public static int addNumbers(int a, int b) { // a and b are parameters
		int sum = a + b;
		return sum;
		
		// OR
		//return a + b
	}

	// main method at the bottom
	public static void main(String[] args) {
		// method call
		printMessage(); // no return and no parameters
		
		int number1 = 4;
		int number2 = 7;
		
		int add2Numbers = addNumbers(number1, number2);
		System.out.println(add2Numbers);
		
		System.out.println(addNumbers(2, 6));
		
		// System.out.println(addNumbers(5.4, 3.4));

	}
	
	// methods

}
