package edu.handong.csee.java.HW3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

public class WriteFile {
	public void wirteFile(HashMap<String,String> map) throws FileNotFoundException{
		HashMap<String,String> resultMap = new HashMap<String,String>();
		resultMap = map;
		{
			PrintWriter pw = new PrintWriter("c:/out.txt");
			for(String key : resultMap.keySet()) {
				String data = "이름" + key + "횟수" + resultMap.get(key) ;
				pw.println(data);
			}
			pw.close();
		}
	}
}
