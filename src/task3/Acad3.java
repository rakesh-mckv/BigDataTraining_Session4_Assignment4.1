package task3;

import java.util.Scanner;
public class Acad3 {

	public static void main(String[] args) {
		
		//declaring object for method sumtask
		Sumtask ob = new Sumtask();
		Scanner sc = new Scanner(System.in);
		//taking input from user
		System.out.println("Enter first number");
		ob.x = sc.nextInt();
		System.out.println("Enter second number");
		ob.y = sc.nextInt();
		sc.close();
		//calling from method sum()
		System.out.println("First number is: " + ob.x);
		System.out.println("Second number is: " +ob.y);
		System.out.println("Sum is: " +ob.sum(ob.x,ob.y));
	}

}
