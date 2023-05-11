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
	public void numberEqualToZero() {
		int number = 0;
		String numberReturned = fizzBuz.play(number);
		Assert.assertEquals("Invalid Input",numberReturned );
		
	}
	
	@Test
	public void numberEqualToOne() {
		int number = 1;
		String numberReturned = fizzBuz.play(number);
		Assert.assertEquals("1",numberReturned );
		
	}
	@Test
	public void numberEqualToThree() {
		int number = 3;
		String numberReturned = fizzBuz.play(number);
		Assert.assertEquals("Fizz",numberReturned );
		
	}
	@Test
	public void numberEqualToFour() {
		int number = 4;
		String numberReturned = fizzBuz.play(number);
		Assert.assertEquals("4",numberReturned );
		
	}
	@Test
	public void numberEqualToFive() {
		int number = 5;
		String numberReturned = fizzBuz.play(number);
		Assert.assertEquals("Buzz",numberReturned );
		
	}
	
}
