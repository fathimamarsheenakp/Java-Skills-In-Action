package practice.array;

import java.util.Scanner;

public class MatrixMultiplier {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter length of Matrix-1: ");
		int[][] matrix1 = new int[scanner.nextInt()][scanner.nextInt()];
		
		System.out.println("Enter Matrix-1 elements: ");
		for (int i = 0; i <= matrix1.length - 1; i++) {
			for (int j = 0; j <= matrix1[i].length - 1; j++) {
				matrix1[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("Enter length of Matrix-2: ");
		int[][] matrix2 = new int[scanner.nextInt()][scanner.nextInt()];
		
		System.out.println("Enter Matrix-2 elements: ");
		for (int i = 0; i <= matrix2.length - 1; i++) {
			for (int j = 0; j <= matrix2[i].length - 1; j++) {
				matrix2[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("Matrix-1:");
		for (int[] row : matrix1) {
			for (int element : row) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
		
		System.out.println("Matrix-2:");
		for (int i = 0; i <= matrix2.length - 1; i++) {
			for (int j = 0; j <= matrix2[i].length - 1; j++) {
				System.out.print(matrix2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		multiplyMatrices(matrix1,matrix2);
		
	}
	
	public static void multiplyMatrices(int[][] matrix1, int[][] matrix2) {
		if (matrix1[0].length == matrix2.length) {
			int[][] mul = new int[matrix1.length][matrix2[0].length];
			
			for (int i = 0; i <= matrix1.length - 1; i++) {
				for (int j = 0; j <= matrix2[0].length - 1; j++) {
					for (int k = 0; k <= matrix2.length - 1; k++) {
						mul[i][j] += matrix1[i][k] * matrix2[k][j];
					}
				}
			}
			
			System.out.println("After matrix multiplication:");
			
			for (int[] row : mul) {
				for (int element : row) {
					System.out.print(element + " ");
				}
				System.out.println();
			}
		}
		else {
			System.out.println("Matrix multiplication is not possible!");
		}
	}
}
		
	
