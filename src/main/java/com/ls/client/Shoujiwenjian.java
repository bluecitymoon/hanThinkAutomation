
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
 *         &lt;element name="cup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wangka" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xinxi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wjname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "cup",
    "wangka",
    "xinxi",
    "wjname"
})
@XmlRootElement(name = "shoujiwenjian")
public class Shoujiwenjian {

    protected String cup;
    protected String wangka;
    protected String xinxi;
    protected String wjname;

    /**
     * Gets the value of the cup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCup() {
        return cup;
    }

    /**
     * Sets the value of the cup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCup(String value) {
        this.cup = value;
    }

    /**
     * Gets the value of the wangka property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWangka() {
        return wangka;
    }

    /**
     * Sets the value of the wangka property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWangka(String value) {
        this.wangka = value;
    }

    /**
     * Gets the value of the xinxi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXinxi() {
        return xinxi;
    }

    /**
     * Sets the value of the xinxi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXinxi(String value) {
        this.xinxi = value;
    }

    /**
     * Gets the value of the wjname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWjname() {
        return wjname;
    }

    /**
     * Sets the value of the wjname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWjname(String value) {
        this.wjname = value;
    }

}
