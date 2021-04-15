package Unit2;
/**
 * 
 * @author Mohith Nagendra
 * 3/3/2021
 * Write a class that accepts the number of each type of meal ordered and display the total money 
 * collected for adult meals, children’s meals and all meals.
 */
import java.util.Scanner;
public class ChiliToGo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("How many adult meals would you like to order? ");
		int adult_meals = in.nextInt();
		System.out.println("How many kid's meals would you like to order? ");
		int kids_meals = in.nextInt();
		
		int total_adult = 7 * adult_meals;
		int total_kids = 4 * kids_meals;
		System.out.println("The total adult meals price is: $" + total_adult);
		System.out.println("The total kid's meals price is: $" + total_kids);
		
		int total_price = total_adult + kids_meals;
		System.out.println("The total price is: $" + total_price);
		
		float adult_profit = (float)4.35 * adult_meals;
		float total_adult_prof = total_adult - adult_profit;
		System.out.printf("\nThe total adult meals profit is: $%.2f", total_adult_prof);
		
		float kids_profit = (float)3.10 * kids_meals;
		float total_kids_prof = total_kids - kids_profit;
		System.out.printf("\nThe total kid's meals profit is: $%.2f", total_kids_prof);
		
		float total_profit = total_adult_prof + total_kids_prof;
		System.out.printf("\nThe total profit is: $%.2f", total_profit);
	}

}
