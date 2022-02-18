/**
 * Question 02 - Write an algorithm to show the minimum number of characters that must be 
 * added to a string must be considered safe
 * <br><br>
 * <b>Solution:</b>
 * This class contains methods to handle with passwords.
 * <br><br>
 * <b>Plus:</b>
 * To complement the solution this class also have methods to returns a 
 * feedback warning the user if the password contain a minimum of a digit 
 * value, special character, lower case character and upper case character 
 * 
 * @author Hugo Baker
 *
 */
public class Password {

	private String password;

	public Password(String password) {
		this.password = password;
	}
	
	/**
	 * This method returns a minimum number of characters that have added in
	 * the password to became it safe.
	 * 
	 * @param password	is a (string password) from user.
	 * @return integer number with number of characters to add.
	 */
	public int minimumChar() {
		return 6 - this.password.length();
	}
	
	/**
	 * This method check if the password have:
	 * 	A minimum of 6 characters
	 * 	A minimum of 1 digit
	 * 	A minimum of 1 Lower Case character
	 * 	A minimum of 1 Upper Case character
	 * 	A minimum of 1 Special character !@#$%^&*()-+
	 * <br><br>
	 * And will return a complete feedback to inform what the user have to do 
	 * for the password can be considered safe and stronger.
	 *  
	 * @param  password	is a (string password) from user.
	 * @return string with the feedback message about the password security.
	 */
	public String feedback() {
		String feedback = "Sua senha deve conter:";
		if(minimumChar() > 0) {
			feedback += "\n=> no mínimo 6 caracteres";
		}
		if(!containDigit()) {
			feedback += "\n=> no mínimo 1 digito";
		}
		if(!containLowerCase()) {
			feedback += "\n=> no mínimo 1 letra em minúsculo";
		}
		if(!containUpperCase()) {
			feedback += "\n=> no mínimo 1 letra em maiúsculo";
		}
		if(!containSpecial()) {
			feedback += "\n=> no mínimo 1 desses caracteres especiais  !@#$%^&*()-+";
		}
		if(feedback.equals("Sua senha deve conter:")) {
			return "A senha " + password + " está dentro dos padrões de segurança(senha forte).";
		} else {
			return feedback;
		}
	}
	
	/**
	 * Returns true is password string have a minimum of one
	 * digit.
	 * 
	 * @param password	is a (string password) from user.
	 * @return	true is this string contain a digit, 
	 * false otherwise.
	 */
	private boolean containDigit() {
		for(int i = 0; i < password.length(); i++) {
			char c = password.charAt(i); 
			if(Character.isDigit(c)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Returns true if password string have a minimum of one
	 * lower case character.
	 * 
	 * @param password	is a (string password) from user.
	 * @return	true if this string contain a lower case character, 
	 * false otherwise.
	 */
	private boolean containLowerCase() {
		for(int i = 0; i < password.length(); i++) {
			char c = password.charAt(i); 
			if(Character.isLowerCase(c)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Returns true if password string have a minimum of one upper
	 * case character.
	 * 
	 * @param password	is a (string password) from user.
	 * @return true if this string contain a upper case character, 
	 * false otherwise.
	 */
	private boolean containUpperCase() {
		for(int i = 0; i < password.length(); i++) {
			char c = password.charAt(i); 
			if(Character.isUpperCase(c)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Returns true if password string have a minimum one special 
	 * character of this !@#$%^&*()-+
	 *    
	 * @param password 	is a (string password) from user.
	 * @return true if this string contains a special character, 
	 * false otherwise.
	 */
	private boolean containSpecial() {
		String[] specialChar = {"!","@","#","$","%","^","&","*","(",")","-","+"};
		
		for(int i = 0; i < specialChar.length ; i++) {
			if(password.contains(specialChar[i])) {
				return true;
			}
		}
		return false;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}