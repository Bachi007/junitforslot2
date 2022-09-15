package com.slot2junit;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;


@TestMethodOrder(OrderAnnotation.class)
class AppTest{
	
	@Order(2)
	@Test
	void testadding() {
	
//		int exp=12;
//	int sum=new App().adding(5, 7);//actual
//		
//	assertEquals(exp,sum);
	assertEquals(10,new App().adding(2, 8));
		
	}
	
	@DisplayName(value="this is even test case")
	@Test
	void testEven() {
		
		assertFalse(new App().checkEven(13));
		
	}
	
	
	@Order(1)
	@Test
	void testsort() {
		int ar[]= {81,21,5,6,47,91};
		int res[]=new App().sortingofarray(ar);
		int exp[]={5,6,21,47,81,91};
		
		assertArrayEquals(exp,res);
		
	}
	
	@Test
	void testIterable(){
		
		ArrayList<Integer> al=new ArrayList<Integer>(Arrays.asList(5,10,8,65,71));
		
		ArrayList<Integer> al2=new ArrayList<Integer>(Arrays.asList(5,10,8,65,71));
		
		assertIterableEquals(al,al2);
		
	}
	
	@DisabledOnJre(JRE.OTHER)
	@Test
	void testString() {
		assertSame("9059065724",new App().wishme());
	}
	
	@DisabledOnOs(OS.MAC)
	@EnabledOnOs(OS.WINDOWS)
	@Test
	void testdivide() {
		assertAll(
		()->assertEquals(5,new App().divide(15, 3)),
		()->assertThrows(ArithmeticException.class,()->new App().divide(15, 0)),
		()->assertEquals(-2,new App().divide(-8, 4))
		);
	}
	
	
	@Disabled
	@Test
	void testunderdev() {
		fail("Under development");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}