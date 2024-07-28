package testproject_test;

import static org.junit.Assert.*;

import org.junit.Test;

public class testcase4 {

	@Test
	public void test() {
		test_example object = new test_example();
		
		boolean output=object.notnullString("");
		
		assertEquals(true,output);
	}

}
