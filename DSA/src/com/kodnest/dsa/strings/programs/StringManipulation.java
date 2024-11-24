package com.kodnest.dsa.strings.programs;

public class StringManipulation {

	public String stringReverse(String str) {
		char[] arr1 = str.toCharArray();
		char[] arr2 = new char[arr1.length];
		
		int j = arr1.length - 1;
		for (int i = 0; i <= arr1.length - 1; i++) {
			arr2[j] = arr1[i];
			j--;
		}
		str = new String(arr2);
		return str;
	}
	
	public String getReverse(String str) {
//		String[] rev = new String[str.length()];
//		StringBuffer buffer = new StringBuffer(str);
		StringBuffer rev = new StringBuffer();
		for (int i = str.length() - 1; i >= 0; i--) {
			rev.append(str.charAt(i));
//			System.out.println(rev);
		}
		
		String res = new String(rev);
		return res;
	}
	
	public String spclReverse(String str) {
		char[] arr1 = str.toCharArray();
		char[] arr2 = new char[arr1.length];
		
		for (int i = 0; i <= arr1.length - 1; i++) {
			if (arr1[i] == ' ') {
				arr2[i] = arr1[i];
			}
		}
		
		int j = arr1.length - 1;
		for (int i = 0; i <= arr1.length - 1 ; i++) {
			if (arr1[i] != ' ') {
				if (arr2[j] == ' ') {
					j--;
				} 
				arr2[j] = arr1[i];
				j--;
			}
		}
		
		String res = new String(arr2);
		return res;
	}
}
