package cal;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class CalculatorTest {
	
	Calculator ca =new Calculator();
	@Test
	public void testAdd_BothNumbersArePositive_ShouldReturnPositiveNumber(){
		int first=1;
		int second=2;
		
		int result = ca.add(first,second);
		assertTrue(result>0);
		//fail("Not yet implemented");
	}
	@Test
	public void testAdd_BothNumbersAreNegative_ShouldReturnNegativeNumber(){
		int first=-1;
		int second=-2;
		int result = ca.add(first,second);
		assertTrue(result<0);
	}
	@Test
	public void testAdd_GreaterNumbersISPositiveOtherOneIsNegative_ShouldReturnPositiveNumbedr() {
		int first=-1;
		int second=2;
		int result = ca.add(first,second);
		assertTrue(result>0);
	}
	@Test
	public void testAdd_GreaterNumbersIsNegativeOtherOneISPositive_ShouldReturnNegativeNumber() {
		int first=1;
		int second=-2;
		int result = ca.add(first,second);
		assertTrue(result<0);
	}
	//test

}
