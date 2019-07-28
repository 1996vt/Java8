package com.code.MethodReference;

import java.util.List;
import java.util.ArrayList;

	public class Test1 {

	   public static void main(String args[]) {
	      List names = new ArrayList();
			
	      names.add("Aman");
	      names.add("Bman");
	      names.add("Cman");
			
	      names.forEach(System.out::println); // Calling direct by class name
	   }
}