package testproject_test;

import static org.junit.Assert.*;

import org.junit.Test;

public class testcase3 {

	@Test
	public void test() {
		test_example object = new test_example();
		
		boolean output=object.isValid("ABC123");
		
		assertEquals(true,output);
	}

}
