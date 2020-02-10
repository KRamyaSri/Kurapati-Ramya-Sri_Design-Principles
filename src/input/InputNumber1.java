package input;

import java.util.Scanner;

public class InputNumber1 
{
	public static double integer1() 
	{
		System.out.println("Enter first number:");
		Scanner sc = new Scanner(System.in);
		double number1 = sc.nextDouble();
		return number1;
	}
}
