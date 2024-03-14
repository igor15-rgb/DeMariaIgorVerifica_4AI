package igor;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class DeMariaIgorTest_B {
	private DeMariaIgorClass a;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("eseguito PRIMA della CLASSE");
	}

	// INIZIO TEST

	// test di tipo int
	@Test
	void test1() {
		// fail("Not yet implemented");
		DeMariaIgorClass a = new DeMariaIgorClass();
		assertEquals(6, a.DeMariaMet(2, 3));
	}

	// test di tipo int
	@Test
	void test2() {
		// fail("Not yet implemented");
		DeMariaIgorClass a = new DeMariaIgorClass();
		assertEquals(8, a.DeMariaMet(4, 2));
	}

	// test di tipo int
	@Test
	void test3() {
		// fail("Not yet implemented");
		DeMariaIgorClass a = new DeMariaIgorClass();
		assertEquals(20, a.DeMariaMet(5, 4));
	}

}
