package com.code.DefaultMethods;

interface TestInterface 
{ 
	    // abstract method 
	    public void square (int a); 
	  
	    // static method 
	    static void show() 
	    { 
	        System.out.println("Static Method"); 
	    } 
} 
	  
public class Test1 implements TestInterface 
{ 
	    // Implementation of square abstract method 
	    public void square (int a) 
	    { 
	        System.out.println(a*a); 
	    } 
	  
	    public static void main(String args[]) 
	    { 
	        Test1 d = new Test1(); 
	        d.square(2); 
	  
	        // Static method executed 
	        TestInterface.show(); 
	    } 
} 

