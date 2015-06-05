package com.ls.service.impl.test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

import org.htmlparser.Parser;
import org.htmlparser.tags.TableColumn;
import org.htmlparser.util.ParserException;

import com.google.common.io.Files;
import com.ls.service.impl.vistor.RTMarketDetailParser;

public class SuzhouTest {

	public static void main(String[] args) throws IOException {

		String htmlDetail = Files.toString(new File("D:\\data\\Jerry\\hanThinkAutomation\\src\\main\\java\\com\\ls\\service\\impl\\test\\rtMarket-detail.html"), Charset.defaultCharset());
		Parser detailpParser = new Parser();
		try {
			detailpParser.setInputHTML(htmlDetail);
			RTMarketDetailParser suZhouUnivercityOrdersDetailFinder = new RTMarketDetailParser();
			detailpParser.visitAllNodesWith(suZhouUnivercityOrdersDetailFinder);

			List<TableColumn> columns = suZhouUnivercityOrdersDetailFinder.getProductList();

			for (int i = 7; i < columns.size(); i++) {
				if (i % 7 == 0) {
					System.out.println("barcode=" + columns.get(i).getStringText());
				}
				if (i % 7 == 2) {
					System.out.println("productName=" + columns.get(i).getStringText());
				}
			}

		} catch (ParserException e) {
			e.printStackTrace();
		}

	}

}
