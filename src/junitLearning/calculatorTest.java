package junitLearning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@SuppressWarnings("unused")
class calculatorTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Going to break the code!!..check result");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("all done!!..check result");
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testToString() {
		
		calculator calc= new calculator();
		assertEquals("I am a calc1", calc.toString(), "Should be not ok");
				
	}
	
	@Test
	void addcal()
	{
		calculator calc= new calculator();
		assertEquals(6, calc.add(3, 3), "Should be ok");
	}

	

}
