package com.ls.service.impl;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.htmlparser.Node;
import org.htmlparser.Tag;
import org.htmlparser.tags.TableColumn;
import org.htmlparser.tags.TableRow;
import org.htmlparser.tags.TableTag;
import org.htmlparser.visitors.NodeVisitor;

import com.ls.util.HanthinkUtil;
import com.ls.vo.Orders;

public class CarrefourDetailFinder extends NodeVisitor {

	private Orders order = new Orders();

	private boolean hasFoundTitle = false;

	private String orderNumber;

	public void visitTag(Tag tag) {

		if (tag instanceof TableTag) {

			TableTag tableTag = (TableTag)tag;

			if (isTableIWant(tableTag)) {

				if (hasFoundTitle) {
					parseDetail(tableTag);
				} else {
					parseTitle(tableTag);

					hasFoundTitle = true;
				}
			}
		}

	}

	private void parseDetail(TableTag tableTag) {

		Node[] rows = tableTag.getChildren().toNodeArray();

		List<Map<String, String>> productDetailMapList = order.getOrdersItemList();

		if (productDetailMapList == null) {
			productDetailMapList = new ArrayList<Map<String, String>>(rows.length);
		}

		order.setOrdersItemList(productDetailMapList);

		for (int i = 0; i < rows.length; i++) {

			if (i < 3) {
				continue;
			}

			if (rows[i] instanceof TableRow) {

				TableRow tableRow = (TableRow)rows[i];

				TableColumn[] tableColumn = tableRow.getColumns();
				Map<String, String> detailMap = new HashMap<String, String>();
				productDetailMapList.add(detailMap);

				detailMap.put("orderNumber", orderNumber);

				for (int j = 0; j < tableColumn.length; j++) {

					Node[] tds = tableColumn[j].getChildrenAsNodeArray();

					String textReallyNeeded = tds[0].toPlainTextString();

					switch (j) {
						case 0:
							detailMap.put("productNumber", textReallyNeeded);
							break;
						case 1:
							detailMap.put("barCode", textReallyNeeded);
							break;

						case 2:
							detailMap.put("description", textReallyNeeded);
							break;
						case 3:
							detailMap.put("countInSingleBox", textReallyNeeded);
							break;
						case 4:
							break;
						case 5:
							detailMap.put("giftCount", textReallyNeeded);
							break;
						case 6:
							detailMap.put("count", textReallyNeeded);
							break;
						case 7:
							detailMap.put("priceWithoutTax", textReallyNeeded);
							break;
						case 8:
							detailMap.put("moneyAmountWithoutTax", textReallyNeeded);
							break;

						default:
							break;
					}

				}
			}
		}
	}

	private void parseTitle(TableTag tableTag) {

		Map<String, String> orderTitleMap = order.getOrderTitleMap();

		if (orderTitleMap == null) {
			orderTitleMap = new HashMap<String, String>();
			order.setOrderTitleMap(orderTitleMap);
		}

		Node[] rows = tableTag.getChildren().toNodeArray();

		for (int i = 0; i < rows.length; i++) {

			TableRow tableRow = (TableRow)rows[i];

			TableColumn[] tableColumn = tableRow.getColumns();

			for (int j = 0; j < tableColumn.length; j++) {
				String tdcontent = StringUtils.trimToEmpty(tableColumn[j].getStringText());
				if (i == 2 && j == 1) {
					orderTitleMap.put("orderNumber", tdcontent);
					orderNumber = tdcontent;
				} else if (i == 2 && j == 3) {
					orderTitleMap.put("supplierNumber", tdcontent);
				} else if (i == 3 && j == 1) {

					if (StringUtils.isNotBlank(tdcontent)) {
						try {
							String standardDate = HanthinkUtil.getCarrefourDateToStandardString(tdcontent);
							orderTitleMap.put("orderDate", standardDate);

						} catch (ParseException e) {

							orderTitleMap.put("orderDate", "");
						}

					} else {
						orderTitleMap.put("orderDate", "");
					}

				} else if (i == 4 && j == 1) {

					if (StringUtils.isNotBlank(tdcontent)) {
						try {
							String standardDate = HanthinkUtil.getCarrefourDateToStandardString(tdcontent);
							orderTitleMap.put("estimateTakeOverDate", standardDate);

						} catch (ParseException e) {

							orderTitleMap.put("estimateTakeOverDate", "");
						}

					} else {
						orderTitleMap.put("estimateTakeOverDate", "");
					}

				} else if (i == 1 && j == 1) {
					orderTitleMap.put("storeNumberEnglish", tdcontent);
				} else if (i == 1 && j == 0) {
					orderTitleMap.put("storeNumber", tdcontent);
				}
			}
		}

	}

	boolean isTableIWant(TableTag tableTag) {

		try {
			String className = tableTag.getAttribute("class");

			if (StringUtils.isNotBlank(className) && className.equals("tab2")) {
				return true;
			}
		} catch (Exception e) {
			return false;
		}

		return false;
	}

	public Orders getOrder() {

		return order;
	}
}
