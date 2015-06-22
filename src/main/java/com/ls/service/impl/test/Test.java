package com.ls.service.impl.test;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			ZipFile fileToUnzip = new ZipFile("C:\\Users\\Administrator\\Downloads\\stream.zip");
			long start = System.currentTimeMillis();
			
			Enumeration<? extends ZipEntry> enumeration = fileToUnzip.entries();
			
			while(enumeration.hasMoreElements()) {
				
				ZipEntry zipEntry = enumeration.nextElement();
				
				System.out.println("find file " + zipEntry.getName());
				
				InputStream bis = fileToUnzip.getInputStream(zipEntry);
				
				FileOutputStream fos = new FileOutputStream(new File("C:\\Users\\Administrator\\Downloads\\stream.csv"));
				OutputStream bos = new BufferedOutputStream(fos, 4096);           
                
                int count;
                byte data[] = new byte[4096];
                while ((count = bis.read(data, 0, 4096)) != -1)
                {
                    bos.write(data, 0, count);
                }
                bos.flush();
                bos.close();
                bis.close();
                
			}
			long end = System.currentTimeMillis();
			
			System.out.println("used " + (end - start) / 1000 + "s");
			fileToUnzip.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
