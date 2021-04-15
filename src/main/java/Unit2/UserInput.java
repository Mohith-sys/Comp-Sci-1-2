package Unit2;
/**
 * 
 * @author Mohith Nagendra
 *2/29/2021
 *User Input
 */

// step 1
import java.util.Scanner;
public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// step 2 : creating a scanner object
		Scanner kb = new Scanner(System.in);
		
		// step 3: getting user input
		System.out.print("Enter a number: ");
		int number = kb.nextInt(); // Integer
		//double d = kb.nextDouble(); // Double
		//boolean b = kb.nextBoolean(); // Boolean
		//String name = kb.nextLine(); // String
		
		System.out.println("Your entered the number: " + number);
		
		// step 4: close the scanner object
		kb.close();

	}

}
