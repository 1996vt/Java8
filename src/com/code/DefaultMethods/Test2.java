package com.code.DefaultMethods;


	interface TestInterface1 
	{ 
	   
	    default void show() 
	    { 
	        System.out.println("Default TestInterface1"); 
	    } 
	} 
	  
	interface TestInterface2 
	{ 
	   
	    default void show() 
	    { 
	        System.out.println("Default TestInterface2"); 
	    } 
	} 
	   
public class Test2 implements TestInterface1, TestInterface2 
{ 
	    // Overriding default show method 
	    public void show() 
	    { 
	         
	        TestInterface1.super.show(); 
	   
	        TestInterface2.super.show(); 
	    } 
	  
	    public static void main(String args[]) 
	    { 
	        Test2 d = new Test2(); 
	        d.show(); 
	    } 
} 

