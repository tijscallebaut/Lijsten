package lijsten;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LijstenTest {

	@Test
	void test() {
		LegeLijst ll = new LegeLijst();
		assertEquals(0,ll.getLength());
		assertEquals(ll, new LegeLijst());
		assertEquals("[]",ll.toString());
		
		NietLegeLijst nll1 = new NietLegeLijst(1,
				new NietLegeLijst(2,new LegeLijst()));
		NietLegeLijst nll2 = new NietLegeLijst(1,
				new NietLegeLijst(2,new LegeLijst()));
		assertEquals(2,nll1.getLength());
		assertEquals(nll1,nll2);
		assertNotEquals(nll1,nll2.staart);
		assertEquals("[1,2]",nll1 + "");
	}

}
