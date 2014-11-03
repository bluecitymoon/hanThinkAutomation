
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
 *         &lt;element name="zdid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "zdid",
    "lx"
})
@XmlRootElement(name = "mbgetxiaoxi")
public class Mbgetxiaoxi {

    protected String cup;
    protected String mk;
    protected String zdid;
    protected String lx;

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
     * Gets the value of the zdid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZdid() {
        return zdid;
    }

    /**
     * Sets the value of the zdid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZdid(String value) {
        this.zdid = value;
    }

    /**
     * Gets the value of the lx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLx() {
        return lx;
    }

    /**
     * Sets the value of the lx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLx(String value) {
        this.lx = value;
    }

}
