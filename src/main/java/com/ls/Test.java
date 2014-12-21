package com.ls;

import net.sf.json.xml.XMLSerializer;

public class Test {

	public static void main(String[] args) {
		
		String xml = "<?xml version=\"1.0\" encoding=\"utf-8\"?><soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\"><soap:Body><daorudanjuResponse xmlns=\"http://HanThink.com/\"><daorudanjuResult /></daorudanjuResponse></soap:Body></soap:Envelope>";
		
		XMLSerializer xmlSerializer = new XMLSerializer();
		System.out.println(xmlSerializer.read(xml).toString());
		
	}

}
