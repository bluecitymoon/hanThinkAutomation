
package com.ls.client;

import java.math.BigDecimal;
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
 *         &lt;element name="kcmingxizhang">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="zhubiaoid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="zibiaoid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="djbh" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="30"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="djlx" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="djmc" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="cunhuoid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="rukushuliang" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="chukushuliang" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="rkdj" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="ckdj" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="rkje" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="ckje" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="rkdhsj" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="ckdhsbj" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="ckdbhsbj" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="fuzhu" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="riqi" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="dzshijian" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="danweiid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="bumenid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="renyuanid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="cangkuid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="chziyouxiang1" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="200"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="chziyouxiang2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="chziyouxiang3" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="chziyouxiang4" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="chziyouxiang5" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="btziyouxiang1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="btziyouxiang2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="btziyouxiang3" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="btziyouxiang4" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="btziyouxiang5" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="z1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="z2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="z3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="z4" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="z5" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="z6" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="z7" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="z8" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="z9" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="z10" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ysyfyue">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="danweiid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="xiashujgid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="wpybyingshouye" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="wpbbyingshouye" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="fpybyingshouye" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="fabbyingshouye" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="bizhongid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="kcxiancunliangzhang">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="cangkuid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="cunhuoid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="xcliang" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="jine" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="chziyouxiang1" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="200"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="chziyouxiang2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="chziyouxiang3" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="chziyouxiang4" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="chziyouxiang5" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="btziyouxiang1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="btziyouxiang2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="btziyouxiang3" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="btziyouxiang4" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="btziyouxiang5" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="z1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="z2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="z3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="z4" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="z5" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="z6" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="z7" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="z8" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="z9" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="z10" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="LSchziyouxiang2" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="LSchziyouxiang3" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="LSbtziyouxiang1" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="LSbtziyouxiang2" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="LSbtziyouxiang3" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
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
    "kcmingxizhangOrYsyfyueOrKcxiancunliangzhang"
})
@XmlRootElement(name = "kclDS", namespace = "http://tempuri.org/kclDS.xsd")
public class KclDS {

    @XmlElements({
        @XmlElement(name = "kcmingxizhang", namespace = "http://tempuri.org/kclDS.xsd", type = KclDS.Kcmingxizhang.class),
        @XmlElement(name = "ysyfyue", namespace = "http://tempuri.org/kclDS.xsd", type = KclDS.Ysyfyue.class),
        @XmlElement(name = "kcxiancunliangzhang", namespace = "http://tempuri.org/kclDS.xsd", type = KclDS.Kcxiancunliangzhang.class)
    })
    protected List<Object> kcmingxizhangOrYsyfyueOrKcxiancunliangzhang;

