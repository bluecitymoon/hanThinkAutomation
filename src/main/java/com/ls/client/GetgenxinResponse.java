
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
 *         &lt;element name="getgenxinResult" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
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
    "getgenxinResult"
})
@XmlRootElement(name = "getgenxinResponse")
public class GetgenxinResponse {

    protected byte[] getgenxinResult;

    /**
     * Gets the value of the getgenxinResult property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getGetgenxinResult() {
        return getgenxinResult;
    }

    /**
     * Sets the value of the getgenxinResult property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setGetgenxinResult(byte[] value) {
        this.getgenxinResult = value;
    }

}
