package task6;

//class with same method name but different signature
public class SumOverLoad {
	void sum(int a, int b){
		
		System.out.println("The sum of two numbers are " + (a+b));
		
	}
	int sum(int a, int b, int c){
		
		int d = a+b+c;
		return d;
	}
}
