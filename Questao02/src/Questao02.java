import java.util.Scanner;

/**
 * Question 02 - Write an algorithm to show the minimum number of characters that must be 
 * added to a string must be considered safe.
 * <br><br>
 * <b>Solution:</b>
 * This algorithm returns how many characters the user have to add to have a 
 * secure password.
 * <br><br>
 * <b>Plus:</b>
 * To complement the solution this algorithm also returns a feedback warning 
 * the user if the password contain a minimum of a digit value, 
 * special character, lower case character and upper case character 
 * 
 * @author Hugo Baker
 *
 */
public class Questao02 {

	public static void main(String args[]) {
		System.out.println("\n===DESAFIO DE PROGRAMAÇÃO - CAPGEMINI 2022===\n");
		System.out.println("#Questão 02\n\n");
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a senha para testar:");
		Password password = new Password(scan.nextLine());
		
		int add = password.minimumChar();
		if (add > 0) {
			System.out.println("\nDeve ser adicionado pelo menos " + 
								Integer.toString(add) + " caracter " + 
								"para que a senha seja considerada segura!");  
		}
		
		System.out.println();
		System.out.println("=>Feedback sobre a senha<=");
		System.out.println(password.feedback());
		
		scan.close();
	}
	
}
