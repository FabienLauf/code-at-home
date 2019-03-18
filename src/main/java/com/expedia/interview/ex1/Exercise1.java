package com.expedia.interview.ex1;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Exercise1 {

	
	String timeInWords(int h, int m) {

		String timeInWords="";

		String nums[] = { "zero", "one", "two", "three", "four", 
				"five", "six", "seven", "eight", "nine", 
				"ten", "eleven", "twelve", "thirteen", 
				"fourteen", "fifteen", "sixteen", "seventeen", 
				"eighteen", "nineteen", "twenty", "twenty one", 
				"twenty two", "twenty three", "twenty four", 
				"twenty five", "twenty six", "twenty seven", 
				"twenty eight", "twenty nine", 
		}; 
	        
		//if minute is equals to zero
		if (m == 0) 
			timeInWords= nums[h] + " o' clock "; 

		//if minute is equals to one
		else if (m == 1) 
			timeInWords = "one minute past " +  
					nums[h]; 
		
		//if minute is equals to fifty nine
		else if (m == 59) 
			timeInWords= "one minute to " +  
					nums[(h % 12) + 1]; 
		
		//if minute is equals to fifteen
		else if (m == 15) 
			timeInWords= "quarter past " + nums[h]; 

		//if minute is equals to thirty
		else if (m == 30) 
			timeInWords= "half past " + nums[h]; 

		//if minute is equals to fourty five
		else if (m == 45)
			timeInWords= "quarter to " +  
					nums[(h % 12) + 1]; //

		// for minutes between 1-29
		else if (m <= 30) 
			timeInWords= nums[m] + " minutes past " + 
					nums[h]; 
		
		// for minutes between 31-59
		else if (m > 30) 
			timeInWords = nums[60 - m] + " minutes to " +      
					nums[(h % 12) + 1]; 

		return timeInWords;
	}

    public static void main(String[] args) {
		
    	Exercise1 exercise1=new Exercise1();
    	String result=exercise1.timeInWords(7, 15);
    	System.out.println(result);
    	
	}
}
