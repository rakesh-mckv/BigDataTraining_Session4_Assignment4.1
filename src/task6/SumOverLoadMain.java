package task6;

public class SumOverLoadMain {

	public static void main(String[] args) {
		//determining object of class
		SumOverLoad ob = new SumOverLoad();
		//passing values for two numbers
		ob.sum(10, 20);
		//passing values for three numbers
		int result = ob.sum(100,200,300);
		System.out.println("The sum of three numbers are "+result);
	}

}
