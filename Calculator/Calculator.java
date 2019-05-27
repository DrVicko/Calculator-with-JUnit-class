package Calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); 
		int number1;
		int number2; 
		int selection = -1; 
		
		Calculations calculations = new Calculations(); 
		
		while (selection != 0)
		{
			try
			{
				System.out.println("\nSelect: \n1. To add two numbers \n2. To subtract two numbers \n3. To multiply two numbers"
						+ "\n4. To divide two numbers \n0. To exit Calculator app");
		   
				selection = input.nextInt(); 
			} catch (InputMismatchException ex)
			{
				System.out.println("Error!! Input must be integer, please try again");
				input.nextLine(); 
			}
	
			if (selection == 1)
			{
				System.out.println("Enter first number: ");
				number1 = input.nextInt(); 
				System.out.println("Enter second number");
				number2 = input.nextInt(); 
				int result = calculations.addNumbers(number1, number2);
				System.out.println(number1 + " + " + number2 + " is " + result);
			}
			else if (selection == 2)
			{
				System.out.println("Enter first number: ");
				number1 = input.nextInt(); 
				System.out.println("Enter second number");
				number2 = input.nextInt(); 
				int result = calculations.divideNumbers(number1, number2);
				System.out.println(number1 + " - " + number2 + " is " + result);
			}
			else if (selection == 3)
			{
				System.out.println("Enter first number: ");
				number1 = input.nextInt(); 
				System.out.println("Enter second number");
				number2 = input.nextInt(); 
				int result = calculations.multiplyNumbers(number1, number2);
				System.out.println(number1 + " * " + number2 + " is " + result);
			}
			else if (selection == 4)
			{
				System.out.println("Enter first number: ");
				number1 = input.nextInt(); 
				System.out.println("Enter second number");
				number2 = input.nextInt(); 
				int result = calculations.divideNumbers(number1, number2);
				System.out.println(number1 + " / " + number2 + " is " + result);
			}
			else if (selection == 0)
			{
				break; 
			}  
		}
		input.close();

	}

}
