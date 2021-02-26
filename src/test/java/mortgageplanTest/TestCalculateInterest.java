package mortgageplanTest;

import static org.junit.Assert.*;

import org.junit.Test;

import mortgageplan.mortgageplan;

public class TestCalculateInterest {

	@Test
	public void test() {
		double output = mortgageplan.calculateInterest(6);
		
		assertEquals(0.005, output, 0.001);
	}

}
