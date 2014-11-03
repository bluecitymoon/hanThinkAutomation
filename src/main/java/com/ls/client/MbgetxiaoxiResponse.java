
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
 *         &lt;element name="mbgetxiaoxiResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "mbgetxiaoxiResult"
})
@XmlRootElement(name = "mbgetxiaoxiResponse")
public class MbgetxiaoxiResponse {

    protected String mbgetxiaoxiResult;

    /**
     * Gets the value of the mbgetxiaoxiResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMbgetxiaoxiResult() {
        return mbgetxiaoxiResult;
    }

    /**
     * Sets the value of the mbgetxiaoxiResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMbgetxiaoxiResult(String value) {
        this.mbgetxiaoxiResult = value;
    }

}
