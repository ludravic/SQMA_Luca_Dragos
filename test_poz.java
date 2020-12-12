import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import classe.MyClass;

public class test_poz {

private static MyClass object;
	
	@BeforeClass
	public static void setareObject() {
		object = new MyClass();
	}
	
	@Test
	public void test() {
		assertEquals(10, object.sum_1_n(4));		
	}
	
	
}
