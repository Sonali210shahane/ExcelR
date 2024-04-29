package day7;

import org.testng.annotations.Test;

public class TestNG2 {
	@Test(priority=4,invocationCount = 2)
	public void test() {
		System.out.println("test method");
	}
	@Test(priority = -1)
	public void test1() {
		System.out.println("test1 method");
	}
	@Test(priority = 2,enabled=false)
	public void test2() {
		System.out.println("test2 method");
	}

	@Test
	public void test3() {
		System.out.println("test3 method");
	}

	@Test
	public void test4() {
		System.out.println("test4 method");
	}

	@Test
	public void test5() {
		System.out.println("test5 method");
	}


}
