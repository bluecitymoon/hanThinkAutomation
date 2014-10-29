package com.ls.grab;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Test {

	public static void main(String[] args) {

		
		String testString = "共7条记录,第1页, 共1页";
		
		String s="表15dfsdaf33\r\n表abcd15def\r\n表   15  哈哈abc22\r\n表*#A$!@&@!15$#@432$+_\r\nabc表¥@des15def表288¥：";
	     String regex="[^共\r\n]*?共[^\\d\r\n]*?(\\d+)[^\r\n]*";
	     Pattern p=Pattern.compile(regex);
	     Matcher m=p.matcher(testString);
	     while(m.find()){
	      System.out.println(m.group(1));
	     }
	}

}
