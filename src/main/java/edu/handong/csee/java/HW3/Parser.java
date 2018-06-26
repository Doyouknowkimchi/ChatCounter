package edu.handong.csee.java.HW3;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class Parser {
	abstract HashMap<String,ArrayList<Message>> read(File file);
}
