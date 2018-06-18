package edu.handong.csee.java.HW3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RedundancyChecker {
	HashMap<String,ArrayList<Message>> redundancyMap = new HashMap<String , ArrayList<Message>>();


	public HashMap<String,ArrayList<Message>> redundanCheack(HashMap<String,ArrayList<Message>> map) {
		for(String key : map.keySet()){//key
			if(!(redundancyMap.containsKey(key))){
				ArrayList<Message> redundancyMessageList = new ArrayList<>();
				redundancyMap.put(key, redundancyMessageList);
			}				
			if(redundancyMap.containsKey(key)){ 
				ArrayList<Message> messageList = map.get(key);
				ArrayList<Message> redundancyMessageList = redundancyMap.get(key);
				Message ms = new Message();
				String commonMessage;

				for(Message orginMessage : messageList){ 
					for(Message newMessage : redundancyMessageList){
						if(!(newMessage.getMessage().equals(orginMessage.getMessage()))){
							redundancyMessageList.add(orginMessage);
						}
					}
				}

				for(Message orginMessage : messageList){ 
					for(Message newMessage : redundancyMessageList){
						if(orginMessage.getMessage().contains("\n")){
							String strMessageInMessages = orginMessage.getMessage().trim();//
							String strNewMessage = newMessage.getMessage().trim();

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
							if(!(longMessage.startsWith(shortMessage))&&(newMessage.getDate().equals(orginMessage.getDate()))){
								redundancyMessageList.add(orginMessage);
							}
						}
					}
				}
			}
		}// 엔터있는 경우 (날짜 + 메세지 일부)
		return redundancyMap;
	}
}