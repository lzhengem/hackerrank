//Your local library needs your help! Given the expected and actual return dates for a library book, create a program that calculates the fine (if any). The fee structure is as follows:
//
//If the book is returned on or before the expected return date, no fine will be charged (i.e.: .
//If the book is returned after the expected return day but still within the same calendar month and year as the expected return date, .
//If the book is returned after the expected return month but still within the same calendar year as the expected return date, the .
//If the book is returned after the calendar year in which it was expected, there is a fixed fine of .
//Input Format
//
//The first line contains  space-separated integers denoting the respective , , and  on which the book was actually returned. 
//The second line contains  space-separated integers denoting the respective , , and  on which the book was expected to be returned (due date).
//
//Constraints
//
//Output Format
//
//Print a single integer denoting the library fine for the book received as input.
//
//Sample Input
//
//9 6 2015
//6 6 2015
//Sample Output
//
//45
//Explanation
//
//Given the following return dates: 
//Actual:  
//Expected: 
//
//Because , we know it is less than a year late. 
//Because , we know it's less than a month late. 
//Because , we know that it was returned late (but still within the same month and year).
//
//Per the library's fee structure, we know that our fine will be . We then print the result of  as our output.
import java.io.*;
import java.util.*;

public class NestedLogic {
	private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	String[] returnDate = scanner.nextLine().split(" ");
    	int returnDay = Integer.parseInt(returnDate[0]);
    	int returnMonth = Integer.parseInt(returnDate[1]);
    	int returnYear = Integer.parseInt(returnDate[2]);
    	
    	String[] dueDate = scanner.nextLine().split(" ");
    	int dueDay = Integer.parseInt(dueDate[0]);
    	int dueMonth = Integer.parseInt(dueDate[1]);
    	int dueYear = Integer.parseInt(dueDate[2]);
    	
    	int fee;
    	if(returnYear > dueYear) {
    		fee=10000;
    	}else if (returnYear == dueYear && returnMonth > dueMonth) {
    		fee =500 * (returnMonth - dueMonth);
    	}else if (returnYear == dueYear && returnMonth == dueMonth && returnDay > dueDay) {
    		fee =15 * (returnDay - dueDay);
    	}else {
    		fee =0;
    	}
    	System.out.println(fee);
    }
}
