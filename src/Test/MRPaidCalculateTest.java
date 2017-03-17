package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Main.Start;

public class MRPaidCalculateTest {

	@Test
	public void test() {
		double[] ext = {11666.666666666666,8750.0,5833.333333333334,2916.6666666666674};
		double[] ent = Start.mountlyPaid(4, 2916.6666666666665, 11666.666666666666);
		
		for (int i = 0; i< ext.length; i++){
			assertEquals(true, ext[i] == ent[i]);
		}
	}

}
