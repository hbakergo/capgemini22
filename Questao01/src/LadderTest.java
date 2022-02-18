
import org.junit.Test;

/**
 * This is a test class of Ladder.
 * 
 * @author Hugo Baker
 *
 */
public class LadderTest {

	//invalid input < 0
	@Test(expected=RuntimeException.class)
	public void testNegativeSteps() {
		Ladder ladder = new Ladder(-10);
		
	}
	
	//invalid input > 100
	@Test(expected=RuntimeException.class)
	public void testBigValueSteps() {
		Ladder ladder = new Ladder(500);
	}
	
	//valid input 6
	@Test
	public void testValidInput() {
		Ladder ladder = new Ladder(6);
	}
}
