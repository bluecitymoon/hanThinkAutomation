
package com.ls.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
 *         &lt;element name="beifenjihua">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="mingcheng" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="zhangtao" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="shijian" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="shujuku" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="lujing" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="300"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="zhixingriqi" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="baoliutianshu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="dengluxinxi">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="CPU" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="jisuanjiming" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="zhangtao" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="mokuai" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="caozuoyuan" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="denglushijian" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="xukejidengluzhandian">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="mingcheng" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="xukeshu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="denglushu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="xx" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="zhangtaobiaoshi">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="mingcheng">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="gengxinshijian" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="shujuku" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="zhucexinxibiao">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="CPUhao">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="200"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="wangka">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="200"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="jisuanjiming" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="gengxinshijian" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="shifouzhuce" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="mendian" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="500"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="chengxuji">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="mingcheng">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="500"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="banben" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="500"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="lujing" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="500"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="wenjianjia" minOccurs="0">
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
    "beifenjihuaOrDengluxinxiOrXukejidengluzhandian"
})
@XmlRootElement(name = "xitongDs", namespace = "http://tempuri.org/xitongDs1.xsd")
public class XitongDs {

    @XmlElements({
        @XmlElement(name = "beifenjihua", namespace = "http://tempuri.org/xitongDs1.xsd", type = XitongDs.Beifenjihua.class),
        @XmlElement(name = "dengluxinxi", namespace = "http://tempuri.org/xitongDs1.xsd", type = XitongDs.Dengluxinxi.class),
        @XmlElement(name = "xukejidengluzhandian", namespace = "http://tempuri.org/xitongDs1.xsd", type = XitongDs.Xukejidengluzhandian.class),
        @XmlElement(name = "zhangtaobiaoshi", namespace = "http://tempuri.org/xitongDs1.xsd", type = XitongDs.Zhangtaobiaoshi.class),
        @XmlElement(name = "zhucexinxibiao", namespace = "http://tempuri.org/xitongDs1.xsd", type = XitongDs.Zhucexinxibiao.class),
        @XmlElement(name = "chengxuji", namespace = "http://tempuri.org/xitongDs1.xsd", type = XitongDs.Chengxuji.class)
    })
    protected List<Object> beifenjihuaOrDengluxinxiOrXukejidengluzhandian;

