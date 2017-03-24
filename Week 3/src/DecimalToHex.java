import java.util.Scanner;

public class DecimalToHex {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter an integer between 0 and 15: ");
		int hex = input.nextInt();
		
		if (hex <= 9)
		{
			System.out.print("The hex value is " + hex);
		
		}
		else
		{
			System.out.print("The hex value is " + (char) (hex + 55));
		}
		
		input.close();

	}

}
