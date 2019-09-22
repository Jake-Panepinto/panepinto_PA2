package panepinto_p2;

import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		
		// Introduction and choice.
		System.out.println("Welcome to BMI Calculator. Choose 1 for standard measurements or 2 for metric measurements.");
		
		// Declaring variables.
		int choice = scnr.nextInt();
		double weight, height;
		double BMI;
		
		// Measurements in standard system.
		if(choice == 1) {
			System.out.println("Please enter your weight in pounds and then your height in inches.");
			weight = scnr.nextDouble();
			height = scnr.nextDouble();
			BMI = (703 * weight) / Math.pow(height, 2.0);
			System.out.printf("Your BMI is %.2f%n", BMI);
		}
		
		// Measurements in metric system.
		if(choice == 2) {
			System.out.println("Please enter your weight in kilograms and then your height in meters.");
			weight = scnr.nextDouble();
			height = scnr.nextDouble();
			BMI = weight / Math.pow(height, 2.0);
			System.out.printf("Your BMI is %.2f%n", BMI);
		}
		
		// Print BMI Health Chart.
		System.out.println("Category		|		Range");
		System.out.println("---------------------------------------------");
		System.out.println("Underweight 		|		<18.5");
		System.out.println("Normal weight 		|	    18.5-24.9");
		System.out.println("Overweight 		|	      25-29.9");
		System.out.println("Obese 			|		 <=30");

	}

}
