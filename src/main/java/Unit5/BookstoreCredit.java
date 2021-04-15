package Unit5;
/**
 * 
 * @author Mohith Nagendra
 * 4/9/2021
 * Write a program that prompts a student for a name and grade point average in the main method, 
 * and then passes the values to a method that displays a descriptive message.
 */
import java.util.Scanner;
public class BookstoreCredit {

	public static double gpa_calc(double gpa) {
		double money = gpa * 10;
		return money;
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your Name: ");
		String name = in.nextLine();
		
		System.out.println("Enter your GPA: ");
		double gpa = in.nextDouble();
		
		gpa_calc(gpa);
		System.out.printf("%s has a gpa of %.2f and gets $%.2f", name, gpa, gpa_calc(gpa));

	}

}
