package input;

import java.util.Scanner;

public class InputOperator 
{
	public static int inputOperator() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter your choice (1,2,3,4):");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		int operatorInput = sc.nextInt();
		return operatorInput;
	}
}
