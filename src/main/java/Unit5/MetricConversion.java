package Unit5;
/**
 * 
 * @author Mohith Nagendra
 * 4/13/2021
 * Write a program with methods where one converts the value from inches to centimeters and the other converts the same value from gallons to 
 * liters.
 */
import java.util.Scanner;
public class MetricConversion {
	
	public static double centi(double value) {
		double centimeters = value * 2.54;
		return centimeters;
	}
	
	public static double liters(double value) {
		double tot_liter = value * 3.7854;
		return tot_liter;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a value: ");
		double value = in.nextDouble();
		
		System.out.printf("%.2f inches is %.2f centimeters and %.2f gallons is %.2f liters", value, centi(value), value, liters(value));

	}

}
