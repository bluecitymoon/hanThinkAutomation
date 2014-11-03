
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
 *         &lt;element name="mbgetrenwuzhubiaoResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "mbgetrenwuzhubiaoResult"
})
@XmlRootElement(name = "mbgetrenwuzhubiaoResponse")
public class MbgetrenwuzhubiaoResponse {

    protected String mbgetrenwuzhubiaoResult;

    /**
     * Gets the value of the mbgetrenwuzhubiaoResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMbgetrenwuzhubiaoResult() {
        return mbgetrenwuzhubiaoResult;
    }

    /**
     * Sets the value of the mbgetrenwuzhubiaoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMbgetrenwuzhubiaoResult(String value) {
        this.mbgetrenwuzhubiaoResult = value;
    }

}
