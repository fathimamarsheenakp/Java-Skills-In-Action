package com.kodnest.filehandling.fileio;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileIOBufferStream {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
				
			String path1 = "C:\\Users\\fathi\\OneDrive\\Desktop\\Kodnest\\Java\\File\\input.txt";
			String path2 = "C:\\Users\\fathi\\OneDrive\\Desktop\\Kodnest\\Java\\File\\output.txt";
				
			fis =  new FileInputStream(path1);
			fos = new FileOutputStream(path2);
				
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
				
			int x;
			while ((x = bis.read()) != -1) {
				bos.write(x);
			}
				
			bos.flush();
				
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				
				fis.close();
				fos.close();
				bis.close();
				bos.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		} 
	
	}
}
