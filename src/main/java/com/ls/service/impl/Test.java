package com.ls.service.impl;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.google.common.base.Splitter;
import com.google.common.io.Files;
import com.ls.entity.Order;
import com.ls.entity.ProductDetail;
import com.ls.vo.Orders;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fileName = "D:\\workspace\\hanThinkAutomation\\src\\main\\java\\com\\ls\\service\\impl\\demo.txt";
		try {
			List<String> lines = Files.readLines(new File(fileName), Charset.defaultCharset());
			String[] linesString = lines.toArray(new String[] {});

			parseTescoOrdersTemplate(linesString);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Order parseTescoOrdersTemplate(String[] lines) {

		if (null == lines || lines.length == 0) {
			return null;
		}

		Order order = new Order();
		List<ProductDetail> productDetails = new ArrayList<ProductDetail>();
		order.setProductDetails(productDetails);
		
		for (int i = 0; i < lines.length; i++) {

			String currentLine = lines[i];
			if (i > 14) {
				parseProductDetails(currentLine, order);
				
				if (StringUtils.isBlank(currentLine)) {
					
					break;
				}
			}

			switch (i) {
			case 0:
			case 2:	
			case 5:
			case 6:
			case 8:
				break;
			case 1:
				parseStoreNumber(currentLine, order);
				break;
			case 3:
				parseOrderNumber(currentLine, order);
				break;
			case 4:
				parserOrderDate(currentLine, order);
				parserDeliverayDate(currentLine, order);
				break;
//			case 6 : 
//				parserAddress(currentLine, order);
//				break;
			case 7 : 
				parseSupplierNumber(currentLine, order);
				break;
				
			default:
				break;
			}
		}


		return null;
	}
	
	private static void parseProductDetails(String currentLine, Order order) {
		
		Iterator<String> elementIterator = Splitter.on(" ").omitEmptyStrings().split(currentLine).iterator();
		List<String> productDetailList = new ArrayList<String>();
		while (elementIterator.hasNext()) {
			productDetailList.add(elementIterator.next());
		}
		
		if (productDetailList.size() < 6) {
			return;
		}
		
		ProductDetail productDetail = new ProductDetail();
		
		String productNumber = productDetailList.get(0).replace("\\", "");
		productDetail.setProductNumber(productNumber);
		String description = productDetailList.get(1);
		productDetail.setDescription(description);
		String count = productDetailList.get(10);
		productDetail.setCount(count);
		String countInSingleBox = productDetailList.get(4);
		productDetail.setCountInSingleBox(countInSingleBox);
		String boxCount = productDetailList.get(9);
		productDetail.setBoxCount(boxCount);
		String priceWithoutTax = productDetailList.get(5);
		productDetail.setPriceWithoutTax(priceWithoutTax);
		String moneyAmountWithoutTax = productDetailList.get(7);
		productDetail.setMoneyAmountWithoutTax(moneyAmountWithoutTax);
		
		System.out.println(productDetail);
		
		order.getProductDetails().add(productDetail);
		
		
	}

	private static void parseSupplierNumber(String currentLine, Order order) {

		Iterator<String> elementIterator = Splitter.on(" ").omitEmptyStrings().split(currentLine).iterator();

		boolean findOrderNumber = false;
		while (elementIterator.hasNext()) {
			String element = (String) elementIterator.next();

			if (findOrderNumber) {
				order.setSupplierNumber(element.trim());
				
				break;
			}

			if (element.equals("厂商编号")) {
				findOrderNumber = true;
			}
		}
		
	}

	private static void parserAddress(String currentLine, Order order) {
		
		Iterator<String> elementIterator = Splitter.on(" ").omitEmptyStrings().split(currentLine).iterator();

		boolean findFirstElement = false;
		boolean findSecondElment = false;
		while (elementIterator.hasNext()) {
			String element = (String) elementIterator.next();
			
			if (findFirstElement && findSecondElment) {
				order.setAddress(element.trim());
				break;
			}

			if (element.equals("店")) {
				findFirstElement = true;
			}
			if (element.equals("址")) {
				findSecondElment = true;
			}
		}
		
	}

	private static void parserDeliverayDate(String currentLine, Order order) {

		Iterator<String> elementIterator = Splitter.on(" ").omitEmptyStrings().split(currentLine).iterator();

		boolean findOrderNumber = false;
		while (elementIterator.hasNext()) {
			String element = (String) elementIterator.next();

			if (findOrderNumber) {
				order.setEstimateTakeOverDate(element.trim());
				break;
			}

			if (element.equals("交货日期")) {
				findOrderNumber = true;
			}
		}
	}

	private static void parserOrderDate(String currentLine, Order order) {

		Iterator<String> elementIterator = Splitter.on(" ").omitEmptyStrings().split(currentLine).iterator();

		boolean findOrderNumber = false;
		while (elementIterator.hasNext()) {
			String element = (String) elementIterator.next();

			if (findOrderNumber) {
				order.setOrderDate(element.trim());

				break;
			}

			if (element.equals("订单日期")) {
				findOrderNumber = true;
			}
		}

	}

	private static void parseOrderNumber(String currentLine, Order order) {

		Iterator<String> elementIterator = Splitter.on(" ").omitEmptyStrings().split(currentLine).iterator();

		boolean findOrderNumber = false;
		while (elementIterator.hasNext()) {
			String element = (String) elementIterator.next();

			if (findOrderNumber) {
				order.setOrderNumber(element.trim());
				break;
			}

			if (element.equals("订单号码")) {
				findOrderNumber = true;
			}
		}
	}

	private static void parseStoreNumber(String currentLine, Order order) {

		Iterator<String> elementIterator = Splitter.on(" ").omitEmptyStrings().split(currentLine).iterator();

		boolean findStoreNumber = false;
		while (elementIterator.hasNext()) {
			String element = (String) elementIterator.next();

			if (findStoreNumber) {
				order.setStoreNumber(element.trim());
				break;
			}

			if (element.equals("店别:")) {
				findStoreNumber = true;
			}
		}

	}

}
