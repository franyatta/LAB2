/**
 * Lab2_Task2_Francine_Vo.java
 * Francine Vo
 * 01253035
 * 09/06/2023
 */

import java.util.Scanner;

public class Lab2_Task2_Francine_Vo {
	
	public static void main(String[] args) {
		
		// 1. Declare Variables
		double score1, score2, score3, score4;
		double average;
		
		// 2. Prompt user for Test Score
		System.out.print("Enter four test scores: ");
		Scanner input = new Scanner(System.in);
		score1 = input.nextDouble();
		score2 = input.nextDouble();
		score3 = input.nextDouble();
		score4 = input.nextDouble();
		input.close();
		
		// 3. Calculate Average
		average = (score1 + score2 + score3 + score4) / 4;
		
		// 4. Output Results
		System.out.println("Average: " + average);

	}
}
