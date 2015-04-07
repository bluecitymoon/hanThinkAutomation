package com.ls.service.impl.test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import org.htmlparser.Parser;
import org.htmlparser.util.ParserException;

import com.google.common.io.Files;
import com.ls.service.impl.vistor.SuZhouUnivercityOrdersDetailFinder;


public class SuzhouTest {

	public static void main(String[] args) throws IOException {

		String html = Files.toString(new File("D:\\data\\Jerry\\hanThinkAutomation\\src\\main\\java\\com\\ls\\service\\impl\\test\\suzhouOrders.html"), Charset.defaultCharset());
		
//		Parser parser = new Parser();
//		try {
//			parser.setInputHTML(html);
//			
//			SuZhouUnivercityOrdersFinder suZhouUnivercityOrdersFinder = new SuZhouUnivercityOrdersFinder();
//			parser.visitAllNodesWith(suZhouUnivercityOrdersFinder);
//			
//			System.out.println(suZhouUnivercityOrdersFinder.getOrders());
//			
//		} catch (ParserException e) {
//			e.printStackTrace();
//		}
		
		String htmlDetail = Files.toString(new File("D:\\data\\Jerry\\hanThinkAutomation\\src\\main\\java\\com\\ls\\service\\impl\\test\\suzhouDetail.html"), Charset.defaultCharset());
		Parser detailpParser = new Parser();
		try {
			detailpParser.setInputHTML(htmlDetail);
			SuZhouUnivercityOrdersDetailFinder suZhouUnivercityOrdersDetailFinder = new SuZhouUnivercityOrdersDetailFinder();
			detailpParser.visitAllNodesWith(suZhouUnivercityOrdersDetailFinder);
			
			System.out.println(suZhouUnivercityOrdersDetailFinder.getOrdersItemList());
		} catch (ParserException e) {
			e.printStackTrace();
		}
		
	}

}
