import java.util.Scanner;

public class PrintTheCharactersInAStringReversely {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a sring: ");
		String value = input.nextLine();
		System.out.print("The reverse of " + "\"" + value + "\" is ");
		reverseDisplay(value);
		
		input.close();
	}

	public static void reverseDisplay(String value)
	{
		if (value.length() != 0)
		{
			System.out.println(value.charAt(value.length() - 1));
			reverseDisplay(value.substring(0, value.length() - 1));
	
	}


	}
}

