import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
//import arrays so can use sort function
//import java.util.Arrays;

public class DivisiblePairsSum {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        scanner.close();
    	
    	//for testing just hard code n,k,a
//    	int k = 2;
//      int[] a = {6, 5, 7, 4, 2, 4};
    	
        
        int validPairs = 0;
        
        //loop through the array to see if any 2 numbers are divisible by k
        for(int i = 0; i < a.length; i++) { 
        	for(int j = i+1; j < a.length; j++) {
        		if((a[i] + a[j]) % k == 0) {
//        			System.out.print(i + " and " + j + ":");
//        			System.out.println(a[i] + " + " + a[j] + " = " + (a[i] + a[j]));
        			validPairs++;
        		}
        		
        	}
        	
        }
        System.out.println(validPairs);
    }
}