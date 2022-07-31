package com.assignments;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SumOfDigitsTest {
	static SumOfDigits sumOfDigits;
	@Before
	public void before() {
		System.out.println("Before");
	}
	
	@BeforeClass
	public static void beforeClass() {
		sumOfDigits = new SumOfDigits();
		System.out.println("Before Class");
	}

	@Test
	public void testSumDigits() {
		long actualResult = sumOfDigits.sumDigits(123);
		assertEquals(6, actualResult);
	}
	
	@Test
	public void testSumDigitsOtherNumber() {
		long actualResult = sumOfDigits.sumDigits(124);
		
		assertEquals(7, actualResult);
	}
	
	@After
	public void after() {
		System.out.println("After");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
	
	@Test(expected=NullPointerException.class)
	public void testException() {
		throw new NullPointerException();
	}

}
