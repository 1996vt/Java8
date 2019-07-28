package com.code.MethodReference;

import java.util.*; 
	  
public class Test3 { 
	  
	    // instance function 
	    void someFunction(String s) 
	    { 
	        System.out.println(s); 
	    } 
	  
	    public static void main(String[] args) 
	    { 
	  
	        List<String> list = new ArrayList<String>(); 
	        list.add("Aman"); 
	        list.add("Bman"); 
	        list.add("Cman"); 
	  

	        // using double colon operator 
	        list.forEach((new Test3())::someFunction); // calling by creating object of the class 
	    }
}