package main;

import java.util.Scanner;

public class Calculator 
{
    public static void main(String[] args)
    {
    	boolean loopController=true;
    	Scanner sc=new Scanner(System.in);
    	while(loopController) 
    	{	
    		double firstNumber = input.InputNumber1.integer1();
    		double secondNumber = input.InputNumber2.integer2();
    		int operator = input.InputOperator.inputOperator();
    		double result = Logic.CallingNecessaryFunction.functionCall(firstNumber, secondNumber, operator);
    		output.Output.printOutput(firstNumber, secondNumber, operator, result);
    		System.out.println("want to continue? (yes/no):");
    		String check = sc.nextLine();
    		if("no".equals(check)) 
    	    {
    			System.out.println("bye... see you soon.");
    			loopController = false;
    		}
    		else if("yes".equals(check))
    			continue;
    		else
    			Exceptions.ExceptionMessage.printErrorMessage();
    	}
    }
}