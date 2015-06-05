package com.ls.service.impl.vistor;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.htmlparser.Tag;
import org.htmlparser.tags.TableColumn;
import org.htmlparser.visitors.NodeVisitor;

public class RTMarketDetailParser extends NodeVisitor {

	private List<org.htmlparser.tags.TableColumn> productList = new ArrayList<org.htmlparser.tags.TableColumn>();

	@Override
	public void visitTag(Tag tag) {

		super.visitTag(tag);
		if (tag instanceof org.htmlparser.tags.TableColumn) {

			String bgcolor = tag.getAttribute("bgcolor");
			if (StringUtils.isNotBlank(bgcolor) && bgcolor.equals("silver")) {
				productList.add((TableColumn)tag);
			}
		}
	}

	public List<org.htmlparser.tags.TableColumn> getProductList() {

		return productList;
	}
}
