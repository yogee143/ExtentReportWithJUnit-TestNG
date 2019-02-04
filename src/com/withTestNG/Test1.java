package com.withTestNG;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 extends BaseTest{

	@Test
	public void funcTest1() {
		test = extent.createTest("Test1");
		Assert.assertTrue(1>0);
	}
	

	@Test
	public void funcTest2() {
		test = extent.createTest("Test2");
		Assert.assertEquals("Yogesh","Yogi");
		
		
	}

	@Test
	public void funcTest3() {
		test = extent.createTest("Test2");
		Assert.assertNotEquals("Yogesh","Yogesh");
		
		
	}

}
