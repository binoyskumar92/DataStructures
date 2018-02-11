/*
 * Programming Interview Question:
Given an array of stock prices, find the maximum profit that can be earned by performing multiple non-overlapping transactions (buy and sell)

Input: 100, 80, 120, 130, 70, 60, 100, 125
Output: 115

Algorithm:
1. Find increasing pairs
2. Accumulate profit for each pair
 */
public class Main {

    public static void main(String[] args) {
	    int[] arr = {100, 80, 120, 130, 70, 60, 100, 125};
	    int i=0,profit=0;
	    while(i<arr.length-1){
	        if(arr[i]<arr[i+1]){
	            profit+=arr[i+1]-arr[i];
	        }
	        i++;
	    }
	    System.out.println("Profit="+profit);
    }
}
