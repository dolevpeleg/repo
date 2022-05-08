import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrimeNumberMethodTest 
{
	@Test
	void test() 
	{
		assertTrue(PrimeNumberMethod.isPrime(11) == true);
		assertTrue(PrimeNumberMethod.isPrime(50) == false);
	}

}
