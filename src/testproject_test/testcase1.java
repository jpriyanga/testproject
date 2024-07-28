package testproject_test;

import static org.junit.Assert.*;

import org.junit.Test;

public class testcase1 {

	@Test
	public void test() {
		test_example object = new test_example();
		
		int output=object.square(4);
		
		assertEquals(16,output);
	}
	

}
