package com.ls.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.htmlparser.Tag;
import org.htmlparser.tags.ImageTag;
import org.htmlparser.tags.LinkTag;
import org.htmlparser.visitors.NodeVisitor;

public class CarrefourDetailLinkingFinder extends NodeVisitor {

	private List<String> guidList;
	private boolean hasNextPageFlag = false;

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
		}

		if (tag instanceof ImageTag) {

			ImageTag imageTag = (ImageTag)tag;
			String src = imageTag.getAttribute("src");
			if (StringUtils.isNotBlank(src) && src.equals("/platform/images/last1a.gif")) {
				hasNextPageFlag = true;
			}
		}

	}

	public List<String> getGuidList() {

		return guidList;
	}

	public boolean hasNextPage() {

		if (guidList == null || guidList.size() == 0) {
			return false;
		}
		return hasNextPageFlag;
	}

}
