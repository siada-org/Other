package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Main.Start;

public class CalculateOverPaidTest {
	
	Start start;

	@Test
	public void test() {
		assertEquals(true, Start.calculateOverPaid(15000, 10000)==5000);
	}

}
