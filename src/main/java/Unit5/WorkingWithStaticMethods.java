package Unit5;
/**
 * 
 * @author Mohith Nagendra
 * 4/5/2021
 * How to use static methods and copy code from Edpuzzle video and modify the program to 
 * get user input for zip code using Scanner class inside the zipcode() method. 
 */
import java.util.Scanner;
public class WorkingWithStaticMethods {

	public static void printMessage() {
		System.out.println("Welcome to the Java World!");
	}
	public static int zipcode() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter zip code: ");
		int zip = in.nextInt();
		
		in.close();
		return zip;
	}
	public static void main(String[] args) {
		int zip = zipcode();
		System.out.println(zip);
	}

}
