//this is unfinisiheddd*****************************************
//An English text needs to be encrypted using the following encryption scheme. 
//First, the spaces are removed from the text. Let  be the length of this text. 
//Then, characters are written into a grid, whose rows and columns have the following constraints:
//
//For example, the sentence if man was meant to stay on the ground god would have given us roots after removing spaces is  characters long.  is between  and , so it is written in the form of a grid with 7 rows and 8 columns.
//
//ifmanwas  
//meanttos          
//tayonthe  
//groundgo  
//dwouldha  
//vegivenu  
//sroots
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Encryption {

    // Complete the encryption function below.
    static String encryption(String s) {
    	String nospace = s.replaceAll("\\s+", "");
    	int charsPerRow = (int)Math.sqrt(nospace.length());
//    	int numCols = (int) Math.ceil(Math.sqrt(nospace.length()));
    	ArrayList<String> stringArray = new ArrayList<>();
    	
    	//use String buffer to conserve resources
    	StringBuffer outputString = new StringBuffer("");
    	
    	//loop through the string without spaces and add to the string buffer
    	for(int i = 0; i < nospace.length(); i+=charsPerRow) {
    		//if reached the end of the string for the last line, add the rest of the string
    		if(i + charsPerRow > nospace.length()){
    			stringArray.add(nospace.substring(i));
//    			outputString.append(nospace.substring(i));
    		//if haven't reached the end of the string yet, add the characters up to the
    		//row limit and then add a newline character
    		}else {
    			stringArray.add(nospace.substring(i,i + charsPerRow));
//	    		outputString.append(nospace.substring(i,i + charsPerRow));
//	    		outputString.append(" ");
    		}
    	}
    	return outputString.toString();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Encryption.txt"));

        String s = scanner.nextLine();

        String result = encryption(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
