import java.util.Scanner;

public class FinancialCreditCardNumberValidation {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a credit card number: ");
		
		if (isValid(input.nextLong()))
			System.out.print("Credit card number is valid!");
		else
			System.out.print("Credit card number is invalid!");
			
		input.close();

	}

	public static boolean isValid(long number)
	{
		int sumEvenPlaces = 0;
		int sumOddPlaces = 0;
		boolean result = false;
		
	if (getSize(number) >= 13 && getSize(number) <= 16)	
		if (prefixMatched(number, 4) || prefixedMatch(number, 5) || prefixedMatch(number, 6) || prefixedMatch(number, 37))
		{
		
			sumEvenPlaces = sumofDoubleEvenPlace(number);
			sumOddPlaces = sumOfDoubleOddPlace(number);
			result = ((sumEvenPlaces + sumOddPlaces) % 10 == 10);
		}
		return result;
	}

	
	private static boolean prefixMatched(long number, int d) {
		
		return false;
	}

	public static int sumOfDoubleOddPlace(long number)
	{
		String numberToString = Long.toString(number);
		
		int sumOddPlaces = 0;
		for (int i = 1; i < numberToString.length(); i += 2)
			sumOddPlaces += getDigit(Character.getNumericValue(numberToString.charAt(i)));
		
		return sumOddPlaces;
		
	}
	
	
	public static int sumofDoubleEvenPlace(long number)
	{
		int sumEvenPlaces = 0;
		String numberToString = Long.toString(number);
		
		for (int i = 0; i < numberToString.length(); i += 2)
			sumEvenPlaces += (getDigit(Character.getNumericValue(numberToString.charAt(i)) * 2));
		
		return sumEvenPlaces;	
	}
	
	public static int getDigit(int number)
	{
		if (Integer.toString(number).length() == 1)
			return number;
		else
			return ((number % 10) + 1);
		
	}
	
	
	public static boolean prefixedMatch(long number, int d)
	{
		int length = new StringBuilder(Integer.toString(d)).length();
		String numberToString = Long.toString(number);
		String dToString = Integer.toString(d);
		
		for (int i = 0; i < length; i++)
			if (numberToString.charAt(i) != dToString.charAt(i))
				return false;
		
		return true;
		
	
	}
	public static int getSize(long d)
	{
		return (Long.toString(d).length());
	}
	
	
	
	
	
	
	
}
