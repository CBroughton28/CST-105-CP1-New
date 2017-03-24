import java.util.Scanner;

public class CheckPassword {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("A password must have at least either characters."
				+ "\nA password consists of only letters and digits."
				+ "\nA password must contain at least two digits. ");
		System.out.print("Check Password: ");
		
		if (checkPassword(input.next()))
			System.out.print("Valid Password");
		else 
			System.out.print("Invalid Password: ");
		
		
		input.close();
		

	}

	public static boolean checkPassword(String password)	
	{
		if (checkLength(password))
			if (onlyLettersDigits(password))
				if (atLeast2Digits(password))
					return true;
				else return false;
			else return false;
		else return false;
						
						
						
	}
	
	public static boolean atLeast2Digits(String password)
	{
		int digitCounter = 0;
		
		for (int i = 0; i < password.length(); i++)
			if (!(Character.isDigit(password.charAt(i))))
					digitCounter++;
			
			if(digitCounter >= 2)
				return true;
			
			return false;
			
	}
	
	
	
	public static boolean onlyLettersDigits(String password)
	{
		for (int i = 0; i < password.length(); i++)
			if (!(Character.isDigit(password.charAt(i)) || Character.isLetter(password.charAt(i))))
				return false;
		
		return true;
	
	}
	
	
	public static boolean checkLength(String password)	
	{
		if (password.length() <= 7)
			return false;
		
		return true;
		
	}
}



