package dad.codesignal;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CheckPalindromeTest {
	private CheckPalindrome checkPalindrome;
	
	@Before
	public void setup() {
		checkPalindrome = new CheckPalindrome();
	}
	
	@Test
	public void test1() {
		boolean result = checkPalindrome.solution("aba");
		assertEquals(true, result);
		
	}
	
	public void test2() {
		assertEquals(false, checkPalindrome.solution("hola"));
	}
	
	public void test3() {
		assertEquals(true, checkPalindrome.solution("olalO"));
	}
	

}
