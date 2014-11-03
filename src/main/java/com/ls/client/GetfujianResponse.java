
package com.ls.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getfujianResult" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getfujianResult"
})
@XmlRootElement(name = "getfujianResponse")
public class GetfujianResponse {

    protected byte[] getfujianResult;

    /**
     * Gets the value of the getfujianResult property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getGetfujianResult() {
        return getfujianResult;
    }

    /**
     * Sets the value of the getfujianResult property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setGetfujianResult(byte[] value) {
        this.getfujianResult = value;
    }

}
