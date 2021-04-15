package Unit3;
import java.util.Scanner;

public class DoNow317 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter your name:");
		String name = in.nextLine();

		String reservation = "Jack"; // String is an object so it won't compare contents instead addresses

		if (name == reservation) { 
			// This will compare the addresses not the contents of the string
			// Objects won't have same addresses so it will print the else automatically without a syntax error
			System.out.println("Right this way!");
		} else {
			System.out.println("Sorry! No reservation under this name");
		}
	}
}