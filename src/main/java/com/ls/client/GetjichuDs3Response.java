
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
 *         &lt;element name="getjichuDs3Result" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
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
    "getjichuDs3Result"
})
@XmlRootElement(name = "getjichuDs3Response")
public class GetjichuDs3Response {

    protected byte[] getjichuDs3Result;

    /**
     * Gets the value of the getjichuDs3Result property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getGetjichuDs3Result() {
        return getjichuDs3Result;
    }

    /**
     * Sets the value of the getjichuDs3Result property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setGetjichuDs3Result(byte[] value) {
        this.getjichuDs3Result = value;
    }

}
