
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
 *         &lt;element name="mbsaodanxinxiResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "mbsaodanxinxiResult"
})
@XmlRootElement(name = "mbsaodanxinxiResponse")
public class MbsaodanxinxiResponse {

    protected String mbsaodanxinxiResult;

    /**
     * Gets the value of the mbsaodanxinxiResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMbsaodanxinxiResult() {
        return mbsaodanxinxiResult;
    }

    /**
     * Sets the value of the mbsaodanxinxiResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMbsaodanxinxiResult(String value) {
        this.mbsaodanxinxiResult = value;
    }

}
