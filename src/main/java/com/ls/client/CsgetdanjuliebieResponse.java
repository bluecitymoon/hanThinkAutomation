
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
 *         &lt;element name="csgetdanjuliebieResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "csgetdanjuliebieResult"
})
@XmlRootElement(name = "csgetdanjuliebieResponse")
public class CsgetdanjuliebieResponse {

    protected String csgetdanjuliebieResult;

    /**
     * Gets the value of the csgetdanjuliebieResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCsgetdanjuliebieResult() {
        return csgetdanjuliebieResult;
    }

    /**
     * Sets the value of the csgetdanjuliebieResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCsgetdanjuliebieResult(String value) {
        this.csgetdanjuliebieResult = value;
    }

}
