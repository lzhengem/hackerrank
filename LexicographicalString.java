//
//Given a word , rearrange the letters of  to construct another word  in such a way that  is lexicographically greater than . In case of multiple possible answers, find the lexicographically smallest one among them.
//
//Input Format
//
//The first line of input contains , the number of test cases. Each of the next  lines contains .
//
//Constraints
//
// will contain only lower-case English letters and its length will not exceed .
//Output Format
//
//For each testcase, output a string lexicographically bigger than  in a separate line. In case of multiple possible answers, print the lexicographically smallest one, and if no answer exists, print no answer.
//
//Sample Input
//
//5
//ab
//bb
//hefg
//dhck
//dkhc
//Sample Output
//
//ba
//no answer
//hegf
//dhkc
//hcdk
//Explanation
//
//Test case 1: 
//There exists only one string greater than ab which can be built by rearranging ab. That is ba.
//Test case 2: 
//Not possible to rearrange bb and get a lexicographically greater string.
//Test case 3: 
//hegf is the next string lexicographically greater than hefg.
//Test case 4: 
//dhkc is the next string lexicographically greater than dhck.
//Test case 5: 
//hcdk is the next string lexicographically greater than dkhc.
import java.io.*;
import java.util.*;

public class LexicographicalString {
	private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	int cases = Integer.parseInt(scanner.nextLine());
    	String[] output = new String[cases];
    	//loop through the cases
    	for(int i = 0; i < cases; i++) {
    		String w = scanner.nextLine();
    		String[] original_word = w.split("");
    		String[] sorted_word = original_word;
    		Arrays.sort(sorted_word);
    		String looping_char = original_word[0];
    		boolean stillsearching = true;
    		//loop through each letter in the string, to find first character to change
    		while(stillsearching) {
    			int sorted_index = Arrays.binarySearch(original_word, looping_char);
    			//make the looping_char next
//    			looping_char = original_word.next();
    			stillsearching = false;
    		}
    		int first = Arrays.binarySearch(original_word, "a"); //returns -1 if not found
    		System.out.println(Arrays.toString(original_word));
    		System.out.println(a);
//    		output[i] = w;
    	}
//    	System.out.println(Arrays.toString(output));
    	
    }
}
