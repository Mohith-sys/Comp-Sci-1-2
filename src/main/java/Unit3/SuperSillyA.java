package Unit3;
/**
 * 
 * @author Mohith Nagendra
 * 3/19/2021
 * Write a program for admission booths in “Super Silly Fun Land” from Despicable Me. 
 */
import java.util.Scanner;
public class SuperSillyA {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter your age: ");
		int age = in.nextInt();
		
		double base_price = 30;
		double senior_price = base_price * 0.5;
		if (age >= 65) {
			System.out.printf("Price of ticket being charged: $%.2f", senior_price);
		}
		else if (age < 65 && age > 0) {
			System.out.printf("Price of ticket being charged: $%.2f", base_price);
		}
		else if (age <= 0) {
			System.out.println("Invalid age");
		}

	}

}
