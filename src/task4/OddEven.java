package task4;
import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//taking inputs from user
		System.out.println("Enter two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		//processing:if first number is less than second number
		if(a<b){
		for (int i = a+1 ; i < b ; i++){
			if(i%2==0){			   
			   System.out.println("Even No." + i);
			   }
			else{
			   System.out.println("Odd No." + i);	
		}			
	  }		
	}
		//processing:if first number is greater than second number
		else{
		for (int i = b+1 ; i < a ; i++){
			if(i%2==0){			   
			   System.out.println("Even No." + i);
			   }
			else{
			   System.out.println("Odd No." + i);	
		}			
	   }
	  }
		sc.close();
	}
}
