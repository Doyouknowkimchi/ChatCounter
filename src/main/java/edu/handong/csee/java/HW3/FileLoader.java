package edu.handong.csee.java.HW3;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FileLoader{
	// 디렉토리  path를 찾아서 file로 만들어서 list file을 통해 파일 쭉 돌릴 수 있다.
	
	void pulldata(String path)
	{
		BufferedReader br = null; 
		PrintWriter pw = null;
		try{        
			br = new BufferedReader(new FileReader("경로,파일")); 
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