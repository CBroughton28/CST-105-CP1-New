import java.util.Scanner;

public class FinancialApplicationFutureInvestment {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		final int YEARS = 5;
		
		System.out.print("input investment amount and annual interest rate: ");
		System.out.printf("Investment value is $%.2f", furureInvestmentValue(input.nextDouble(), (input.nextDouble() / 1200), YEARS));
		
		input.close();
		
	}
	
	public static double furureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years)
	{
		System.out.printf("%-5s %s \n", "YEAR", "Investment Value");

		
		for (int i = 1; i <= years; i++)
		{
			for (int j = 1; j <= 12; j++)
				investmentAmount += (investmentAmount * monthlyInterestRate);
			System.out.printf("%-5d %.2f \n", i, investmentAmount);
		}
	
		return investmentAmount;
	}

}
