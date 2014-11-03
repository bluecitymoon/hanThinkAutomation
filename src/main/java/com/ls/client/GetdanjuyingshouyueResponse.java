
package com.ls.client;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="getdanjuyingshouyueResult" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
    "getdanjuyingshouyueResult"
})
@XmlRootElement(name = "getdanjuyingshouyueResponse")
public class GetdanjuyingshouyueResponse {

    @XmlElement(required = true)
    protected BigDecimal getdanjuyingshouyueResult;

    /**
     * Gets the value of the getdanjuyingshouyueResult property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGetdanjuyingshouyueResult() {
        return getdanjuyingshouyueResult;
    }

    /**
     * Sets the value of the getdanjuyingshouyueResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGetdanjuyingshouyueResult(BigDecimal value) {
        this.getdanjuyingshouyueResult = value;
    }

}
