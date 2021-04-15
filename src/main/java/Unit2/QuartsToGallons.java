package Unit2;
/**
 * 
 * @author Mohith Nagendra
 *3/1/2021
 *Write a program to get number of quarts as user input and calculate gallons and quart(left over).
 */
import java.util.Scanner;
public class QuartsToGallons {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter number of quarts: ");
		int total_quarts = in.nextInt();
		
		// calculate number of gallons
		int gallons = total_quarts / 4;
		
		// calculate number of left over quarts
		int quarts = total_quarts % 4;
		
		// print the result
		System.out.printf("%d quarts = %d gallons and %d quarts", total_quarts, gallons, quarts);
		in.close();
	}

}
