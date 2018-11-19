// Lilah has a string, , of lowercase English letters that she repeated infinitely many times.

// Given an integer, , find and print the number of letter a's in the first  letters of Lilah's infinite string.

// For example, if the string  and , the substring we consider is , the first  characters of her infinite string. There are  occurrences of a in the substring.

// Function Description

// Complete the repeatedString function in the editor below. It should return an integer representing the number of occurrences of a in the prefix of length  in the infinitely repeating string.

// repeatedString has the following parameter(s):

// s: a string to repeat
// n: the number of characters to consider
// Input Format

// The first line contains a single string, . 
// The second line contains an integer, .

// Constraints

// For  of the test cases, .
// Output Format

// Print a single integer denoting the number of letter a's in the first  letters of the infinite string created by repeating  infinitely many times.

// Sample Input 0

// aba
// 10
// Sample Output 0

// 7
// Explanation 0 
// The first  letters of the infinite string are abaabaabaa. Because there are  a's, we print  on a new line.

// Sample Input 1

// a
// 1000000000000
// Sample Output 1

// 1000000000000
// Explanation 1 
// Because all of the first  letters of the infinite string are a, we print  on a new line.

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RepeatedString {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
    	// ArrayList<Integer> stringArr = new ArrayList<>(); 
    	long num_a = 0;
    	//count the number of a's in one complete string
    	for(char c : s.toCharArray()){
    		if (c == 'a'){
    			num_a++;
    		}
    	}
    	//get the length of s. aba = 2 a's. divide n by the length of s, and multiple this with how many a's are in one iteration of the string.
    	//next we need to see how many a's are left over in the rest of the string
    	num_a *= n/s.length();
    	
    	for(int i = 0; i < n % s.length(); i++){
    		if(s.charAt(i) == 'a')
    			num_a++;
    	}
    	System.out.println(num_a);
    	return num_a;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("RepeatedString.txt"));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
