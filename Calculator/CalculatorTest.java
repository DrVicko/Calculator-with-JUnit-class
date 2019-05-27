package Calculator;
import Calculator.Calculations; 

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest 
{
	
	@Test
	public void additionTest ()
	{
		Calculations calculations = new Calculations(); 
		int result = calculations.addNumbers (2, 3);
		assertEquals(5, result);		
	}
	
	@Test
	public void substractionTest ()
	{
		Calculations calculations = new Calculations(); 
		int result = calculations.substractNumbers (5, 2);
		assertEquals(3, result);
	}
	
	@Test
	public void multiplicationTest ()
	{
		Calculations calculations = new Calculations(); 
		int result = calculations.multiplyNumbers (2, 3);
		assertEquals(6, result);
	}
	
	@Test
	public void divisionTest ()
	{
		Calculations calculations = new Calculations(); 
		int result = calculations.divideNumbers (6, 3);
		assertEquals(2, result);
	}


}
