package Unit3;
/**
 * 
 * @author Mohith Nagendra
 * 3/9/2021
 * Get int value as a user input
 * and print if the user given number is
 * Positive, Negative or zero
 */
import java.util.Scanner;
public class PositiveNegative {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int number = in.nextInt();
		
		if (number > 0)
			System.out.println("The number is positive.");
		else if (number == 0)
			System.out.println("The number is zero.");
		else
			System.out.println("The number is negative.");

	}

}
