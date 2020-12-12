package classe;

public class MyClass {

	public int sum_1_n(int n) {
		
		if(n<0)
			throw new IllegalArgumentException();
		
		n=n*(n+1)/2;		
		return n;		
	}

}
