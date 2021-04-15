package Unit5;
/**
 * 
 * @author Mohith Nagendra
 * 4/13/2021
 * Write a program with a main() method that prompts the user for the length, width, and height of a rectangular room.
 */
import java.util.Scanner;
public class PaintCalculator {
	public static double area(double w, double l, double h) {
		double rect_area = ((w * h) * 2) + ((l * h) * 2);
		return rect_area;
	}
	
	public static double paint(double total_area) {
		double gallons = ((double)total_area / 350);
		return gallons;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the width: ");
		double width = in.nextDouble();
		
		System.out.println("Enter the length: ");
		double length = in.nextDouble();
		
		System.out.println("Enter the height: ");
		double height = in.nextDouble();
		
		double rect_area = area(width, length, height);
		double price = paint(rect_area) * 32;
		
		System.out.printf("The cost to paint a %.0f-by-%.0f foot room with a %.0f-foot ceilings is $%.2f", width, length, height, price);

	}

}
