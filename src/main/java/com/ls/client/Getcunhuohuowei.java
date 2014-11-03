
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
 *         &lt;element name="dengluming" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="denglumima" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zhangtaoming" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cangkuid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cunhuoid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="chziyouxiang2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="chziyouxiang3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="chziyouxiang4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chziyouxiang5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="btziyouxiang1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="btziyouxiang2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="btziyouxiang3" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "cangkuid",
    "cunhuoid",
    "chziyouxiang2",
    "chziyouxiang3",
    "chziyouxiang4",
    "chziyouxiang5",
    "btziyouxiang1",
    "btziyouxiang2",
    "btziyouxiang3"
})
@XmlRootElement(name = "getcunhuohuowei")
public class Getcunhuohuowei {

    protected String cup;
    protected String wangka;
    protected String dengluming;
    protected String denglumima;
    protected String zhangtaoming;
    protected int cangkuid;
    protected int cunhuoid;
    protected int chziyouxiang2;
    protected int chziyouxiang3;
    protected String chziyouxiang4;
    protected String chziyouxiang5;
    protected int btziyouxiang1;
    protected int btziyouxiang2;
    protected int btziyouxiang3;

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
     * Gets the value of the chziyouxiang2 property.
     * 
     */
    public int getChziyouxiang2() {
        return chziyouxiang2;
    }

    /**
     * Sets the value of the chziyouxiang2 property.
     * 
     */
    public void setChziyouxiang2(int value) {
        this.chziyouxiang2 = value;
    }

    /**
     * Gets the value of the chziyouxiang3 property.
     * 
     */
    public int getChziyouxiang3() {
        return chziyouxiang3;
    }

    /**
     * Sets the value of the chziyouxiang3 property.
     * 
     */
    public void setChziyouxiang3(int value) {
        this.chziyouxiang3 = value;
    }

    /**
     * Gets the value of the chziyouxiang4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChziyouxiang4() {
        return chziyouxiang4;
    }

    /**
     * Sets the value of the chziyouxiang4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChziyouxiang4(String value) {
        this.chziyouxiang4 = value;
    }

    /**
     * Gets the value of the chziyouxiang5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChziyouxiang5() {
        return chziyouxiang5;
    }

    /**
     * Sets the value of the chziyouxiang5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChziyouxiang5(String value) {
        this.chziyouxiang5 = value;
    }

    /**
     * Gets the value of the btziyouxiang1 property.
     * 
     */
    public int getBtziyouxiang1() {
        return btziyouxiang1;
    }

    /**
     * Sets the value of the btziyouxiang1 property.
     * 
     */
    public void setBtziyouxiang1(int value) {
        this.btziyouxiang1 = value;
    }

    /**
     * Gets the value of the btziyouxiang2 property.
     * 
     */
    public int getBtziyouxiang2() {
        return btziyouxiang2;
    }

    /**
     * Sets the value of the btziyouxiang2 property.
     * 
     */
    public void setBtziyouxiang2(int value) {
        this.btziyouxiang2 = value;
    }

    /**
     * Gets the value of the btziyouxiang3 property.
     * 
     */
    public int getBtziyouxiang3() {
        return btziyouxiang3;
    }

    /**
     * Sets the value of the btziyouxiang3 property.
     * 
     */
    public void setBtziyouxiang3(int value) {
        this.btziyouxiang3 = value;
    }

}
