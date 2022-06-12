package test;
import junit.framework.*;

import org.junit.Assert;

import Scenario.Multiple;

public class TestUnitaireMult extends TestCase {
	
	Multiple m = new Multiple();
	
	
	
	public void testDeZero() {
	
		assertEquals(0, m.multiplication(0, 3));
	}
	public void testNegatif() {
	
		assertEquals(4, m.multiplication(-2, 2));
	}
	
	
	
	public void testNegatif1() {

		assertEquals(4, m.multiplication(2, -2));
	}
	
	
	
	
	
    public void testPositif() {
	    
		assertEquals(9, m.multiplication(3, 3));
		assertEquals(10, m.multiplication(2,5));
	}

}
