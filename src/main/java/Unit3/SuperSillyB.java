package Unit3;
/**
 * 
 * @author Mohith Nagendra
 * 3/19/2021
 * Write a program for admission booths in “Super Silly Fun Land” from Despicable Me. 
 */
import java.util.Scanner;
public class SuperSillyB {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter your age: ");
		int age = in.nextInt();
		in.nextLine();
		
		System.out.println("Which city are you from? ");
		String city = in.nextLine();
	
		String santa_city = "Santa Monica";
		double base_price = 40; // new base price
		double kids_price = 0; // price for kids ages 1-4
		double senior_price = base_price * 0.5; // price for senior citizens not from Santa Monica
		double santa_price = 30; // price for people from Santa Monica
		double senior_sm = santa_price * 0.5; // price for senior citizens from Santa Monica
		
		
		if (age > 0 && age < 5) {
			System.out.printf("Price of ticket being charged: $%.2f", kids_price);
		}
		else if (age >= 5 && age < 65) {
			if (city.equals(santa_city)) {
				System.out.printf("Price of ticket being charged: $%.2f", santa_price);
			}
			else {
				System.out.printf("Price of ticket being charged: $%.2f", base_price);
			}
		}
		else if (age >= 65) {
			if (city.equals(santa_city)) {
				System.out.printf("Price of ticket being charged: $%.2f", senior_sm);
			}
			else {
				System.out.printf("Price of ticket being charged: $%.2f", senior_price);
			}
		}
		else {
			System.out.println("Invalid age");
		}

	}

}