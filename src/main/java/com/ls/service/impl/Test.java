package com.ls.service.impl;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

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
		
		String fileContent = Files.toString(new File("D:\\data\\Jerry\\hanThinkAutomation\\src\\main\\java\\com\\ls\\service\\impl\\carrefourlist.html"), Charset.defaultCharset());
		
		Parser htmlParser = new Parser();
		htmlParser.setInputHTML(fileContent);
		CarrefourDetailLinkingFinder carrefourDetailLinkingFinder = new CarrefourDetailLinkingFinder();
		
		htmlParser.visitAllNodesWith(carrefourDetailLinkingFinder);
		
		System.out.println(carrefourDetailLinkingFinder.hasNextPage());
		//System.out.println(carrefourDetailLinkingFinder.getOrder());
	}

}
