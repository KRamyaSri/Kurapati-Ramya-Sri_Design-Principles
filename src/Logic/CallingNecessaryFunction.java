package Logic;

public class CallingNecessaryFunction 
{
	public static double functionCall(double number1, double number2, int choice) 
	{
		double result = 0;
		switch(choice) 
		{
		case 1:
			 result = functions.Addition.add(number1, number2);
			 break;
		case 2:
			 result = functions.Subtraction.sub(number1, number2);
			 break;
		case 3:
			 result = functions.Multiplication.mult(number1, number2);
			 break;
		case 4:
			 result = functions.Division.div(number1, number2);
			 break;
		default:
			Exceptions.ExceptionMessage.printErrorMessage();
			break;
		}
		return result;
	}
}
