package edu.handong.csee.java.HW3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RedundancyChecker {
	HashMap<String,ArrayList<Message>> redundancyMap = new HashMap<String , ArrayList<Message>>();


	public HashMap<String,ArrayList<Message>> redundanCheack(HashMap<String,ArrayList<Message>> map) {
		for(String key : map.keySet()){//key
			if(!redundancyMap.containsKey(key)){
				ArrayList<Message> redundancyMessageList = new ArrayList<>();
				redundancyMap.put(key, redundancyMessageList);
			}				
			if(redundancyMap.containsKey(key)){ 
				ArrayList<Message> messageList = map.get(key);
				ArrayList<Message> redundancyMessageList = redundancyMap.get(key);
				Message ms = new Message();
				String commonMessage;




				for(Message comp : messageList){ 
					if(!(redundancyMessageList.contains(comp.getMessage()))){
						redundancyMessageList.add(comp);
					}

					if(comp.getMessage().contains("\n"))
						while(comp.getMessage() != null){
							String pattern = "(......).+";
							Pattern r = Pattern.compile(pattern);
							Matcher m = r.matcher(ms.getMessage());
							while(m.find()){
								commonMessage = m.group(1);
							}
						}

				}
			}

		}
		return redundancyMap;
	}
}