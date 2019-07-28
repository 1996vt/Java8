package com.code.MethodReference;

import java.util.*; 
	  
class Test2 { 
	  
	    // constructor 
	 	public Test2(String s) 
	    { 
	        System.out.println("Hello " + s); 
	    } 
	  
	    public static void main(String[] args) 
	    { 
	  
	        List<String> list = new ArrayList<String>(); 
	        list.add("Aman"); 
	        list.add("Bman"); 
	        list.add("Cman"); 
	  
 
	        // using double colon operator 
	        list.forEach(Test2::new); // calling by new keyword
	    } 
} 
