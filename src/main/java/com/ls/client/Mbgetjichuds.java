
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
 *         &lt;element name="chengxuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jisuanjiming" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dengluming" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="denglumima" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zhangtaoming" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "chengxuid",
    "jisuanjiming",
    "dengluming",
    "denglumima",
    "zhangtaoming"
})
@XmlRootElement(name = "mbgetjichuds")
public class Mbgetjichuds {

    protected String chengxuid;
    protected String jisuanjiming;
    protected String dengluming;
    protected String denglumima;
    protected String zhangtaoming;

    /**
     * Gets the value of the chengxuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChengxuid() {
        return chengxuid;
    }

    /**
     * Sets the value of the chengxuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChengxuid(String value) {
        this.chengxuid = value;
    }

    /**
     * Gets the value of the jisuanjiming property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJisuanjiming() {
        return jisuanjiming;
    }

    /**
     * Sets the value of the jisuanjiming property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJisuanjiming(String value) {
        this.jisuanjiming = value;
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

}
