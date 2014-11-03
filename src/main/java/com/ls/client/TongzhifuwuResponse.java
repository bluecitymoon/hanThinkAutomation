
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
 *         &lt;element name="tongzhifuwuResult" type="{http://HanThink.com/}ArrayOfAnyType" minOccurs="0"/>
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
    "tongzhifuwuResult"
})
@XmlRootElement(name = "tongzhifuwuResponse")
public class TongzhifuwuResponse {

    protected ArrayOfAnyType tongzhifuwuResult;

    /**
     * Gets the value of the tongzhifuwuResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAnyType }
     *     
     */
    public ArrayOfAnyType getTongzhifuwuResult() {
        return tongzhifuwuResult;
    }

    /**
     * Sets the value of the tongzhifuwuResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAnyType }
     *     
     */
    public void setTongzhifuwuResult(ArrayOfAnyType value) {
        this.tongzhifuwuResult = value;
    }

}
