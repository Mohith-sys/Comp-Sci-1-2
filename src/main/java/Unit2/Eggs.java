package Unit2;
/**
 * 
 * @author Mohith Nagendra
 * 3/3/2021
 * Write a class that prompts a user for the number of eggs in the order and then display the amount 
 * owed with a full explanation.
 */
import java.util.Scanner;
public class Eggs {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("How many eggs would you like to order? ");
		int total_eggs = in.nextInt();
		
		int dozens = total_eggs / 12;
		int eggs = total_eggs % 12;
		
		double total_price = (dozens * 3.25) + (eggs * 0.45);
		
		System.out.printf("\nYou ordered %d eggs. That is %d dozen at $3.25 per dozen and %d loose eggs at 45 cents each for a total of $%.2f.",
				+ total_eggs, dozens, eggs, total_price);

	}

}
