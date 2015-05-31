package com.ls.service.impl.vistor;

import org.apache.commons.lang.StringUtils;
import org.htmlparser.Tag;
import org.htmlparser.tags.LinkTag;
import org.htmlparser.visitors.NodeVisitor;

public class SoSoReportCenterLinkerVistor extends NodeVisitor {
	
	private String parameters;
	
	@Override
	public void visitTag(Tag tag) {
		
		super.visitTag(tag);
		
		if(tag instanceof LinkTag) {
			
			LinkTag linkTag = (LinkTag) tag;
			
			String href = linkTag.getAttribute("href");
			
			if (StringUtils.isNotBlank(href) && href.startsWith("http://v30.hecom.cn/loginAlone.do")) {
				
				setParameters(href.split("\\?")[1]);
			}
		}
	}
	
	public String getParameters() {
		return parameters;
	}
	public void setParameters(String parameters) {
		this.parameters = parameters;
	}

	
}
