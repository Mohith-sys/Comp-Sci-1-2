package Unit3;
/**
 * 
 * @author Mohith Nagendra
 * 3/11/2021
 * Write a Java program to print the user given 3 integer values in descending order.
 */
import java.util.Scanner;
public class Descending {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int number = in.nextInt();
		
		System.out.println("Enter another number: ");
		int number1 = in.nextInt();
		
		System.out.println("Enter another number: ");
		int number2 = in.nextInt();
		
		if (number > number1 && number > number2) {
			if (number1 > number2)
				System.out.println(number + ", " + number1 + ", " + number2);
			else if (number2 > number1)
				System.out.println(number + ", " + number2 + ", " + number1);
			else
				System.out.println("Please enter 3 different numbers");
		}
		
		else if (number1 > number && number1 > number2) {
			if (number > number2)
				System.out.println(number1 + ", " + number + ", " + number2);
			else if (number2 > number)
				System.out.println(number1 + ", " + number2 + ", " + number);
			else
				System.out.println("Please enter 3 different numbers");
		}
			
		else if (number2 > number && number2 > number1) {
			if (number > number1)
				System.out.println(number2 + ", " + number + ", " + number1);
			else if (number1 > number)
				System.out.println(number2 + ", " + number1 + ", " + number);
			else
				System.out.println("Please enter 3 different numbers");
		}
		
		else
			System.out.println("Please enter 3 different numbers");
		
	}

}
