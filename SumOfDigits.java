package day6;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// Calculating the sum of digits
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a whole number ");
		int num = scanner.nextInt();
		int sum = 0;
		
		while (num != 0) {
			sum = sum + num % 10; //Used to get he last number
			num = num / 10;  //Used to remove the last number
			
		}
		
		System.out.println("The sum of the number is: " + sum);

	}

}
