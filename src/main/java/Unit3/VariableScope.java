package Unit3;

public class VariableScope {

	public static void main(String[] args) {
		int a = 5, b = 5;

		if (a == b) {
			int sum = a + b;
			System.out.println("a and b are equal");
		}
		// sum is not available outside the conditional statement
		System.out.println("Sum of a and b is: " + sum);

	}

}
