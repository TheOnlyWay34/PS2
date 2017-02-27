package pkgBase;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import pkgBase.MyInteger;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		MyInteger in1 = new MyInteger(376);
		MyInteger in2 = new MyInteger(139);
		MyInteger in3 = new MyInteger(376);

		assertTrue(in1.isEven());
		assertFalse(in2.isEven());
		assertFalse(in1.isOdd());
		assertTrue(in2.isOdd());
		assertFalse(in1.isPrime());
		assertTrue(in2.isPrime());

		assertTrue(MyInteger.isEven(6));
		assertFalse(MyInteger.isEven(149));
		assertTrue(MyInteger.isOdd(149));
		assertFalse(MyInteger.isOdd(6));
		assertTrue(MyInteger.isPrime(149));
		assertFalse(MyInteger.isPrime(6));

		assertTrue(MyInteger.isEven(in1));
		assertFalse(MyInteger.isEven(in2));
		assertTrue(MyInteger.isOdd(in2));
		assertFalse(MyInteger.isOdd(in1));
		assertTrue(MyInteger.isPrime(in2));
		assertFalse(MyInteger.isPrime(in1));

		assertTrue(in1.equals(376));
		assertFalse(in2.equals(376));
		assertTrue(in1.equals(in3));
		assertFalse(in1.equals(in2));

	}

}
