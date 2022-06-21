package telran.numbers.tests;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import telran.numbers.AdditionalTasksConsultation;

class AdditionalTasksConsultationTests {

	@Test
	void maxSubsequenceLengthTest() {
		int ar[] = {1,1,1,3,3,3,3,5,6,6,6,6,6,7,8,8,8,9,9,9,9,9,1,1};
		assertEquals(5, AdditionalTasksConsultation.maxSubsequenceLength(ar));
	}
	@Test
	void toBinaryStrTest() {
		int a = 299;
		assertEquals(Integer.toBinaryString(a), AdditionalTasksConsultation.toBinaryStr(a));
	}

}
