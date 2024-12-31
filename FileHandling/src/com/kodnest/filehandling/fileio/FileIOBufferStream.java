package com.kodnest.filehandling.fileio;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileIOBufferStream {

	public static void main(String[] args) {
	try {
				
				String path1 = "C:\\Users\\fathi\\OneDrive\\Desktop\\Kodnest\\Java\\File\\input.txt";
				String path2 = "C:\\Users\\fathi\\OneDrive\\Desktop\\Kodnest\\Java\\File\\output.txt";
				
				FileInputStream fis =  new FileInputStream(path1);
				FileOutputStream fos = new FileOutputStream(path2);
				
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				
				int x;
				while ((x = bis.read()) != -1) {
					bos.write(x);
				}
				
				bos.flush();
				
			}catch (Exception e) {
				e.printStackTrace();
			}
	}
}
