// John works at a clothing store. He has a large pile of socks that he must pair by color for sale. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.

// For example, there are  socks with colors . There is one pair of color  and one of color . There are three odd socks left, one of each color. The number of pairs is .

// Function Description

// Complete the sockMerchant function in the editor below. It must return an integer representing the number of matching pairs of socks that are available.

// sockMerchant has the following parameter(s):

// n: the number of socks in the pile
// ar: the colors of each sock
// Input Format

// The first line contains an integer , the number of socks represented in . 
// The second line contains  space-separated integers describing the colors  of the socks in the pile.

// Constraints

//  where 
// Output Format

// Print the total number of matching pairs of socks that John can sell.

// Sample Input

// 9
// 10 20 20 10 10 30 50 10 20
// Sample Output

// 3
// Explanation

// sock.png

// John can match three pairs of socks.

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SockMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
    	Hashtable<Integer, Boolean> firstFoundSock = new Hashtable<>();
    	int matchingSocks = 0;
    	// System.out.println(socks.get(1));
    	for(int i = 0; i < ar.length; i++){
    		//if firstFoundSock.get(ar[i]) is true, this means a first sock was already found, and this current sock is the matching sock. add one to the count
    		if(firstFoundSock.get(ar[i]) != null && firstFoundSock.get(ar[i])){
    			firstFoundSock.put(ar[i], false);
    			matchingSocks += 1;

    		}else{//if firstFoundSock.get(ar[i]) is false, then this is the first sock found. change firstFoundSock.get(ar[i]) to true.
    			firstFoundSock.put(ar[i],true);
    		}
    	}
    	//return the number of matching socks
    	return matchingSocks;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("SockMerchant.txt"));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
