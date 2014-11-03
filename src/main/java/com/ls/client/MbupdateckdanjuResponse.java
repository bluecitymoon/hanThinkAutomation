
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
 *         &lt;element name="mbupdateckdanjuResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "mbupdateckdanjuResult"
})
@XmlRootElement(name = "mbupdateckdanjuResponse")
public class MbupdateckdanjuResponse {

    protected String mbupdateckdanjuResult;

    /**
     * Gets the value of the mbupdateckdanjuResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMbupdateckdanjuResult() {
        return mbupdateckdanjuResult;
    }

    /**
     * Sets the value of the mbupdateckdanjuResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMbupdateckdanjuResult(String value) {
        this.mbupdateckdanjuResult = value;
    }

}
