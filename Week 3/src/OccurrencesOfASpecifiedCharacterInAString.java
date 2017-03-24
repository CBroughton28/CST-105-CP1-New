import java.util.Scanner;

public class OccurrencesOfASpecifiedCharacterInAString {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String line = input.nextLine();
		System.out.print("Enter the character to check: ");
		char c = input.next().charAt(0);
		System.out.print("The character (" + c + ") appear(s) " + count(line, c) + " time(s).");
		input.close();

	}

	public static int count(String str, char a)
	{
		if (str.length() == 1)
			return (str.charAt(0) == a ? 1 : 0);
		return (str.charAt(0) == a ? 1 : 0) + count(str.substring(1, str.length()), a);
	}
}
