package task7;

public class SameTypeOverloadMain {

	public static void main(String[] args) {
		//Defining object of class
		SameTypeOverload ob = new SameTypeOverload();
		//passing different number of values
		int result1 = ob.sum(10, 20);
		int result2 = ob.sum(10, 20, 30);
		int result3 = ob.sum(10, 20, 30, 40);
		//printing results
		System.out.println("The result for 2 numbers are "+result1);
		System.out.println("The result for 3 numbers are "+result2);
		System.out.println("The result for 4 numbers are "+result3);
	}

}
