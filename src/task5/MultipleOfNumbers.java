package task5;

import java.util.Scanner;

public class MultipleOfNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//taking input from user
		System.out.println("Enter the number");
		int a = sc.nextInt();
		//logic to print first 10 multiples of user input
		for(int i = 1 ; i <= 10 ; i++){
			System.out.println(a + " * " + i + " = " + a*i);
		}
		sc.close();
	}
}
