package com.ls.service.impl.vistor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.lang.StringUtils;
import org.htmlparser.Node;
import org.htmlparser.Tag;
import org.htmlparser.tags.TableColumn;
import org.htmlparser.tags.TableRow;
import org.htmlparser.visitors.NodeVisitor;

import com.ls.vo.Orders;

public class SuZhouUnivercityOrdersFinder extends NodeVisitor {

	private List<Orders> orders = new ArrayList<Orders>();

	@Override
	public void visitTag(Tag tag) {

		super.visitTag(tag);

		if (tag instanceof org.htmlparser.tags.TableRow) {

			TableRow row = (TableRow)tag;

			String className = row.getAttribute("class");
			if (StringUtils.isNotBlank(className) && className.equals("tr_list")) {

				TableColumn[] tableColumns = row.getColumns();
				
				Orders order = parserOrder(tableColumns);
				
				orders.add(order);

			}

		}
	}

	private Orders parserOrder(Node[] nodes) {
		
		Orders order = new Orders();
		Map<String, String> orderTitleMap = new HashMap<String, String>();
		orderTitleMap.put("uuid", UUID.randomUUID().toString());
		order.setOrderTitleMap(orderTitleMap);
		for (int i = 0; i < nodes.length; i++) {
			
			Node node = nodes[i];
			switch (i) {
				case 0:
					
					orderTitleMap.put("orderNumber", node.getFirstChild().getText().replace("&nbsp;", ""));
					break;

				case 1 :
					
					orderTitleMap.put("supplierNumber", node.getFirstChild().getText().replace("&nbsp;", ""));
					break;
					
				case 5 :
					
					orderTitleMap.put("orderDate", node.getFirstChild().getText().replace("&nbsp;", ""));
					break;
					
				case 6 :
					
					orderTitleMap.put("estimateTakeOverDate", node.getFirstChild().getText().replace("&nbsp;", ""));
					break;
					
				default:
					break;
			}
		}
		
		return order;
	}

	public List<Orders> getOrders() {

		return orders;
	}

}
