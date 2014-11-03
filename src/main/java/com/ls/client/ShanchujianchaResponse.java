
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
 *         &lt;element name="shanchujianchaResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "shanchujianchaResult"
})
@XmlRootElement(name = "shanchujianchaResponse")
public class ShanchujianchaResponse {

    protected int shanchujianchaResult;

    /**
     * Gets the value of the shanchujianchaResult property.
     * 
     */
    public int getShanchujianchaResult() {
        return shanchujianchaResult;
    }

    /**
     * Sets the value of the shanchujianchaResult property.
     * 
     */
    public void setShanchujianchaResult(int value) {
        this.shanchujianchaResult = value;
    }

}
