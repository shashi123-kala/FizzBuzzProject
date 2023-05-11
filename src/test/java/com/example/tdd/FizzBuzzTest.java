package com.example.tdd;

import static org.junit.Assert.assertNotNull;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
	
	private  FizzBuzz fizzBuz;
	
	@Before
	public void setup() {
		 fizzBuz = new FizzBuzz();
	}

	
	@Test
	public void numberEqualToOne() {
		int number = 0;
		String numberReturned = fizzBuz.play(number);
		Assert.assertEquals("Invalid Input",numberReturned );
		
	}
	
	
}
