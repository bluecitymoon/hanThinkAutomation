
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
 *         &lt;element name="mbckdanjuResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "mbckdanjuResult"
})
@XmlRootElement(name = "mbckdanjuResponse")
public class MbckdanjuResponse {

    protected String mbckdanjuResult;

    /**
     * Gets the value of the mbckdanjuResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMbckdanjuResult() {
        return mbckdanjuResult;
    }

    /**
     * Sets the value of the mbckdanjuResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMbckdanjuResult(String value) {
        this.mbckdanjuResult = value;
    }

}
