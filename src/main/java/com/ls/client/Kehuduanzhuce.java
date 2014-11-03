
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
 *         &lt;element name="cpuhao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wangka" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mingcheng" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "cpuhao",
    "wangka",
    "mingcheng"
})
@XmlRootElement(name = "kehuduanzhuce")
public class Kehuduanzhuce {

    protected String cpuhao;
    protected String wangka;
    protected String mingcheng;

    /**
     * Gets the value of the cpuhao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpuhao() {
        return cpuhao;
    }

    /**
     * Sets the value of the cpuhao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpuhao(String value) {
        this.cpuhao = value;
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
     * Gets the value of the mingcheng property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMingcheng() {
        return mingcheng;
    }

    /**
     * Sets the value of the mingcheng property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMingcheng(String value) {
        this.mingcheng = value;
    }

}
