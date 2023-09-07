/**
 * Lab2_Task1_Francine_Vo.java
 * Francine Vo
 * 01253035
 * 09/06/2023
 */

import java.util.Scanner;
import java.lang.Math;

public class Lab2_Task1_Francine_Vo {
	
	public static void main(String[] args) {
		
		// 1. Declare Variables
			double x1, y1; // Point 1
			double x2, y2; // Point 2
			double side1, side2; // Intermediate
			double distance; // Output
		
		// 2. Prompt user for coordinates
			System.out.print("Enter x1, y1, x2, y2: ");
			Scanner input = new Scanner(System.in);
			x1 = input.nextDouble();
			y1 = input.nextDouble();
			x2 = input.nextDouble();
			y2 = input.nextDouble();
			input.close();
		
		// 3. Calculate side1 squared:
			side1 = Math.pow(x2 - x1, 2);
		
		// 4. Calculate side2 squared:
			side2 = Math.pow(y2 - y1, 2);
		
		// 5. Calculate Distance
			distance = Math.sqrt(side1 + side2);
		
		// 6. Output the result
			System.out.println("Distance = " + distance);

	}

}