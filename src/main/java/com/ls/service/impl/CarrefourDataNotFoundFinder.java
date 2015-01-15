package com.ls.service.impl;

import org.htmlparser.Tag;
import org.htmlparser.visitors.NodeVisitor;

public class CarrefourDataNotFoundFinder extends NodeVisitor {

	boolean hasData = false;

	public void visitTag(Tag tag) {
		
		String tagName = tag.getTagName();
		if (tagName.equalsIgnoreCase("b")) {
			
			String tagText = tag.toString();
		}

	}

	public boolean hasData() {

		return hasData;
	}
}
