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
	// ���丮  path�� ã�Ƽ� file�� ���� list file�� ���� ���� �� ���� �� �ִ�.

	//File.listFiles() �� �̿��ϸ� �ش� ���丮�� �ִ� ��� ���� ������ �޾� �� �� �ֽ��ϴ�.

	
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