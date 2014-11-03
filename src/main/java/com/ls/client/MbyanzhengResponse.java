
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
 *         &lt;element name="mbyanzhengResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "mbyanzhengResult"
})
@XmlRootElement(name = "mbyanzhengResponse")
public class MbyanzhengResponse {

    protected int mbyanzhengResult;

    /**
     * Gets the value of the mbyanzhengResult property.
     * 
     */
    public int getMbyanzhengResult() {
        return mbyanzhengResult;
    }

    /**
     * Sets the value of the mbyanzhengResult property.
     * 
     */
    public void setMbyanzhengResult(int value) {
        this.mbyanzhengResult = value;
    }

}
