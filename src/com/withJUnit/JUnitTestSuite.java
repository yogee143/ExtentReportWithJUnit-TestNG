package com.withJUnit;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	ExtentReportWithJUnit.class,
	ExtentReportWithJUnit2.class
	})
public class JUnitTestSuite {

}
