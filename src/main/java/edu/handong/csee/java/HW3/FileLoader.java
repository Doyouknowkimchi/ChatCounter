package edu.handong.csee.java.HW3;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileLoader{
	// 디렉토리  path를 찾아서 file로 만들어서 list file을 통해 파일 쭉 돌릴 수 있다.

	//File.listFiles() 를 이용하면 해당 디렉토리에 있는 모든 파일 정보를 받아 올 수 있습니다.

	
	ArrayList<String> makefilelist(String path){
		ArrayList<String> results = new ArrayList<String>();
		System.out.println("put directory path");
		File[] files = new File(path).listFiles();

		for (File file : files) {
			if (file.isFile()) 
				results.add(file.getName());
		}
		System.out.println(results);
		return results;
	}


}