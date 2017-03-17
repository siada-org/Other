package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Main.Start;

public class CalculateTotalSummTest {
	
	Start start;

	@Test
	public void test() {
		assertEquals(true, Start.calculateTotalSumm(10000, 50, 12)==15000);
	}

}
