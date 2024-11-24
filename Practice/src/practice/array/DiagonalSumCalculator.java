package practice.array;

import java.util.Scanner;

public class DiagonalSumCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter length of matrix: ");
		int[][] matrix = new int[scanner.nextInt()][scanner.nextInt()];
		
		System.out.println("Enter Matrix elements: ");
		for (int i = 0; i <= matrix.length - 1; i++) {
			for (int j = 0; j <= matrix[i].length - 1; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println();
		System.out.println("Matrix is :");
		for (int[] row : matrix) {
			for (int element : row) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		calculateDiagonalSum(matrix);
	}
	
	public static void calculateDiagonalSum(int[][] matrix) {
		if (matrix.length == matrix[0].length) {
			int sum = 0;
			for (int i = 0; i <= matrix.length - 1; i++) {
				for (int j = 0; j <= matrix[i].length - 1; j++) {
					if (i == j) {
						sum = sum + matrix[i][j];
					}
				}
			}
			System.out.println("Sum is: " + sum);
		} else {
			System.out.println("Cannot calculate diagonal sum.");
		}
	}
}
