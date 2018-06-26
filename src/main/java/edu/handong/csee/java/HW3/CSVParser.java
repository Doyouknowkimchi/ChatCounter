package edu.handong.csee.java.HW3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CSVParser extends Parser{
	// make data useful
	HashMap<String,ArrayList<Message>> csvUserChat = new HashMap<String , ArrayList<Message>>();

	HashMap<String,ArrayList<Message>> read(File file)
	{
		BufferedReader br = null; 
		try{        
			br = new BufferedReader(new FileReader(file)); 
			String line = null;
			String pattern = ".+\\s(.....)...,\"(.+)\",\"(.+)\"";
			String id;
			String message;
			String time;
			while((line = br.readLine())!= null){

				Pattern r = Pattern.compile(pattern);
				Matcher m = r.matcher(line);
				while(m.find()){

					time = m.group(1);
					id = m.group(2);
					message = m.group(3);
					
					Message ms = new Message();

					ms.setDate(time);
					ms.setMessage(message);
					ms.setUserID(id);

					if(!csvUserChat.containsKey(ms.getUserID())){
						ArrayList<Message> mesageList = new ArrayList<>();
						csvUserChat.put(id, mesageList);
					}

					if(csvUserChat.containsKey(ms.getUserID())){
						ArrayList<Message> mesageList = csvUserChat.get(ms.getUserID());
						mesageList.add(ms);
					}
				}

			}

		}
		catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return csvUserChat;
	}
}