
package com.ls.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
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
 *         &lt;element name="dengluming" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="denglumima" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zhangtaoming" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="danjuds" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any maxOccurs="2" minOccurs="2"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "dengluming",
    "denglumima",
    "zhangtaoming",
    "danjuds"
})
@XmlRootElement(name = "daorudanju")
public class Daorudanju {

    protected String dengluming;
    protected String denglumima;
    protected String zhangtaoming;
    protected Daorudanju.Danjuds danjuds;

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
     * Gets the value of the danjuds property.
     * 
     * @return
     *     possible object is
     *     {@link Daorudanju.Danjuds }
     *     
     */
    public Daorudanju.Danjuds getDanjuds() {
        return danjuds;
    }

    /**
     * Sets the value of the danjuds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Daorudanju.Danjuds }
     *     
     */
    public void setDanjuds(Daorudanju.Danjuds value) {
        this.danjuds = value;
    }


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
     *         &lt;any maxOccurs="2" minOccurs="2"/>
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
        "any"
    })
    public static class Danjuds {

        @XmlAnyElement(lax = true)
        protected List<Object> any;

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<Object>();
            }
            return this.any;
        }

    }

}
