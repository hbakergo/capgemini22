import java.util.Scanner;


/**
 * This class is used to implement the question 03 of Capgemini programming challenge 2022
 * <br><br>
 * Question 03 - Given any string, develop an algorithm that finds the number of pairs of 
 * substrings that are anagrams.
 * 
 * @author Hugo Baker
 *
 */
public class Questao03 {

	public static void main(String[] args) {
		System.out.println("\n===DESAFIO DE PROGRAMAÇÃO - CAPGEMINI 2022===\n");
		System.out.println("#Questão 03\n\n");
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a p:");
		String word = scan.nextLine();
		
		Anagram anagram = new Anagram(word);
		
		System.out.println("A quantidade de Anagramas pares é: " + 
							Integer.toString(anagram.getNumberOfAnagramPairs()));
		scan.close();
	}
}
