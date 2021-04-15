package Unit3;
/**
 * 
 * @author Mohith Nagendra
 * 3/9/2021
 * Write a program to find out if the given number is 
 * even or odd
 */
public class EvenOdd {

	public static void main(String[] args) {
		int number = 8;
		
		//even, odd, divisible, factor:
		// % - modulus(remainder)
		
		int remainder = number % 2;
		
		if(remainder == 0) {
			System.out.println("Number is even.");
			System.out.println("The number is divisible by 2.");
		}
		else // no need of {} if there is only one statement
			System.out.println("Number is odd.");		

	}

}
