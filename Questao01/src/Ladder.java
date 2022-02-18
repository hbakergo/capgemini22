
/**
 * This class prints a ladder with size "n" using the char * and
 * spaces. The base and height of the ladder must be the same as the value of
 * "n". The last line must not have any spaces.
 * 
 * @author Hugo Baker
 */
public class Ladder {

	private int size;

	/**
	 * I delimited the size of ladder to between 0 and 100 just to the ladder stay
	 * on limit on the most screen sizes of terminals.
	 * 
	 * @param size	is the size of Ladder(steps)
	 */
	public Ladder(int size) {
            if((size > 0) && (size <= 100)){
            	this.size = size;
            } else throw new RuntimeException("O tamanho da escada dever ser um valor inteiro entre 0 e 100.");
	}
	
	/**
     * Prints an sequence of character "*" on the line. Each line represents a
     * step of Ladder.
     * 
     * @param size  is an integer value that represents total of steps
     * @param space is an integer value that represents spaces to print
     */
    private void printLadderSteps(int size, int space){        
        if(size > 1){
        	printLadderSteps(size-1, space+1);
        } 
            for(int i = 0; i < space; i++){
                System.out.print(" ");
            }
            for(int i = 0; i < size; i++){
                System.out.print("*");
            }
        System.out.println("\n");
    }
    
    /**
     * Print a Ladder.
     */
    public void printLadder() {
    	printLadderSteps(size, 0);
    }
	
}
