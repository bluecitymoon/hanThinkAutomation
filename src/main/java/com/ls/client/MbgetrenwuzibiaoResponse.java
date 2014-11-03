
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
 *         &lt;element name="mbgetrenwuzibiaoResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "mbgetrenwuzibiaoResult"
})
@XmlRootElement(name = "mbgetrenwuzibiaoResponse")
public class MbgetrenwuzibiaoResponse {

    protected String mbgetrenwuzibiaoResult;

    /**
     * Gets the value of the mbgetrenwuzibiaoResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMbgetrenwuzibiaoResult() {
        return mbgetrenwuzibiaoResult;
    }

    /**
     * Sets the value of the mbgetrenwuzibiaoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMbgetrenwuzibiaoResult(String value) {
        this.mbgetrenwuzibiaoResult = value;
    }

}
