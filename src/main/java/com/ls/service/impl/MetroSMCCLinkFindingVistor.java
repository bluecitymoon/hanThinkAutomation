package com.ls.service.impl;

import org.htmlparser.Tag;
import org.htmlparser.tags.ImageTag;
import org.htmlparser.tags.LinkTag;
import org.htmlparser.visitors.NodeVisitor;

public class MetroSMCCLinkFindingVistor extends NodeVisitor{

	boolean hasLoadedEverything = false;
	
	@Override
	public void visitTag(Tag tag) {
		super.visitTag(tag);
		
		if (tag instanceof ImageTag) {
			
			ImageTag smccImageTag = (ImageTag) tag;
			if (smccImageTag.getAttribute("src").equals("/com.sap.portal.resourcerepository/repo/mimes/images/mcc_scm.JPG")) {
				System.err.println("bingo");
				
				LinkTag linkTag = (LinkTag) smccImageTag.getParent();
				System.out.println(linkTag.toPlainTextString());
				hasLoadedEverything = true;
			}
		}
	}

	public boolean hasLoadedEverything() {
		return hasLoadedEverything;
	}
	
}
