package com.code.LambdaExpression;

public class Test1 {

			   public static void main(String args[]) {
			      Test1 object1 = new Test1();
					
			      MathOperation addition = (int a, int b) -> a + b; // A function that can be created without belonging to any class
	
					
			      MathOperation subtraction = (a, b) -> a - b; //return type is same as that of the body expression
					
			      MathOperation multiplication = (int a, int b) -> { return a * b; };
					
			      MathOperation division = (int a, int b) -> a / b;
					
			      System.out.println("10 + 5 = " + object1.operate(10, 5, addition));
			      System.out.println("10 - 5 = " + object1.operate(10, 5, subtraction));
			      System.out.println("10 x 5 = " + object1.operate(10, 5, multiplication));
			      System.out.println("10 / 5 = " + object1.operate(10, 5, division));
		     }
			
		   interface MathOperation {
		      int operation(int a, int b);
		   }
			
			
		   private int operate(int a, int b, MathOperation mathOperation) {
		      return mathOperation.operation(a, b);
		   }
		}