    /**
     * Gets the value of the kcmingxizhangOrYsyfyueOrKcxiancunliangzhang property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kcmingxizhangOrYsyfyueOrKcxiancunliangzhang property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKcmingxizhangOrYsyfyueOrKcxiancunliangzhang().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KclDS.Kcmingxizhang }
     * {@link KclDS.Ysyfyue }
     * {@link KclDS.Kcxiancunliangzhang }
     * 
     * 
     */
    public List<Object> getKcmingxizhangOrYsyfyueOrKcxiancunliangzhang() {
        if (kcmingxizhangOrYsyfyueOrKcxiancunliangzhang == null) {
            kcmingxizhangOrYsyfyueOrKcxiancunliangzhang = new ArrayList<Object>();
        }
        return this.kcmingxizhangOrYsyfyueOrKcxiancunliangzhang;
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
     *         &lt;element name="zhubiaoid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="zibiaoid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="djbh" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="30"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="djlx" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="djmc" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="cunhuoid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="rukushuliang" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="chukushuliang" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="rkdj" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="ckdj" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="rkje" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="ckje" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="rkdhsj" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="ckdhsbj" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="ckdbhsbj" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="fuzhu" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="100"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="riqi" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="dzshijian" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="danweiid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="bumenid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="renyuanid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="cangkuid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="chziyouxiang1" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="200"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="chziyouxiang2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="chziyouxiang3" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="chziyouxiang4" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="chziyouxiang5" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="btziyouxiang1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="btziyouxiang2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="btziyouxiang3" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="btziyouxiang4" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="btziyouxiang5" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="z1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="z2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="z3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="z4" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="z5" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="z6" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="z7" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="z8" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="z9" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="z10" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
        "zhubiaoid",
        "zibiaoid",
        "djbh",
        "djlx",
        "djmc",
        "cunhuoid",
        "rukushuliang",
        "chukushuliang",
        "rkdj",
        "ckdj",
        "rkje",
        "ckje",
        "rkdhsj",
        "ckdhsbj",
        "ckdbhsbj",
        "fuzhu",
        "riqi",
        "dzshijian",
        "danweiid",
        "bumenid",
        "renyuanid",
        "cangkuid",
        "chziyouxiang1",
        "chziyouxiang2",
        "chziyouxiang3",
        "chziyouxiang4",
        "chziyouxiang5",
        "btziyouxiang1",
        "btziyouxiang2",
        "btziyouxiang3",
        "btziyouxiang4",
        "btziyouxiang5",
        "z1",
        "z2",
        "z3",
        "z4",
        "z5",
        "z6",
        "z7",
        "z8",
        "z9",
        "z10"
    })
    public static class Kcmingxizhang {

        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected int id;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected Integer zhubiaoid;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected Integer zibiaoid;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected String djbh;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected String djlx;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected String djmc;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected Integer cunhuoid;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected BigDecimal rukushuliang;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected BigDecimal chukushuliang;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected BigDecimal rkdj;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected BigDecimal ckdj;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected BigDecimal rkje;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected BigDecimal ckje;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected BigDecimal rkdhsj;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected BigDecimal ckdhsbj;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected BigDecimal ckdbhsbj;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected String fuzhu;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar riqi;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar dzshijian;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected Integer danweiid;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected Integer bumenid;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected Integer renyuanid;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected Integer cangkuid;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected String chziyouxiang1;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected Integer chziyouxiang2;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected Integer chziyouxiang3;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected String chziyouxiang4;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected String chziyouxiang5;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected Integer btziyouxiang1;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected Integer btziyouxiang2;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected Integer btziyouxiang3;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected Integer btziyouxiang4;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected Integer btziyouxiang5;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected BigDecimal z1;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected BigDecimal z2;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected BigDecimal z3;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected BigDecimal z4;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected BigDecimal z5;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected BigDecimal z6;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected BigDecimal z7;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected BigDecimal z8;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected BigDecimal z9;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected BigDecimal z10;

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
         * Gets the value of the zibiaoid property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getZibiaoid() {
            return zibiaoid;
        }

        /**
         * Sets the value of the zibiaoid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setZibiaoid(Integer value) {
            this.zibiaoid = value;
        }

        /**
         * Gets the value of the djbh property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDjbh() {
            return djbh;
        }

        /**
         * Sets the value of the djbh property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDjbh(String value) {
            this.djbh = value;
        }

        /**
         * Gets the value of the djlx property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDjlx() {
            return djlx;
        }

        /**
         * Sets the value of the djlx property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDjlx(String value) {
            this.djlx = value;
        }

        /**
         * Gets the value of the djmc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDjmc() {
            return djmc;
        }

        /**
         * Sets the value of the djmc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDjmc(String value) {
            this.djmc = value;
        }

        /**
         * Gets the value of the cunhuoid property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCunhuoid() {
            return cunhuoid;
        }

        /**
         * Sets the value of the cunhuoid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCunhuoid(Integer value) {
            this.cunhuoid = value;
        }

        /**
         * Gets the value of the rukushuliang property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getRukushuliang() {
            return rukushuliang;
        }

        /**
         * Sets the value of the rukushuliang property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setRukushuliang(BigDecimal value) {
            this.rukushuliang = value;
        }

        /**
         * Gets the value of the chukushuliang property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getChukushuliang() {
            return chukushuliang;
        }

        /**
         * Sets the value of the chukushuliang property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setChukushuliang(BigDecimal value) {
            this.chukushuliang = value;
        }

        /**
         * Gets the value of the rkdj property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getRkdj() {
            return rkdj;
        }

        /**
         * Sets the value of the rkdj property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setRkdj(BigDecimal value) {
            this.rkdj = value;
        }

        /**
         * Gets the value of the ckdj property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCkdj() {
            return ckdj;
        }

        /**
         * Sets the value of the ckdj property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCkdj(BigDecimal value) {
            this.ckdj = value;
        }

        /**
         * Gets the value of the rkje property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getRkje() {
            return rkje;
        }

        /**
         * Sets the value of the rkje property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setRkje(BigDecimal value) {
            this.rkje = value;
        }

        /**
         * Gets the value of the ckje property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCkje() {
            return ckje;
        }

        /**
         * Sets the value of the ckje property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCkje(BigDecimal value) {
            this.ckje = value;
        }

        /**
         * Gets the value of the rkdhsj property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getRkdhsj() {
            return rkdhsj;
        }

        /**
         * Sets the value of the rkdhsj property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setRkdhsj(BigDecimal value) {
            this.rkdhsj = value;
        }

        /**
         * Gets the value of the ckdhsbj property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCkdhsbj() {
            return ckdhsbj;
        }

        /**
         * Sets the value of the ckdhsbj property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCkdhsbj(BigDecimal value) {
            this.ckdhsbj = value;
        }

        /**
         * Gets the value of the ckdbhsbj property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCkdbhsbj() {
            return ckdbhsbj;
        }

        /**
         * Sets the value of the ckdbhsbj property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCkdbhsbj(BigDecimal value) {
            this.ckdbhsbj = value;
        }

        /**
         * Gets the value of the fuzhu property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFuzhu() {
            return fuzhu;
        }

        /**
         * Sets the value of the fuzhu property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFuzhu(String value) {
            this.fuzhu = value;
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
         * Gets the value of the dzshijian property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDzshijian() {
            return dzshijian;
        }

        /**
         * Sets the value of the dzshijian property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDzshijian(XMLGregorianCalendar value) {
            this.dzshijian = value;
        }

        /**
         * Gets the value of the danweiid property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getDanweiid() {
            return danweiid;
        }

        /**
         * Sets the value of the danweiid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setDanweiid(Integer value) {
            this.danweiid = value;
        }

        /**
         * Gets the value of the bumenid property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getBumenid() {
            return bumenid;
        }

        /**
         * Sets the value of the bumenid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setBumenid(Integer value) {
            this.bumenid = value;
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
         * Gets the value of the cangkuid property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCangkuid() {
            return cangkuid;
        }

        /**
         * Sets the value of the cangkuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCangkuid(Integer value) {
            this.cangkuid = value;
        }

        /**
         * Gets the value of the chziyouxiang1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChziyouxiang1() {
            return chziyouxiang1;
        }

        /**
         * Sets the value of the chziyouxiang1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChziyouxiang1(String value) {
            this.chziyouxiang1 = value;
        }

        /**
         * Gets the value of the chziyouxiang2 property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getChziyouxiang2() {
            return chziyouxiang2;
        }

        /**
         * Sets the value of the chziyouxiang2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setChziyouxiang2(Integer value) {
            this.chziyouxiang2 = value;
        }

        /**
         * Gets the value of the chziyouxiang3 property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getChziyouxiang3() {
            return chziyouxiang3;
        }

        /**
         * Sets the value of the chziyouxiang3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setChziyouxiang3(Integer value) {
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
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getBtziyouxiang1() {
            return btziyouxiang1;
        }

        /**
         * Sets the value of the btziyouxiang1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setBtziyouxiang1(Integer value) {
            this.btziyouxiang1 = value;
        }

        /**
         * Gets the value of the btziyouxiang2 property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getBtziyouxiang2() {
            return btziyouxiang2;
        }

        /**
         * Sets the value of the btziyouxiang2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setBtziyouxiang2(Integer value) {
            this.btziyouxiang2 = value;
        }

        /**
         * Gets the value of the btziyouxiang3 property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getBtziyouxiang3() {
            return btziyouxiang3;
        }

        /**
         * Sets the value of the btziyouxiang3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setBtziyouxiang3(Integer value) {
            this.btziyouxiang3 = value;
        }

        /**
         * Gets the value of the btziyouxiang4 property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getBtziyouxiang4() {
            return btziyouxiang4;
        }

        /**
         * Sets the value of the btziyouxiang4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setBtziyouxiang4(Integer value) {
            this.btziyouxiang4 = value;
        }

        /**
         * Gets the value of the btziyouxiang5 property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getBtziyouxiang5() {
            return btziyouxiang5;
        }

        /**
         * Sets the value of the btziyouxiang5 property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setBtziyouxiang5(Integer value) {
            this.btziyouxiang5 = value;
        }

        /**
         * Gets the value of the z1 property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getZ1() {
            return z1;
        }

        /**
         * Sets the value of the z1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setZ1(BigDecimal value) {
            this.z1 = value;
        }

        /**
         * Gets the value of the z2 property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getZ2() {
            return z2;
        }

        /**
         * Sets the value of the z2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setZ2(BigDecimal value) {
            this.z2 = value;
        }

        /**
         * Gets the value of the z3 property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getZ3() {
            return z3;
        }

        /**
         * Sets the value of the z3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setZ3(BigDecimal value) {
            this.z3 = value;
        }

        /**
         * Gets the value of the z4 property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getZ4() {
            return z4;
        }

        /**
         * Sets the value of the z4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setZ4(BigDecimal value) {
            this.z4 = value;
        }

        /**
         * Gets the value of the z5 property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getZ5() {
            return z5;
        }

        /**
         * Sets the value of the z5 property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setZ5(BigDecimal value) {
            this.z5 = value;
        }

        /**
         * Gets the value of the z6 property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getZ6() {
            return z6;
        }

        /**
         * Sets the value of the z6 property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setZ6(BigDecimal value) {
            this.z6 = value;
        }

        /**
         * Gets the value of the z7 property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getZ7() {
            return z7;
        }

        /**
         * Sets the value of the z7 property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setZ7(BigDecimal value) {
            this.z7 = value;
        }

        /**
         * Gets the value of the z8 property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getZ8() {
            return z8;
        }

        /**
         * Sets the value of the z8 property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setZ8(BigDecimal value) {
            this.z8 = value;
        }

        /**
         * Gets the value of the z9 property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getZ9() {
            return z9;
        }

        /**
         * Sets the value of the z9 property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setZ9(BigDecimal value) {
            this.z9 = value;
        }

        /**
         * Gets the value of the z10 property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getZ10() {
            return z10;
        }

        /**
         * Sets the value of the z10 property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setZ10(BigDecimal value) {
            this.z10 = value;
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
     *         &lt;element name="cangkuid" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="cunhuoid" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="xcliang" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="jine" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="chziyouxiang1" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="200"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="chziyouxiang2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="chziyouxiang3" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="chziyouxiang4" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="chziyouxiang5" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="btziyouxiang1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="btziyouxiang2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="btziyouxiang3" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="btziyouxiang4" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="btziyouxiang5" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="z1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="z2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="z3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="z4" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="z5" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="z6" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="z7" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="z8" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="z9" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="z10" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="LSchziyouxiang2" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="100"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="LSchziyouxiang3" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="100"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="LSbtziyouxiang1" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="100"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="LSbtziyouxiang2" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="100"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="LSbtziyouxiang3" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="100"/>
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
        "cangkuid",
        "cunhuoid",
        "xcliang",
        "jine",
        "chziyouxiang1",
        "chziyouxiang2",
        "chziyouxiang3",
        "chziyouxiang4",
        "chziyouxiang5",
        "btziyouxiang1",
        "btziyouxiang2",
        "btziyouxiang3",
        "btziyouxiang4",
        "btziyouxiang5",
        "z1",
        "z2",
        "z3",
        "z4",
        "z5",
        "z6",
        "z7",
        "z8",
        "z9",
        "z10",
        "lSchziyouxiang2",
        "lSchziyouxiang3",
        "lSbtziyouxiang1",
        "lSbtziyouxiang2",
        "lSbtziyouxiang3"
    })
    public static class Kcxiancunliangzhang {

        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected int id;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected int cangkuid;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected int cunhuoid;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected BigDecimal xcliang;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected BigDecimal jine;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected String chziyouxiang1;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected Integer chziyouxiang2;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected Integer chziyouxiang3;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected String chziyouxiang4;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected String chziyouxiang5;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected Integer btziyouxiang1;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected Integer btziyouxiang2;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected Integer btziyouxiang3;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected Integer btziyouxiang4;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected Integer btziyouxiang5;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected BigDecimal z1;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected BigDecimal z2;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected BigDecimal z3;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected BigDecimal z4;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected BigDecimal z5;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected BigDecimal z6;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected BigDecimal z7;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected BigDecimal z8;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected BigDecimal z9;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected BigDecimal z10;
        @XmlElement(name = "LSchziyouxiang2", namespace = "http://tempuri.org/kclDS.xsd")
        protected String lSchziyouxiang2;
        @XmlElement(name = "LSchziyouxiang3", namespace = "http://tempuri.org/kclDS.xsd")
        protected String lSchziyouxiang3;
        @XmlElement(name = "LSbtziyouxiang1", namespace = "http://tempuri.org/kclDS.xsd")
        protected String lSbtziyouxiang1;
        @XmlElement(name = "LSbtziyouxiang2", namespace = "http://tempuri.org/kclDS.xsd")
        protected String lSbtziyouxiang2;
        @XmlElement(name = "LSbtziyouxiang3", namespace = "http://tempuri.org/kclDS.xsd")
        protected String lSbtziyouxiang3;

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
         * Gets the value of the xcliang property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getXcliang() {
            return xcliang;
        }

        /**
         * Sets the value of the xcliang property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setXcliang(BigDecimal value) {
            this.xcliang = value;
        }

        /**
         * Gets the value of the jine property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getJine() {
            return jine;
        }

        /**
         * Sets the value of the jine property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setJine(BigDecimal value) {
            this.jine = value;
        }

        /**
         * Gets the value of the chziyouxiang1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChziyouxiang1() {
            return chziyouxiang1;
        }

        /**
         * Sets the value of the chziyouxiang1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChziyouxiang1(String value) {
            this.chziyouxiang1 = value;
        }

        /**
         * Gets the value of the chziyouxiang2 property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getChziyouxiang2() {
            return chziyouxiang2;
        }

        /**
         * Sets the value of the chziyouxiang2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setChziyouxiang2(Integer value) {
            this.chziyouxiang2 = value;
        }

        /**
         * Gets the value of the chziyouxiang3 property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getChziyouxiang3() {
            return chziyouxiang3;
        }

        /**
         * Sets the value of the chziyouxiang3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setChziyouxiang3(Integer value) {
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
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getBtziyouxiang1() {
            return btziyouxiang1;
        }

        /**
         * Sets the value of the btziyouxiang1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setBtziyouxiang1(Integer value) {
            this.btziyouxiang1 = value;
        }

        /**
         * Gets the value of the btziyouxiang2 property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getBtziyouxiang2() {
            return btziyouxiang2;
        }

        /**
         * Sets the value of the btziyouxiang2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setBtziyouxiang2(Integer value) {
            this.btziyouxiang2 = value;
        }

        /**
         * Gets the value of the btziyouxiang3 property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getBtziyouxiang3() {
            return btziyouxiang3;
        }

        /**
         * Sets the value of the btziyouxiang3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setBtziyouxiang3(Integer value) {
            this.btziyouxiang3 = value;
        }

        /**
         * Gets the value of the btziyouxiang4 property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getBtziyouxiang4() {
            return btziyouxiang4;
        }

        /**
         * Sets the value of the btziyouxiang4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setBtziyouxiang4(Integer value) {
            this.btziyouxiang4 = value;
        }

        /**
         * Gets the value of the btziyouxiang5 property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getBtziyouxiang5() {
            return btziyouxiang5;
        }

        /**
         * Sets the value of the btziyouxiang5 property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setBtziyouxiang5(Integer value) {
            this.btziyouxiang5 = value;
        }

        /**
         * Gets the value of the z1 property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getZ1() {
            return z1;
        }

        /**
         * Sets the value of the z1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setZ1(BigDecimal value) {
            this.z1 = value;
        }

        /**
         * Gets the value of the z2 property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getZ2() {
            return z2;
        }

        /**
         * Sets the value of the z2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setZ2(BigDecimal value) {
            this.z2 = value;
        }

        /**
         * Gets the value of the z3 property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getZ3() {
            return z3;
        }

        /**
         * Sets the value of the z3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setZ3(BigDecimal value) {
            this.z3 = value;
        }

        /**
         * Gets the value of the z4 property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getZ4() {
            return z4;
        }

        /**
         * Sets the value of the z4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setZ4(BigDecimal value) {
            this.z4 = value;
        }

        /**
         * Gets the value of the z5 property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getZ5() {
            return z5;
        }

        /**
         * Sets the value of the z5 property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setZ5(BigDecimal value) {
            this.z5 = value;
        }

        /**
         * Gets the value of the z6 property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getZ6() {
            return z6;
        }

        /**
         * Sets the value of the z6 property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setZ6(BigDecimal value) {
            this.z6 = value;
        }

        /**
         * Gets the value of the z7 property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getZ7() {
            return z7;
        }

        /**
         * Sets the value of the z7 property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setZ7(BigDecimal value) {
            this.z7 = value;
        }

        /**
         * Gets the value of the z8 property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getZ8() {
            return z8;
        }

        /**
         * Sets the value of the z8 property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setZ8(BigDecimal value) {
            this.z8 = value;
        }

        /**
         * Gets the value of the z9 property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getZ9() {
            return z9;
        }

        /**
         * Sets the value of the z9 property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setZ9(BigDecimal value) {
            this.z9 = value;
        }

        /**
         * Gets the value of the z10 property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getZ10() {
            return z10;
        }

        /**
         * Sets the value of the z10 property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setZ10(BigDecimal value) {
            this.z10 = value;
        }

        /**
         * Gets the value of the lSchziyouxiang2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLSchziyouxiang2() {
            return lSchziyouxiang2;
        }

        /**
         * Sets the value of the lSchziyouxiang2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLSchziyouxiang2(String value) {
            this.lSchziyouxiang2 = value;
        }

        /**
         * Gets the value of the lSchziyouxiang3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLSchziyouxiang3() {
            return lSchziyouxiang3;
        }

        /**
         * Sets the value of the lSchziyouxiang3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLSchziyouxiang3(String value) {
            this.lSchziyouxiang3 = value;
        }

        /**
         * Gets the value of the lSbtziyouxiang1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLSbtziyouxiang1() {
            return lSbtziyouxiang1;
        }

        /**
         * Sets the value of the lSbtziyouxiang1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLSbtziyouxiang1(String value) {
            this.lSbtziyouxiang1 = value;
        }

        /**
         * Gets the value of the lSbtziyouxiang2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLSbtziyouxiang2() {
            return lSbtziyouxiang2;
        }

        /**
         * Sets the value of the lSbtziyouxiang2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLSbtziyouxiang2(String value) {
            this.lSbtziyouxiang2 = value;
        }

        /**
         * Gets the value of the lSbtziyouxiang3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLSbtziyouxiang3() {
            return lSbtziyouxiang3;
        }

        /**
         * Sets the value of the lSbtziyouxiang3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLSbtziyouxiang3(String value) {
            this.lSbtziyouxiang3 = value;
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
     *         &lt;element name="danweiid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="xiashujgid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="wpybyingshouye" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="wpbbyingshouye" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="fpybyingshouye" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="fabbyingshouye" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="bizhongid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
        "danweiid",
        "xiashujgid",
        "wpybyingshouye",
        "wpbbyingshouye",
        "fpybyingshouye",
        "fabbyingshouye",
        "bizhongid"
    })
    public static class Ysyfyue {

        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected int id;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected Integer danweiid;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected Integer xiashujgid;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected BigDecimal wpybyingshouye;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected BigDecimal wpbbyingshouye;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected BigDecimal fpybyingshouye;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected BigDecimal fabbyingshouye;
        @XmlElement(namespace = "http://tempuri.org/kclDS.xsd")
        protected Integer bizhongid;

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
         * Gets the value of the danweiid property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getDanweiid() {
            return danweiid;
        }

        /**
         * Sets the value of the danweiid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setDanweiid(Integer value) {
            this.danweiid = value;
        }

        /**
         * Gets the value of the xiashujgid property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getXiashujgid() {
            return xiashujgid;
        }

        /**
         * Sets the value of the xiashujgid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setXiashujgid(Integer value) {
            this.xiashujgid = value;
        }

        /**
         * Gets the value of the wpybyingshouye property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getWpybyingshouye() {
            return wpybyingshouye;
        }

        /**
         * Sets the value of the wpybyingshouye property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setWpybyingshouye(BigDecimal value) {
            this.wpybyingshouye = value;
        }

        /**
         * Gets the value of the wpbbyingshouye property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getWpbbyingshouye() {
            return wpbbyingshouye;
        }

        /**
         * Sets the value of the wpbbyingshouye property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setWpbbyingshouye(BigDecimal value) {
            this.wpbbyingshouye = value;
        }

        /**
         * Gets the value of the fpybyingshouye property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getFpybyingshouye() {
            return fpybyingshouye;
        }

        /**
         * Sets the value of the fpybyingshouye property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setFpybyingshouye(BigDecimal value) {
            this.fpybyingshouye = value;
        }

        /**
         * Gets the value of the fabbyingshouye property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getFabbyingshouye() {
            return fabbyingshouye;
        }

        /**
         * Sets the value of the fabbyingshouye property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setFabbyingshouye(BigDecimal value) {
            this.fabbyingshouye = value;
        }

        /**
         * Gets the value of the bizhongid property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getBizhongid() {
            return bizhongid;
        }

        /**
         * Sets the value of the bizhongid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setBizhongid(Integer value) {
            this.bizhongid = value;
        }

    }

}
