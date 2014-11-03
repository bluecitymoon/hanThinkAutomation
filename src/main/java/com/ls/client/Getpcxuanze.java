
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
 *         &lt;element name="zhangtaoming" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cangkuid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="zmrq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cunhuoids" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "zhangtaoming",
    "cangkuid",
    "zmrq",
    "cunhuoids"
})
@XmlRootElement(name = "getpcxuanze")
public class Getpcxuanze {

    protected String zhangtaoming;
    protected int cangkuid;
    protected String zmrq;
    protected String cunhuoids;

    /**
     * Gets the value of the zhangtaoming property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZhangtaoming() {
        return zhangtaoming;
    }

    /**
     * Sets the value of the zhangtaoming property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZhangtaoming(String value) {
        this.zhangtaoming = value;
    }

    /**
     * Gets the value of the cangkuid property.
     * 
     */
    public int getCangkuid() {
        return cangkuid;
    }

    /**
     * Sets the value of the cangkuid property.
     * 
     */
    public void setCangkuid(int value) {
        this.cangkuid = value;
    }

    /**
     * Gets the value of the zmrq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZmrq() {
        return zmrq;
    }

    /**
     * Sets the value of the zmrq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZmrq(String value) {
        this.zmrq = value;
    }

    /**
     * Gets the value of the cunhuoids property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCunhuoids() {
        return cunhuoids;
    }

    /**
     * Sets the value of the cunhuoids property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCunhuoids(String value) {
        this.cunhuoids = value;
    }

}
