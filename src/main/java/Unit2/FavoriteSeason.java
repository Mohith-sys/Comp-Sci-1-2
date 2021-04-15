package Unit2;
/**
 * 
 * @author Mohith Nagendra
 * 2/29/2021
 * Get user input asking for their favorite season and print it out::
 * "Your favorite season is: __________"
 */

import java.util.Scanner;
public class FavoriteSeason {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter your favorite season: ");
		String season = kb.nextLine(); 
		System.out.println("Your favorite season is: " + season);

	}

}
