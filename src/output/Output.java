package output;

public class Output 
{
	public static void printOutput(double number1, double number2, int operator, double result) 
	{
		switch(operator) 
		{
		case 1:
			System.out.println(number1+" + "+number2+" = "+result);
			break;
		case 2:
			System.out.println(number1+" - "+number2+" = "+result);
			break;
		case 3:
			System.out.println(number1+" * "+number2+" = "+result);
			break;
		case 4:
			System.out.println(number1+" / "+number2+" = "+result);
			break;
		default:
			Exceptions.ExceptionMessage.printErrorMessage();
			break;
		}
	}
}
