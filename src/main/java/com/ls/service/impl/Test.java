package com.ls.service.impl;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import javax.xml.parsers.ParserConfigurationException;

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
		
		System.out.println("2015.6.6".replaceAll(".", "-"));
	}

	public static void testGrabLianhuaDetail() throws IOException, ParserException {

		String fileContent = Files.toString(new File("D:\\data\\Jerry\\hanThinkAutomation\\src\\main\\java\\com\\ls\\service\\impl\\lianhua_detail.html"), Charset.defaultCharset());

		Parser htmlParser = new Parser();
		htmlParser.setInputHTML(fileContent);
		LianHuaDetailFinder lianHuaDetailFinder = new LianHuaDetailFinder("11223344");

		htmlParser.visitAllNodesWith(lianHuaDetailFinder);

	}

}
