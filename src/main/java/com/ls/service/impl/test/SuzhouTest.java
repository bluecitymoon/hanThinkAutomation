package com.ls.service.impl.test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

import org.htmlparser.Parser;
import org.htmlparser.util.ParserException;

import com.google.common.io.Files;
import com.ls.service.impl.vistor.RTMarketDetailParser;

public class SuzhouTest {

	public static void main(String[] args) throws IOException {

		String htmlDetail = Files.toString(new File("D:\\workspace\\hanThinkAutomation\\src\\main\\java\\com\\ls\\service\\impl\\test\\rtMarket-detail.html"), Charset.defaultCharset());
		Parser detailpParser = new Parser();
		try {
			detailpParser.setInputHTML(htmlDetail);
			RTMarketDetailParser suZhouUnivercityOrdersDetailFinder = new RTMarketDetailParser();
			detailpParser.visitAllNodesWith(suZhouUnivercityOrdersDetailFinder);

			List<String> columns = suZhouUnivercityOrdersDetailFinder.getProductList();

			System.out.println(columns);

		} catch (ParserException e) {
			e.printStackTrace();
		}

	}

}
