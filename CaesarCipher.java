//Julius Caesar protected his confidential information by encrypting it in a cipher. Caesar's cipher rotated every letter in a string by a fixed number, , making it unreadable by his enemies. Given a string, , and a number, , encrypt  and print the resulting string.
//
//Note: The cipher only encrypts letters; symbols, such as -, remain unencrypted.
//
//Input Format
//
//The first line contains an integer, , which is the length of the unencrypted string. 
//The second line contains the unencrypted string, . 
//The third line contains the integer encryption key, , which is the number of letters to rotate.
//
//Constraints 
// 
// 
// is a valid ASCII string and doesn't contain any spaces.
//
//Output Format
//
//For each test case, print the encoded string.
//
//Sample Input
//
//11
//middle-Outz
//2
//Sample Output
//
//okffng-Qwvb
//Explanation
//
//Each unencrypted letter is replaced with the letter occurring  spaces after it when listed alphabetically. Think of the alphabet as being both case-sensitive and circular; if  rotates past the end of the alphabet, it loops back to the beginning (i.e.: the letter after  is , and the letter after  is ).
//
//Selected Examples: 
// (ASCII 109) becomes  (ASCII 111). 
// (ASCII 105) becomes  (ASCII 107). 
// remains the same, as symbols are not encoded. 
// (ASCII 79) becomes  (ASCII 81). 
// (ASCII 122) becomes  (ASCII 98); because  is the last letter of the alphabet,  (ASCII 97) is the next letter after it in lower-case rotation.
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CaesarCipher {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        
        //loop through the string
        for(int i = 0; i< n; i++) {
        	int ascii = (int) s.charAt(i);
        	char translated;
        	
        	
        	if (ascii >=97 && ascii <=122 ) {//if the character is a-z
        		translated = (char)(((ascii - 97 + k) % 26) + 97);
//        		System.out.println("the ascii is " + ascii);
//        		System.out.println("the character is " + translated);
        	}
        	else if(ascii >=65 && ascii <=90) { //the character is A-Z
        		translated = (char)(((ascii - 65 + k) % 26) + 65);
        	}else {//not in the alphabet
        		translated = (char)ascii;
        	}
        	System.out.print(translated);
        }
        
    }
}
