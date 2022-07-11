package telran.text.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static telran.text.Ad04.*;

class Ad04Tests {

	@Test
	void Ad04TestTrue() {
		String exp = "aaaaaa (sdfsdfdsf[dfd(f)f] zcvzxcv {{[ghjk]}} asd )";	
		assertTrue(hasaValidBrackets(exp));
	}
	@Test
	void Ad04TestFalse() {
		String exp = ")dfgswfgsf(";	
		assertFalse(hasaValidBrackets(exp));
		exp = "[werwert(wertwrtw] wertrt)";
		assertFalse(hasaValidBrackets(exp));
	}

}
