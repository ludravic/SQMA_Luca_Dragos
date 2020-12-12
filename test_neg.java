import org.junit.BeforeClass;
import org.junit.Test;

import MyClass;

public class test_neg {


private static MyClass object;
	
	@BeforeClass
	public static void setareObject() {
		object = new MyClass();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test() {
		object.sum_1_n(-4);
	}
	
}
