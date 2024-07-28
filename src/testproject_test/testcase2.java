package testproject_test;

import static org.junit.Assert.*;

import org.junit.Test;

public class testcase2 {

	@Test
	public void test() {
	test_example object = new test_example();
		
		int output=object.sum(5,5);
		
		assertEquals(10,output);//here the 10 means the correct results we expected
	}

}
