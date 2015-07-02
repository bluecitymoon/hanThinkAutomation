package com.ls.service.impl;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.lang.StringUtils;
import org.htmlparser.Parser;
import org.htmlparser.util.ParserException;

import com.google.common.io.Files;

public class Test {

	/**
	 * @param args
	 * @throws IOException
	 * @throws ParserException
	 * @throws ParserConfigurationException
	 */
	public static void main(String[] args) throws IOException, ParserException {

		//testGrabLianhuaDetail();
		
//		String fileName = "D:\\data\\Jerry\\hanThinkAutomation\\src\\main\\java\\com\\ls\\service\\impl\\demo.txt";
//		
//		List<String> lines = Files.readLines(new File(fileName), Charset.defaultCharset());
//		
//		List<List<String>> groupLines = new ArrayList<List<String>>();
//		
//		List<String> singleLines = new ArrayList<String>();
//		int count = 0;
//		for (String string : lines) {
//			
//			if (StringUtils.isNotBlank(string) && string.trim().equals("TESCO 乐  购  商  品  订  单")) {
//				
//				singleLines = new ArrayList<String>();
//				groupLines.add(singleLines);
//				count ++;
//			}
//			
//			singleLines.add(string);
//		}
//		
//		for (List<String> group : groupLines) {
//			
//			System.out.println("===============================================");
//			for (String string : group) {
//				
//				System.out.println(string);
//			}
//		}
		
//		StringBuffer test = new StringBuffer("20150204");
//		System.out.println(test.insert(4, '-').insert(7, '-'));
		
		
		String regex = "[^a-zA-Z0-9]";
		
		System.out.println("%^%&%$_)<><,/,/234444 <><,//,.()()()()2342 assfsdf    s123".replaceAll(regex, ""));
	}

	public static void testGrabLianhuaDetail() throws IOException, ParserException {

		String fileContent = Files.toString(new File("D:\\data\\Jerry\\hanThinkAutomation\\src\\main\\java\\com\\ls\\service\\impl\\lianhua_detail.html"), Charset.defaultCharset());

		Parser htmlParser = new Parser();
		htmlParser.setInputHTML(fileContent);
		LianHuaDetailFinder lianHuaDetailFinder = new LianHuaDetailFinder("11223344");

		htmlParser.visitAllNodesWith(lianHuaDetailFinder);

	}

}
