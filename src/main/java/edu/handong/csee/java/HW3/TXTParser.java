package edu.handong.csee.java.HW3;

import java.io.BufferedReader;
import java.text.SimpleDateFormat;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.security.acl.Group;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TXTParser extends Parser {
	// make data useful
	HashMap<String,ArrayList<Message>> txtUserChat = new HashMap<String , ArrayList<Message>>();
	ArrayList<Message> messageList = new ArrayList<>();
	HashMap<String,ArrayList<Message>> read(File file)
	{
		BufferedReader br3 = null;
		BufferedReader br2 = null;
		BufferedReader br = null;

		try{        
			br = new BufferedReader(new FileReader(file)); 
			String line = null;
			String pattern = "\\[(.+)]\\s\\[(.+)\\]\\s(.+)";
			String id;
			String message;
			String time;
			String hour = null;
			String minute;
			String regularTime = null;
			int intHour;
			while((line = br.readLine())!= null){

				Pattern r = Pattern.compile(pattern);
				Matcher m = r.matcher(line);
				while(m.find()){

					id = m.group(1);
					time = m.group(2);
					message = m.group(3);
					
					if(time.contains("오전")){
						pattern = "(.+)\\s([0-9]+):([0-9]+)";
						Pattern tp = Pattern.compile(pattern);
						Matcher tm = tp.matcher(time);
						while(tm.find()){
							intHour = Integer.parseInt(tm.group(2));
							hour = String.valueOf(intHour);
							if(intHour<10){
							hour = String.format("%02d", intHour);
							}
							
							minute = tm.group(3);
							
							regularTime = hour+":"+minute;
						}
					}
					
					else if(time.contains("오후")){
						pattern = "(.+)\\s([0-9]+):([0-9]+)";
						Pattern tp = Pattern.compile(pattern);
						Matcher tm = tp.matcher(time);
						while(tm.find()){
							hour = tm.group(2)+12;
							minute = tm.group(3);
							
							regularTime = hour+":"+minute;
						}
					}

					else if(time.contains("AM")){
						pattern = "([0-9]+):([0-9]+)\\s(.+)";
						Pattern tp = Pattern.compile(pattern);
						Matcher tm = tp.matcher(time);
						while(tm.find()){
							intHour = Integer.parseInt(tm.group(1));
							hour = String.valueOf(intHour);
							if(intHour<10){
							hour = String.format("%02d", intHour);
							}
							minute = tm.group(2);
							
							regularTime = hour+":"+minute;
						}
					}
					
					else if(time.contains("PM")){
						pattern = "([0-9]+):([0-9]+)\\s(.+)";
						Pattern tp = Pattern.compile(pattern);
						Matcher tm = tp.matcher(time);
						while(tm.find()){
							hour = tm.group(1)+12;
							minute = tm.group(2);
							
							regularTime = hour+":"+minute;
						}
					}

					time = regularTime;
					Message ms = new Message();

					ms.setDate(time);
					ms.setMessage(message);
					ms.setUserID(id);

					// need to change time expression(to csv format)

					if(!(txtUserChat.containsKey(ms.getUserID()))){
						ArrayList<Message> mesageList = new ArrayList<>();
						txtUserChat.put(id, mesageList);
					}
					if(txtUserChat.containsKey(ms.getUserID())){ 
						ArrayList<Message> mesageList = txtUserChat.get(ms.getUserID());
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
		return txtUserChat;
	}
}