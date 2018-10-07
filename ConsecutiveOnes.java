//Given a base- integer, , convert it to binary (base-). Then find and print the base- integer denoting the maximum number of consecutive 's in 's binary representation.
//
//Input Format
//
//A single integer, .
//
//Constraints
//
//Output Format
//
//Print a single base- integer denoting the maximum number of consecutive 's in the binary representation of .
//
//Sample Input 1
//
//5
//Sample Output 1
//
//1
//Sample Input 2
//
//13
//Sample Output 2
//
//2
//Explanation
//
//Sample Case 1: 
//The binary representation of  is , so the maximum number of consecutive 's is .
//
//Sample Case 2: 
//The binary representation of  is , so the maximum number of consecutive 's is .
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ConsecutiveOnes {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        
        //do a bitwise shift to the left one time
        //then use bitwise AND between n and n<<1
        //the consecutive ones in the number will end up in the bitwise AND
        //count how many times you can shift. the number of times that you
        //are able to shift the ones over is the number of how many consecutive ones there are
        int count = 0;        
        while (n != 0) {
        	count++;
        	n = (n & (n <<1));
        	//System.out.println("n is now " + n);
        }
        System.out.println(count);
    }
}

