
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
 *         &lt;element name="shifouhuidanResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "shifouhuidanResult"
})
@XmlRootElement(name = "shifouhuidanResponse")
public class ShifouhuidanResponse {

    protected boolean shifouhuidanResult;

    /**
     * Gets the value of the shifouhuidanResult property.
     * 
     */
    public boolean isShifouhuidanResult() {
        return shifouhuidanResult;
    }

    /**
     * Sets the value of the shifouhuidanResult property.
     * 
     */
    public void setShifouhuidanResult(boolean value) {
        this.shifouhuidanResult = value;
    }

}
