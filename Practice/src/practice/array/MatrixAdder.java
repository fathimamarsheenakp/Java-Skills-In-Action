package practice.array;

import java.util.Scanner;

public class MatrixAdder {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter dimension of the Matrix-1: ");
		int[][] mat1 = new int[scanner.nextInt()][scanner.nextInt()];
		
		System.out.println("Enter dimension of the Matrix-2: ");
		int[][] mat2 = new int[scanner.nextInt()][scanner.nextInt()];

		System.out.println("Enter elements of Matrix-1");
		for (int i = 0; i <= mat1.length - 1; i++) {
			for (int j = 0; j <= mat1[i].length - 1; j++) {
				mat1[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("Enter elements of Matrix-2");
		for (int i = 0; i <= mat2.length - 1; i++) {
			for (int j = 0; j <= mat2[i].length - 1; j++) {
				mat2[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("Matrix-1 is: ");
		for (int i = 0; i <= mat1.length - 1; i++) {
			for (int j = 0; j <= mat1[i].length - 1; j++) {
				System.out.print(mat1[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Matrix-2 is: ");
		for (int i = 0; i <= mat2.length - 1; i++) {
			for (int j = 0; j <= mat2[i].length - 1; j++) {
				System.out.print(mat2[i][j] + " ");
			}
			System.out.println();
		}

		addMatrices(mat1, mat2);
		
	}
	
	public static void addMatrices(int[][] mat1, int[][] mat2) {
		
		if (mat1.length == mat2.length && mat1[0].length == mat2[0].length) {
			
			int[][] mat3 = new int[mat1.length][mat1[0].length];
			
			for (int i = 0; i <= mat3.length - 1; i++) {
				for (int j = 0; j <= mat3[i].length - 1; j++) {
					mat3[i][j] = mat1[i][j] + mat2[i][j];
				}
			}
			
			System.out.println("After matrix addition: ");
			for (int i = 0; i <= mat3.length - 1; i++) {
				for (int j = 0; j <= mat3[i].length - 1; j++) {
					System.out.print(mat3[i][j] + " ");
				}
				System.out.println();
			}
			
		} else {
			System.out.println("Metrix addition not possible!");
		}
	}
}
