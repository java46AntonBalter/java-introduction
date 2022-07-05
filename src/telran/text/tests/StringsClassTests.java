package telran.text.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.text.Strings;

class StringsClassTests {

	@Test
	void matchesTest() {
		String str1 = "David";
		String str2 = "david";
		String str3 = "John F";
		String str4 = "John K";
		String str5 = "John Fitzgerald";
		String str6 = "Anna Maria Magdalena";
		String str7 = "Anna Magdalena";
		String str8 = "Maria Magdalena";
		String str9 = "Anna Maria Roberta";
		String str10 = "Anna Magdalena Roberta";
		String str11 = "Anna Magdalena Maria";

		assertEquals("match", Strings.matches(str1, str2));
		assertEquals("match", Strings.matches(str3, str5));
		assertEquals("no match", Strings.matches(str4, str5));
		assertEquals("match", Strings.matches(str6, str7));
		assertEquals("match", Strings.matches(str6, str8));
		assertEquals("no match", Strings.matches(str6, str9));
		assertEquals("no match", Strings.matches(str6, str10));
		assertEquals("no match", Strings.matches(str6, str11));
	}

	@Test
	void sortStringsAsNumbersTest() {
		String[] str1 = { "125", "7", "7", "7", "650", "321", "321", "1", "1", "0", "0", "999", "999", "977", "56",
				"56" };
		String[] expected = { "0", "0", "1", "1", "7", "7", "7", "56", "56", "125", "321", "321", "650", "977", "999",
				"999" };
		Strings.sortStringsAsNumbers(str1);
		assertArrayEquals(expected, str1);
	}

}