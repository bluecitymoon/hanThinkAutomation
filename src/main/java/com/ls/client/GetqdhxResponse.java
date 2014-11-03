
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
 *         &lt;element name="getqdhxResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "getqdhxResult"
})
@XmlRootElement(name = "getqdhxResponse")
public class GetqdhxResponse {

    protected boolean getqdhxResult;

    /**
     * Gets the value of the getqdhxResult property.
     * 
     */
    public boolean isGetqdhxResult() {
        return getqdhxResult;
    }

    /**
     * Sets the value of the getqdhxResult property.
     * 
     */
    public void setGetqdhxResult(boolean value) {
        this.getqdhxResult = value;
    }

}
