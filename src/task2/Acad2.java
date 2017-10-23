package task2;

import java.util.Scanner;

public class Acad2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		//taking input from user		
		System.out.println("Enter the first number");
		int a = in.nextInt();
		System.out.println("Enter the second number");
		int b = in.nextInt();
		in.close();
		//performing sum and printing to console
		int sum = a + b;
		System.out.println("Sum is " + sum);		
	}
}
