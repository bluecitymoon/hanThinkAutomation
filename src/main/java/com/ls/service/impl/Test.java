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
		
		String fileContent = Files.toString(new File("D:\\data\\Jerry\\hanThinkAutomation\\src\\main\\java\\com\\ls\\service\\impl\\lianhua_detail.html"), Charset.defaultCharset());
		
		Parser htmlParser = new Parser();
		htmlParser.setInputHTML(fileContent);
		//CarrefourDetailFinder carrefourDetailLinkingFinder = new CarrefourDetailFinder();
		
		LianHuaDetailFinder lianHuaDetailFinder = new LianHuaDetailFinder("aaaa");
		htmlParser.visitAllNodesWith(lianHuaDetailFinder);
		
		System.out.println(lianHuaDetailFinder.getOrdersItemList());
		//System.out.println(carrefourDetailLinkingFinder.getOrder());
	}

}
