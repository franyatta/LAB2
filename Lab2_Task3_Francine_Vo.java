/**
 * Lab2_Task3_Francine_Vo.java
 * Francine Vo
 * 01253035
 * 09/06/2023
 */
import java.util.Scanner;
import java.lang.Math;

public class Lab2_Task3_Francine_Vo {

	public static void main(String[] args) {
		
		// 1. Declare Variables and Constants
			final double COST_PER_LITER = 0.38; // in dollars $
			final double PROFIT_PER_CARTON = 0.27; // in dollars $
			final double LITERS_PER_CARTON = 3.78; // in liters
		
			double liters;
			double profit;
			double cost;
			int cartons;

		// 2. Prompt User for liters of milk produced
			System.out.print("Enter how much milk was produced in liters: ");
			Scanner input = new Scanner(System.in);
			liters = input.nextDouble();
			input.close();
			
		// 3. Calculate Number of Cartons Produced: round(liters/LITERS_PER_CARTON)
			cartons = (int)Math.round(liters/LITERS_PER_CARTON);
				
		// 4. Calculate Total Cost: liters * COST_PER_LITER
			cost = liters * COST_PER_LITER;
				
		// 5. Calculate the Total Profit: cartons * PROFIT_PER_CARTON
			profit = cartons * PROFIT_PER_CARTON;
			
		// 6. Output Results
			System.out.println("Milk cartons needed: " + cartons);
			System.out.println("Cost of production: $" + cost);
			System.out.println("Total profit: $" + profit);

	}

}
