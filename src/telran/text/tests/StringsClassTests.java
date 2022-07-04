package telran.text.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.text.Strings;

class StringsClassTests {

//	@Test
//	void matchesTest() {
//		String str1 = "David";
//		String str2 = "david";
//		assertEquals("match", Strings.matches(str1, str2));
//		//TODO
//		//        Examples:
////	        - David vs. david: match
////	        - John F vs. John Fitzgerald: match
////	        - John K vs. John Fitzgerald: no match
////	        - Anna Maria Magdalena vs. Anna Magdalena: match
////	        - Anna Maria Magdalena vs. Maria Magdalena: match
////	        - Anna Maria Magdalena vs. Anna Maria Roberta: no match
////	        - Anna Maria Magdalena vs. Anna Magdalena Roberta: no match
////	        - Anna Maria Magdalena vs. Anna Magdalena Maria: no match
//	}
	@Test
	void sortStringsAsNumbersTest() {
		String[] str1 = { "125", "7", "7", "7", "650", "321", "321", "1", "1", "0", "0", "999", "999", "977", "56",
				"56" };
		String[] expected = {"0", "0", "1", "1", "7", "7", "7", "56", "56", "125", "321", "321", "650", "977", "999", "999"};
		Strings.sortStringsAsNumbers(str1);
		assertArrayEquals(expected, str1);
	}

}