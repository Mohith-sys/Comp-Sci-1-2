package Unit2;
/**
 * 
 * @author Mohith Nagendra
 *3/1/2021
 *Formatted Print Statements
 */
public class PrintFIntro {

	public static void main(String[] args) {
		int x = 4, y = 5;
		int sum = x + y;
		
		System.out.println("The sum is " + sum);
		System.out.println("The sum of " + x +
				" and " + y + " is " + sum);
		// using formatted print statement
		System.out.printf("The sum of %d and %d is %d",
				x, y, sum);
		
		double div = (double)y/x;
		// converting it a double to get decimal division
		
		System.out.printf("\nThe quotient of %d and %d is %.2f", 
				+ y, x, div);
		// %d - int type variable
		// %f - double type variable
		// %.2f - will round the double value to 2 decimal places
		// %c - char
		// %b - boolean
		// %s - string

	}

}
