package practice.array;

import java.util.Scanner;

public class MatrixTransposer {

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
		
		
		int[][] transpose = transposeMatrix(matrix);
		
		System.out.println("Transpose of the matrix is : ");
		for (int[] row : transpose) {
			for (int element : row) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
	}
	
	public static int[][] transposeMatrix(int[][] matrix) {
		int[][] transpose = new int[matrix.length][matrix[0].length];
		for (int i = 0; i <= matrix.length - 1; i++) {
			for (int j = 0; j <= matrix[i].length - 1; j++) {
				transpose[i][j] = matrix[j][i];
			}
		}
		
		return transpose;
	}

}
