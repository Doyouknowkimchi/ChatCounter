package edu.handong.csee.java.HW3;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap; 

public class ChatCounter {
	HashMap<String,ArrayList<Message>> map = new HashMap<String,ArrayList<Message>>();
	HashMap<String,String> resultMap = new HashMap<String,String>();
	
	
	public static void main(String[] args) {
		
		ChatCounter chatCounter = new ChatCounter();
		
		chatCounter.run(args);
	}
	
	public void run(String[] args){
		//1. 파일을 읽어서 hashmap에 저장		
		FileLoader fileloader = new FileLoader();
		map = fileloader.readFiles(args[0]);
		//2. 중복 체크(hashmap 넘겨준다)
		RedundancyChecker check = new RedundancyChecker();
		map = check.redundanCheack(map);
		
		//3. 중복 체크 후에 받아온 새로운 hashmap으로 메세지 카운트 한다.
		messageCounter(map);
		//4. 결과를 파일로 작성
		FileWriter resultWrite = new FileWriter();
	}
	
	public HashMap<String,String> messageCounter(HashMap<String,ArrayList<Message>> map){
		return resultMap;
	}
}