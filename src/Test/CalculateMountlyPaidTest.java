package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Main.Start;

public class CalculateMountlyPaidTest {
	

	@Test
	public void test() {
		assertEquals(true, Start.calculateMountlyPaid(15000, 12)==1250);
	}

}
