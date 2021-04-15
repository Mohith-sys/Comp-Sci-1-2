package Unit2;
/**
 * 
 * @author Mohith Nagendra
 * 3/5/2021
 * Write a class that calculates and displays the conversion of an entered number of dollars into currency 
 * denominations
 */
import java.util.Scanner;
public class Dollars {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter total amount of dollars: ");
		int total = in.nextInt();
		
		int twenties = total / 20;
		int remaining1 = total - (twenties * 20);
		
		int tens = remaining1 / 10;
		int remaining2 = remaining1 - (tens * 10);
		
		int fives = remaining2 / 5;
		int ones = remaining2 - (fives * 5);

		System.out.println("Amount of 20s: " + twenties);
		System.out.println("Amount of 10s: " + tens);
		System.out.println("Amount of 5s: " + fives);
		System.out.println("Amount of 1s: " + ones);

	}

}
