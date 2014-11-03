
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
 *         &lt;element name="lshzzResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "lshzzResult"
})
@XmlRootElement(name = "lshzzResponse")
public class LshzzResponse {

    protected int lshzzResult;

    /**
     * Gets the value of the lshzzResult property.
     * 
     */
    public int getLshzzResult() {
        return lshzzResult;
    }

    /**
     * Sets the value of the lshzzResult property.
     * 
     */
    public void setLshzzResult(int value) {
        this.lshzzResult = value;
    }

}
