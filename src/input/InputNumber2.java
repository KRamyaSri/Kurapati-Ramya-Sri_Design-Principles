package input;

import java.util.Scanner;

public class InputNumber2 
{
	public static double integer2() 
	{
		System.out.println("Enter second number:");
		Scanner sc = new Scanner(System.in);
		double number = sc.nextDouble();
		return number;
	}
}
