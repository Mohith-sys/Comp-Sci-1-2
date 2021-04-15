package Unit2;
/**
 * 
 * @author Mohith Nagendra
 * 2/23/2021
 * Arithmetic operators in Java
 */
public class ArithmeticTest {

	public static void main(String[] args) {
		// + addition
		// - subtraction
		// * multiplication
		// / division
		// % remainder
		
		// declaration & initialization
		int a = 5, b = 4; //both
		
		int c = 5; // variables are separated
		int d = 4;
		
		int e, f; // declare
		e = 5; // initializing
		f = 4;
		
		System.out.println(a + b);
		int sum = a + b;
		System.out.println(sum);
		
		int div = a / b; // integer division
		// gives you the quotient
		System.out.println(div);
		
		double div1 = (double)a / (double)b;
		// a and b are integers
		System.out.println(div1);
		
		int x = 12 / 15 + 23 * 10 % 2;
		System.out.println(x);

	}

}
