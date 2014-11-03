
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
 *         &lt;element name="mk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xiaoxiid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fankuineirong" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jieshourenid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "mk",
    "xiaoxiid",
    "fankuineirong",
    "jieshourenid"
})
@XmlRootElement(name = "mbxiaoxifankui")
public class Mbxiaoxifankui {

    protected String cup;
    protected String mk;
    protected String xiaoxiid;
    protected String fankuineirong;
    protected String jieshourenid;

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
     * Gets the value of the mk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMk() {
        return mk;
    }

    /**
     * Sets the value of the mk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMk(String value) {
        this.mk = value;
    }

    /**
     * Gets the value of the xiaoxiid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXiaoxiid() {
        return xiaoxiid;
    }

    /**
     * Sets the value of the xiaoxiid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXiaoxiid(String value) {
        this.xiaoxiid = value;
    }

    /**
     * Gets the value of the fankuineirong property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFankuineirong() {
        return fankuineirong;
    }

    /**
     * Sets the value of the fankuineirong property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFankuineirong(String value) {
        this.fankuineirong = value;
    }

    /**
     * Gets the value of the jieshourenid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJieshourenid() {
        return jieshourenid;
    }

    /**
     * Sets the value of the jieshourenid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJieshourenid(String value) {
        this.jieshourenid = value;
    }

}
