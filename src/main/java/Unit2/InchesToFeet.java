package Unit2;
/**
 * 
 * @author Mohith Nagendra
 *3/1/2021
 *Write a program to get number of inches as user input and calculate feet and inches(left over).
 */
import java.util.Scanner;
public class InchesToFeet {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter number of inches: ");
		int total_inches = in.nextInt();
		
		// calculate number of gallons
		int feet = total_inches / 12;
		
		// calculate number of left over quarts
		int inches = total_inches % 12;
		
		// print the result
		System.out.printf("%d inches = %d feet and %d inches", total_inches, feet, inches);
		in.close();
	
	}

}
