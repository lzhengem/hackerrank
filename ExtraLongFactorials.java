//The factorial of the integer , written , is defined as:
//
//Calculate and print the factorial of a given integer.
//
//Note: Factorials of  can't be stored even in a  long long variable. Big integers must be used for such calculations. Languages like Java, Python, Ruby etc. can handle big integers, but we need to write additional code in C/C++ to handle huge values.
//
//We recommend solving this challenge using BigIntegers.
//
//Input Format
//
//Input consists of a single integer 
//
//Constraints
//
//
//Output Format
//
//Print the factorial of .
//
//Sample Input
//
//
//Sample Output
//
//
//Explanation
//
//

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ExtraLongFactorials {

    // Complete the extraLongFactorials function below.
    static void extraLongFactorials(int n) {
    	//use BigInteger so it doesnt overflow
    	BigInteger answer = BigInteger.valueOf(1);
    	//if it is 1 or less, then just return n
    	if(n <=1) {
    		answer = BigInteger.valueOf(n);
    	}
    	//loop through all the numbers less than n and multiple them
    	for(int i = n; i >1; i--) {
    		answer = answer.multiply(BigInteger.valueOf(i));
    	}
    	//output
    	System.out.println(answer);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        extraLongFactorials(n);

        scanner.close();
    }
}
