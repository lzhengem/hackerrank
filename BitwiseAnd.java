//Given set . Find two integers,  and  (where ), from set  such that the value of  is the maximum possible and also less than a given integer, . In this case,  represents the bitwise AND operator.
//
//Input Format
//
//The first line contains an integer, , the number of test cases. 
//Each of the  subsequent lines defines a test case as  space-separated integers,  and , respectively.
//
//Constraints
//
//Output Format
//
//For each test case, print the maximum possible value of  on a new line.
//
//Sample Input
//
//3
//5 2
//8 5
//2 2
//Sample Output
//
//1
//4
//0
//Explanation
//
// 
//
//All possible values of  and  are:
//
//The maximum possible value of  that is also  is , so we print  on a new line.
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BitwiseAND {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);
            
            //if k is odd, the answer is k-1 (k & k-1 would be k-1)
            //if k is even, the highest possible answer is k-1, but if k-1 is not possible, then k-2 is possible(from previous statement)
            //k-1 is the highest possible answer for any result
            //k-1 | k will give you the next number possible to still get (k-1) from bitwise AND
            //if k-1 and k-1|k is less than n, then it is within bounds and the answer is k-1
            if ((k-1 | k) <= n)
            	System.out.println(k-1);
            else
            //if k-1 is not achievable, k-2 is achievable  
            	System.out.println(k-2);
        }
        


        scanner.close();
    }
}
