package com.ls.service.impl.vistor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.htmlparser.Node;
import org.htmlparser.Tag;
import org.htmlparser.tags.TableColumn;
import org.htmlparser.tags.TableRow;
import org.htmlparser.visitors.NodeVisitor;

public class SuZhouUnivercityOrdersDetailFinder extends NodeVisitor {

	private List<Map<String, String>> ordersItemList = new ArrayList<Map<String, String>>();
	private String uuid;

	@Override
	public void visitTag(Tag tag) {

		super.visitTag(tag);

		if (tag instanceof org.htmlparser.tags.TableRow) {

			TableRow row = (TableRow)tag;

			String className = row.getAttribute("class");
			if (StringUtils.isNotBlank(className) && className.equals("tr_list")) {

				TableColumn[] tableColumns = row.getColumns();

				Map<String, String> detailMap = parserOrder(tableColumns);
				ordersItemList.add(detailMap);
			}

		}
	}

	private Map<String, String> parserOrder(Node[] nodes) {

		Map<String, String> detailMap = new HashMap<String, String>();

		for (int i = 0; i < nodes.length; i++) {

			detailMap.put("uuid", uuid);
			Node node = nodes[i];
			switch (i) {
				case 1:

					detailMap.put("productNumber", node.getFirstChild().getText().replace("&nbsp;", ""));
					break;

				case 2:

					detailMap.put("description", node.getFirstChild().getFirstChild().getText().replace("&nbsp;", ""));
					break;

				case 7:

					detailMap.put("priceWithoutTax", node.getFirstChild().getText().replace("&nbsp;", ""));
					break;

				case 10:

					detailMap.put("count", node.getFirstChild().getText().replace("&nbsp;", ""));
					break;
				case 11:

					detailMap.put("moneyAmountWithoutTax", node.getFirstChild().getText().replace("&nbsp;", ""));
					break;
				default:
					break;
			}
		}

		return detailMap;
	}

	public List<Map<String, String>> getOrdersItemList() {

		return ordersItemList;
	}

	public String getUuid() {

		return uuid;
	}

	public void setUuid(String uuid) {

		this.uuid = uuid;
	}

}
