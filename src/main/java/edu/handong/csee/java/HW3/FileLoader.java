package edu.handong.csee.java.HW3;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FileLoader{
	HashMap<String,ArrayList<Message>> allMap = new HashMap<String,ArrayList<Message>>();
	

	public HashMap<String,ArrayList<Message>> readFiles(String path){

		CSVParser csvParser = new CSVParser();
		TXTParser txtParser = new TXTParser();
		

		File[] files = new File(path).listFiles();
		for (File file : files) { 
			if(file.getName().endsWith(".csv")){ 
				allMap = csvParser.read(file);
				}
			if(file.getName().endsWith(".txt")){ 
				allMap.putAll(txtParser.read(file));
				
			}
		}
		return allMap;
	}
}