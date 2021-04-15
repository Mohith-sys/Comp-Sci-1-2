package Unit2;
/**
 * 
 * @author Mohith Nagendra
 * 2/23/2021
 * User input in getting char data type
 */
import java.util.Scanner;
public class UserInputChar {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a character: ");
		// in.nextInt() - int
		// in.nextDouble() - double
		// in.nextBoolean() - boolean
		// in.nextLine() - string
		// no direct method for char data type
		char ch = in.nextLine() .charAt(0);
		// getting user input as a string and
		// getting first character from user input
		System.out.println("Character that user entered: " + ch);

	}

}
