package panepinto_p1;

import java.util.Scanner;

public class Encrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);

		// Declaring my variables.
		final int ARRAY_LEN = 4;
		int i, digit, saveVal, divVal = 1000;
		int num = scnr.nextInt();
		int[] data = new int[ARRAY_LEN];

		// Store each digit of the integer into array indices.
		for (i = 0; i < ARRAY_LEN; i++) {
			digit = num / divVal;
			data[i] = digit;
			num = num % divVal;
			divVal = divVal / 10;
		}

		// Encrypt data. (Adding 7 and making it single digit again if needed.)
		for (i = 0; i < ARRAY_LEN; i++) {
			data[i] += 7;
			if (data[i] > 9) {
				data[i] = data[i] % 10;
			}
		}

		// Swapping values of the indices.
		// Indices 1 and 3.
		saveVal = data[2];
		data[2] = data[0];
		data[0] = saveVal;
		// Indices 2 and 4.
		saveVal = data[3];
		data[3] = data[1];
		data[1] = saveVal;

		// Print encrypted data.
		for (i = 0; i < ARRAY_LEN; i++) {
			System.out.print(data[i]);
		}
		System.out.println("");
	}
}
