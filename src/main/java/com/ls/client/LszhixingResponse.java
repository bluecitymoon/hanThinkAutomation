
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
 *         &lt;element name="lszhixingResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "lszhixingResult"
})
@XmlRootElement(name = "lszhixingResponse")
public class LszhixingResponse {

    protected String lszhixingResult;

    /**
     * Gets the value of the lszhixingResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLszhixingResult() {
        return lszhixingResult;
    }

    /**
     * Sets the value of the lszhixingResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLszhixingResult(String value) {
        this.lszhixingResult = value;
    }

}
