import java.util.Scanner;

public class FinancialApplicationPayroll {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter employee's name: ");
		String empName = input.next();
		
		System.out.print("number of hours worked in a week: ");
		int hoursWorked = input.nextInt();
		
		System.out.print("Enter hourly payrate: $ ");
		double payRate = input.nextDouble();
		
		System.out.print("Enter Federal tax withholding: ");
		double fedTax = input.nextDouble() / 100.0;
		
		System.out.print("Enter State tax withholding: ");
		double stateTax = input.nextDouble() / 100.0;
		
		
		double wage = hoursWorked * payRate;
		
		System.out.print("Name: " + empName +
				"\nWage before tax deduction: " + wage +	
				"\nFederal Tax Withholding rate: " + (wage * fedTax) +
				"\nState tax Withholding rate: " + (wage * stateTax) +
				"\nWage after tax deduction: " + ((wage - (wage * fedTax)) - (wage * stateTax)));
		
		input.close();
		

	}

}