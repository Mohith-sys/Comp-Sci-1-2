package Unit5;
/**
 * 
 * @author Mohith Nagendra
 * 4/9/2021
 * Write a program to calculate the volume of the given figure according to the given formula.
 */
public class CalcVolume {

	public static double vol_cyl(double r, double h) {
		double vol = Math.PI * r * r * h;
		return vol;
		// return Math.PI * r * r * h;
	}
	
	public static double vol_cone(double r, double h) {
		// You must use vol_cyl method to calculate vol of cone
		double vol = vol_cyl(r,h) / 3;
		return vol;
	}
	
	public static void main(String[] args) {
		double r = 4.5;
		double h_cyl = 10;
		double h_cone = 5.5;
		
		double v_cyl = vol_cyl(r, h_cyl);
		double v_cone = vol_cone(r, h_cone);
		
		double vol_figure = v_cyl + v_cone;
		
		System.out.printf("Vol of the given figure = %.2f", vol_figure);

	}

}
