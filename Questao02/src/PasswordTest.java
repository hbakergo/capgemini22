import static org.junit.Assert.*;

import org.junit.Test;

/**
 * This is a test class of Password. 
 * 
 * @author Hugo Baker
 *
 */
public class PasswordTest {

	//String (password) empty
	@Test
	public void testPasswordEmpty() {
		Password password = new Password("");
		
		assertNotSame("A senha " + password + 
				" está dentro dos padrões de segurança(senha forte).",
				password.feedback());
		assertEquals(6,password.minimumChar());
	}
	
	/**
	 * String (password) without:
	 * 	minimum of 1 digit
	 * 	minimum of 1 lower case character
	 * 	minimum of 1 upper case character
	 * 	minimum of 1 special character !@#$%^&*()-+
	 */
	@Test
	public void testPasswordWithSize6() {
		Password password = new Password("||||||");
		
		assertEquals(0,password.minimumChar());
		assertEquals("Sua senha deve conter:" +
				"\n=> no mínimo 1 digito" + 
				"\n=> no mínimo 1 letra em minúsculo" +
				"\n=> no mínimo 1 letra em maiúsculo" +
				"\n=> no mínimo 1 desses caracteres especiais  !@#$%^&*()-+",
				password.feedback());
	}
	
	/**
	 * String (password) without:
	 * 	minimum of 1 lower case character
	 * 	minimum of 1 upper case character
	 * 	minimum of 1 special character !@#$%^&*()-+
	 */
	@Test
	public void testPasswordWithDigit() {
		Password password = new Password("1|||||");
		
		assertEquals(0,password.minimumChar());
		assertEquals("Sua senha deve conter:" +
				"\n=> no mínimo 1 letra em minúsculo" +
				"\n=> no mínimo 1 letra em maiúsculo" +
				"\n=> no mínimo 1 desses caracteres especiais  !@#$%^&*()-+",
				password.feedback());
	}
	
	/**
	 * String (password) without:
	 * 	minimum of 1 upper case character
	 * 	minimum of 1 special character !@#$%^&*()-+
	 */
	@Test
	public void testPasswordWithLowerCase() {
		Password password = new Password("1h||||");
		
		assertEquals(0,password.minimumChar());
		assertEquals("Sua senha deve conter:" +
				"\n=> no mínimo 1 letra em maiúsculo" +
				"\n=> no mínimo 1 desses caracteres especiais  !@#$%^&*()-+",
				password.feedback());
	}
	
	/**
	 * String (password) without:
	 * 	minimum of 1 special character !@#$%^&*()-+
	 */
	@Test
	public void testPasswordWithUpperCase() {
		Password password = new Password("1hU|||");
		
		assertEquals(0,password.minimumChar());
		assertEquals("Sua senha deve conter:" +
				"\n=> no mínimo 1 desses caracteres especiais  !@#$%^&*()-+",
				password.feedback());
	}
	
	//String (password) with special character
	@Test
	public void testPasswordWithSpecialCharacter() {
		Password password = new Password("1hUgo@");
		
		assertEquals(0,password.minimumChar());
		assertEquals("A senha " + password.getPassword() + 
				" está dentro dos padrões de segurança(senha forte).",
				password.feedback());
	}
}
