package mortgageplanTest;

import static org.junit.Assert.*;
import org.junit.Test;

import mortgageplan.mortgageplan;

public class TestCalculateFixedMonthlyPayment {

	@Test
	public void test() {
double output = mortgageplan.calculateFixedPayment(10, 1, 2);
		
		assertEquals(20, output, 0.001);
	}

}
