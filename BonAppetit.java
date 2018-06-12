//Anna and Brian are sharing a meal at a restuarant and they agree to split the bill equally. Brian wants to order something that Anna is allergic to though, and they agree that Anna won't pay for that item. Brian gets the check and calculates Anna's portion. You must determine if his calculation is correct.
//
//For example, assume the bill has the following prices: . Anna declines to eat item  which costs . If Brian calculates the bill correctly, Anna will pay . If he includes the cost of , he will calculate . In the second case, he should refund  to Anna.
//
//You are given an array of prices, , the cost of each of the  items, , the item Anna doesn't eat, and , the total amount of money that Brian charged Anna for her portion of the bill. If the bill is fairly split, print Bon Appetit. Otherwise, print the integer amount of money that Brian must refund to Anna.
//
//Input Format
//
//The first line contains two space-separated integers  and , the number of items ordered and the -based index of the item that Anna did not eat. 
//The second line contains  space-separated integers  where . 
//The third line contains an integer, , the amount of money that Brian charged Anna for her share of the bill.
//
//Constraints
//
//Output Format
//
//If Brian did not overcharge Anna, print Bon Appetit on a new line; otherwise, print the difference (i.e., ) that Brian must refund to Anna. This will always be an integer.
//
//Sample Input 0
//
//4 1
//3 10 2 9
//12
//Sample Output 0
//
//5
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.IntStream;

public class BonAppetit {
	private static final Scanner scanner = new Scanner(System.in);
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    	String[] numItemsAndNotEatenItem = scanner.nextLine().split(" ");
    	scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
    	
    	int numItems = Integer.parseInt(numItemsAndNotEatenItem[0]);
    	int itemNotEaten = Integer.parseInt(numItemsAndNotEatenItem[1]);
    	
    	String[] prices = scanner.nextLine().split(" ");
    	scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
    	int charged = scanner.nextInt();
    	
    	//parse the prices into int
    	int[] pricesArray = new int[numItems];
    	for(int i = 0; i < numItems; i++) {
    		//if the item is something that anna shared, then add it into the array
    		if(i != itemNotEaten) {

    			pricesArray[i] = Integer.parseInt(prices[i]);
    		}
    	}
    	
    	//add up the prices, and split them
    	int sum = IntStream.of(pricesArray).sum();
    	int split = (int)(sum / 2);
    	
    	//if charged correctly, print out Bon Appetit, if not, print out how much bill owes anna
    	if(charged == split)
    		System.out.println("Bon Appetit");    	
    	else
    		System.out.println(charged - split);   
    }
}