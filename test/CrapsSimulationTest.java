import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CrapsSimulationTest
{

	@Test
	void test_static_1()
	{
//		fail("Not yet implemented");
		
		Die die = new CrookedDie1();
		
		assertEquals("Die1.testStatic()", die.testStatic());
	}
	
	@Test
	void test_static_2()
	{
//		fail("Not yet implemented");
		
		CrookedDie1 die = new CrookedDie1();
		
		assertEquals("CrookedDie1.testStatic()", die.testStatic());
	}

}
