/**
 * 
 */
package com.example.demo.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 */

@RestController
@RequestMapping("/numbers")
public class myController {
	
	@GetMapping("/prime")
	public int[] primeNumbers() 
	{
		int[] prime = {2,3,5,7,11};
		return prime;
		
	}
	
	@GetMapping("/even")
	public int[] evenNumbers() 
	{
		int[] even = {2,4,6,8,10};
		return even;
	}
	
	@GetMapping("/fibo")
	public int[] fibonacciNumbers() 
	{
		int[] fibo = {55,89,144,233,377,610,987};
		return fibo;
	}
	
	
	
	
	

}
