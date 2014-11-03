
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
 *         &lt;element name="fujian" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dizhi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="leixing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="biaoti" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="riqi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kehu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="miaoshu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "fujian",
    "jd",
    "wd",
    "dizhi",
    "leixing",
    "biaoti",
    "riqi",
    "kehu",
    "miaoshu"
})
@XmlRootElement(name = "mbfujiancz")
public class Mbfujiancz {

    protected String cup;
    protected String mk;
    protected String fujian;
    protected String jd;
    protected String wd;
    protected String dizhi;
    protected String leixing;
    protected String biaoti;
    protected String riqi;
    protected String kehu;
    protected String miaoshu;

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
     * Gets the value of the fujian property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFujian() {
        return fujian;
    }

    /**
     * Sets the value of the fujian property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFujian(String value) {
        this.fujian = value;
    }

    /**
     * Gets the value of the jd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJd() {
        return jd;
    }

    /**
     * Sets the value of the jd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJd(String value) {
        this.jd = value;
    }

    /**
     * Gets the value of the wd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWd() {
        return wd;
    }

    /**
     * Sets the value of the wd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWd(String value) {
        this.wd = value;
    }

    /**
     * Gets the value of the dizhi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDizhi() {
        return dizhi;
    }

    /**
     * Sets the value of the dizhi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDizhi(String value) {
        this.dizhi = value;
    }

    /**
     * Gets the value of the leixing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeixing() {
        return leixing;
    }

    /**
     * Sets the value of the leixing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeixing(String value) {
        this.leixing = value;
    }

    /**
     * Gets the value of the biaoti property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBiaoti() {
        return biaoti;
    }

    /**
     * Sets the value of the biaoti property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBiaoti(String value) {
        this.biaoti = value;
    }

    /**
     * Gets the value of the riqi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiqi() {
        return riqi;
    }

    /**
     * Sets the value of the riqi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiqi(String value) {
        this.riqi = value;
    }

    /**
     * Gets the value of the kehu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKehu() {
        return kehu;
    }

    /**
     * Sets the value of the kehu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKehu(String value) {
        this.kehu = value;
    }

    /**
     * Gets the value of the miaoshu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiaoshu() {
        return miaoshu;
    }

    /**
     * Sets the value of the miaoshu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiaoshu(String value) {
        this.miaoshu = value;
    }

}
