
package com.ls.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="dengluming" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="denglumima" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zhangtaoming" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="riqi" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="cunhuoid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="danweiid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mendians" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fs" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "dengluming",
    "denglumima",
    "zhangtaoming",
    "riqi",
    "cunhuoid",
    "danweiid",
    "mendians",
    "fs"
})
@XmlRootElement(name = "getjiage")
public class Getjiage {

    protected String cup;
    protected String wangka;
    protected String dengluming;
    protected String denglumima;
    protected String zhangtaoming;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar riqi;
    protected int cunhuoid;
    protected int danweiid;
    protected String mendians;
    protected int fs;

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
     * Gets the value of the dengluming property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDengluming() {
        return dengluming;
    }

    /**
     * Sets the value of the dengluming property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDengluming(String value) {
        this.dengluming = value;
    }

    /**
     * Gets the value of the denglumima property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenglumima() {
        return denglumima;
    }

    /**
     * Sets the value of the denglumima property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenglumima(String value) {
        this.denglumima = value;
    }

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
     * Gets the value of the riqi property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRiqi() {
        return riqi;
    }

    /**
     * Sets the value of the riqi property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRiqi(XMLGregorianCalendar value) {
        this.riqi = value;
    }

    /**
     * Gets the value of the cunhuoid property.
     * 
     */
    public int getCunhuoid() {
        return cunhuoid;
    }

    /**
     * Sets the value of the cunhuoid property.
     * 
     */
    public void setCunhuoid(int value) {
        this.cunhuoid = value;
    }

    /**
     * Gets the value of the danweiid property.
     * 
     */
    public int getDanweiid() {
        return danweiid;
    }

    /**
     * Sets the value of the danweiid property.
     * 
     */
    public void setDanweiid(int value) {
        this.danweiid = value;
    }

    /**
     * Gets the value of the mendians property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMendians() {
        return mendians;
    }

    /**
     * Sets the value of the mendians property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMendians(String value) {
        this.mendians = value;
    }

    /**
     * Gets the value of the fs property.
     * 
     */
    public int getFs() {
        return fs;
    }

    /**
     * Sets the value of the fs property.
     * 
     */
    public void setFs(int value) {
        this.fs = value;
    }

}
