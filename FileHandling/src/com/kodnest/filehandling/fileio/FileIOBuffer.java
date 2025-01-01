package com.kodnest.filehandling.fileio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileIOBuffer {

	public static void main(String[] args) {
		
		FileReader fr = null;
		FileWriter fw = null;
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			
			String path1 = "C:\\Users\\fathi\\OneDrive\\Desktop\\Kodnest\\Java\\File\\NewInput.txt";
			String path2 = "C:\\Users\\fathi\\OneDrive\\Desktop\\Kodnest\\Java\\File\\NewOutput.txt";
			
			fr = new FileReader(path1);
			fw = new FileWriter(path2);
			
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			
			String x;
			while ((x = br.readLine()) != null) {
				bw.write(x);
			}
			
			bw.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				
				fr.close();
				fw.close();
				br.close();
				bw.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
	}
}
