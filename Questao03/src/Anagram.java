import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * This class deal with anagrams, and the main objective is return how many anagrams pairs 
 * a word contains.
 * 
 * @author Hugo Baker
 *
 */
public class Anagram {

	private String word;
	private List<String> listSubstrings = new ArrayList<>();
	
	public Anagram(String word) {
		this.word = word.toLowerCase();
		listSubstrings = getSubstrings(word);
	}
	
	/**
	 * Returns a list of substrings of a word. This list will be used
	 * to find the anagrams of a original string(word)
	 * 
	 * @param word	is a string informed by the user
	 * @return string vector that contains all the substrings
	 */
	private List<String> getSubstrings(String word){
		
		List<String> listSubstring = new ArrayList<>();
		
		for(int i = 0; i < word.length(); i++) {
			for(int j = i + 1; j <= word.length(); j++) {
				listSubstring.add(word.substring(i, j));
			}
		}
		
		return listSubstring;
	}
	
	/**
	 * Print on Console all substrings presents in word.
	 */
	public void printSubstrings() {
		System.out.println(word);
		listSubstrings.stream()
					  .forEach(System.out::println);
	}
	
	/**
	 * Check if String 1(str1) is anagram of String 2(str2)
	 * @param str1	(String) is the substring 1 to compare with substring 2.
	 * @param str2	(String) is the substring 2 to compare with substring 1.
	 * @return true	if both strings are anagrams, otherwise false
	 */
	private boolean isAnagram(String str1, String str2) {
		if(str1.length() != str2.length()) 
			return false;
      
		int count = 0;
		boolean[] check = new boolean[str2.length()];
		for(int i = 0; i < str1.length(); i++) {
			for(int j = 0; j < str2.length(); j++) {
				if(str1.charAt(i) == str2.charAt(j) && !check[j]) {
					count++; 
					check[j] = true; 
					break;
				}
			}
		}
		return count == str2.length() ? true : false;
	}
	
	/**
	 * Count anagrams presents in the listSubstrings from a word.
	 * 
	 * @return count is a integer value of how many anagrams a word contains.
	 */
	private int countAnagrams() {
		int count = 0;
		for(int i = 0; i < listSubstrings.size(); i++) {
			for(int j = i; j < listSubstrings.size(); j++) {
				if(isAnagram(listSubstrings.get(i), listSubstrings.get(j))) {
					count++;
				}
			}
		}
		return count;
	}
	
	/**
	 * Count anagrams pairs presents in the listSubstrings from a word.
	 * 
	 * @return count is a integer value of how many anagrams pairs a word contains.
	 */
    public int getNumberOfAnagramPairs(){
        int count = 0;
        for(int i = 0; i < listSubstrings.size(); i++) {
            for(int j = i+1; j < listSubstrings.size(); j++) {
                if(isAnagramPair(listSubstrings.get(i), listSubstrings.get(j))) {
                    count++;
                }
            }
        }
        return count;
    }
    
    /**
     * Returns true if the String 1 and String 2 are anagrams pairs, or false if not.
     * 
     * @param str1 (String) is the substring 1 to compare with substring 2.
     * @param str2 (String) is the substring 2 to compare with substring 1.
     * @return true	if both strings are pair anagrams, otherwise false
     */
    private boolean isAnagramPair(String str1,String str2){
    	char[] char1 = str1.toCharArray();
		char[] char2 = str2.toCharArray();
		Arrays.sort(char1);
		Arrays.sort(char2);
		str1 = new String(char1);
		str2 = new String(char2);
		
		if(str1.equals(str2)) {
			return true;
		} else return false;
    }
    
    
	public String getWord() {
		return word;
	}

	public List<String> getListSubstrings() {
		return listSubstrings;
	}
	
}
