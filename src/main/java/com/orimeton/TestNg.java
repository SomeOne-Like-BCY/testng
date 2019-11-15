package com.orimeton;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg {
	@Test
	public void name() {
		//int i = 1 / 0;
		//System.out.println("这是一个测试");
	}
	@Test(groups = "{a1,a2}")
	public void name2() {
		//int i = 1 / 0;
		//System.out.println("这是一个测试2");
	}
	@BeforeMethod
	public void name3() {
		//int i = 1 / 0;
		//System.out.println("这是一个测试3");
	}
	
	@Test(expectedExceptions = RuntimeException.class)
	public void name4() {
		//int i = 1 / 0;
		//System.out.println("这是一个异常测试");
		throw new RuntimeException();
	}
	
	
}
