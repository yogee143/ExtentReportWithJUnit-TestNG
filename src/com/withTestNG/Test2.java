package com.withTestNG;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 extends BaseTest{

	@Test
	public void func2Test1() {
		test = extent.createTest("2#Test1");
		Assert.assertTrue(1>0);
	}
	

	@Test
	public void func2Test2() {
		test = extent.createTest("2#Test2");
		Assert.assertEquals("Yogesh","Yogi");
		
		
	}

	@Test
	public void func2Test3() {
		test = extent.createTest("2#Test2");
		Assert.assertNotEquals("Yogesh","Yogesh");
		
		
	}

}
