import java.util.Scanner;

public class FibonacciNumbers {

	public static void main(String[] args) 
	{
	
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an index: ");
		int index = input.nextInt();
		System.out.print("The fib(" + index + ") is " + fibonacci(index) + ".");
		
		input.close();

	}

	public static long fibonacci(int index)
	{
		long f0 = 0, f1 = 1;
		long fibNum = 0;
		
		
		if (index == 0)
			return 0;
		if (index ==1)
			return 1;
		
		for (int i = 2; i <= index; i++)
		{
			fibNum = f0 + f1;
			f0 = f1;
			f1 = fibNum;
		}
		
		return fibNum;
		
	}
}
