package com.ls.service.impl.vistor;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.htmlparser.Tag;
import org.htmlparser.tags.TableColumn;
import org.htmlparser.visitors.NodeVisitor;

public class RTMarketDetailParser extends NodeVisitor {

	private List<String> productList = new ArrayList<String>();
	int count = 0;

	@Override
	public void visitTag(Tag tag) {

		super.visitTag(tag);
		if (tag instanceof org.htmlparser.tags.TableColumn) {

			String bgcolor = tag.getAttribute("bgcolor");
			if (StringUtils.isNotBlank(bgcolor) && bgcolor.equals("silver")) {
				if (count > 6) {
					TableColumn column = (TableColumn) tag;
					productList.add(column.toPlainTextString().replace("&nbsp;", ""));
				}
				count++;
			}
		}
	}

	public List<String> getProductList() {
		return productList;
	}
}
