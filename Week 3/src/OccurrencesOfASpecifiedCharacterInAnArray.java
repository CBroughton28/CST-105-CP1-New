import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class OccurrencesOfASpecifiedCharacterInAnArray {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		char[] list = generateList(input.nextInt());
		System.out.print("Enter a character: ");
		char a = input.next().charAt(0);
		System.out.print("Number of " + a + " appearances is/are in " + Arrays.toString(list) + " is " + count(list, a) + ".");
				
		input.close();
	}

	public static int count(char[] chars, char ch)
	{
		return count(chars, ch, 0);
	}
	
	
	public static int count(char[] chars, char ch, int high)
	{
		if ((chars.length - 1) == high)
			return chars[high] == ch ? 1 : 0;
		
		return (chars[high] == ch ? 1 : 0) + count(chars, ch, ++high);
	}
	
	
	public static char[] generateList(int size)
	{
		
		char[] tempList = new char[size];
		Random randChar = new Random();
		
		for (int i = 0; i < size; i++)
			if (randChar.nextInt(2) == 0)
				tempList[i] = (char) (randChar.nextInt(26) + 65);
			else
				tempList[i] = (char) (randChar.nextInt(26) + 97);
		return tempList;
		
		
	}
	
	
	}
