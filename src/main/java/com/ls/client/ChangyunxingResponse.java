
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
 *         &lt;element name="changyunxingResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "changyunxingResult"
})
@XmlRootElement(name = "changyunxingResponse")
public class ChangyunxingResponse {

    protected int changyunxingResult;

    /**
     * Gets the value of the changyunxingResult property.
     * 
     */
    public int getChangyunxingResult() {
        return changyunxingResult;
    }

    /**
     * Sets the value of the changyunxingResult property.
     * 
     */
    public void setChangyunxingResult(int value) {
        this.changyunxingResult = value;
    }

}
