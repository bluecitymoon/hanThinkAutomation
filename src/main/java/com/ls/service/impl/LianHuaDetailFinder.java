package com.ls.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.htmlparser.Tag;
import org.htmlparser.tags.TableColumn;
import org.htmlparser.tags.TableRow;
import org.htmlparser.tags.TableTag;
import org.htmlparser.visitors.NodeVisitor;

public class LianHuaDetailFinder extends NodeVisitor {

	private String orderNumber;

	private String orderCancelDate;

	private List<Map<String, String>> ordersItemList = new ArrayList<Map<String, String>>();

	public LianHuaDetailFinder(String orderNumber) {

		super();

		this.orderNumber = orderNumber;
	}

	public void visitTag(Tag tag) {

		if (tag instanceof TableTag) {
			TableTag tableTag = (TableTag)tag;

			String className = tableTag.getAttribute("class");
			String align = tableTag.getAttribute("align");
			String width = tableTag.getAttribute("width");

			if (StringUtils.isNotBlank(className) && className.equals("cTableBody") && StringUtils.isNotBlank(align) && align.equals("center") && StringUtils.isNotBlank(width) && width.equals("980px")) {

				TableRow[] rows = tableTag.getRows();

				for (TableRow tableRow : rows) {
					String rowClassName = tableRow.getAttribute("class");
					if (StringUtils.isNotBlank(rowClassName) && rowClassName.equals("row")) {

						Map<String, String> detailMap = new HashMap<String, String>();
						detailMap.put("orderNumber", orderNumber);

						ordersItemList.add(detailMap);

						TableColumn[] tds = tableRow.getColumns();
						for (int i = 0; i < tds.length; i++) {

							String textReallyNeeded = StringUtils.trimToEmpty(tds[i].toPlainTextString());

							switch (i) {

								case 1:
									detailMap.put("barCode", textReallyNeeded);
									break;
								case 2:
									detailMap.put("productNumber", textReallyNeeded);
									break;
								case 4:
									detailMap.put("description", textReallyNeeded);
									break;

								case 10:
									detailMap.put("giftCount", textReallyNeeded);
									break;

								case 11:
									detailMap.put("count", textReallyNeeded);
									break;

								case 14:

									try {
										String taxRate = textReallyNeeded.replace("%", "");
										taxRate = "0." + taxRate;
										detailMap.put("taxRate", taxRate);

									} catch (Exception e) {
										detailMap.put("taxRate", "");
									}

									break;

								case 15:
									detailMap.put("priceWithoutTax", textReallyNeeded);
									break;

								case 16:
									detailMap.put("priceWithTax", textReallyNeeded);
									break;

								case 17:
									detailMap.put("moneyAmountWithoutTax", textReallyNeeded);
									break;

								case 18:
									detailMap.put("moneyAmountWithTax", textReallyNeeded);
									break;

								default:
									break;
							}
						}

					}
				}
			}

			if (StringUtils.isNotBlank(className) && className.equals("cTableBody") && StringUtils.isNotBlank(align) && align.equals("left") && StringUtils.isNotBlank(width) && width.equals("980px")) {

				TableRow[] rows = tableTag.getRows();

				if (rows != null && rows.length > 1) {
					TableRow rowINeed = rows[1];
					TableColumn[] columns = rowINeed.getColumns();

					if (columns != null && columns.length > 3) {

						String cancelDateColumnText = columns[3].toPlainTextString().trim();

						if (cancelDateColumnText.contains("订货取消日期：")) {
							orderCancelDate = cancelDateColumnText.substring("订货取消日期：".length()).replace(".", "-");
						}
					}

				}
			}
		}

	}

	public List<Map<String, String>> getOrdersItemList() {

		return ordersItemList;
	}

	public String getOrderCancelDate() {

		return orderCancelDate;
	}

}
