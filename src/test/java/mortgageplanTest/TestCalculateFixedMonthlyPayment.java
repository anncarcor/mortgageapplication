package mortgageplanTest;

import static org.junit.Assert.*;
import org.junit.Test;

import mortgageplan.Mortgageplan;

public class TestCalculateFixedMonthlyPayment {

	@Test
	public void test() {
double output = Mortgageplan.calculateFixedPayment(10, 1, 2);
		
		assertEquals(20, output, 0.001);
	}

}
