package practice.array;

import java.util.Scanner;

public class StockProfitCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Profit is " + getProfit(arr));
		
	}
	
	public static int getProfit(int[] arr) {
		int minPrice = Integer.MAX_VALUE;
		int profit = 0;
		
		for (int price : arr) {
			if (price < minPrice) {
				minPrice = price;
			} else {
//				int p = price - minPrice;
				if (price - minPrice > profit) {
					profit = price - minPrice;
				}
			}
		}
		return profit;
	}
}
