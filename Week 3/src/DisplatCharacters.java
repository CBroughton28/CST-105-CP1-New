import java.util.Scanner;

public class DisplatCharacters {

	public static void main(String[] args) 
	{
		
		final int CHARACTERS_PER_LINE = 10;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter character to print: ");
		printChars(input.next().charAt(0), input.next().charAt(0), CHARACTERS_PER_LINE);
		
		input.close();
	}
	
public static void printChars(char ch1, char ch2, int numberPerLine)
{
	int counter = 0;
	
	for (int i = ch1; i <= ch2; i++)
	{
		counter++;
		
		if (counter % 10 == 0)
			System.out.printf("%-2s \n", ((char) i));
		else
			System.out.printf("%-2s", ((char) i));
			
	}

}
}