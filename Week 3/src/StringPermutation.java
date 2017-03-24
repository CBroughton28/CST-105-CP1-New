import java.util.Scanner;

public class StringPermutation {

	private static Scanner scanner;


	public static void main(String[] args) 
	{
		System.out.print("Enter a string: "); 
		scanner = new Scanner(System.in);
		String s = scanner.next(); 
		System.out.println("All possible permutations of " + s + " are: "); 
		 
		 
		displayPermutation(s); 
	} 
		 
		 
	 public static void displayPermutation(String s) { 
	   displayPermutation("", s); 
	 
	 } 
	
		 
	 public static void displayPermutation(String s1, String s2) { 
		 
		 
	         if (s2.length() == 0) { 
		         System.out.println(s1); 
	         } else { 
		        for (int i = 0; i < s2.length(); i++) { 
		            displayPermutation(s1 + s2.charAt(i), s2.substring(0, i) + s2.substring(i + 1)); 
		            
		        	} 
		         } 
		     } 
		
		 
	} 
