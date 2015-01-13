package com.ls.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.htmlparser.Tag;
import org.htmlparser.tags.LinkTag;
import org.htmlparser.visitors.NodeVisitor;

import com.google.common.base.Splitter;
import com.ls.vo.TescoDetailLinkParameters;

public class TescoDetailLinkingFinder extends NodeVisitor {

	private String linkTextToFind;
	private int count;
	private List<TescoDetailLinkParameters> tescoDetailLinkParameters;

	public TescoDetailLinkingFinder(String linkTextToFind) {

		count = 0;
		this.linkTextToFind = linkTextToFind;
	}

	public void visitTag(Tag tag) {

		if (tag instanceof LinkTag) {
			LinkTag linkTag = (LinkTag)tag;
			String linkText = linkTag.getLinkText();

			if (StringUtils.isNotBlank(linkText) && linkText.equals(linkTextToFind)) {

				count++;

				int index = 0;

				String onclickParameter = tag.getAttribute("onclick").replace("openPDF(", "").replace(")", "");
				Iterator<String> iterator = Splitter.on(",").trimResults().split(onclickParameter).iterator();

				TescoDetailLinkParameters parameterPojo = new TescoDetailLinkParameters();

				while (iterator.hasNext()) {
					String parameter = iterator.next().replace("'", "");
					if (index == 0) {
						parameterPojo.setOrderNumber(parameter);
					} else if (index == 1) {
						parameterPojo.setVendorNumber(parameter);
					} else if (index == 2) {
						parameterPojo.setFileName(parameter);
					} else if (index == 3) {
						parameterPojo.setFileCreateDate(parameter);
					}

					index++;
				}

				if (null == tescoDetailLinkParameters) {
					tescoDetailLinkParameters = new ArrayList<TescoDetailLinkParameters>();
				}

				tescoDetailLinkParameters.add(parameterPojo);
			}
		}

	}

	public boolean linkTextFound() {

		return (0 != count);
	}

	public int getCount() {

		return (count);
	}

	public List<TescoDetailLinkParameters> getTescoDetailLinkParameters() {

		return tescoDetailLinkParameters;
	}

}
