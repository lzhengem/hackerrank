import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Array2DDS {


    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int max = -63; //start with lowest possible number
        int currentSum;
        //use the top left as the starting point - would only need to go down 4 rows
        for(int i=0; i<4;i++){
            //only need to loop through til index 3
            for(int j=0; j<4;j++){
                //add all the numbers in the hourglass
                currentSum = arr[i][j] + arr[i][j+1] + arr[i][j+2];//top 3 numbers
                currentSum += arr[i+1][j+1];//middle number
                currentSum += arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];//bottom 3 numbers
                if (currentSum > max) max = currentSum;

            }
            
        }
        System.out.println(max);

        return max;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Array2DDS_OUTPUT.txt"));

        int[][] arr = new int[6][6];

        int[] a = {-9,-9,-9,1,1,1};
        int[] b = {0,-9,0,4,3,2};
        int[] c = {-9,-9,-9,1,2,3};
        int[] d = {0,0,8,6,6,0};
        int[] e = {0,0,0,-2,0,0};
        int[] f = {0,0,1,2,4,0};
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        arr[3] = d;
        arr[4] = e;
        arr[5] = f;

        // for (int i = 0; i < 6; i++) {
        //     String[] arrRowItems = scanner.nextLine().split(" ");
        //     scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        //     for (int j = 0; j < 6; j++) {
        //         int arrItem = Integer.parseInt(arrRowItems[j]);
        //         arr[i][j] = arrItem;
        //     }
        // }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
