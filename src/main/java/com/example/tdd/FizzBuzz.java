package com.example.tdd;

public class FizzBuzz {
public String play(int number) {		
		
		if(number == 0 ) 
		return "Invalid Input";	
		if(number % 3 == 0 ) 
			return "Fizz";	
		return String.valueOf(number);		
		
	}

}
