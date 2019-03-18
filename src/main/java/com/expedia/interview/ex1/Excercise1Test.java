package com.expedia.interview.ex1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Excercise1Test {


	
	@Test
	public void testCase1() {
		
		Exercise1 excercise1Test=new Exercise1();

		assertEquals("three o' clock ",excercise1Test.timeInWords(3, 0));
		
		
		
	}
	
	@Test
	public void testCase2() {
		
		Exercise1 excercise1Test=new Exercise1();
		
		assertEquals("thirteen minutes to six",excercise1Test.timeInWords(5, 47));
		
		
		
	}
	
	@Test
	public void testCase3() {
		
		Exercise1 excercise1Test=new Exercise1();
		
		assertEquals("quarter past seven",excercise1Test.timeInWords(7, 15));
		
	}
}
