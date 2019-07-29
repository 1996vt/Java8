package com.code.StreamAPI;

import java.util.*; 
import java.util.stream.*; 
	  
public class Test 
{ 
	  public static void main(String args[]) 
	  { 
	   List<Integer> number = Arrays.asList(1,2,3,4); 
	  
	   List<Integer> square = number.stream().map(x -> x*x).collect(Collectors.toList()); // map method -> collect() returns the intermediate result of the collection
	    System.out.println(square); 
	  
	   List<String> names = Arrays.asList("Stream","String","Rest"); 
	   
	   List<String> result = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList()); //filter method 
	    System.out.println(result); 
	  
	   List<String> show = names.stream().sorted().collect(Collectors.toList()); // sorted method 
	    System.out.println(show); 
	  
	   List<Integer> numbers = Arrays.asList(2,3,4,5,2); 
	  
	   Set<Integer> squareSet = numbers.stream().map(x->x*x).collect(Collectors.toSet()); 
	   System.out.println(squareSet); 
	  
	   number.stream().map(x->x*x).forEach(y->System.out.println(y)); // forEach method
	  
	   int even = number.stream().filter(x->x%2==0).reduce(0,(init,i)-> init+i); // reduce method, initial value 0 incremented by 'i' - value in result 
	  
	   System.out.println(even);
	  } 
} 

