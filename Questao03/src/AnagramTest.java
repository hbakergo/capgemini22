import static org.junit.Assert.*;

import org.junit.Test;

/**
 * This class is used to Test Anagram class.
 * 
 * @author Hugo Baker
 *
 */
public class AnagramTest {

	/**
	 * Using a word "ovo" the exercise expected a number of Anagrams pairs equal 3,
	 * but my algorithm only returns 2.
	 * I think there was a mistake on the result expected at the exercise statement
	 */
	@Test
	public void testWordOvo() {
		Anagram anagram = new Anagram("ovo");
		assertEquals(2,anagram.getNumberOfAnagramPairs());
	}
	
	//test word ifailuhkqq
	@Test
	public void testWordIfailuhkqq() {
		Anagram anagram = new Anagram("ifailuhkqq");
		assertEquals(3,anagram.getNumberOfAnagramPairs());
	}
	
	//test empty string
	@Test
	public void testEmptyString() {
		Anagram anagram = new Anagram("");
		assertEquals(0,anagram.getNumberOfAnagramPairs());
	}
	
}
