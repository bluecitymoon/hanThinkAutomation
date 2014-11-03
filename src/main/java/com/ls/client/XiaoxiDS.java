
package com.ls.client;

import java.util.ArrayList;
import java.util.List;
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
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="xiaoxi">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="renyuanid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="neirong" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="3000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="fasongren" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="suoshuleibieid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="yuedu" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="yewuid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="zhubiaoming" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="zibiaoming" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="zhubiaoid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="shijian" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="chulijiegou" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="3000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="zhuangtai" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="cengji" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="fasongrenid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="zonghe" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="1000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="zidingyi1" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="200"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="zidingyi2" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="200"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="zidingyi3" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="200"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "xiaoxi"
})
@XmlRootElement(name = "xiaoxiDS", namespace = "http://tempuri.org/xiaoxiDS.xsd")
public class XiaoxiDS {

    @XmlElement(namespace = "http://tempuri.org/xiaoxiDS.xsd")
    protected List<XiaoxiDS.Xiaoxi> xiaoxi;

    /**
     * Gets the value of the xiaoxi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xiaoxi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXiaoxi().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XiaoxiDS.Xiaoxi }
     * 
     * 
     */
    public List<XiaoxiDS.Xiaoxi> getXiaoxi() {
        if (xiaoxi == null) {
            xiaoxi = new ArrayList<XiaoxiDS.Xiaoxi>();
        }
        return this.xiaoxi;
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
     *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="renyuanid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="neirong" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="3000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="fasongren" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="suoshuleibieid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="yuedu" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="yewuid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="zhubiaoming" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="zibiaoming" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="zhubiaoid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="shijian" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="chulijiegou" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="3000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="zhuangtai" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="cengji" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="fasongrenid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="zonghe" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="1000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="zidingyi1" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="200"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="zidingyi2" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="200"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="zidingyi3" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="200"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
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
        "id",
        "renyuanid",
        "neirong",
        "fasongren",
        "suoshuleibieid",
        "yuedu",
        "yewuid",
        "zhubiaoming",
        "zibiaoming",
        "zhubiaoid",
        "shijian",
        "chulijiegou",
        "zhuangtai",
        "cengji",
        "fasongrenid",
        "zonghe",
        "zidingyi1",
        "zidingyi2",
        "zidingyi3"
    })
    public static class Xiaoxi {

        @XmlElement(namespace = "http://tempuri.org/xiaoxiDS.xsd")
        protected int id;
        @XmlElement(namespace = "http://tempuri.org/xiaoxiDS.xsd")
        protected Integer renyuanid;
        @XmlElement(namespace = "http://tempuri.org/xiaoxiDS.xsd")
        protected String neirong;
        @XmlElement(namespace = "http://tempuri.org/xiaoxiDS.xsd")
        protected String fasongren;
        @XmlElement(namespace = "http://tempuri.org/xiaoxiDS.xsd")
        protected Integer suoshuleibieid;
        @XmlElement(namespace = "http://tempuri.org/xiaoxiDS.xsd")
        protected Boolean yuedu;
        @XmlElement(namespace = "http://tempuri.org/xiaoxiDS.xsd")
        protected Integer yewuid;
        @XmlElement(namespace = "http://tempuri.org/xiaoxiDS.xsd")
        protected String zhubiaoming;
        @XmlElement(namespace = "http://tempuri.org/xiaoxiDS.xsd")
        protected String zibiaoming;
        @XmlElement(namespace = "http://tempuri.org/xiaoxiDS.xsd")
        protected Integer zhubiaoid;
        @XmlElement(namespace = "http://tempuri.org/xiaoxiDS.xsd")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar shijian;
        @XmlElement(namespace = "http://tempuri.org/xiaoxiDS.xsd")
        protected String chulijiegou;
        @XmlElement(namespace = "http://tempuri.org/xiaoxiDS.xsd")
        protected String zhuangtai;
        @XmlElement(namespace = "http://tempuri.org/xiaoxiDS.xsd")
        protected Integer cengji;
        @XmlElement(namespace = "http://tempuri.org/xiaoxiDS.xsd")
        protected Integer fasongrenid;
        @XmlElement(namespace = "http://tempuri.org/xiaoxiDS.xsd")
        protected String zonghe;
        @XmlElement(namespace = "http://tempuri.org/xiaoxiDS.xsd")
        protected String zidingyi1;
        @XmlElement(namespace = "http://tempuri.org/xiaoxiDS.xsd")
        protected String zidingyi2;
        @XmlElement(namespace = "http://tempuri.org/xiaoxiDS.xsd")
        protected String zidingyi3;

        /**
         * Gets the value of the id property.
         * 
         */
        public int getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         */
        public void setId(int value) {
            this.id = value;
        }

        /**
         * Gets the value of the renyuanid property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getRenyuanid() {
            return renyuanid;
        }

        /**
         * Sets the value of the renyuanid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setRenyuanid(Integer value) {
            this.renyuanid = value;
        }

        /**
         * Gets the value of the neirong property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNeirong() {
            return neirong;
        }

        /**
         * Sets the value of the neirong property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNeirong(String value) {
            this.neirong = value;
        }

        /**
         * Gets the value of the fasongren property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFasongren() {
            return fasongren;
        }

        /**
         * Sets the value of the fasongren property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFasongren(String value) {
            this.fasongren = value;
        }

        /**
         * Gets the value of the suoshuleibieid property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getSuoshuleibieid() {
            return suoshuleibieid;
        }

        /**
         * Sets the value of the suoshuleibieid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setSuoshuleibieid(Integer value) {
            this.suoshuleibieid = value;
        }

        /**
         * Gets the value of the yuedu property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isYuedu() {
            return yuedu;
        }

        /**
         * Sets the value of the yuedu property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setYuedu(Boolean value) {
            this.yuedu = value;
        }

        /**
         * Gets the value of the yewuid property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getYewuid() {
            return yewuid;
        }

        /**
         * Sets the value of the yewuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setYewuid(Integer value) {
            this.yewuid = value;
        }

        /**
         * Gets the value of the zhubiaoming property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZhubiaoming() {
            return zhubiaoming;
        }

        /**
         * Sets the value of the zhubiaoming property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZhubiaoming(String value) {
            this.zhubiaoming = value;
        }

        /**
         * Gets the value of the zibiaoming property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZibiaoming() {
            return zibiaoming;
        }

        /**
         * Sets the value of the zibiaoming property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZibiaoming(String value) {
            this.zibiaoming = value;
        }

        /**
         * Gets the value of the zhubiaoid property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getZhubiaoid() {
            return zhubiaoid;
        }

        /**
         * Sets the value of the zhubiaoid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setZhubiaoid(Integer value) {
            this.zhubiaoid = value;
        }

        /**
         * Gets the value of the shijian property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getShijian() {
            return shijian;
        }

        /**
         * Sets the value of the shijian property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setShijian(XMLGregorianCalendar value) {
            this.shijian = value;
        }

        /**
         * Gets the value of the chulijiegou property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChulijiegou() {
            return chulijiegou;
        }

        /**
         * Sets the value of the chulijiegou property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChulijiegou(String value) {
            this.chulijiegou = value;
        }

        /**
         * Gets the value of the zhuangtai property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZhuangtai() {
            return zhuangtai;
        }

        /**
         * Sets the value of the zhuangtai property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZhuangtai(String value) {
            this.zhuangtai = value;
        }

        /**
         * Gets the value of the cengji property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCengji() {
            return cengji;
        }

        /**
         * Sets the value of the cengji property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCengji(Integer value) {
            this.cengji = value;
        }

        /**
         * Gets the value of the fasongrenid property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getFasongrenid() {
            return fasongrenid;
        }

        /**
         * Sets the value of the fasongrenid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setFasongrenid(Integer value) {
            this.fasongrenid = value;
        }

        /**
         * Gets the value of the zonghe property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZonghe() {
            return zonghe;
        }

        /**
         * Sets the value of the zonghe property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZonghe(String value) {
            this.zonghe = value;
        }

        /**
         * Gets the value of the zidingyi1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZidingyi1() {
            return zidingyi1;
        }

        /**
         * Sets the value of the zidingyi1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZidingyi1(String value) {
            this.zidingyi1 = value;
        }

        /**
         * Gets the value of the zidingyi2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZidingyi2() {
            return zidingyi2;
        }

        /**
         * Sets the value of the zidingyi2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZidingyi2(String value) {
            this.zidingyi2 = value;
        }

        /**
         * Gets the value of the zidingyi3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZidingyi3() {
            return zidingyi3;
        }

        /**
         * Sets the value of the zidingyi3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZidingyi3(String value) {
            this.zidingyi3 = value;
        }

    }

}
