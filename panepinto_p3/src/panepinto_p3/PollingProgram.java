package panepinto_p3;

import java.util.Scanner;

public class PollingProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);

		// Set up my topics.
		String[] topics = new String[5];
		topics[0] = "Video Games";
		topics[1] = "Chicken Tenders";
		topics[2] = "Broccoli";
		topics[3] = "Java Code";
		topics[4] = "Television";
		
		// Initialize variables.
		int[][] responses = new int[5][10];
		double[] averages = new double[5];
		int total = 0, highIndex = 0, lowIndex = 0, choice = 0;
		int i, j, vote, highTotal = 0, lowTotal = 1000000000, numVoters = 0;
		
		// Introduction.
		System.out.println("Welcome to Jake's Poll!");
		System.out.println("The topics are: video games, chicken tenders, broccoli, java code, and television.");
		System.out.println("Rate each of these items, in order, from 1-10.");

		// Get inputs and store them.
		while(choice != -1) {
			for(i=0; i<5; i++) {
				System.out.println("Enter rate for " + topics[i] + ".");
				vote = scnr.nextInt();
				responses[i][vote-1] += 1;
			}
			numVoters++;
			// Prompt user if more voters.
			System.out.println("Enter 1 to rate or -1 to exit.");
			choice = scnr.nextInt();
		}
		
		// Find averages for all topics, the least rated, and highest rated.
		for(i=0; i<5; i++) {
			total = 0;
			for(j=0; j<10; j++) {
				total += ((j + 1) * responses[i][j]);
			}
			// Checks if this is higher than highest.
			if(total > highTotal) {
				highTotal = total;
				highIndex = i;
			}
			// Checks if this is lower than lowest.
			if(total < lowTotal) {
				lowTotal = total;
				lowIndex = i;
			}
			averages[i] = (double)total/(double)numVoters; 
		}
		
		// Code that prints the results in tabular format.
		System.out.format("%16s%4d%4d%4d%4d%4d%4d%4d%4d%4d%4d%10s", "Topics", 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, "Averages");
		System.out.println("");
		System.out.println("--------------------------------------------------------------------");
		System.out.format("%16s%4d%4d%4d%4d%4d%4d%4d%4d%4d%4d%10.2f", topics[0], responses[0][0], responses[0][1],
				responses[0][2], responses[0][3], responses[0][4], responses[0][5], responses[0][6], responses[0][7],
				responses[0][8], responses[0][9], averages[0]);
		System.out.println("");
		System.out.format("%16s%4d%4d%4d%4d%4d%4d%4d%4d%4d%4d%10.2f", topics[1], responses[1][0], responses[1][1],
				responses[1][2], responses[1][3], responses[1][4], responses[1][5], responses[1][6], responses[1][7],
				responses[1][8], responses[1][9], averages[1]);
		System.out.println("");
		System.out.format("%16s%4d%4d%4d%4d%4d%4d%4d%4d%4d%4d%10.2f", topics[2], responses[2][0], responses[2][1],
				responses[2][2], responses[2][3], responses[2][4], responses[2][5], responses[2][6], responses[2][7],
				responses[2][8], responses[2][9], averages[2]);
		System.out.println("");
		System.out.format("%16s%4d%4d%4d%4d%4d%4d%4d%4d%4d%4d%10.2f", topics[3], responses[3][0], responses[3][1],
				responses[3][2], responses[3][3], responses[3][4], responses[3][5], responses[3][6], responses[3][7],
				responses[3][8], responses[3][9], averages[3]);
		System.out.println("");
		System.out.format("%16s%4d%4d%4d%4d%4d%4d%4d%4d%4d%4d%10.2f", topics[4], responses[4][0], responses[4][1],
				responses[4][2], responses[4][3], responses[4][4], responses[4][5], responses[4][6], responses[4][7],
				responses[4][8], responses[4][9], averages[4]);
		System.out.println("");
		
		// Prints the high and low category.
		System.out.println("");
		System.out.printf("%s reached the highest point total with %d points.%n", topics[highIndex], highTotal);
		System.out.printf("%s reached had the lowest point total with %d points.%n", topics[lowIndex], lowTotal);
	}
}
