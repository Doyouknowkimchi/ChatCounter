package edu.handong.csee.java.HW3;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.Reader;

import sun.misc.resources.Messages;

public class Soruce {
	
	/*Reader in;
	try {
		in = new FileReader(file);
		Iterable<CSVrecord> records = CSVFormat.DEFAULT.withFirstRe...// 첫줄 띄운다
		for (SCVRecord record : records){
			String date = record.get(0).substring(11,16);
			String user = record.get(1);
			String strMessage = record.get(2);
			
			Message messages = new Message(date, record.get.(0),user, ..)
					
			if(!messages.containsKey(message.getid())) {
				messages.put(user, new ArrayList<Message>());
			}
			
			if(!exisitingMessage(message,message,FromWhere.CSV))
				messages.get(message.getId()).add(message);
		}
} catch (FileNotFoundException e) {
	e.printStackTrace();
} catch (IoException e) {
	e.printStackTrace();
}

return messages;

//여기까지 하나

	//csv파일에서 영어로 날짜 나오는 경우
	
	br.readLine();
	int currentYear = -1;
	int currentMonth = -1;
	int currentDay = -1;
	String currentDate = "";

	While ((thisLine = br.readLine()) != null) { 
		if(thisLine.matches("-+\\s([0-9]+).\\s([0-9]+).\\s([0-9]+)+.+")){

			String pattern = "-+\\s([0-9]+).\\s([0-9]+).\\s([0-9]+).+"; 
			Pattern r = Pattern.compile(pattern);

			Macher m = r.matcher(thisLine);


			if(m.find) {
				currentYear = Integer.parseInt(m.group(1));
				currentMonth = Integer.parseInt(m.group(2));
				currentDay = Integer.parseInt(m.group(3));		
			}
			currentDate = getCurrentDate(currentYear,currentMonth,currentDay);
			continue;

		}else if (thisLine.matchers(".+,\\s(.+)\\s([0-9]+,\\s[0-9]+)\\s.+")) {
			String pattern = ".+,\\s(.+)\\s([0-9]+),\\s([0-9]+).\\s.+";
			Pattern r = Pattern.compile(pattern);

			Matcher m = r.matcher(thisLine);

			if (m.find()){
				currentMonth = getMonthNumberFrom(m.group(1));
				currentDay = Integer.parseInt(m.group(2));
				currentYear = Integer.parseInt(m.group(3));
			}
			currentDate = getCurrentDate(currnetYear,currentMonth,currentDay);
			continue;			
		}

		if(thisLine.matches("(\\[.+\\])\\s(\\[.+\\])\\s.+")) {
			Stirng pattern = "\\[(.+)\\]\\s(\\[.+\\])\\s(.+)";
			Pattern r = Pattern.compile(pattern);
			Matcher m = r.matcher(thisLine);

			if (m.find()) {
				String id = m.group(1);
				String time = m.group(2);
				String strMessage = m.group(3);

				Message message = new Message(getDataTime(currentDate,time),id,strMessage,FromWhere.TXT);
				
				if(!messages.containsKey(message.getID())) {
					messages.put(id,new Arraylist<Message>());
				}
				
				if(!existingMessage(messages,message,FromWhere.TXT))
					messages.get(message.getId()).add(message);
				}
			}
		}
	br.close();
} catch (IOExepation e) {
	e.printStackTrace();
}// end while, 앞에 try 있다는 반증
return messages;
	
	//여기까지 둘
	
private String getDateTime(String currentDate, String time) {
	
	String pattern = "\\{(.+)\\s([0-9]+):([0-9]+)\\]";
	Pattern r = pattern.compile(pattern);
	Matcher m = r.matcher(time);
	
	String ampm="",hour"",minute"";
	if (m.find()) {
		ampm = m.group(1);
		hour = m.group(2);
		minute = m.group(3);
		
		if(ampm.equal("12"))
			return formatFor2Digit(0) + "+" + (Integer.parseInt(minute));
			
		return formatFor2Digit(Integer.parseInt(hour))
				+ "+" + formatFor2Digit(Integer.parseInt(minute));
	}
	
	//오후 12시 
	if(hour.equals("12"))
		return formatFor2Digit(Integer.parseInt(hour)) 
				+ ":" + formatFor2Digit(Integer.parseInt(minute));		
}

pattern = "\\[([0-9]+)]:([0-9])\\s(.+)\\";
r = Pattern.compile(pattern);
m = r.macher(time);

if (m.find()) {
	ampm = m.group(3);
	hour = m.group(1);
	minute = m.group(2);
}
	private String formatFor2Digit(int parseInt) {
		// TODO Auto-generated method stub
		return null;
	} 



//여기까지 셋	
	
String strMessageInMessages = messageInMessages().trim();
String strNewMessage = message.getMessage().trim;

int length = strMessageInMessages.length();
int lengthInNewMessage = strNewMessage.length();

String shortMessage = "";
String longMessage = "";
if(length<lenthInNewMessage) {
	shortMessage = strMessageInMessages;
	longMessage = strNewMessage;
}else {
	shortMessage = NewMessage;
	longMessage = strMessageInMessages;
}
if(longMessage.startsWith(shortMessage))
	return true
}
	
	
*/
}