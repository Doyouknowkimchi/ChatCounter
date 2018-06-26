package edu.handong.csee.java.HW3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RedundancyChecker {
	HashMap<String,ArrayList<Message>> checkedMap = new HashMap<String , ArrayList<Message>>();


	public HashMap<String,ArrayList<Message>> redundanCheack(HashMap<String,ArrayList<Message>> map) {
		for(String key : map.keySet()){//bring key
			if(!(checkedMap.containsKey(key))){
				ArrayList<Message> redundancyMessageList = new ArrayList<>();
				checkedMap.put(key, redundancyMessageList);
			}				
			if(checkedMap.containsKey(key)){ 
				ArrayList<Message> redundancyMessageList = map.get(key);
				ArrayList<Message> checkedMessageList = checkedMap.get(key);
				Message ms = new Message();
				String commonMessage;

				for(Message redundancyMessage : redundancyMessageList){ 
					for(Message checkedMessage : checkedMessageList){
						if(!(checkedMessage.getMessage().equals(redundancyMessage.getMessage()))){
							checkedMessageList.add(redundancyMessage);
						}
					}
				}

				for(Message redundancyMessage : redundancyMessageList){ 
					for(Message checkedMessage : checkedMessageList){
						if(redundancyMessage.getMessage().contains("\n")){
							String strMessageInMessages = redundancyMessage.getMessage().trim();//
							String strNewMessage = checkedMessage.getMessage().trim();

							int length = strMessageInMessages.length();
							int lengthInNewMessage = strNewMessage.length();

							String shortMessage = "";
							String longMessage = "";
							if(length<lengthInNewMessage) {
								shortMessage = strMessageInMessages;
								longMessage = strNewMessage;
							}else {
								shortMessage = strNewMessage;
								longMessage = strMessageInMessages;
							}
							if(!(longMessage.startsWith(shortMessage))&&(checkedMessage.getDate().equals(redundancyMessage.getDate()))){
								checkedMessageList.add(redundancyMessage);
							}
						}
					}
				}
			}
		}// 엔터있는 경우 (날짜 + 메세지 일부)
		return checkedMap;
	}
}