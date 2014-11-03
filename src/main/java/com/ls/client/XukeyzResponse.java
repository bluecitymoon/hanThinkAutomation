
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
 *         &lt;element name="xukeyzResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "xukeyzResult"
})
@XmlRootElement(name = "xukeyzResponse")
public class XukeyzResponse {

    protected boolean xukeyzResult;

    /**
     * Gets the value of the xukeyzResult property.
     * 
     */
    public boolean isXukeyzResult() {
        return xukeyzResult;
    }

    /**
     * Sets the value of the xukeyzResult property.
     * 
     */
    public void setXukeyzResult(boolean value) {
        this.xukeyzResult = value;
    }

}
