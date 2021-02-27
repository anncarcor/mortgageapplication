package mortgageplanTest;

import static org.junit.Assert.*;

import org.junit.Test;

import mortgageplan.Mortgageplan;

public class TestCalculateInterest {

	@Test
	public void test() {
		double output = Mortgageplan.calculateInterest(6);
		
		assertEquals(0.005, output, 0.001);
	}

}