    /**
     * Gets the value of the beifenjihuaOrDengluxinxiOrXukejidengluzhandian property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beifenjihuaOrDengluxinxiOrXukejidengluzhandian property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBeifenjihuaOrDengluxinxiOrXukejidengluzhandian().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XitongDs.Beifenjihua }
     * {@link XitongDs.Dengluxinxi }
     * {@link XitongDs.Xukejidengluzhandian }
     * {@link XitongDs.Zhangtaobiaoshi }
     * {@link XitongDs.Zhucexinxibiao }
     * {@link XitongDs.Chengxuji }
     * 
     * 
     */
    public List<Object> getBeifenjihuaOrDengluxinxiOrXukejidengluzhandian() {
        if (beifenjihuaOrDengluxinxiOrXukejidengluzhandian == null) {
            beifenjihuaOrDengluxinxiOrXukejidengluzhandian = new ArrayList<Object>();
        }
        return this.beifenjihuaOrDengluxinxiOrXukejidengluzhandian;
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
     *         &lt;element name="mingcheng" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="zhangtao" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="shijian" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="shujuku" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="lujing" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="300"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="zhixingriqi" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="baoliutianshu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
        "mingcheng",
        "zhangtao",
        "shijian",
        "shujuku",
        "lujing",
        "zhixingriqi",
        "baoliutianshu"
    })
    public static class Beifenjihua {

        @XmlElement(namespace = "http://tempuri.org/xitongDs1.xsd")
        protected int id;
        @XmlElement(namespace = "http://tempuri.org/xitongDs1.xsd")
        protected String mingcheng;
        @XmlElement(namespace = "http://tempuri.org/xitongDs1.xsd")
        protected String zhangtao;
        @XmlElement(namespace = "http://tempuri.org/xitongDs1.xsd")
        protected String shijian;
        @XmlElement(namespace = "http://tempuri.org/xitongDs1.xsd")
        protected String shujuku;
        @XmlElement(namespace = "http://tempuri.org/xitongDs1.xsd")
        protected String lujing;
        @XmlElement(namespace = "http://tempuri.org/xitongDs1.xsd")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar zhixingriqi;
        @XmlElement(namespace = "http://tempuri.org/xitongDs1.xsd")
        protected Integer baoliutianshu;

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

        /**
         * Gets the value of the zhangtao property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZhangtao() {
            return zhangtao;
        }

        /**
         * Sets the value of the zhangtao property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZhangtao(String value) {
            this.zhangtao = value;
        }

        /**
         * Gets the value of the shijian property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShijian() {
            return shijian;
        }

        /**
         * Sets the value of the shijian property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShijian(String value) {
            this.shijian = value;
        }

        /**
         * Gets the value of the shujuku property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShujuku() {
            return shujuku;
        }

        /**
         * Sets the value of the shujuku property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShujuku(String value) {
            this.shujuku = value;
        }

        /**
         * Gets the value of the lujing property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLujing() {
            return lujing;
        }

        /**
         * Sets the value of the lujing property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLujing(String value) {
            this.lujing = value;
        }

        /**
         * Gets the value of the zhixingriqi property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getZhixingriqi() {
            return zhixingriqi;
        }

        /**
         * Sets the value of the zhixingriqi property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setZhixingriqi(XMLGregorianCalendar value) {
            this.zhixingriqi = value;
        }

        /**
         * Gets the value of the baoliutianshu property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getBaoliutianshu() {
            return baoliutianshu;
        }

        /**
         * Sets the value of the baoliutianshu property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setBaoliutianshu(Integer value) {
            this.baoliutianshu = value;
        }

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
     *         &lt;element name="mingcheng">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="500"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="banben" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="500"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="lujing" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="500"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="wenjianjia" minOccurs="0">
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
        "mingcheng",
        "banben",
        "lujing",
        "wenjianjia"
    })
    public static class Chengxuji {

        @XmlElement(namespace = "http://tempuri.org/xitongDs1.xsd")
        protected int id;
        @XmlElement(namespace = "http://tempuri.org/xitongDs1.xsd", required = true)
        protected String mingcheng;
        @XmlElement(namespace = "http://tempuri.org/xitongDs1.xsd")
        protected String banben;
        @XmlElement(namespace = "http://tempuri.org/xitongDs1.xsd")
        protected String lujing;
        @XmlElement(namespace = "http://tempuri.org/xitongDs1.xsd")
        protected String wenjianjia;

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

        /**
         * Gets the value of the banben property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBanben() {
            return banben;
        }

        /**
         * Sets the value of the banben property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBanben(String value) {
            this.banben = value;
        }

        /**
         * Gets the value of the lujing property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLujing() {
            return lujing;
        }

        /**
         * Sets the value of the lujing property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLujing(String value) {
            this.lujing = value;
        }

        /**
         * Gets the value of the wenjianjia property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWenjianjia() {
            return wenjianjia;
        }

        /**
         * Sets the value of the wenjianjia property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWenjianjia(String value) {
            this.wenjianjia = value;
        }

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
     *         &lt;element name="CPU" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="100"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="jisuanjiming" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="zhangtao" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="mokuai" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="caozuoyuan" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="denglushijian" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
        "cpu",
        "jisuanjiming",
        "zhangtao",
        "mokuai",
        "caozuoyuan",
        "denglushijian"
    })
    public static class Dengluxinxi {

        @XmlElement(namespace = "http://tempuri.org/xitongDs1.xsd")
        protected int id;
        @XmlElement(name = "CPU", namespace = "http://tempuri.org/xitongDs1.xsd")
        protected String cpu;
        @XmlElement(namespace = "http://tempuri.org/xitongDs1.xsd")
        protected String jisuanjiming;
        @XmlElement(namespace = "http://tempuri.org/xitongDs1.xsd")
        protected String zhangtao;
        @XmlElement(namespace = "http://tempuri.org/xitongDs1.xsd")
        protected String mokuai;
        @XmlElement(namespace = "http://tempuri.org/xitongDs1.xsd")
        protected String caozuoyuan;
        @XmlElement(namespace = "http://tempuri.org/xitongDs1.xsd")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar denglushijian;

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
         * Gets the value of the cpu property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCPU() {
            return cpu;
        }

        /**
         * Sets the value of the cpu property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCPU(String value) {
            this.cpu = value;
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
         * Gets the value of the zhangtao property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZhangtao() {
            return zhangtao;
        }

        /**
         * Sets the value of the zhangtao property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZhangtao(String value) {
            this.zhangtao = value;
        }

        /**
         * Gets the value of the mokuai property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMokuai() {
            return mokuai;
        }

        /**
         * Sets the value of the mokuai property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMokuai(String value) {
            this.mokuai = value;
        }

        /**
         * Gets the value of the caozuoyuan property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCaozuoyuan() {
            return caozuoyuan;
        }

        /**
         * Sets the value of the caozuoyuan property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCaozuoyuan(String value) {
            this.caozuoyuan = value;
        }

        /**
         * Gets the value of the denglushijian property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDenglushijian() {
            return denglushijian;
        }

        /**
         * Sets the value of the denglushijian property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDenglushijian(XMLGregorianCalendar value) {
            this.denglushijian = value;
        }

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
     *         &lt;element name="mingcheng" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="xukeshu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="denglushu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="xx" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
        "mingcheng",
        "xukeshu",
        "denglushu",
        "xx"
    })
    public static class Xukejidengluzhandian {

        @XmlElement(namespace = "http://tempuri.org/xitongDs1.xsd")
        protected int id;
        @XmlElement(namespace = "http://tempuri.org/xitongDs1.xsd")
        protected String mingcheng;
        @XmlElement(namespace = "http://tempuri.org/xitongDs1.xsd")
        protected Integer xukeshu;
        @XmlElement(namespace = "http://tempuri.org/xitongDs1.xsd")
        protected Integer denglushu;
        @XmlElement(namespace = "http://tempuri.org/xitongDs1.xsd")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar xx;

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

        /**
         * Gets the value of the xukeshu property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getXukeshu() {
            return xukeshu;
        }

        /**
         * Sets the value of the xukeshu property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setXukeshu(Integer value) {
            this.xukeshu = value;
        }

        /**
         * Gets the value of the denglushu property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getDenglushu() {
            return denglushu;
        }

        /**
         * Sets the value of the denglushu property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setDenglushu(Integer value) {
            this.denglushu = value;
        }

        /**
         * Gets the value of the xx property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getXx() {
            return xx;
        }

        /**
         * Sets the value of the xx property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setXx(XMLGregorianCalendar value) {
            this.xx = value;
        }

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
     *         &lt;element name="mingcheng">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="gengxinshijian" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="shujuku" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
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
        "mingcheng",
        "gengxinshijian",
        "shujuku"
    })
    public static class Zhangtaobiaoshi {

        @XmlElement(namespace = "http://tempuri.org/xitongDs1.xsd")
        protected int id;
        @XmlElement(namespace = "http://tempuri.org/xitongDs1.xsd", required = true)
        protected String mingcheng;
        @XmlElement(namespace = "http://tempuri.org/xitongDs1.xsd", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar gengxinshijian;
        @XmlElement(namespace = "http://tempuri.org/xitongDs1.xsd")
        protected String shujuku;

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

        /**
         * Gets the value of the gengxinshijian property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getGengxinshijian() {
            return gengxinshijian;
        }

        /**
         * Sets the value of the gengxinshijian property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setGengxinshijian(XMLGregorianCalendar value) {
            this.gengxinshijian = value;
        }

        /**
         * Gets the value of the shujuku property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShujuku() {
            return shujuku;
        }

        /**
         * Sets the value of the shujuku property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShujuku(String value) {
            this.shujuku = value;
        }

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
     *         &lt;element name="CPUhao">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="200"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="wangka">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="200"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="jisuanjiming" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="gengxinshijian" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="shifouzhuce" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="mendian" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="500"/>
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
        "cpUhao",
        "wangka",
        "jisuanjiming",
        "gengxinshijian",
        "shifouzhuce",
        "mendian"
    })
    public static class Zhucexinxibiao {

        @XmlElement(namespace = "http://tempuri.org/xitongDs1.xsd")
        protected int id;
        @XmlElement(name = "CPUhao", namespace = "http://tempuri.org/xitongDs1.xsd", required = true)
        protected String cpUhao;
        @XmlElement(namespace = "http://tempuri.org/xitongDs1.xsd", required = true)
        protected String wangka;
        @XmlElement(namespace = "http://tempuri.org/xitongDs1.xsd")
        protected String jisuanjiming;
        @XmlElement(namespace = "http://tempuri.org/xitongDs1.xsd")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar gengxinshijian;
        @XmlElement(namespace = "http://tempuri.org/xitongDs1.xsd")
        protected Boolean shifouzhuce;
        @XmlElement(namespace = "http://tempuri.org/xitongDs1.xsd")
        protected String mendian;

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
         * Gets the value of the cpUhao property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCPUhao() {
            return cpUhao;
        }

        /**
         * Sets the value of the cpUhao property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCPUhao(String value) {
            this.cpUhao = value;
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
         * Gets the value of the gengxinshijian property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getGengxinshijian() {
            return gengxinshijian;
        }

        /**
         * Sets the value of the gengxinshijian property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setGengxinshijian(XMLGregorianCalendar value) {
            this.gengxinshijian = value;
        }

        /**
         * Gets the value of the shifouzhuce property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isShifouzhuce() {
            return shifouzhuce;
        }

        /**
         * Sets the value of the shifouzhuce property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setShifouzhuce(Boolean value) {
            this.shifouzhuce = value;
        }

        /**
         * Gets the value of the mendian property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMendian() {
            return mendian;
        }

        /**
         * Sets the value of the mendian property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMendian(String value) {
            this.mendian = value;
        }

    }

}
