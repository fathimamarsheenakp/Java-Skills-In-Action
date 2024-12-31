package com.kodnest.filehandling.fileio;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputOutput {

	public static void main(String[] args) {
		try {
			
			String path1 = "C:\\Users\\fathi\\OneDrive\\Desktop\\Kodnest\\Java\\File\\input.txt";
			String path2 = "C:\\Users\\fathi\\OneDrive\\Desktop\\Kodnest\\Java\\File\\output.txt";
			
			FileInputStream fis =  new FileInputStream(path1);
			FileOutputStream fos = new FileOutputStream(path2);
			
			int x;
			while ((x = fis.read()) != -1) {
				fos.write(x);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
