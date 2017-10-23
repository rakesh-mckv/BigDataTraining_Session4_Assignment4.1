package task7;

public class SameTypeOverload {
//defining methods with same return type but different number of parameters/calculation
	int sum(int a, int b){		
		int e = a+b;
		return e;		
	}
	
	int sum(int a, int b, int c){		
		int d = a*b*c;
		return d;
	}
	
	int sum(int a, int b, int p, int q ){		
		int result = (a + b) * (p + q);
		return result;		
	}

}
