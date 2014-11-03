
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
 *         &lt;element name="yanzhengResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "yanzhengResult"
})
@XmlRootElement(name = "yanzhengResponse")
public class YanzhengResponse {

    protected int yanzhengResult;

    /**
     * Gets the value of the yanzhengResult property.
     * 
     */
    public int getYanzhengResult() {
        return yanzhengResult;
    }

    /**
     * Sets the value of the yanzhengResult property.
     * 
     */
    public void setYanzhengResult(int value) {
        this.yanzhengResult = value;
    }

}
