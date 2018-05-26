package edu.handong.csee.java.HW3;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FileLoader{
	// ���丮  path�� ã�Ƽ� file�� ���� list file�� ���� ���� �� ���� �� �ִ�.
	
	void pulldata(String path)
	{
		BufferedReader br = null; 
		PrintWriter pw = null;
		try{        
			br = new BufferedReader(new FileReader("���,����")); 
			pw = new PrintWriter(new FileWriter(""));
			String line = null;
			while((line = br.readLine())!= null){
				pw.println(line);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			pw.close();
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}