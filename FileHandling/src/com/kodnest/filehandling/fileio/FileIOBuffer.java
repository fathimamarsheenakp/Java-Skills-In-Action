package com.kodnest.filehandling.fileio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileIOBuffer {

	public static void main(String[] args) {
		
		try {
			
			String path1 = "C:\\Users\\fathi\\OneDrive\\Desktop\\Kodnest\\Java\\File\\NewInput.txt";
			String path2 = "C:\\Users\\fathi\\OneDrive\\Desktop\\Kodnest\\Java\\File\\NewOutput.txt";
			
			FileReader fr = new FileReader(path1);
			FileWriter fw = new FileWriter(path2);
			
			BufferedReader br = new BufferedReader(fr);
			BufferedWriter bw = new BufferedWriter(fw);
			
			String x;
			while ((x = br.readLine()) != null) {
				bw.write(x);
			}
			
			bw.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
