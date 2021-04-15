package Unit2;
/**
 * 
 * @author Mohith Nagendra
 * 3/3/2021
 * Math functions in Java
 */
public class MathFunctions {

	public static void main(String[] args) {
		int x = -5;
		int abs_x = Math.abs(x); //int will return int
		
		System.out.println("The abs(x): " + abs_x);
		System.out.printf("The abs(x): %d", abs_x);
		
		double a = -5.6;
		double abs_a = Math.abs(a);
		System.out.printf("\nThe abs(a): %.2f", abs_a);
		//%.2f - to print 2 decimal places
		
		double cube_7 = Math.cbrt(7);
		System.out.printf("\nThe cbrt(7): %f", cube_7);

		double b = 9.4;
		double ceil_b = Math.ceil(b); 
		System.out.printf("\nceil(9.4): %f", ceil_b);

		double c = 34.892;
		double floor_c = Math.floor(x); 
		System.out.printf("\nfloor(34.892): %f", floor_c);

		double max_number = Math.max(34.45, 23.3); 
		System.out.println("\nMax value: " + max_number);
		
		double f = 3, g = 9;
		double min_fg = Math.min(f, g); 
		System.out.printf("\nmin(3,9)): %f", min_fg);

		double h = 7, i = 2;
		double pow_hi = Math.pow(h, i);
		System.out.printf("\npow(7,2): %f", pow_hi );
		
		double random_number = Math.random();
		double random_number1 = Math.random();
		double random_number2 = Math.random();
		System.out.println("\n" + random_number); 
		System.out.println(random_number1);
		System.out.println( random_number2);
		
		// Math.round ()
		double round_number = Math.round(45.3444); 
		System.out.printf("\nround_45.3444: %f", round_number);
		// Math.round returns a long data type
		// type casting long to int
		
		double m = 49;
		double sqrt_m = Math.sqrt(m); 
		System.out.printf("\nsqrt(49): %f", sqrt_m);

	}

}
