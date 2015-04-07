package com.ls.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.htmlparser.Tag;
import org.htmlparser.tags.LinkTag;
import org.htmlparser.tags.Span;
import org.htmlparser.visitors.NodeVisitor;

public class CarrefourDetailLinkingFinder extends NodeVisitor {
	
	private List<String> guidList;
	private List<Integer> otherPageIndexs = new ArrayList<Integer>();
	
	private boolean hasNextPageGroup = false;

	private int currentIndex;

	public void visitTag(Tag tag) {

		if (tag instanceof LinkTag) {
			LinkTag linkTag = (LinkTag)tag;

			String onclickAttribute = linkTag.getAttribute("onclick");
			
			if (StringUtils.isNotBlank(onclickAttribute) && onclickAttribute.startsWith("viewMessage('")) {

				if (null == guidList) {
					guidList = new ArrayList<String>();
				}
				String[] elements = onclickAttribute.split("\'");

				guidList.add(elements[3]);
			}

			String className = linkTag.getAttribute("class");
			if (StringUtils.isNotBlank(className) && className.equals("pageLink")) {
				String otherIndexString = linkTag.toPlainTextString();
				
				if (StringUtils.isNotBlank(otherIndexString)) {
					otherPageIndexs.add(Integer.valueOf(otherIndexString.trim()));

				}
				
				String href = linkTag.getAttribute("href");
				if (StringUtils.isNotBlank(href) && href.startsWith("javascript:gotoPageGroup(")) {
					hasNextPageGroup = true;
				}
				
			}
		}

		if (tag instanceof Span) {

			Span span = (Span)tag;

			String className = span.getAttribute("class");
			if (StringUtils.isNotBlank(className) && className.equals("currentPage")) {
				
				String spanText = span.toPlainTextString();
				
				if (StringUtils.isNotBlank(spanText)) {
					currentIndex = Integer.valueOf(spanText.trim());
				}
			}
		}
	}

	public List<String> getGuidList() {

		return guidList;
	}

	public boolean hasNextPage() {
		
		if (hasNextPageGroup) {
			return true;
		}
		
		System.out.println("Other page index list --> " + otherPageIndexs.toString());
		System.out.println("current page index is --> " + currentIndex);

		if (otherPageIndexs.isEmpty()) {
			return false;
		}
		
		for(Integer otherSingleIndex : otherPageIndexs) {
			
			if (otherSingleIndex > currentIndex) {
				return true;
			}
		}
		
		return false;
	}

}
