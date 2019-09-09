package test;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import main.Calculator;


public class CalculatorTest {
	
	Calculator calculator;

	@Before
	public void setUp() throws Exception{
		calculator = new Calculator();
	}
	
	@SuppressWarnings("unlikely-arg-type")
	@Test
	public void add() throws Exception{
		equals(calculator.add(20,10,30));
	}
	@SuppressWarnings("unlikely-arg-type")
	@Test
	public void subtract() throws Exception{
		equals(calculator.subtract(20,10,10));
	}
	@SuppressWarnings("unlikely-arg-type")
	@Test
	public void div() throws Exception{
		equals(calculator.div(20,10,2));
	}
	@SuppressWarnings("unlikely-arg-type")
	@Test
	public void multi() throws Exception{
		equals(calculator.multi(20,10,200));
	}

}
