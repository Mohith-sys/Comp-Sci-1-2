package Unit5;
/**
 * 
 * @author Mohith Nagendra
 * 4/5/2021
 * Learn about static methods
 */
import java.util.Scanner;
public class CalcNumbers {
	// 3 methods
	public static int displayTwiceTheNumber(int n) {
		int twice = 2 * n;
		return twice;
	}
	public static int displayNumberPlusFive(int n) {
		int sum = n + 5;
		return sum;
	}
	public static int displayNumberSquared(int n) {
		int squared = n * n;
		return squared;
	}
	public static void main(String[] args) {
		// get user input
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = in.nextInt();
		// int 
		System.out.print("Enter the number of what you want to be displayed(TwiceTheNumber = 1, NumberPlusFive = 2, and NumberSquared = 3): ");
		int option = in.nextInt();
		// option (String or int) .equals() or ==
		// conditonal statements
		// call the method inside the if statement
		
		if (option == 1) {
			System.out.println(displayTwiceTheNumber(num));
		}
		else if (option == 2) {
			System.out.println(displayNumberPlusFive(num));
		}
		else {
			System.out.println(displayNumberSquared(num));
		}

	}

}
