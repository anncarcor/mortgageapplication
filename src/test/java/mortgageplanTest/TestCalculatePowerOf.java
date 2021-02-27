package mortgageplanTest;

import static org.junit.Assert.*;

import org.junit.Test;

import mortgageplan.Mortgageplan;

public class TestCalculatePowerOf {

	@Test
	public void test() {
		double output = Mortgageplan.calculatePowerOf(2,2);
		
		assertEquals(9, output, 0.001);
	}

}
