package com.slot2junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppTest{
	
	@AfterEach
	 void beforetestcase() {
		System.out.println("After each tests");
	}
	@BeforeEach
	 void beforeeachtest() {
		System.out.println("Before each tests");
	}
	
	@Test
	void testadding() {
		App ap=new App();
		int exp=5;
		int actual=ap.adding(2, 3);
	System.out.println("This is first testcase");	
		assertEquals(exp,actual,"it would return 6");
	}
	
	@Test
	void testEven()
	{
		System.out.println("This is second testcase");
		assertTrue(new App().checkEven(8));
	}
	
}