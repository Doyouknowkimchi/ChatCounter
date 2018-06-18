package edu.handong.csee.java.HW3;

import java.util.ArrayList;
import java.util.HashMap;

public class PMCounter {

	HashMap<String,String> pmCounter;

	public HashMap<String,String> pmCounter(HashMap<String,ArrayList<Message>> map){
		for(String key : map.keySet()){
			int chatCount = map.get(key).size();
			int resultOfCount = chatCount;
			String sizeOfchat = Integer.toString(resultOfCount);
			pmCounter.put(key, sizeOfchat);
		}
		return pmCounter;
	}
}
