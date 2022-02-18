import java.util.Scanner;

/**

 */


/**
 * Question 01 - Write an algorithm that print a ladder with size "n" using the 
 * char and spaces. The base and height of the ladder must be the same as the 
 * value of "n". The last line must not have any spaces.
 * 
 * @author Hugo Baker
 * 
 */
public class Questao01 {

	public static void main(String[] args) throws Exception {
        System.out.println("\n===DESAFIO DE PROGRAMAÇÃO - CAPGEMINI 2022===\n");
		System.out.println("#Questão 01\n\n");
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o tamanho da escada (valor de 01 a 100):");
		String scanInput = scan.nextLine();
        
		try {
			Ladder ladder = new Ladder(Integer.parseInt(scanInput));
			ladder.printLadder();
		} catch (NumberFormatException  NFE) {
			System.err.println("O valor infomado deve ser um inteiro.\n");
			System.err.println(NFE.toString());
		}
		scan.close();
	}
}
