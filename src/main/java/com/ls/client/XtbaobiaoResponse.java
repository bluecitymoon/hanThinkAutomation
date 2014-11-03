
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
 *         &lt;element name="xtbaobiaoResult" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
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
    "xtbaobiaoResult"
})
@XmlRootElement(name = "xtbaobiaoResponse")
public class XtbaobiaoResponse {

    protected byte[] xtbaobiaoResult;

    /**
     * Gets the value of the xtbaobiaoResult property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getXtbaobiaoResult() {
        return xtbaobiaoResult;
    }

    /**
     * Sets the value of the xtbaobiaoResult property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setXtbaobiaoResult(byte[] value) {
        this.xtbaobiaoResult = value;
    }

}
