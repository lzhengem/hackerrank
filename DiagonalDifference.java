//Given a square matrix, calculate the absolute difference between the sums of its diagonals.
//
//Input Format
//
//The first line contains a single integer,  denoting the number of rows and columns in the matrix . 
//The next  lines denote the matrix 's rows, with each line containing  space-separated integers describing the columns.
//
//Constraints
//
//Output Format
//
//Print the absolute difference between the sums of the matrix's two diagonals as a single integer.
//
//Sample Input
//
//3
//11 2 4
//4 5 6
//10 8 -12
//Sample Output
//
//15
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class DiagonalDifference {

    // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] a) {
    	int leftDiagonal = 0;
    	int rightDiagonal = 0;
    	//loop over each row
    	for(int i =0; i< a.length; i++) {
    		//loop over each column
    		for(int j =0; j< a.length; j++) {
    			//add to the left diagonal if column == row
    			if(j == i) {
    				leftDiagonal += a[i][j];
    			}
    			//add to the right diagonal if column == rowlength - row
    			if(j == a.length -1 - i) {
    				rightDiagonal += a[i][j];
    			}
    		}
    	}
    	return Math.abs(leftDiagonal - rightDiagonal);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//    	BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("diagonalDifference.txt"));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] aRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < n; j++) {
                int aItem = Integer.parseInt(aRowItems[j]);
                a[i][j] = aItem;
            }
        }

        int result = diagonalDifference(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
