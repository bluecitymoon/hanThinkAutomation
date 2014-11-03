
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
 *         &lt;element name="quanxianziduan">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="yhid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="yewuid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="ziduan" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="mingcheng" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="chakan" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="xiugai" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="kexuanchanshuzhi">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="canshuid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="kexuanzhi" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="waibidangan">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="bianma" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="mingcheng" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="10"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="morenhuilv" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ziyouxiangdangan">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="fenzuid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="bianma" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="mingcheng" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="zidingyi1" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="zidingyi2" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="zidingyi3" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="zidingyi4" minOccurs="0">
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
 *         &lt;element name="shuxingxuanxiangdangan">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="biao" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="120"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="shuxing">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="30"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="bianma" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="mingcheng" minOccurs="0">
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
 *         &lt;element name="fukuantiaojian">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="bianma">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="jiekuantianshu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="jiepiaotianshu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="jiepiaoshidian1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="jiepiaoshidian2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="jiepiaoshidian3" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="jiekuanshidian1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="jiekuanshidian2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="jiekuanshidian3" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="fahuoshifoujisuanzhangqi" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="beizhu" minOccurs="0">
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
 *         &lt;element name="huoweidangan">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="bianma">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="mingcheng">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="cangkuid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="zuidatiji" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="zuidazhongliang" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="zidingyi1" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="10"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="zidingyi2" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="10"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="zhujifu" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="suoshuleibieid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="tingyong" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="shuxingmingchengdangan">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="bianma" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="biao" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="16"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="shuxing">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="26"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="mingcheng" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="yeqian" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="duizhaomajibenbiao">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="bianma" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="mingcheng" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="danganbiaoming" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="shifoumoji" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="danweijd">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="danweiid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="jiadanid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="bianhao" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="beizhu" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="riqi" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="danjuleixing" minOccurs="0">
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
 *         &lt;element name="canshudangan">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="mingcheng" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="30"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="canshuzhi" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="bumendangan">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="bianma" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="mingcheng" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="sunxuma" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="shifoumoji" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="duizhaoma" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="leibielujing" minOccurs="0">
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
 *         &lt;element name="cunhuoleibie">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="bianma" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="mingcheng">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="25"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="sunxuma" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="shifoumoji" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="leibielujing" minOccurs="0">
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
 *         &lt;element name="danweileibie">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="bianma" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="mingcheng" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="30"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="sunxuma" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="shifoumoji" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="leibielujing" minOccurs="0">
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
 *         &lt;element name="huoweileibie">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="bianma" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="mingcheng" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="shifoumoji" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="sunxuma" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="leibielujing" minOccurs="0">
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
 *         &lt;element name="xiangmuleibie">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="bianma" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="mingcheng">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="sunxuma" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="shifoumoji" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ziyouxiangfenzu">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="bianma" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="mingcheng" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="sunxuma" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="shifoumoji" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="leibielujing" minOccurs="0">
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
 *         &lt;element name="EXdayinmoban">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="xuhao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="mobanid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="mingcheng" minOccurs="0">
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
 *                   &lt;element name="h1" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="h2" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="h3" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="zhijiedayin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="zonghe" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="1000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="biaojiegou">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="biao">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="jiegou" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="mingcheng" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="200"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="xuhao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="kuandu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="dingwei" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="heji" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="shifoubilu" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="cankaodangan_xianshilie" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="guanliandangan" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="leixing" minOccurs="0">
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
 *         &lt;element name="jiezhangbiaoshi">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="qijianid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="mokuai" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="isjiezhang" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="shuihuid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="kuaijiqijian">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="shuihuid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="niandu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="qijian" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="kaishiriqi" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="jieshuriqi" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="shuihudangan">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="mingcheng">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="quancheng">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="dizhi">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="200"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="shuihao" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="yinhangzhanghao" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="300"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="dianhua" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="zuigaojine" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="duizhaoma" minOccurs="0">
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
 *         &lt;element name="quanxiandangan">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="yhid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="mingcheng" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="chakan" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="xiugai" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="shanchu" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="shenhe" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="qishen" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="dengzhang" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="qideng" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="zengjia" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="yemianshezhi" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="yulan" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="dayin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="guanbi" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="dakai" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="shuchu" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="lanmu" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="pz" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="yewuid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="yewukemuduizhaobiao">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="yewukemubiaoid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="danweileibieid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="danweiid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="bumenid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="cangkuid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="cunhuoleibieid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="cunhuoid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="kemuid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="cengji" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="yewukemubiao">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="yewuid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="shuihuid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="leixing" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="kemuleibieid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="kemuid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="zdsc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="zddz" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="biaotishuju" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="pzlb" minOccurs="0">
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
 *         &lt;element name="mywork">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="yonghuid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="yewuming" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="xz" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="yz" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="zonghe" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="300"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="bbxzl">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="zhubiaoid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="zibiaoid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="ziduan" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="duizhaoming" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="xianshifangshi" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="10"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="bblj">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="zibiaoid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="zziduan" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="lianjie" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="yziduan" minOccurs="0">
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
 *         &lt;element name="xuqiushizha">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="kaishishijian" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="jieshushijian" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="xuqiulaiyuan" minOccurs="0">
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
 *         &lt;element name="cangkudangan">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="bianma">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="10"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="mingcheng">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="dizhi" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="200"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="bumenid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="fuzerenid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="xingzhi" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="6"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="huowei" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="beizhu" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="200"/>
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
 *                   &lt;element name="zidingyi2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="tingyong" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="iskyl" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="jijiafangfa" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="16"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="duizhaoma" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ismrp" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="zhujifu" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="dianhua" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="chuanzhen" minOccurs="0">
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
 *         &lt;element name="bendanweixinxi">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="mingcheng" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="80"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="jiancheng" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="jigoudaima" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="yuming" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="dizhi" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="dianhua" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="faren" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="10"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="email" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="kaihuyinhangzhanghao" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="shuihao" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="nashuixingzhi" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="beizhu" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="tubiao" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="zidingyi1" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="500"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="zidingyi2" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="zidingyi3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="mobandangan">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="zhubiaoid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="kongjian" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="30"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="kongjianmingcheng" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="500"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="xz" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="yz" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="xianshi" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="shifoubilu" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="cankaodangan" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="xianshilie" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="guanliedangan" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="dingwei" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="zonghe" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="300"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="datiaojian">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="yewuid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="lie" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="mingcheng" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="zonghe" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="300"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="xuhao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="kuaijikemu">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="shuihuid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="bianma" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="bianmam" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="mingcheng" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="26"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="bizhongid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="danweiwanglai" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="gerenwanglai" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="bumenhesuan" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="xiangmuhesuan" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="xiangmuid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="yinhangkemu" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="xianjinkemu" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="yuefangxiang" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="4"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="tingyong" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="suoshuleibieid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="emingcheng" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="26"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="yingshoukemu" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="yingfukemu" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="iswaibi" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="zhujifu" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="shifoumoji" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="sunxuma" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="xiashujg" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="yewudangan">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="bianma" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="mingcheng">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="leixing" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="10"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="tongjileibie" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="16"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="shifoumoji" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="sunxuma" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="mokuai" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="16"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="shifoufushu" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="shengchengdanjumingcheng1" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="shengchengdanjumingcheng2" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="zhubiao" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="zibiao" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="yinchang" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="xitongsheding" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="czdj1fw" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="czdj2fw" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="caidanxiang" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="200"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="zonghe" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="300"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="kongzhitixing" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="300"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="mobanzhubiao">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="bianma" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="mingcheng" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="suoshuyewuid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="leixing" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="10"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="shifoumoji" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="dayinji" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="zhizhang" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="tupianlujing" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="200"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="zonghe" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="300"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="sunxuma" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="feiyongleibie">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="bianma" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="mingcheng">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="25"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="sunxuma" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="shifoumoji" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="leibielujing" minOccurs="0">
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
 *         &lt;element name="feiyongdangan">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="bianma" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="mingcheng" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="leixing" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="iskcbzx" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="zidingyi1" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="zidingyi2" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="suoshuleibieid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="xiaoxileibie">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="bianma" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="mingcheng">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="sunxuma" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="shifoumoji" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="leibielujing" minOccurs="0">
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
 *         &lt;element name="gongzuoliuzibiao">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="zhubiaoid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="chengji" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="yhid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="duanxintongzhi" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="youjiantongzhi" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="pingtaitongzhi" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="cengji" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="zhubiaozuoziduan" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="200"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="zhubiaofuhao" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="zhubiaoyouziduan" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="200"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="fuzhu" minOccurs="0">
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
 *         &lt;element name="gongzuoliuzhubiao">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="yewuid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="yijileixing" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="erjileixing" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="sanjileixing" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="sijileixing" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="wujileixing" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="liuchengwaichuli" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="zhongshencengji" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="zhubiaozuotiaojian" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="1000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="guanxi" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="zibiaotiaojian" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="1000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="fuzhu" minOccurs="0">
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
 *         &lt;element name="lshzz">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="zzxiang" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="lsh" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="baobiaotiaojian">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="bbid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="lie" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="500"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="mingcheng" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="zonghe" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="3000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="baobiaogeshi">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="baobiaoid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="jiegou" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="mingcheng" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="kuandu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="xuhao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="geshi" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="dingwei" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="heji" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="zonghe" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="3000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="leixing" minOccurs="0">
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
 *         &lt;element name="baobiaoshitu">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="baobiaoid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="shituming" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="200"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="xuhao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="moren" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="leibiedangan" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="leibieguanlian" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="tuxinglie" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="hxzyxxuhao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="hxzyxkuandu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="zonghe" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="1000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="baobiaoyuju">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="yuju" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="8000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="shushujuming" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="guanlianlie" minOccurs="0">
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
 *         &lt;element name="shitujiegou">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="bbid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="shituid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="jiegou" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="mingcheng" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="kuandu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="xuhao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="geshi" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="dingwei" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="leixing" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="biaodashi" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="3000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="heji" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="zonghe" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="3000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ysyfmingxizhang">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="zhubiaoid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="danweiid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="xiashujgid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="jiancheng" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
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
 *                   &lt;element name="ysyuanbijine" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="ysbenbijine" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="yfyuanbijine" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="yfbenbijine" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="fuzhu" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="djrq" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="dqrq" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="skyuanbijine" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="skbenbijine" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="fkyuanbijine" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="fkbenbijine" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="hxyuanbijine" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="hxbenbijine" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="hphxyuanbijine" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="hphxbenbijine" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="bumenid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="renyuanid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="kemuid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="xiangmuid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="btziyouxiang1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="btziyouxiang2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="btziyouxiang3" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="btziyouxiang4" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="btziyouxiang5" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="bizhongid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="danjuyue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="xiangmudangan">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="bianma" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="mingcheng" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="beizhu" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="suoshuleibieid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="tingyong" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
 *                         &lt;maxLength value="500"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="zidingyi3" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="500"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="zidingyi4" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="zidingyi5" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="zidingyi6" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="xiangmufeiyongyaoshu">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="bianma" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="mingcheng" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="300"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="shuxing" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="qushubaobiaoid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="fenpeibaobiaoid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="renyuandangan">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="bumenid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="bianma">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="xingming">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="xingbie" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="zhiwu" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="dianhua" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="email" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="200"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="beizhu" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="tingyong" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="dengluming" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="mima" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="shifouyewuyuan" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="zidingyi1" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="zidingyi2" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="zidingyi3" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="zidingyi4" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="zidingyi5" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="jilushijian" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="jilurenid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="shifoucaozuoyuan" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="leixing" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="zonghe" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="3000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="fenzuzhuguan" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="zhujifu" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="zidingyi6" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="zidingyi7" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="zidingyi8" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="zidingyi9" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="zidingyi10" minOccurs="0">
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
 *         &lt;element name="danweixiashujigou">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="danweiid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="bianma" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="zhujifu" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="200"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="jiancheng" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="200"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="quancheng" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="200"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="diqu" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="dizhi" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="200"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="youbian" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="dianhua" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="200"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="chuanzhen" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="email" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="wangzhi" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="lianxiren" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="shuiwudengjihao" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="kaihuyinhangzhanghao" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="kaipiaodizhidianhua" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="renyuandangan_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="tingyong" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="zidingyi1" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="zidingyi2" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="zidingyi3" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="zidingyi4" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="zidingyi5" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="beizhu" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="moren" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="danweidangan">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="bianma">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="200"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="zhujifu" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="200"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="jiancheng">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="200"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="quancheng" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="200"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="suoshuleibieid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="xingzhi">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="6"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="diqu" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="dizhi" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="200"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="youbian" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="10"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="dianhua" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="chuanzhen" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="email" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="wangzhi" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="lianxiren" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="200"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="shuiwudengjihao" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="kaihuyinhangzhanghao" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="70"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="kaipiaodizhidianhua" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="80"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="fuzerenid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="fukuanfangshiid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="dayinmobanid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="duifangcunhuozhubiaoid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="zonggongsiid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="tingyong" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="faren" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="quanxianzuid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="fenguanbumenid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="jilurenid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="jilushijian" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="xiugairenid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="xiugaishijian" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="zidingyi1" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="zidingyi2" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="zidingyi3" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="zidingyi4" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="zidingyi5" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="beizhu" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="1073741823"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="duizhaoma" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="zonghe" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="2000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="xinyongedu" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="yingshoudanju" minOccurs="0">
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
 *         &lt;element name="cunhuodangan">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="bianma">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="mingcheng" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="guigexinghao" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="200"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="zhujifu" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="tiaoxingma" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="30"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="jiliangdanwei" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="10"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="suoshuleibieid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="cankaochengben" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="cankaoshoujia" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="zuidishoujia" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="zuigaojinjia" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="gongyingshangid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="shuilv" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="zuigaokucun" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="zuidikucun" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="huoweiid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="quanxianzuid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="ROP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="dinghuodianfangfa" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="4"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ROPpiliangguize" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="gongyingtianshu" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="dinghuodian" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="gudinggongyingliang" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="baozhiqi" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="shifoulaowu" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="jilurenid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="jilushijian" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="xiugairenid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="xiugaishijian" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="tingyong" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="fuzhudanwei1" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="10"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="fuzhudanwei2" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="10"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="huansuanlv1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="huansuanlv2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="beizhu" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="1000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ziyouxiang1" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="ziyouxiang1fenzu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="ziyouxiang2" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="ziyouxiang2fenzu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="ziyouxiang3" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="ziyouxiang3fenzu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="ziyouxiang4" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="ziyouxiang4fenzu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="ziyouxiang5" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="ziyouxiang5fenzu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
 *                   &lt;element name="zidingyi4" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="200"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="zidingyi5" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="500"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="zidingyi6" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="zidingyi7" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="zidingyi8" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="zidingyi9" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="zidingyi10" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="BOMid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="xiaoshou" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="zizhi" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="waigou" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="weiwai" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="shengchanlingyong" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="shuxing" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="hebingzhouqi" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="zuidigongyingliang" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="gongyingpiliang" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="tiqiangongying" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="dijiema" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="zonghe" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="2000"/>
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
    "quanxianziduanOrKexuanchanshuzhiOrWaibidangan"
})
@XmlRootElement(name = "jichuDs", namespace = "http://tempuri.org/jichuDs.xsd")
public class JichuDs {

    @XmlElements({
        @XmlElement(name = "quanxianziduan", namespace = "http://tempuri.org/jichuDs.xsd", type = JichuDs.Quanxianziduan.class),
        @XmlElement(name = "kexuanchanshuzhi", namespace = "http://tempuri.org/jichuDs.xsd", type = JichuDs.Kexuanchanshuzhi.class),
        @XmlElement(name = "waibidangan", namespace = "http://tempuri.org/jichuDs.xsd", type = JichuDs.Waibidangan.class),
        @XmlElement(name = "ziyouxiangdangan", namespace = "http://tempuri.org/jichuDs.xsd", type = JichuDs.Ziyouxiangdangan.class),
        @XmlElement(name = "shuxingxuanxiangdangan", namespace = "http://tempuri.org/jichuDs.xsd", type = JichuDs.Shuxingxuanxiangdangan.class),
        @XmlElement(name = "fukuantiaojian", namespace = "http://tempuri.org/jichuDs.xsd", type = JichuDs.Fukuantiaojian.class),
        @XmlElement(name = "huoweidangan", namespace = "http://tempuri.org/jichuDs.xsd", type = JichuDs.Huoweidangan.class),
        @XmlElement(name = "shuxingmingchengdangan", namespace = "http://tempuri.org/jichuDs.xsd", type = JichuDs.Shuxingmingchengdangan.class),
        @XmlElement(name = "duizhaomajibenbiao", namespace = "http://tempuri.org/jichuDs.xsd", type = JichuDs.Duizhaomajibenbiao.class),
        @XmlElement(name = "danweijd", namespace = "http://tempuri.org/jichuDs.xsd", type = JichuDs.Danweijd.class),
        @XmlElement(name = "canshudangan", namespace = "http://tempuri.org/jichuDs.xsd", type = JichuDs.Canshudangan.class),
        @XmlElement(name = "bumendangan", namespace = "http://tempuri.org/jichuDs.xsd", type = JichuDs.Bumendangan.class),
        @XmlElement(name = "cunhuoleibie", namespace = "http://tempuri.org/jichuDs.xsd", type = JichuDs.Cunhuoleibie.class),
        @XmlElement(name = "danweileibie", namespace = "http://tempuri.org/jichuDs.xsd", type = JichuDs.Danweileibie.class),
        @XmlElement(name = "huoweileibie", namespace = "http://tempuri.org/jichuDs.xsd", type = JichuDs.Huoweileibie.class),
        @XmlElement(name = "xiangmuleibie", namespace = "http://tempuri.org/jichuDs.xsd", type = JichuDs.Xiangmuleibie.class),
        @XmlElement(name = "ziyouxiangfenzu", namespace = "http://tempuri.org/jichuDs.xsd", type = JichuDs.Ziyouxiangfenzu.class),
        @XmlElement(name = "EXdayinmoban", namespace = "http://tempuri.org/jichuDs.xsd", type = JichuDs.EXdayinmoban.class),
        @XmlElement(name = "biaojiegou", namespace = "http://tempuri.org/jichuDs.xsd", type = JichuDs.Biaojiegou.class),
        @XmlElement(name = "jiezhangbiaoshi", namespace = "http://tempuri.org/jichuDs.xsd", type = JichuDs.Jiezhangbiaoshi.class),
        @XmlElement(name = "kuaijiqijian", namespace = "http://tempuri.org/jichuDs.xsd", type = JichuDs.Kuaijiqijian.class),
        @XmlElement(name = "shuihudangan", namespace = "http://tempuri.org/jichuDs.xsd", type = JichuDs.Shuihudangan.class),
        @XmlElement(name = "quanxiandangan", namespace = "http://tempuri.org/jichuDs.xsd", type = JichuDs.Quanxiandangan.class),
        @XmlElement(name = "yewukemuduizhaobiao", namespace = "http://tempuri.org/jichuDs.xsd", type = JichuDs.Yewukemuduizhaobiao.class),
        @XmlElement(name = "yewukemubiao", namespace = "http://tempuri.org/jichuDs.xsd", type = JichuDs.Yewukemubiao.class),
        @XmlElement(name = "mywork", namespace = "http://tempuri.org/jichuDs.xsd", type = JichuDs.Mywork.class),
        @XmlElement(name = "bbxzl", namespace = "http://tempuri.org/jichuDs.xsd", type = JichuDs.Bbxzl.class),
        @XmlElement(name = "bblj", namespace = "http://tempuri.org/jichuDs.xsd", type = JichuDs.Bblj.class),
        @XmlElement(name = "xuqiushizha", namespace = "http://tempuri.org/jichuDs.xsd", type = JichuDs.Xuqiushizha.class),
        @XmlElement(name = "cangkudangan", namespace = "http://tempuri.org/jichuDs.xsd", type = JichuDs.Cangkudangan.class),
        @XmlElement(name = "bendanweixinxi", namespace = "http://tempuri.org/jichuDs.xsd", type = JichuDs.Bendanweixinxi.class),
        @XmlElement(name = "mobandangan", namespace = "http://tempuri.org/jichuDs.xsd", type = JichuDs.Mobandangan.class),
        @XmlElement(name = "datiaojian", namespace = "http://tempuri.org/jichuDs.xsd", type = JichuDs.Datiaojian.class),
        @XmlElement(name = "kuaijikemu", namespace = "http://tempuri.org/jichuDs.xsd", type = JichuDs.Kuaijikemu.class),
        @XmlElement(name = "yewudangan", namespace = "http://tempuri.org/jichuDs.xsd", type = JichuDs.Yewudangan.class),
        @XmlElement(name = "mobanzhubiao", namespace = "http://tempuri.org/jichuDs.xsd", type = JichuDs.Mobanzhubiao.class),
        @XmlElement(name = "feiyongleibie", namespace = "http://tempuri.org/jichuDs.xsd", type = JichuDs.Feiyongleibie.class),
        @XmlElement(name = "feiyongdangan", namespace = "http://tempuri.org/jichuDs.xsd", type = JichuDs.Feiyongdangan.class),
        @XmlElement(name = "xiaoxileibie", namespace = "http://tempuri.org/jichuDs.xsd", type = JichuDs.Xiaoxileibie.class),
        @XmlElement(name = "gongzuoliuzibiao", namespace = "http://tempuri.org/jichuDs.xsd", type = JichuDs.Gongzuoliuzibiao.class),
        @XmlElement(name = "gongzuoliuzhubiao", namespace = "http://tempuri.org/jichuDs.xsd", type = JichuDs.Gongzuoliuzhubiao.class),
        @XmlElement(name = "lshzz", namespace = "http://tempuri.org/jichuDs.xsd", type = JichuDs.Lshzz.class),
        @XmlElement(name = "baobiaotiaojian", namespace = "http://tempuri.org/jichuDs.xsd", type = JichuDs.Baobiaotiaojian.class),
        @XmlElement(name = "baobiaogeshi", namespace = "http://tempuri.org/jichuDs.xsd", type = JichuDs.Baobiaogeshi.class),
        @XmlElement(name = "baobiaoshitu", namespace = "http://tempuri.org/jichuDs.xsd", type = JichuDs.Baobiaoshitu.class),
        @XmlElement(name = "baobiaoyuju", namespace = "http://tempuri.org/jichuDs.xsd", type = JichuDs.Baobiaoyuju.class),
        @XmlElement(name = "shitujiegou", namespace = "http://tempuri.org/jichuDs.xsd", type = JichuDs.Shitujiegou.class),
        @XmlElement(name = "ysyfmingxizhang", namespace = "http://tempuri.org/jichuDs.xsd", type = JichuDs.Ysyfmingxizhang.class),
        @XmlElement(name = "xiangmudangan", namespace = "http://tempuri.org/jichuDs.xsd", type = JichuDs.Xiangmudangan.class),
        @XmlElement(name = "xiangmufeiyongyaoshu", namespace = "http://tempuri.org/jichuDs.xsd", type = JichuDs.Xiangmufeiyongyaoshu.class),
        @XmlElement(name = "renyuandangan", namespace = "http://tempuri.org/jichuDs.xsd", type = JichuDs.Renyuandangan.class),
        @XmlElement(name = "danweixiashujigou", namespace = "http://tempuri.org/jichuDs.xsd", type = JichuDs.Danweixiashujigou.class),
        @XmlElement(name = "danweidangan", namespace = "http://tempuri.org/jichuDs.xsd", type = JichuDs.Danweidangan.class),
        @XmlElement(name = "cunhuodangan", namespace = "http://tempuri.org/jichuDs.xsd", type = JichuDs.Cunhuodangan.class)
    })
    protected List<Object> quanxianziduanOrKexuanchanshuzhiOrWaibidangan;

    /**
     * Gets the value of the quanxianziduanOrKexuanchanshuzhiOrWaibidangan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quanxianziduanOrKexuanchanshuzhiOrWaibidangan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuanxianziduanOrKexuanchanshuzhiOrWaibidangan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JichuDs.Quanxianziduan }
     * {@link JichuDs.Kexuanchanshuzhi }
     * {@link JichuDs.Waibidangan }
     * {@link JichuDs.Ziyouxiangdangan }
     * {@link JichuDs.Shuxingxuanxiangdangan }
     * {@link JichuDs.Fukuantiaojian }
     * {@link JichuDs.Huoweidangan }
     * {@link JichuDs.Shuxingmingchengdangan }
     * {@link JichuDs.Duizhaomajibenbiao }
     * {@link JichuDs.Danweijd }
     * {@link JichuDs.Canshudangan }
     * {@link JichuDs.Bumendangan }
     * {@link JichuDs.Cunhuoleibie }
     * {@link JichuDs.Danweileibie }
     * {@link JichuDs.Huoweileibie }
     * {@link JichuDs.Xiangmuleibie }
     * {@link JichuDs.Ziyouxiangfenzu }
     * {@link JichuDs.EXdayinmoban }
     * {@link JichuDs.Biaojiegou }
     * {@link JichuDs.Jiezhangbiaoshi }
     * {@link JichuDs.Kuaijiqijian }
     * {@link JichuDs.Shuihudangan }
     * {@link JichuDs.Quanxiandangan }
     * {@link JichuDs.Yewukemuduizhaobiao }
     * {@link JichuDs.Yewukemubiao }
     * {@link JichuDs.Mywork }
     * {@link JichuDs.Bbxzl }
     * {@link JichuDs.Bblj }
     * {@link JichuDs.Xuqiushizha }
     * {@link JichuDs.Cangkudangan }
     * {@link JichuDs.Bendanweixinxi }
     * {@link JichuDs.Mobandangan }
     * {@link JichuDs.Datiaojian }
     * {@link JichuDs.Kuaijikemu }
     * {@link JichuDs.Yewudangan }
     * {@link JichuDs.Mobanzhubiao }
     * {@link JichuDs.Feiyongleibie }
     * {@link JichuDs.Feiyongdangan }
     * {@link JichuDs.Xiaoxileibie }
     * {@link JichuDs.Gongzuoliuzibiao }
     * {@link JichuDs.Gongzuoliuzhubiao }
     * {@link JichuDs.Lshzz }
     * {@link JichuDs.Baobiaotiaojian }
     * {@link JichuDs.Baobiaogeshi }
     * {@link JichuDs.Baobiaoshitu }
     * {@link JichuDs.Baobiaoyuju }
     * {@link JichuDs.Shitujiegou }
     * {@link JichuDs.Ysyfmingxizhang }
     * {@link JichuDs.Xiangmudangan }
     * {@link JichuDs.Xiangmufeiyongyaoshu }
     * {@link JichuDs.Renyuandangan }
     * {@link JichuDs.Danweixiashujigou }
     * {@link JichuDs.Danweidangan }
     * {@link JichuDs.Cunhuodangan }
     * 
     * 
     */
    public List<Object> getQuanxianziduanOrKexuanchanshuzhiOrWaibidangan() {
        if (quanxianziduanOrKexuanchanshuzhiOrWaibidangan == null) {
            quanxianziduanOrKexuanchanshuzhiOrWaibidangan = new ArrayList<Object>();
        }
        return this.quanxianziduanOrKexuanchanshuzhiOrWaibidangan;
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
     *         &lt;element name="baobiaoid" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="jiegou" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="100"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="mingcheng" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="100"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="kuandu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="xuhao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="geshi" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="dingwei" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="heji" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="zonghe" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="3000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="leixing" minOccurs="0">
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
        "baobiaoid",
        "jiegou",
        "mingcheng",
        "kuandu",
        "xuhao",
        "geshi",
        "dingwei",
        "heji",
        "zonghe",
        "leixing"
    })
    public static class Baobiaogeshi {

        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int id;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int baobiaoid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String jiegou;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String mingcheng;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer kuandu;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer xuhao;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String geshi;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected boolean dingwei;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected boolean heji;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zonghe;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String leixing;

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
         * Gets the value of the baobiaoid property.
         * 
         */
        public int getBaobiaoid() {
            return baobiaoid;
        }

        /**
         * Sets the value of the baobiaoid property.
         * 
         */
        public void setBaobiaoid(int value) {
            this.baobiaoid = value;
        }

        /**
         * Gets the value of the jiegou property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJiegou() {
            return jiegou;
        }

        /**
         * Sets the value of the jiegou property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJiegou(String value) {
            this.jiegou = value;
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
         * Gets the value of the kuandu property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getKuandu() {
            return kuandu;
        }

        /**
         * Sets the value of the kuandu property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setKuandu(Integer value) {
            this.kuandu = value;
        }

        /**
         * Gets the value of the xuhao property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getXuhao() {
            return xuhao;
        }

        /**
         * Sets the value of the xuhao property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setXuhao(Integer value) {
            this.xuhao = value;
        }

        /**
         * Gets the value of the geshi property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGeshi() {
            return geshi;
        }

        /**
         * Sets the value of the geshi property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGeshi(String value) {
            this.geshi = value;
        }

        /**
         * Gets the value of the dingwei property.
         * 
         */
        public boolean isDingwei() {
            return dingwei;
        }

        /**
         * Sets the value of the dingwei property.
         * 
         */
        public void setDingwei(boolean value) {
            this.dingwei = value;
        }

        /**
         * Gets the value of the heji property.
         * 
         */
        public boolean isHeji() {
            return heji;
        }

        /**
         * Sets the value of the heji property.
         * 
         */
        public void setHeji(boolean value) {
            this.heji = value;
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
     *         &lt;element name="baobiaoid" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="shituming" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="200"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="xuhao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="moren" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="leibiedangan" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="100"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="leibieguanlian" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="100"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="tuxinglie" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="100"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="hxzyxxuhao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="hxzyxkuandu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="zonghe" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="1000"/>
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
        "baobiaoid",
        "shituming",
        "xuhao",
        "moren",
        "leibiedangan",
        "leibieguanlian",
        "tuxinglie",
        "hxzyxxuhao",
        "hxzyxkuandu",
        "zonghe"
    })
    public static class Baobiaoshitu {

        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int id;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int baobiaoid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String shituming;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer xuhao;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean moren;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String leibiedangan;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String leibieguanlian;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String tuxinglie;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer hxzyxxuhao;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer hxzyxkuandu;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zonghe;

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
         * Gets the value of the baobiaoid property.
         * 
         */
        public int getBaobiaoid() {
            return baobiaoid;
        }

        /**
         * Sets the value of the baobiaoid property.
         * 
         */
        public void setBaobiaoid(int value) {
            this.baobiaoid = value;
        }

        /**
         * Gets the value of the shituming property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShituming() {
            return shituming;
        }

        /**
         * Sets the value of the shituming property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShituming(String value) {
            this.shituming = value;
        }

        /**
         * Gets the value of the xuhao property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getXuhao() {
            return xuhao;
        }

        /**
         * Sets the value of the xuhao property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setXuhao(Integer value) {
            this.xuhao = value;
        }

        /**
         * Gets the value of the moren property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isMoren() {
            return moren;
        }

        /**
         * Sets the value of the moren property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setMoren(Boolean value) {
            this.moren = value;
        }

        /**
         * Gets the value of the leibiedangan property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLeibiedangan() {
            return leibiedangan;
        }

        /**
         * Sets the value of the leibiedangan property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLeibiedangan(String value) {
            this.leibiedangan = value;
        }

        /**
         * Gets the value of the leibieguanlian property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLeibieguanlian() {
            return leibieguanlian;
        }

        /**
         * Sets the value of the leibieguanlian property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLeibieguanlian(String value) {
            this.leibieguanlian = value;
        }

        /**
         * Gets the value of the tuxinglie property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTuxinglie() {
            return tuxinglie;
        }

        /**
         * Sets the value of the tuxinglie property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTuxinglie(String value) {
            this.tuxinglie = value;
        }

        /**
         * Gets the value of the hxzyxxuhao property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getHxzyxxuhao() {
            return hxzyxxuhao;
        }

        /**
         * Sets the value of the hxzyxxuhao property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setHxzyxxuhao(Integer value) {
            this.hxzyxxuhao = value;
        }

        /**
         * Gets the value of the hxzyxkuandu property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getHxzyxkuandu() {
            return hxzyxkuandu;
        }

        /**
         * Sets the value of the hxzyxkuandu property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setHxzyxkuandu(Integer value) {
            this.hxzyxkuandu = value;
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
     *         &lt;element name="bbid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="lie" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="500"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="mingcheng" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="100"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="zonghe" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="3000"/>
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
        "bbid",
        "lie",
        "mingcheng",
        "zonghe"
    })
    public static class Baobiaotiaojian {

        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int id;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer bbid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String lie;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String mingcheng;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zonghe;

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
         * Gets the value of the bbid property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getBbid() {
            return bbid;
        }

        /**
         * Sets the value of the bbid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setBbid(Integer value) {
            this.bbid = value;
        }

        /**
         * Gets the value of the lie property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLie() {
            return lie;
        }

        /**
         * Sets the value of the lie property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLie(String value) {
            this.lie = value;
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
     *         &lt;element name="yuju" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="8000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="shushujuming" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="100"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="guanlianlie" minOccurs="0">
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
        "yuju",
        "shushujuming",
        "guanlianlie"
    })
    public static class Baobiaoyuju {

        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int id;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String yuju;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String shushujuming;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String guanlianlie;

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
         * Gets the value of the yuju property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getYuju() {
            return yuju;
        }

        /**
         * Sets the value of the yuju property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setYuju(String value) {
            this.yuju = value;
        }

        /**
         * Gets the value of the shushujuming property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShushujuming() {
            return shushujuming;
        }

        /**
         * Sets the value of the shushujuming property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShushujuming(String value) {
            this.shushujuming = value;
        }

        /**
         * Gets the value of the guanlianlie property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGuanlianlie() {
            return guanlianlie;
        }

        /**
         * Sets the value of the guanlianlie property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGuanlianlie(String value) {
            this.guanlianlie = value;
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
     *         &lt;element name="zibiaoid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="zziduan" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="lianjie" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="yziduan" minOccurs="0">
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
        "zibiaoid",
        "zziduan",
        "lianjie",
        "yziduan"
    })
    public static class Bblj {

        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int id;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer zibiaoid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zziduan;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String lianjie;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String yziduan;

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
         * Gets the value of the zziduan property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZziduan() {
            return zziduan;
        }

        /**
         * Sets the value of the zziduan property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZziduan(String value) {
            this.zziduan = value;
        }

        /**
         * Gets the value of the lianjie property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLianjie() {
            return lianjie;
        }

        /**
         * Sets the value of the lianjie property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLianjie(String value) {
            this.lianjie = value;
        }

        /**
         * Gets the value of the yziduan property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getYziduan() {
            return yziduan;
        }

        /**
         * Sets the value of the yziduan property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setYziduan(String value) {
            this.yziduan = value;
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
     *         &lt;element name="zhubiaoid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="zibiaoid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="ziduan" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="duizhaoming" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="xianshifangshi" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="10"/>
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
        "zhubiaoid",
        "zibiaoid",
        "ziduan",
        "duizhaoming",
        "xianshifangshi"
    })
    public static class Bbxzl {

        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int id;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer zhubiaoid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer zibiaoid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String ziduan;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String duizhaoming;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String xianshifangshi;

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
         * Gets the value of the ziduan property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZiduan() {
            return ziduan;
        }

        /**
         * Sets the value of the ziduan property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZiduan(String value) {
            this.ziduan = value;
        }

        /**
         * Gets the value of the duizhaoming property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDuizhaoming() {
            return duizhaoming;
        }

        /**
         * Sets the value of the duizhaoming property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDuizhaoming(String value) {
            this.duizhaoming = value;
        }

        /**
         * Gets the value of the xianshifangshi property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXianshifangshi() {
            return xianshifangshi;
        }

        /**
         * Sets the value of the xianshifangshi property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXianshifangshi(String value) {
            this.xianshifangshi = value;
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
     *               &lt;maxLength value="80"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="jiancheng" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="jigoudaima" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="yuming" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="dizhi" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="dianhua" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="faren" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="10"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="email" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="kaihuyinhangzhanghao" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="shuihao" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="nashuixingzhi" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="beizhu" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="tubiao" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="100"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="zidingyi1" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="500"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="zidingyi2" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="zidingyi3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
        "jiancheng",
        "jigoudaima",
        "yuming",
        "dizhi",
        "dianhua",
        "faren",
        "email",
        "kaihuyinhangzhanghao",
        "shuihao",
        "nashuixingzhi",
        "beizhu",
        "tubiao",
        "zidingyi1",
        "zidingyi2",
        "zidingyi3"
    })
    public static class Bendanweixinxi {

        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int id;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String mingcheng;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String jiancheng;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String jigoudaima;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String yuming;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String dizhi;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String dianhua;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String faren;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String email;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String kaihuyinhangzhanghao;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String shuihao;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String nashuixingzhi;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String beizhu;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String tubiao;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zidingyi1;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zidingyi2;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected BigDecimal zidingyi3;

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
         * Gets the value of the jiancheng property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJiancheng() {
            return jiancheng;
        }

        /**
         * Sets the value of the jiancheng property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJiancheng(String value) {
            this.jiancheng = value;
        }

        /**
         * Gets the value of the jigoudaima property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJigoudaima() {
            return jigoudaima;
        }

        /**
         * Sets the value of the jigoudaima property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJigoudaima(String value) {
            this.jigoudaima = value;
        }

        /**
         * Gets the value of the yuming property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getYuming() {
            return yuming;
        }

        /**
         * Sets the value of the yuming property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setYuming(String value) {
            this.yuming = value;
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
         * Gets the value of the dianhua property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDianhua() {
            return dianhua;
        }

        /**
         * Sets the value of the dianhua property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDianhua(String value) {
            this.dianhua = value;
        }

        /**
         * Gets the value of the faren property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFaren() {
            return faren;
        }

        /**
         * Sets the value of the faren property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFaren(String value) {
            this.faren = value;
        }

        /**
         * Gets the value of the email property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmail() {
            return email;
        }

        /**
         * Sets the value of the email property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmail(String value) {
            this.email = value;
        }

        /**
         * Gets the value of the kaihuyinhangzhanghao property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKaihuyinhangzhanghao() {
            return kaihuyinhangzhanghao;
        }

        /**
         * Sets the value of the kaihuyinhangzhanghao property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKaihuyinhangzhanghao(String value) {
            this.kaihuyinhangzhanghao = value;
        }

        /**
         * Gets the value of the shuihao property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShuihao() {
            return shuihao;
        }

        /**
         * Sets the value of the shuihao property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShuihao(String value) {
            this.shuihao = value;
        }

        /**
         * Gets the value of the nashuixingzhi property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNashuixingzhi() {
            return nashuixingzhi;
        }

        /**
         * Sets the value of the nashuixingzhi property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNashuixingzhi(String value) {
            this.nashuixingzhi = value;
        }

        /**
         * Gets the value of the beizhu property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBeizhu() {
            return beizhu;
        }

        /**
         * Sets the value of the beizhu property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBeizhu(String value) {
            this.beizhu = value;
        }

        /**
         * Gets the value of the tubiao property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTubiao() {
            return tubiao;
        }

        /**
         * Sets the value of the tubiao property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTubiao(String value) {
            this.tubiao = value;
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
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getZidingyi3() {
            return zidingyi3;
        }

        /**
         * Sets the value of the zidingyi3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setZidingyi3(BigDecimal value) {
            this.zidingyi3 = value;
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
     *         &lt;element name="biao">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="jiegou" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="mingcheng" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="200"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="xuhao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="kuandu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="dingwei" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="heji" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="shifoubilu" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="cankaodangan_xianshilie" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="100"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="guanliandangan" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="100"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="leixing" minOccurs="0">
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
        "biao",
        "jiegou",
        "mingcheng",
        "xuhao",
        "kuandu",
        "dingwei",
        "heji",
        "shifoubilu",
        "cankaodanganXianshilie",
        "guanliandangan",
        "leixing"
    })
    public static class Biaojiegou {

        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int id;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd", required = true)
        protected String biao;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String jiegou;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String mingcheng;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer xuhao;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer kuandu;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean dingwei;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean heji;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean shifoubilu;
        @XmlElement(name = "cankaodangan_xianshilie", namespace = "http://tempuri.org/jichuDs.xsd")
        protected String cankaodanganXianshilie;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String guanliandangan;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String leixing;

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
         * Gets the value of the biao property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBiao() {
            return biao;
        }

        /**
         * Sets the value of the biao property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBiao(String value) {
            this.biao = value;
        }

        /**
         * Gets the value of the jiegou property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJiegou() {
            return jiegou;
        }

        /**
         * Sets the value of the jiegou property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJiegou(String value) {
            this.jiegou = value;
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
         * Gets the value of the xuhao property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getXuhao() {
            return xuhao;
        }

        /**
         * Sets the value of the xuhao property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setXuhao(Integer value) {
            this.xuhao = value;
        }

        /**
         * Gets the value of the kuandu property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getKuandu() {
            return kuandu;
        }

        /**
         * Sets the value of the kuandu property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setKuandu(Integer value) {
            this.kuandu = value;
        }

        /**
         * Gets the value of the dingwei property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDingwei() {
            return dingwei;
        }

        /**
         * Sets the value of the dingwei property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDingwei(Boolean value) {
            this.dingwei = value;
        }

        /**
         * Gets the value of the heji property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isHeji() {
            return heji;
        }

        /**
         * Sets the value of the heji property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setHeji(Boolean value) {
            this.heji = value;
        }

        /**
         * Gets the value of the shifoubilu property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isShifoubilu() {
            return shifoubilu;
        }

        /**
         * Sets the value of the shifoubilu property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setShifoubilu(Boolean value) {
            this.shifoubilu = value;
        }

        /**
         * Gets the value of the cankaodanganXianshilie property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCankaodanganXianshilie() {
            return cankaodanganXianshilie;
        }

        /**
         * Sets the value of the cankaodanganXianshilie property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCankaodanganXianshilie(String value) {
            this.cankaodanganXianshilie = value;
        }

        /**
         * Gets the value of the guanliandangan property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGuanliandangan() {
            return guanliandangan;
        }

        /**
         * Sets the value of the guanliandangan property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGuanliandangan(String value) {
            this.guanliandangan = value;
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
     *         &lt;element name="bianma" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element name="mingcheng" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="sunxuma" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="shifoumoji" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="duizhaoma" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="leibielujing" minOccurs="0">
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
        "bianma",
        "mingcheng",
        "sunxuma",
        "shifoumoji",
        "duizhaoma",
        "leibielujing"
    })
    public static class Bumendangan {

        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int id;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd", required = true)
        protected BigDecimal bianma;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String mingcheng;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected BigDecimal sunxuma;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean shifoumoji;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String duizhaoma;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String leibielujing;

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
         * Gets the value of the bianma property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getBianma() {
            return bianma;
        }

        /**
         * Sets the value of the bianma property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setBianma(BigDecimal value) {
            this.bianma = value;
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
         * Gets the value of the sunxuma property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getSunxuma() {
            return sunxuma;
        }

        /**
         * Sets the value of the sunxuma property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setSunxuma(BigDecimal value) {
            this.sunxuma = value;
        }

        /**
         * Gets the value of the shifoumoji property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isShifoumoji() {
            return shifoumoji;
        }

        /**
         * Sets the value of the shifoumoji property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setShifoumoji(Boolean value) {
            this.shifoumoji = value;
        }

        /**
         * Gets the value of the duizhaoma property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDuizhaoma() {
            return duizhaoma;
        }

        /**
         * Sets the value of the duizhaoma property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDuizhaoma(String value) {
            this.duizhaoma = value;
        }

        /**
         * Gets the value of the leibielujing property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLeibielujing() {
            return leibielujing;
        }

        /**
         * Sets the value of the leibielujing property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLeibielujing(String value) {
            this.leibielujing = value;
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
     *         &lt;element name="bianma">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="10"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="mingcheng">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="dizhi" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="200"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="bumenid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="fuzerenid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="xingzhi" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="6"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="huowei" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="beizhu" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="200"/>
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
     *         &lt;element name="zidingyi2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="tingyong" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="iskyl" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="jijiafangfa" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="16"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="duizhaoma" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ismrp" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="zhujifu" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="dianhua" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="100"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="chuanzhen" minOccurs="0">
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
        "bianma",
        "mingcheng",
        "dizhi",
        "bumenid",
        "fuzerenid",
        "xingzhi",
        "huowei",
        "beizhu",
        "zidingyi1",
        "zidingyi2",
        "tingyong",
        "iskyl",
        "jijiafangfa",
        "duizhaoma",
        "ismrp",
        "zhujifu",
        "dianhua",
        "chuanzhen"
    })
    public static class Cangkudangan {

        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int id;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd", required = true)
        protected String bianma;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd", required = true)
        protected String mingcheng;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String dizhi;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer bumenid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer fuzerenid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String xingzhi;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean huowei;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String beizhu;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zidingyi1;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected BigDecimal zidingyi2;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean tingyong;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean iskyl;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String jijiafangfa;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String duizhaoma;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean ismrp;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zhujifu;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String dianhua;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String chuanzhen;

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
         * Gets the value of the bianma property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBianma() {
            return bianma;
        }

        /**
         * Sets the value of the bianma property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBianma(String value) {
            this.bianma = value;
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
         * Gets the value of the fuzerenid property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getFuzerenid() {
            return fuzerenid;
        }

        /**
         * Sets the value of the fuzerenid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setFuzerenid(Integer value) {
            this.fuzerenid = value;
        }

        /**
         * Gets the value of the xingzhi property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXingzhi() {
            return xingzhi;
        }

        /**
         * Sets the value of the xingzhi property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXingzhi(String value) {
            this.xingzhi = value;
        }

        /**
         * Gets the value of the huowei property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isHuowei() {
            return huowei;
        }

        /**
         * Sets the value of the huowei property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setHuowei(Boolean value) {
            this.huowei = value;
        }

        /**
         * Gets the value of the beizhu property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBeizhu() {
            return beizhu;
        }

        /**
         * Sets the value of the beizhu property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBeizhu(String value) {
            this.beizhu = value;
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
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getZidingyi2() {
            return zidingyi2;
        }

        /**
         * Sets the value of the zidingyi2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setZidingyi2(BigDecimal value) {
            this.zidingyi2 = value;
        }

        /**
         * Gets the value of the tingyong property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isTingyong() {
            return tingyong;
        }

        /**
         * Sets the value of the tingyong property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setTingyong(Boolean value) {
            this.tingyong = value;
        }

        /**
         * Gets the value of the iskyl property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIskyl() {
            return iskyl;
        }

        /**
         * Sets the value of the iskyl property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIskyl(Boolean value) {
            this.iskyl = value;
        }

        /**
         * Gets the value of the jijiafangfa property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJijiafangfa() {
            return jijiafangfa;
        }

        /**
         * Sets the value of the jijiafangfa property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJijiafangfa(String value) {
            this.jijiafangfa = value;
        }

        /**
         * Gets the value of the duizhaoma property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDuizhaoma() {
            return duizhaoma;
        }

        /**
         * Sets the value of the duizhaoma property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDuizhaoma(String value) {
            this.duizhaoma = value;
        }

        /**
         * Gets the value of the ismrp property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsmrp() {
            return ismrp;
        }

        /**
         * Sets the value of the ismrp property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIsmrp(Boolean value) {
            this.ismrp = value;
        }

        /**
         * Gets the value of the zhujifu property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZhujifu() {
            return zhujifu;
        }

        /**
         * Sets the value of the zhujifu property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZhujifu(String value) {
            this.zhujifu = value;
        }

        /**
         * Gets the value of the dianhua property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDianhua() {
            return dianhua;
        }

        /**
         * Sets the value of the dianhua property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDianhua(String value) {
            this.dianhua = value;
        }

        /**
         * Gets the value of the chuanzhen property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChuanzhen() {
            return chuanzhen;
        }

        /**
         * Sets the value of the chuanzhen property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChuanzhen(String value) {
            this.chuanzhen = value;
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
     *               &lt;maxLength value="30"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="canshuzhi" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="20"/>
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
        "canshuzhi"
    })
    public static class Canshudangan {

        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int id;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String mingcheng;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String canshuzhi;

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
         * Gets the value of the canshuzhi property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCanshuzhi() {
            return canshuzhi;
        }

        /**
         * Sets the value of the canshuzhi property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCanshuzhi(String value) {
            this.canshuzhi = value;
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
     *         &lt;element name="bianma">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="mingcheng" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="100"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="guigexinghao" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="200"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="zhujifu" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="tiaoxingma" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="30"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="jiliangdanwei" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="10"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="suoshuleibieid" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="cankaochengben" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="cankaoshoujia" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="zuidishoujia" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="zuigaojinjia" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="gongyingshangid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="shuilv" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="zuigaokucun" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="zuidikucun" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="huoweiid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="quanxianzuid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="ROP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="dinghuodianfangfa" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="4"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ROPpiliangguize" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="gongyingtianshu" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="dinghuodian" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="gudinggongyingliang" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="baozhiqi" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="shifoulaowu" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="jilurenid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="jilushijian" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="xiugairenid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="xiugaishijian" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="tingyong" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="fuzhudanwei1" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="10"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="fuzhudanwei2" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="10"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="huansuanlv1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="huansuanlv2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="beizhu" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="1000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ziyouxiang1" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="ziyouxiang1fenzu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="ziyouxiang2" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="ziyouxiang2fenzu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="ziyouxiang3" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="ziyouxiang3fenzu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="ziyouxiang4" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="ziyouxiang4fenzu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="ziyouxiang5" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="ziyouxiang5fenzu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
     *         &lt;element name="zidingyi4" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="200"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="zidingyi5" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="500"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="zidingyi6" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="zidingyi7" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="zidingyi8" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="zidingyi9" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="zidingyi10" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="BOMid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="xiaoshou" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="zizhi" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="waigou" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="weiwai" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="shengchanlingyong" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="shuxing" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="hebingzhouqi" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="zuidigongyingliang" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="gongyingpiliang" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="tiqiangongying" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="dijiema" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="zonghe" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="2000"/>
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
        "bianma",
        "mingcheng",
        "guigexinghao",
        "zhujifu",
        "tiaoxingma",
        "jiliangdanwei",
        "suoshuleibieid",
        "cankaochengben",
        "cankaoshoujia",
        "zuidishoujia",
        "zuigaojinjia",
        "gongyingshangid",
        "shuilv",
        "zuigaokucun",
        "zuidikucun",
        "huoweiid",
        "quanxianzuid",
        "rop",
        "dinghuodianfangfa",
        "roPpiliangguize",
        "gongyingtianshu",
        "dinghuodian",
        "gudinggongyingliang",
        "baozhiqi",
        "shifoulaowu",
        "jilurenid",
        "jilushijian",
        "xiugairenid",
        "xiugaishijian",
        "tingyong",
        "fuzhudanwei1",
        "fuzhudanwei2",
        "huansuanlv1",
        "huansuanlv2",
        "beizhu",
        "ziyouxiang1",
        "ziyouxiang1Fenzu",
        "ziyouxiang2",
        "ziyouxiang2Fenzu",
        "ziyouxiang3",
        "ziyouxiang3Fenzu",
        "ziyouxiang4",
        "ziyouxiang4Fenzu",
        "ziyouxiang5",
        "ziyouxiang5Fenzu",
        "zidingyi1",
        "zidingyi2",
        "zidingyi3",
        "zidingyi4",
        "zidingyi5",
        "zidingyi6",
        "zidingyi7",
        "zidingyi8",
        "zidingyi9",
        "zidingyi10",
        "boMid",
        "xiaoshou",
        "zizhi",
        "waigou",
        "weiwai",
        "shengchanlingyong",
        "shuxing",
        "hebingzhouqi",
        "zuidigongyingliang",
        "gongyingpiliang",
        "tiqiangongying",
        "dijiema",
        "zonghe"
    })
    public static class Cunhuodangan {

        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int id;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd", required = true)
        protected String bianma;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String mingcheng;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String guigexinghao;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zhujifu;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String tiaoxingma;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String jiliangdanwei;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int suoshuleibieid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected BigDecimal cankaochengben;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected BigDecimal cankaoshoujia;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected BigDecimal zuidishoujia;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected BigDecimal zuigaojinjia;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer gongyingshangid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected BigDecimal shuilv;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected BigDecimal zuigaokucun;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected BigDecimal zuidikucun;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer huoweiid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer quanxianzuid;
        @XmlElement(name = "ROP", namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean rop;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String dinghuodianfangfa;
        @XmlElement(name = "ROPpiliangguize", namespace = "http://tempuri.org/jichuDs.xsd")
        protected String roPpiliangguize;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected BigDecimal gongyingtianshu;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected BigDecimal dinghuodian;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected BigDecimal gudinggongyingliang;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected BigDecimal baozhiqi;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean shifoulaowu;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer jilurenid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar jilushijian;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer xiugairenid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar xiugaishijian;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean tingyong;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String fuzhudanwei1;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String fuzhudanwei2;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected BigDecimal huansuanlv1;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected BigDecimal huansuanlv2;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String beizhu;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean ziyouxiang1;
        @XmlElement(name = "ziyouxiang1fenzu", namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer ziyouxiang1Fenzu;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean ziyouxiang2;
        @XmlElement(name = "ziyouxiang2fenzu", namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer ziyouxiang2Fenzu;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean ziyouxiang3;
        @XmlElement(name = "ziyouxiang3fenzu", namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer ziyouxiang3Fenzu;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean ziyouxiang4;
        @XmlElement(name = "ziyouxiang4fenzu", namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer ziyouxiang4Fenzu;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean ziyouxiang5;
        @XmlElement(name = "ziyouxiang5fenzu", namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer ziyouxiang5Fenzu;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zidingyi1;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zidingyi2;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zidingyi3;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zidingyi4;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zidingyi5;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected BigDecimal zidingyi6;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected BigDecimal zidingyi7;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected BigDecimal zidingyi8;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean zidingyi9;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar zidingyi10;
        @XmlElement(name = "BOMid", namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer boMid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean xiaoshou;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean zizhi;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean waigou;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean weiwai;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean shengchanlingyong;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer shuxing;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer hebingzhouqi;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected BigDecimal zuidigongyingliang;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected BigDecimal gongyingpiliang;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean tiqiangongying;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer dijiema;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zonghe;

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
         * Gets the value of the bianma property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBianma() {
            return bianma;
        }

        /**
         * Sets the value of the bianma property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBianma(String value) {
            this.bianma = value;
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
         * Gets the value of the guigexinghao property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGuigexinghao() {
            return guigexinghao;
        }

        /**
         * Sets the value of the guigexinghao property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGuigexinghao(String value) {
            this.guigexinghao = value;
        }

        /**
         * Gets the value of the zhujifu property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZhujifu() {
            return zhujifu;
        }

        /**
         * Sets the value of the zhujifu property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZhujifu(String value) {
            this.zhujifu = value;
        }

        /**
         * Gets the value of the tiaoxingma property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTiaoxingma() {
            return tiaoxingma;
        }

        /**
         * Sets the value of the tiaoxingma property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTiaoxingma(String value) {
            this.tiaoxingma = value;
        }

        /**
         * Gets the value of the jiliangdanwei property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJiliangdanwei() {
            return jiliangdanwei;
        }

        /**
         * Sets the value of the jiliangdanwei property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJiliangdanwei(String value) {
            this.jiliangdanwei = value;
        }

        /**
         * Gets the value of the suoshuleibieid property.
         * 
         */
        public int getSuoshuleibieid() {
            return suoshuleibieid;
        }

        /**
         * Sets the value of the suoshuleibieid property.
         * 
         */
        public void setSuoshuleibieid(int value) {
            this.suoshuleibieid = value;
        }

        /**
         * Gets the value of the cankaochengben property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCankaochengben() {
            return cankaochengben;
        }

        /**
         * Sets the value of the cankaochengben property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCankaochengben(BigDecimal value) {
            this.cankaochengben = value;
        }

        /**
         * Gets the value of the cankaoshoujia property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCankaoshoujia() {
            return cankaoshoujia;
        }

        /**
         * Sets the value of the cankaoshoujia property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCankaoshoujia(BigDecimal value) {
            this.cankaoshoujia = value;
        }

        /**
         * Gets the value of the zuidishoujia property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getZuidishoujia() {
            return zuidishoujia;
        }

        /**
         * Sets the value of the zuidishoujia property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setZuidishoujia(BigDecimal value) {
            this.zuidishoujia = value;
        }

        /**
         * Gets the value of the zuigaojinjia property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getZuigaojinjia() {
            return zuigaojinjia;
        }

        /**
         * Sets the value of the zuigaojinjia property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setZuigaojinjia(BigDecimal value) {
            this.zuigaojinjia = value;
        }

        /**
         * Gets the value of the gongyingshangid property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getGongyingshangid() {
            return gongyingshangid;
        }

        /**
         * Sets the value of the gongyingshangid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setGongyingshangid(Integer value) {
            this.gongyingshangid = value;
        }

        /**
         * Gets the value of the shuilv property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getShuilv() {
            return shuilv;
        }

        /**
         * Sets the value of the shuilv property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setShuilv(BigDecimal value) {
            this.shuilv = value;
        }

        /**
         * Gets the value of the zuigaokucun property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getZuigaokucun() {
            return zuigaokucun;
        }

        /**
         * Sets the value of the zuigaokucun property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setZuigaokucun(BigDecimal value) {
            this.zuigaokucun = value;
        }

        /**
         * Gets the value of the zuidikucun property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getZuidikucun() {
            return zuidikucun;
        }

        /**
         * Sets the value of the zuidikucun property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setZuidikucun(BigDecimal value) {
            this.zuidikucun = value;
        }

        /**
         * Gets the value of the huoweiid property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getHuoweiid() {
            return huoweiid;
        }

        /**
         * Sets the value of the huoweiid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setHuoweiid(Integer value) {
            this.huoweiid = value;
        }

        /**
         * Gets the value of the quanxianzuid property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getQuanxianzuid() {
            return quanxianzuid;
        }

        /**
         * Sets the value of the quanxianzuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setQuanxianzuid(Integer value) {
            this.quanxianzuid = value;
        }

        /**
         * Gets the value of the rop property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isROP() {
            return rop;
        }

        /**
         * Sets the value of the rop property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setROP(Boolean value) {
            this.rop = value;
        }

        /**
         * Gets the value of the dinghuodianfangfa property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDinghuodianfangfa() {
            return dinghuodianfangfa;
        }

        /**
         * Sets the value of the dinghuodianfangfa property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDinghuodianfangfa(String value) {
            this.dinghuodianfangfa = value;
        }

        /**
         * Gets the value of the roPpiliangguize property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getROPpiliangguize() {
            return roPpiliangguize;
        }

        /**
         * Sets the value of the roPpiliangguize property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setROPpiliangguize(String value) {
            this.roPpiliangguize = value;
        }

        /**
         * Gets the value of the gongyingtianshu property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getGongyingtianshu() {
            return gongyingtianshu;
        }

        /**
         * Sets the value of the gongyingtianshu property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setGongyingtianshu(BigDecimal value) {
            this.gongyingtianshu = value;
        }

        /**
         * Gets the value of the dinghuodian property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getDinghuodian() {
            return dinghuodian;
        }

        /**
         * Sets the value of the dinghuodian property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setDinghuodian(BigDecimal value) {
            this.dinghuodian = value;
        }

        /**
         * Gets the value of the gudinggongyingliang property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getGudinggongyingliang() {
            return gudinggongyingliang;
        }

        /**
         * Sets the value of the gudinggongyingliang property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setGudinggongyingliang(BigDecimal value) {
            this.gudinggongyingliang = value;
        }

        /**
         * Gets the value of the baozhiqi property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getBaozhiqi() {
            return baozhiqi;
        }

        /**
         * Sets the value of the baozhiqi property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setBaozhiqi(BigDecimal value) {
            this.baozhiqi = value;
        }

        /**
         * Gets the value of the shifoulaowu property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isShifoulaowu() {
            return shifoulaowu;
        }

        /**
         * Sets the value of the shifoulaowu property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setShifoulaowu(Boolean value) {
            this.shifoulaowu = value;
        }

        /**
         * Gets the value of the jilurenid property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getJilurenid() {
            return jilurenid;
        }

        /**
         * Sets the value of the jilurenid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setJilurenid(Integer value) {
            this.jilurenid = value;
        }

        /**
         * Gets the value of the jilushijian property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getJilushijian() {
            return jilushijian;
        }

        /**
         * Sets the value of the jilushijian property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setJilushijian(XMLGregorianCalendar value) {
            this.jilushijian = value;
        }

        /**
         * Gets the value of the xiugairenid property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getXiugairenid() {
            return xiugairenid;
        }

        /**
         * Sets the value of the xiugairenid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setXiugairenid(Integer value) {
            this.xiugairenid = value;
        }

        /**
         * Gets the value of the xiugaishijian property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getXiugaishijian() {
            return xiugaishijian;
        }

        /**
         * Sets the value of the xiugaishijian property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setXiugaishijian(XMLGregorianCalendar value) {
            this.xiugaishijian = value;
        }

        /**
         * Gets the value of the tingyong property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isTingyong() {
            return tingyong;
        }

        /**
         * Sets the value of the tingyong property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setTingyong(Boolean value) {
            this.tingyong = value;
        }

        /**
         * Gets the value of the fuzhudanwei1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFuzhudanwei1() {
            return fuzhudanwei1;
        }

        /**
         * Sets the value of the fuzhudanwei1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFuzhudanwei1(String value) {
            this.fuzhudanwei1 = value;
        }

        /**
         * Gets the value of the fuzhudanwei2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFuzhudanwei2() {
            return fuzhudanwei2;
        }

        /**
         * Sets the value of the fuzhudanwei2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFuzhudanwei2(String value) {
            this.fuzhudanwei2 = value;
        }

        /**
         * Gets the value of the huansuanlv1 property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getHuansuanlv1() {
            return huansuanlv1;
        }

        /**
         * Sets the value of the huansuanlv1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setHuansuanlv1(BigDecimal value) {
            this.huansuanlv1 = value;
        }

        /**
         * Gets the value of the huansuanlv2 property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getHuansuanlv2() {
            return huansuanlv2;
        }

        /**
         * Sets the value of the huansuanlv2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setHuansuanlv2(BigDecimal value) {
            this.huansuanlv2 = value;
        }

        /**
         * Gets the value of the beizhu property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBeizhu() {
            return beizhu;
        }

        /**
         * Sets the value of the beizhu property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBeizhu(String value) {
            this.beizhu = value;
        }

        /**
         * Gets the value of the ziyouxiang1 property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isZiyouxiang1() {
            return ziyouxiang1;
        }

        /**
         * Sets the value of the ziyouxiang1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setZiyouxiang1(Boolean value) {
            this.ziyouxiang1 = value;
        }

        /**
         * Gets the value of the ziyouxiang1Fenzu property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getZiyouxiang1Fenzu() {
            return ziyouxiang1Fenzu;
        }

        /**
         * Sets the value of the ziyouxiang1Fenzu property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setZiyouxiang1Fenzu(Integer value) {
            this.ziyouxiang1Fenzu = value;
        }

        /**
         * Gets the value of the ziyouxiang2 property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isZiyouxiang2() {
            return ziyouxiang2;
        }

        /**
         * Sets the value of the ziyouxiang2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setZiyouxiang2(Boolean value) {
            this.ziyouxiang2 = value;
        }

        /**
         * Gets the value of the ziyouxiang2Fenzu property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getZiyouxiang2Fenzu() {
            return ziyouxiang2Fenzu;
        }

        /**
         * Sets the value of the ziyouxiang2Fenzu property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setZiyouxiang2Fenzu(Integer value) {
            this.ziyouxiang2Fenzu = value;
        }

        /**
         * Gets the value of the ziyouxiang3 property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isZiyouxiang3() {
            return ziyouxiang3;
        }

        /**
         * Sets the value of the ziyouxiang3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setZiyouxiang3(Boolean value) {
            this.ziyouxiang3 = value;
        }

        /**
         * Gets the value of the ziyouxiang3Fenzu property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getZiyouxiang3Fenzu() {
            return ziyouxiang3Fenzu;
        }

        /**
         * Sets the value of the ziyouxiang3Fenzu property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setZiyouxiang3Fenzu(Integer value) {
            this.ziyouxiang3Fenzu = value;
        }

        /**
         * Gets the value of the ziyouxiang4 property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isZiyouxiang4() {
            return ziyouxiang4;
        }

        /**
         * Sets the value of the ziyouxiang4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setZiyouxiang4(Boolean value) {
            this.ziyouxiang4 = value;
        }

        /**
         * Gets the value of the ziyouxiang4Fenzu property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getZiyouxiang4Fenzu() {
            return ziyouxiang4Fenzu;
        }

        /**
         * Sets the value of the ziyouxiang4Fenzu property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setZiyouxiang4Fenzu(Integer value) {
            this.ziyouxiang4Fenzu = value;
        }

        /**
         * Gets the value of the ziyouxiang5 property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isZiyouxiang5() {
            return ziyouxiang5;
        }

        /**
         * Sets the value of the ziyouxiang5 property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setZiyouxiang5(Boolean value) {
            this.ziyouxiang5 = value;
        }

        /**
         * Gets the value of the ziyouxiang5Fenzu property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getZiyouxiang5Fenzu() {
            return ziyouxiang5Fenzu;
        }

        /**
         * Sets the value of the ziyouxiang5Fenzu property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setZiyouxiang5Fenzu(Integer value) {
            this.ziyouxiang5Fenzu = value;
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

        /**
         * Gets the value of the zidingyi4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZidingyi4() {
            return zidingyi4;
        }

        /**
         * Sets the value of the zidingyi4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZidingyi4(String value) {
            this.zidingyi4 = value;
        }

        /**
         * Gets the value of the zidingyi5 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZidingyi5() {
            return zidingyi5;
        }

        /**
         * Sets the value of the zidingyi5 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZidingyi5(String value) {
            this.zidingyi5 = value;
        }

        /**
         * Gets the value of the zidingyi6 property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getZidingyi6() {
            return zidingyi6;
        }

        /**
         * Sets the value of the zidingyi6 property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setZidingyi6(BigDecimal value) {
            this.zidingyi6 = value;
        }

        /**
         * Gets the value of the zidingyi7 property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getZidingyi7() {
            return zidingyi7;
        }

        /**
         * Sets the value of the zidingyi7 property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setZidingyi7(BigDecimal value) {
            this.zidingyi7 = value;
        }

        /**
         * Gets the value of the zidingyi8 property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getZidingyi8() {
            return zidingyi8;
        }

        /**
         * Sets the value of the zidingyi8 property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setZidingyi8(BigDecimal value) {
            this.zidingyi8 = value;
        }

        /**
         * Gets the value of the zidingyi9 property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isZidingyi9() {
            return zidingyi9;
        }

        /**
         * Sets the value of the zidingyi9 property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setZidingyi9(Boolean value) {
            this.zidingyi9 = value;
        }

        /**
         * Gets the value of the zidingyi10 property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getZidingyi10() {
            return zidingyi10;
        }

        /**
         * Sets the value of the zidingyi10 property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setZidingyi10(XMLGregorianCalendar value) {
            this.zidingyi10 = value;
        }

        /**
         * Gets the value of the boMid property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getBOMid() {
            return boMid;
        }

        /**
         * Sets the value of the boMid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setBOMid(Integer value) {
            this.boMid = value;
        }

        /**
         * Gets the value of the xiaoshou property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isXiaoshou() {
            return xiaoshou;
        }

        /**
         * Sets the value of the xiaoshou property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setXiaoshou(Boolean value) {
            this.xiaoshou = value;
        }

        /**
         * Gets the value of the zizhi property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isZizhi() {
            return zizhi;
        }

        /**
         * Sets the value of the zizhi property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setZizhi(Boolean value) {
            this.zizhi = value;
        }

        /**
         * Gets the value of the waigou property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isWaigou() {
            return waigou;
        }

        /**
         * Sets the value of the waigou property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setWaigou(Boolean value) {
            this.waigou = value;
        }

        /**
         * Gets the value of the weiwai property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isWeiwai() {
            return weiwai;
        }

        /**
         * Sets the value of the weiwai property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setWeiwai(Boolean value) {
            this.weiwai = value;
        }

        /**
         * Gets the value of the shengchanlingyong property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isShengchanlingyong() {
            return shengchanlingyong;
        }

        /**
         * Sets the value of the shengchanlingyong property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setShengchanlingyong(Boolean value) {
            this.shengchanlingyong = value;
        }

        /**
         * Gets the value of the shuxing property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getShuxing() {
            return shuxing;
        }

        /**
         * Sets the value of the shuxing property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setShuxing(Integer value) {
            this.shuxing = value;
        }

        /**
         * Gets the value of the hebingzhouqi property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getHebingzhouqi() {
            return hebingzhouqi;
        }

        /**
         * Sets the value of the hebingzhouqi property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setHebingzhouqi(Integer value) {
            this.hebingzhouqi = value;
        }

        /**
         * Gets the value of the zuidigongyingliang property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getZuidigongyingliang() {
            return zuidigongyingliang;
        }

        /**
         * Sets the value of the zuidigongyingliang property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setZuidigongyingliang(BigDecimal value) {
            this.zuidigongyingliang = value;
        }

        /**
         * Gets the value of the gongyingpiliang property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getGongyingpiliang() {
            return gongyingpiliang;
        }

        /**
         * Sets the value of the gongyingpiliang property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setGongyingpiliang(BigDecimal value) {
            this.gongyingpiliang = value;
        }

        /**
         * Gets the value of the tiqiangongying property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isTiqiangongying() {
            return tiqiangongying;
        }

        /**
         * Sets the value of the tiqiangongying property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setTiqiangongying(Boolean value) {
            this.tiqiangongying = value;
        }

        /**
         * Gets the value of the dijiema property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getDijiema() {
            return dijiema;
        }

        /**
         * Sets the value of the dijiema property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setDijiema(Integer value) {
            this.dijiema = value;
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
     *         &lt;element name="bianma" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element name="mingcheng">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="25"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="sunxuma" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element name="shifoumoji" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="leibielujing" minOccurs="0">
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
        "bianma",
        "mingcheng",
        "sunxuma",
        "shifoumoji",
        "leibielujing"
    })
    public static class Cunhuoleibie {

        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int id;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd", required = true)
        protected BigDecimal bianma;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd", required = true)
        protected String mingcheng;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd", required = true)
        protected BigDecimal sunxuma;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean shifoumoji;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String leibielujing;

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
         * Gets the value of the bianma property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getBianma() {
            return bianma;
        }

        /**
         * Sets the value of the bianma property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setBianma(BigDecimal value) {
            this.bianma = value;
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
         * Gets the value of the sunxuma property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getSunxuma() {
            return sunxuma;
        }

        /**
         * Sets the value of the sunxuma property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setSunxuma(BigDecimal value) {
            this.sunxuma = value;
        }

        /**
         * Gets the value of the shifoumoji property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isShifoumoji() {
            return shifoumoji;
        }

        /**
         * Sets the value of the shifoumoji property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setShifoumoji(Boolean value) {
            this.shifoumoji = value;
        }

        /**
         * Gets the value of the leibielujing property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLeibielujing() {
            return leibielujing;
        }

        /**
         * Sets the value of the leibielujing property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLeibielujing(String value) {
            this.leibielujing = value;
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
     *         &lt;element name="bianma">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="200"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="zhujifu" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="200"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="jiancheng">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="200"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="quancheng" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="200"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="suoshuleibieid" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="xingzhi">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="6"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="diqu" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="dizhi" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="200"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="youbian" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="10"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="dianhua" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="chuanzhen" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="email" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="wangzhi" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="lianxiren" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="200"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="shuiwudengjihao" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="kaihuyinhangzhanghao" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="70"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="kaipiaodizhidianhua" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="80"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="fuzerenid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="fukuanfangshiid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="dayinmobanid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="duifangcunhuozhubiaoid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="zonggongsiid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="tingyong" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="faren" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="quanxianzuid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="fenguanbumenid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="jilurenid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="jilushijian" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="xiugairenid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="xiugaishijian" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="zidingyi1" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="zidingyi2" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="zidingyi3" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="zidingyi4" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="zidingyi5" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="beizhu" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="1073741823"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="duizhaoma" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="zonghe" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="2000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="xinyongedu" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="yingshoudanju" minOccurs="0">
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
        "bianma",
        "zhujifu",
        "jiancheng",
        "quancheng",
        "suoshuleibieid",
        "xingzhi",
        "diqu",
        "dizhi",
        "youbian",
        "dianhua",
        "chuanzhen",
        "email",
        "wangzhi",
        "lianxiren",
        "shuiwudengjihao",
        "kaihuyinhangzhanghao",
        "kaipiaodizhidianhua",
        "fuzerenid",
        "fukuanfangshiid",
        "dayinmobanid",
        "duifangcunhuozhubiaoid",
        "zonggongsiid",
        "tingyong",
        "faren",
        "quanxianzuid",
        "fenguanbumenid",
        "jilurenid",
        "jilushijian",
        "xiugairenid",
        "xiugaishijian",
        "zidingyi1",
        "zidingyi2",
        "zidingyi3",
        "zidingyi4",
        "zidingyi5",
        "beizhu",
        "duizhaoma",
        "zonghe",
        "xinyongedu",
        "yingshoudanju"
    })
    public static class Danweidangan {

        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int id;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd", required = true)
        protected String bianma;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zhujifu;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd", required = true)
        protected String jiancheng;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String quancheng;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int suoshuleibieid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd", required = true)
        protected String xingzhi;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String diqu;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String dizhi;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String youbian;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String dianhua;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String chuanzhen;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String email;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String wangzhi;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String lianxiren;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String shuiwudengjihao;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String kaihuyinhangzhanghao;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String kaipiaodizhidianhua;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer fuzerenid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer fukuanfangshiid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer dayinmobanid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer duifangcunhuozhubiaoid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer zonggongsiid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean tingyong;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String faren;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer quanxianzuid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer fenguanbumenid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer jilurenid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar jilushijian;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer xiugairenid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar xiugaishijian;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zidingyi1;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zidingyi2;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zidingyi3;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected BigDecimal zidingyi4;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected BigDecimal zidingyi5;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String beizhu;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String duizhaoma;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zonghe;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected BigDecimal xinyongedu;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String yingshoudanju;

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
         * Gets the value of the bianma property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBianma() {
            return bianma;
        }

        /**
         * Sets the value of the bianma property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBianma(String value) {
            this.bianma = value;
        }

        /**
         * Gets the value of the zhujifu property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZhujifu() {
            return zhujifu;
        }

        /**
         * Sets the value of the zhujifu property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZhujifu(String value) {
            this.zhujifu = value;
        }

        /**
         * Gets the value of the jiancheng property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJiancheng() {
            return jiancheng;
        }

        /**
         * Sets the value of the jiancheng property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJiancheng(String value) {
            this.jiancheng = value;
        }

        /**
         * Gets the value of the quancheng property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQuancheng() {
            return quancheng;
        }

        /**
         * Sets the value of the quancheng property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQuancheng(String value) {
            this.quancheng = value;
        }

        /**
         * Gets the value of the suoshuleibieid property.
         * 
         */
        public int getSuoshuleibieid() {
            return suoshuleibieid;
        }

        /**
         * Sets the value of the suoshuleibieid property.
         * 
         */
        public void setSuoshuleibieid(int value) {
            this.suoshuleibieid = value;
        }

        /**
         * Gets the value of the xingzhi property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXingzhi() {
            return xingzhi;
        }

        /**
         * Sets the value of the xingzhi property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXingzhi(String value) {
            this.xingzhi = value;
        }

        /**
         * Gets the value of the diqu property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDiqu() {
            return diqu;
        }

        /**
         * Sets the value of the diqu property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDiqu(String value) {
            this.diqu = value;
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
         * Gets the value of the youbian property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getYoubian() {
            return youbian;
        }

        /**
         * Sets the value of the youbian property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setYoubian(String value) {
            this.youbian = value;
        }

        /**
         * Gets the value of the dianhua property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDianhua() {
            return dianhua;
        }

        /**
         * Sets the value of the dianhua property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDianhua(String value) {
            this.dianhua = value;
        }

        /**
         * Gets the value of the chuanzhen property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChuanzhen() {
            return chuanzhen;
        }

        /**
         * Sets the value of the chuanzhen property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChuanzhen(String value) {
            this.chuanzhen = value;
        }

        /**
         * Gets the value of the email property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmail() {
            return email;
        }

        /**
         * Sets the value of the email property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmail(String value) {
            this.email = value;
        }

        /**
         * Gets the value of the wangzhi property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWangzhi() {
            return wangzhi;
        }

        /**
         * Sets the value of the wangzhi property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWangzhi(String value) {
            this.wangzhi = value;
        }

        /**
         * Gets the value of the lianxiren property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLianxiren() {
            return lianxiren;
        }

        /**
         * Sets the value of the lianxiren property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLianxiren(String value) {
            this.lianxiren = value;
        }

        /**
         * Gets the value of the shuiwudengjihao property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShuiwudengjihao() {
            return shuiwudengjihao;
        }

        /**
         * Sets the value of the shuiwudengjihao property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShuiwudengjihao(String value) {
            this.shuiwudengjihao = value;
        }

        /**
         * Gets the value of the kaihuyinhangzhanghao property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKaihuyinhangzhanghao() {
            return kaihuyinhangzhanghao;
        }

        /**
         * Sets the value of the kaihuyinhangzhanghao property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKaihuyinhangzhanghao(String value) {
            this.kaihuyinhangzhanghao = value;
        }

        /**
         * Gets the value of the kaipiaodizhidianhua property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKaipiaodizhidianhua() {
            return kaipiaodizhidianhua;
        }

        /**
         * Sets the value of the kaipiaodizhidianhua property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKaipiaodizhidianhua(String value) {
            this.kaipiaodizhidianhua = value;
        }

        /**
         * Gets the value of the fuzerenid property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getFuzerenid() {
            return fuzerenid;
        }

        /**
         * Sets the value of the fuzerenid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setFuzerenid(Integer value) {
            this.fuzerenid = value;
        }

        /**
         * Gets the value of the fukuanfangshiid property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getFukuanfangshiid() {
            return fukuanfangshiid;
        }

        /**
         * Sets the value of the fukuanfangshiid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setFukuanfangshiid(Integer value) {
            this.fukuanfangshiid = value;
        }

        /**
         * Gets the value of the dayinmobanid property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getDayinmobanid() {
            return dayinmobanid;
        }

        /**
         * Sets the value of the dayinmobanid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setDayinmobanid(Integer value) {
            this.dayinmobanid = value;
        }

        /**
         * Gets the value of the duifangcunhuozhubiaoid property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getDuifangcunhuozhubiaoid() {
            return duifangcunhuozhubiaoid;
        }

        /**
         * Sets the value of the duifangcunhuozhubiaoid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setDuifangcunhuozhubiaoid(Integer value) {
            this.duifangcunhuozhubiaoid = value;
        }

        /**
         * Gets the value of the zonggongsiid property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getZonggongsiid() {
            return zonggongsiid;
        }

        /**
         * Sets the value of the zonggongsiid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setZonggongsiid(Integer value) {
            this.zonggongsiid = value;
        }

        /**
         * Gets the value of the tingyong property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isTingyong() {
            return tingyong;
        }

        /**
         * Sets the value of the tingyong property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setTingyong(Boolean value) {
            this.tingyong = value;
        }

        /**
         * Gets the value of the faren property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFaren() {
            return faren;
        }

        /**
         * Sets the value of the faren property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFaren(String value) {
            this.faren = value;
        }

        /**
         * Gets the value of the quanxianzuid property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getQuanxianzuid() {
            return quanxianzuid;
        }

        /**
         * Sets the value of the quanxianzuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setQuanxianzuid(Integer value) {
            this.quanxianzuid = value;
        }

        /**
         * Gets the value of the fenguanbumenid property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getFenguanbumenid() {
            return fenguanbumenid;
        }

        /**
         * Sets the value of the fenguanbumenid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setFenguanbumenid(Integer value) {
            this.fenguanbumenid = value;
        }

        /**
         * Gets the value of the jilurenid property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getJilurenid() {
            return jilurenid;
        }

        /**
         * Sets the value of the jilurenid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setJilurenid(Integer value) {
            this.jilurenid = value;
        }

        /**
         * Gets the value of the jilushijian property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getJilushijian() {
            return jilushijian;
        }

        /**
         * Sets the value of the jilushijian property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setJilushijian(XMLGregorianCalendar value) {
            this.jilushijian = value;
        }

        /**
         * Gets the value of the xiugairenid property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getXiugairenid() {
            return xiugairenid;
        }

        /**
         * Sets the value of the xiugairenid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setXiugairenid(Integer value) {
            this.xiugairenid = value;
        }

        /**
         * Gets the value of the xiugaishijian property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getXiugaishijian() {
            return xiugaishijian;
        }

        /**
         * Sets the value of the xiugaishijian property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setXiugaishijian(XMLGregorianCalendar value) {
            this.xiugaishijian = value;
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

        /**
         * Gets the value of the zidingyi4 property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getZidingyi4() {
            return zidingyi4;
        }

        /**
         * Sets the value of the zidingyi4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setZidingyi4(BigDecimal value) {
            this.zidingyi4 = value;
        }

        /**
         * Gets the value of the zidingyi5 property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getZidingyi5() {
            return zidingyi5;
        }

        /**
         * Sets the value of the zidingyi5 property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setZidingyi5(BigDecimal value) {
            this.zidingyi5 = value;
        }

        /**
         * Gets the value of the beizhu property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBeizhu() {
            return beizhu;
        }

        /**
         * Sets the value of the beizhu property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBeizhu(String value) {
            this.beizhu = value;
        }

        /**
         * Gets the value of the duizhaoma property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDuizhaoma() {
            return duizhaoma;
        }

        /**
         * Sets the value of the duizhaoma property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDuizhaoma(String value) {
            this.duizhaoma = value;
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
         * Gets the value of the xinyongedu property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getXinyongedu() {
            return xinyongedu;
        }

        /**
         * Sets the value of the xinyongedu property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setXinyongedu(BigDecimal value) {
            this.xinyongedu = value;
        }

        /**
         * Gets the value of the yingshoudanju property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getYingshoudanju() {
            return yingshoudanju;
        }

        /**
         * Sets the value of the yingshoudanju property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setYingshoudanju(String value) {
            this.yingshoudanju = value;
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
     *         &lt;element name="danweiid" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="jiadanid" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="bianhao" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="beizhu" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="riqi" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="danjuleixing" minOccurs="0">
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
        "danweiid",
        "jiadanid",
        "bianhao",
        "beizhu",
        "riqi",
        "danjuleixing"
    })
    public static class Danweijd {

        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int id;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int danweiid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int jiadanid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String bianhao;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String beizhu;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar riqi;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String danjuleixing;

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
         * Gets the value of the jiadanid property.
         * 
         */
        public int getJiadanid() {
            return jiadanid;
        }

        /**
         * Sets the value of the jiadanid property.
         * 
         */
        public void setJiadanid(int value) {
            this.jiadanid = value;
        }

        /**
         * Gets the value of the bianhao property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBianhao() {
            return bianhao;
        }

        /**
         * Sets the value of the bianhao property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBianhao(String value) {
            this.bianhao = value;
        }

        /**
         * Gets the value of the beizhu property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBeizhu() {
            return beizhu;
        }

        /**
         * Sets the value of the beizhu property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBeizhu(String value) {
            this.beizhu = value;
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
         * Gets the value of the danjuleixing property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDanjuleixing() {
            return danjuleixing;
        }

        /**
         * Sets the value of the danjuleixing property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDanjuleixing(String value) {
            this.danjuleixing = value;
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
     *         &lt;element name="bianma" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element name="mingcheng" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="30"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="sunxuma" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="shifoumoji" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="leibielujing" minOccurs="0">
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
        "bianma",
        "mingcheng",
        "sunxuma",
        "shifoumoji",
        "leibielujing"
    })
    public static class Danweileibie {

        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int id;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd", required = true)
        protected BigDecimal bianma;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String mingcheng;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected BigDecimal sunxuma;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean shifoumoji;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String leibielujing;

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
         * Gets the value of the bianma property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getBianma() {
            return bianma;
        }

        /**
         * Sets the value of the bianma property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setBianma(BigDecimal value) {
            this.bianma = value;
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
         * Gets the value of the sunxuma property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getSunxuma() {
            return sunxuma;
        }

        /**
         * Sets the value of the sunxuma property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setSunxuma(BigDecimal value) {
            this.sunxuma = value;
        }

        /**
         * Gets the value of the shifoumoji property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isShifoumoji() {
            return shifoumoji;
        }

        /**
         * Sets the value of the shifoumoji property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setShifoumoji(Boolean value) {
            this.shifoumoji = value;
        }

        /**
         * Gets the value of the leibielujing property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLeibielujing() {
            return leibielujing;
        }

        /**
         * Sets the value of the leibielujing property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLeibielujing(String value) {
            this.leibielujing = value;
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
     *         &lt;element name="danweiid" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="bianma" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="100"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="zhujifu" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="200"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="jiancheng" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="200"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="quancheng" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="200"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="diqu" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="dizhi" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="200"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="youbian" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="dianhua" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="200"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="chuanzhen" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="email" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="100"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="wangzhi" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="100"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="lianxiren" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="100"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="shuiwudengjihao" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="kaihuyinhangzhanghao" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="100"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="kaipiaodizhidianhua" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="100"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="renyuandangan_id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="tingyong" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="zidingyi1" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="zidingyi2" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="zidingyi3" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="zidingyi4" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="zidingyi5" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="beizhu" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="moren" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        "bianma",
        "zhujifu",
        "jiancheng",
        "quancheng",
        "diqu",
        "dizhi",
        "youbian",
        "dianhua",
        "chuanzhen",
        "email",
        "wangzhi",
        "lianxiren",
        "shuiwudengjihao",
        "kaihuyinhangzhanghao",
        "kaipiaodizhidianhua",
        "renyuandanganId",
        "tingyong",
        "zidingyi1",
        "zidingyi2",
        "zidingyi3",
        "zidingyi4",
        "zidingyi5",
        "beizhu",
        "moren"
    })
    public static class Danweixiashujigou {

        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int id;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int danweiid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String bianma;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zhujifu;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String jiancheng;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String quancheng;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String diqu;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String dizhi;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String youbian;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String dianhua;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String chuanzhen;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String email;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String wangzhi;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String lianxiren;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String shuiwudengjihao;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String kaihuyinhangzhanghao;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String kaipiaodizhidianhua;
        @XmlElement(name = "renyuandangan_id", namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer renyuandanganId;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean tingyong;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zidingyi1;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zidingyi2;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zidingyi3;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zidingyi4;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zidingyi5;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String beizhu;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean moren;

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
         * Gets the value of the bianma property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBianma() {
            return bianma;
        }

        /**
         * Sets the value of the bianma property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBianma(String value) {
            this.bianma = value;
        }

        /**
         * Gets the value of the zhujifu property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZhujifu() {
            return zhujifu;
        }

        /**
         * Sets the value of the zhujifu property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZhujifu(String value) {
            this.zhujifu = value;
        }

        /**
         * Gets the value of the jiancheng property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJiancheng() {
            return jiancheng;
        }

        /**
         * Sets the value of the jiancheng property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJiancheng(String value) {
            this.jiancheng = value;
        }

        /**
         * Gets the value of the quancheng property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQuancheng() {
            return quancheng;
        }

        /**
         * Sets the value of the quancheng property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQuancheng(String value) {
            this.quancheng = value;
        }

        /**
         * Gets the value of the diqu property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDiqu() {
            return diqu;
        }

        /**
         * Sets the value of the diqu property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDiqu(String value) {
            this.diqu = value;
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
         * Gets the value of the youbian property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getYoubian() {
            return youbian;
        }

        /**
         * Sets the value of the youbian property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setYoubian(String value) {
            this.youbian = value;
        }

        /**
         * Gets the value of the dianhua property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDianhua() {
            return dianhua;
        }

        /**
         * Sets the value of the dianhua property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDianhua(String value) {
            this.dianhua = value;
        }

        /**
         * Gets the value of the chuanzhen property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChuanzhen() {
            return chuanzhen;
        }

        /**
         * Sets the value of the chuanzhen property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChuanzhen(String value) {
            this.chuanzhen = value;
        }

        /**
         * Gets the value of the email property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmail() {
            return email;
        }

        /**
         * Sets the value of the email property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmail(String value) {
            this.email = value;
        }

        /**
         * Gets the value of the wangzhi property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWangzhi() {
            return wangzhi;
        }

        /**
         * Sets the value of the wangzhi property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWangzhi(String value) {
            this.wangzhi = value;
        }

        /**
         * Gets the value of the lianxiren property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLianxiren() {
            return lianxiren;
        }

        /**
         * Sets the value of the lianxiren property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLianxiren(String value) {
            this.lianxiren = value;
        }

        /**
         * Gets the value of the shuiwudengjihao property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShuiwudengjihao() {
            return shuiwudengjihao;
        }

        /**
         * Sets the value of the shuiwudengjihao property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShuiwudengjihao(String value) {
            this.shuiwudengjihao = value;
        }

        /**
         * Gets the value of the kaihuyinhangzhanghao property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKaihuyinhangzhanghao() {
            return kaihuyinhangzhanghao;
        }

        /**
         * Sets the value of the kaihuyinhangzhanghao property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKaihuyinhangzhanghao(String value) {
            this.kaihuyinhangzhanghao = value;
        }

        /**
         * Gets the value of the kaipiaodizhidianhua property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKaipiaodizhidianhua() {
            return kaipiaodizhidianhua;
        }

        /**
         * Sets the value of the kaipiaodizhidianhua property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKaipiaodizhidianhua(String value) {
            this.kaipiaodizhidianhua = value;
        }

        /**
         * Gets the value of the renyuandanganId property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getRenyuandanganId() {
            return renyuandanganId;
        }

        /**
         * Sets the value of the renyuandanganId property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setRenyuandanganId(Integer value) {
            this.renyuandanganId = value;
        }

        /**
         * Gets the value of the tingyong property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isTingyong() {
            return tingyong;
        }

        /**
         * Sets the value of the tingyong property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setTingyong(Boolean value) {
            this.tingyong = value;
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

        /**
         * Gets the value of the zidingyi4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZidingyi4() {
            return zidingyi4;
        }

        /**
         * Sets the value of the zidingyi4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZidingyi4(String value) {
            this.zidingyi4 = value;
        }

        /**
         * Gets the value of the zidingyi5 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZidingyi5() {
            return zidingyi5;
        }

        /**
         * Sets the value of the zidingyi5 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZidingyi5(String value) {
            this.zidingyi5 = value;
        }

        /**
         * Gets the value of the beizhu property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBeizhu() {
            return beizhu;
        }

        /**
         * Sets the value of the beizhu property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBeizhu(String value) {
            this.beizhu = value;
        }

        /**
         * Gets the value of the moren property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isMoren() {
            return moren;
        }

        /**
         * Sets the value of the moren property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setMoren(Boolean value) {
            this.moren = value;
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
     *         &lt;element name="yewuid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="lie" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="100"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="mingcheng" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="100"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="zonghe" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="300"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="xuhao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
        "yewuid",
        "lie",
        "mingcheng",
        "zonghe",
        "xuhao"
    })
    public static class Datiaojian {

        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int id;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer yewuid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String lie;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String mingcheng;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zonghe;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer xuhao;

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
         * Gets the value of the lie property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLie() {
            return lie;
        }

        /**
         * Sets the value of the lie property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLie(String value) {
            this.lie = value;
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
         * Gets the value of the xuhao property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getXuhao() {
            return xuhao;
        }

        /**
         * Sets the value of the xuhao property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setXuhao(Integer value) {
            this.xuhao = value;
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
     *         &lt;element name="bianma" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="mingcheng" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="danganbiaoming" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="100"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="shifoumoji" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        "bianma",
        "mingcheng",
        "danganbiaoming",
        "shifoumoji"
    })
    public static class Duizhaomajibenbiao {

        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int id;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected BigDecimal bianma;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String mingcheng;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String danganbiaoming;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean shifoumoji;

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
         * Gets the value of the bianma property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getBianma() {
            return bianma;
        }

        /**
         * Sets the value of the bianma property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setBianma(BigDecimal value) {
            this.bianma = value;
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
         * Gets the value of the danganbiaoming property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDanganbiaoming() {
            return danganbiaoming;
        }

        /**
         * Sets the value of the danganbiaoming property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDanganbiaoming(String value) {
            this.danganbiaoming = value;
        }

        /**
         * Gets the value of the shifoumoji property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isShifoumoji() {
            return shifoumoji;
        }

        /**
         * Sets the value of the shifoumoji property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setShifoumoji(Boolean value) {
            this.shifoumoji = value;
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
     *         &lt;element name="xuhao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="mobanid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="mingcheng" minOccurs="0">
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
     *         &lt;element name="h1" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="h2" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="h3" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="zhijiedayin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="zonghe" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="1000"/>
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
        "xuhao",
        "mobanid",
        "mingcheng",
        "lujing",
        "h1",
        "h2",
        "h3",
        "zhijiedayin",
        "zonghe"
    })
    public static class EXdayinmoban {

        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int id;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer xuhao;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer mobanid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String mingcheng;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String lujing;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String h1;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String h2;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String h3;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean zhijiedayin;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zonghe;

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
         * Gets the value of the xuhao property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getXuhao() {
            return xuhao;
        }

        /**
         * Sets the value of the xuhao property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setXuhao(Integer value) {
            this.xuhao = value;
        }

        /**
         * Gets the value of the mobanid property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getMobanid() {
            return mobanid;
        }

        /**
         * Sets the value of the mobanid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setMobanid(Integer value) {
            this.mobanid = value;
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
         * Gets the value of the h1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getH1() {
            return h1;
        }

        /**
         * Sets the value of the h1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setH1(String value) {
            this.h1 = value;
        }

        /**
         * Gets the value of the h2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getH2() {
            return h2;
        }

        /**
         * Sets the value of the h2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setH2(String value) {
            this.h2 = value;
        }

        /**
         * Gets the value of the h3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getH3() {
            return h3;
        }

        /**
         * Sets the value of the h3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setH3(String value) {
            this.h3 = value;
        }

        /**
         * Gets the value of the zhijiedayin property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isZhijiedayin() {
            return zhijiedayin;
        }

        /**
         * Sets the value of the zhijiedayin property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setZhijiedayin(Boolean value) {
            this.zhijiedayin = value;
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
     *         &lt;element name="bianma" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="mingcheng" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="leixing" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="iskcbzx" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="zidingyi1" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="zidingyi2" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="suoshuleibieid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
        "bianma",
        "mingcheng",
        "leixing",
        "iskcbzx",
        "zidingyi1",
        "zidingyi2",
        "suoshuleibieid"
    })
    public static class Feiyongdangan {

        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int id;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String bianma;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String mingcheng;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer leixing;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean iskcbzx;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zidingyi1;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zidingyi2;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer suoshuleibieid;

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
         * Gets the value of the bianma property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBianma() {
            return bianma;
        }

        /**
         * Sets the value of the bianma property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBianma(String value) {
            this.bianma = value;
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
         * Gets the value of the leixing property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getLeixing() {
            return leixing;
        }

        /**
         * Sets the value of the leixing property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setLeixing(Integer value) {
            this.leixing = value;
        }

        /**
         * Gets the value of the iskcbzx property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIskcbzx() {
            return iskcbzx;
        }

        /**
         * Sets the value of the iskcbzx property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIskcbzx(Boolean value) {
            this.iskcbzx = value;
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
     *         &lt;element name="bianma" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element name="mingcheng">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="25"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="sunxuma" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element name="shifoumoji" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="leibielujing" minOccurs="0">
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
        "bianma",
        "mingcheng",
        "sunxuma",
        "shifoumoji",
        "leibielujing"
    })
    public static class Feiyongleibie {

        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int id;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd", required = true)
        protected BigDecimal bianma;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd", required = true)
        protected String mingcheng;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd", required = true)
        protected BigDecimal sunxuma;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean shifoumoji;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String leibielujing;

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
         * Gets the value of the bianma property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getBianma() {
            return bianma;
        }

        /**
         * Sets the value of the bianma property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setBianma(BigDecimal value) {
            this.bianma = value;
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
         * Gets the value of the sunxuma property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getSunxuma() {
            return sunxuma;
        }

        /**
         * Sets the value of the sunxuma property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setSunxuma(BigDecimal value) {
            this.sunxuma = value;
        }

        /**
         * Gets the value of the shifoumoji property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isShifoumoji() {
            return shifoumoji;
        }

        /**
         * Sets the value of the shifoumoji property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setShifoumoji(Boolean value) {
            this.shifoumoji = value;
        }

        /**
         * Gets the value of the leibielujing property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLeibielujing() {
            return leibielujing;
        }

        /**
         * Sets the value of the leibielujing property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLeibielujing(String value) {
            this.leibielujing = value;
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
     *         &lt;element name="bianma">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="jiekuantianshu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="jiepiaotianshu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="jiepiaoshidian1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="jiepiaoshidian2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="jiepiaoshidian3" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="jiekuanshidian1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="jiekuanshidian2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="jiekuanshidian3" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="fahuoshifoujisuanzhangqi" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="beizhu" minOccurs="0">
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
        "bianma",
        "jiekuantianshu",
        "jiepiaotianshu",
        "jiepiaoshidian1",
        "jiepiaoshidian2",
        "jiepiaoshidian3",
        "jiekuanshidian1",
        "jiekuanshidian2",
        "jiekuanshidian3",
        "fahuoshifoujisuanzhangqi",
        "beizhu"
    })
    public static class Fukuantiaojian {

        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int id;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd", required = true)
        protected String bianma;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer jiekuantianshu;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer jiepiaotianshu;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer jiepiaoshidian1;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer jiepiaoshidian2;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer jiepiaoshidian3;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer jiekuanshidian1;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer jiekuanshidian2;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer jiekuanshidian3;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean fahuoshifoujisuanzhangqi;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String beizhu;

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
         * Gets the value of the bianma property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBianma() {
            return bianma;
        }

        /**
         * Sets the value of the bianma property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBianma(String value) {
            this.bianma = value;
        }

        /**
         * Gets the value of the jiekuantianshu property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getJiekuantianshu() {
            return jiekuantianshu;
        }

        /**
         * Sets the value of the jiekuantianshu property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setJiekuantianshu(Integer value) {
            this.jiekuantianshu = value;
        }

        /**
         * Gets the value of the jiepiaotianshu property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getJiepiaotianshu() {
            return jiepiaotianshu;
        }

        /**
         * Sets the value of the jiepiaotianshu property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setJiepiaotianshu(Integer value) {
            this.jiepiaotianshu = value;
        }

        /**
         * Gets the value of the jiepiaoshidian1 property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getJiepiaoshidian1() {
            return jiepiaoshidian1;
        }

        /**
         * Sets the value of the jiepiaoshidian1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setJiepiaoshidian1(Integer value) {
            this.jiepiaoshidian1 = value;
        }

        /**
         * Gets the value of the jiepiaoshidian2 property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getJiepiaoshidian2() {
            return jiepiaoshidian2;
        }

        /**
         * Sets the value of the jiepiaoshidian2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setJiepiaoshidian2(Integer value) {
            this.jiepiaoshidian2 = value;
        }

        /**
         * Gets the value of the jiepiaoshidian3 property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getJiepiaoshidian3() {
            return jiepiaoshidian3;
        }

        /**
         * Sets the value of the jiepiaoshidian3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setJiepiaoshidian3(Integer value) {
            this.jiepiaoshidian3 = value;
        }

        /**
         * Gets the value of the jiekuanshidian1 property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getJiekuanshidian1() {
            return jiekuanshidian1;
        }

        /**
         * Sets the value of the jiekuanshidian1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setJiekuanshidian1(Integer value) {
            this.jiekuanshidian1 = value;
        }

        /**
         * Gets the value of the jiekuanshidian2 property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getJiekuanshidian2() {
            return jiekuanshidian2;
        }

        /**
         * Sets the value of the jiekuanshidian2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setJiekuanshidian2(Integer value) {
            this.jiekuanshidian2 = value;
        }

        /**
         * Gets the value of the jiekuanshidian3 property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getJiekuanshidian3() {
            return jiekuanshidian3;
        }

        /**
         * Sets the value of the jiekuanshidian3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setJiekuanshidian3(Integer value) {
            this.jiekuanshidian3 = value;
        }

        /**
         * Gets the value of the fahuoshifoujisuanzhangqi property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFahuoshifoujisuanzhangqi() {
            return fahuoshifoujisuanzhangqi;
        }

        /**
         * Sets the value of the fahuoshifoujisuanzhangqi property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFahuoshifoujisuanzhangqi(Boolean value) {
            this.fahuoshifoujisuanzhangqi = value;
        }

        /**
         * Gets the value of the beizhu property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBeizhu() {
            return beizhu;
        }

        /**
         * Sets the value of the beizhu property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBeizhu(String value) {
            this.beizhu = value;
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
     *         &lt;element name="yewuid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="yijileixing" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="erjileixing" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="sanjileixing" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="sijileixing" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="wujileixing" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="liuchengwaichuli" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="zhongshencengji" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="zhubiaozuotiaojian" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="1000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="guanxi" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="zibiaotiaojian" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="1000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="fuzhu" minOccurs="0">
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
        "yewuid",
        "yijileixing",
        "erjileixing",
        "sanjileixing",
        "sijileixing",
        "wujileixing",
        "liuchengwaichuli",
        "zhongshencengji",
        "zhubiaozuotiaojian",
        "guanxi",
        "zibiaotiaojian",
        "fuzhu"
    })
    public static class Gongzuoliuzhubiao {

        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int id;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer yewuid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer yijileixing;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer erjileixing;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer sanjileixing;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer sijileixing;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer wujileixing;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean liuchengwaichuli;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer zhongshencengji;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zhubiaozuotiaojian;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String guanxi;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zibiaotiaojian;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String fuzhu;

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
         * Gets the value of the yijileixing property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getYijileixing() {
            return yijileixing;
        }

        /**
         * Sets the value of the yijileixing property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setYijileixing(Integer value) {
            this.yijileixing = value;
        }

        /**
         * Gets the value of the erjileixing property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getErjileixing() {
            return erjileixing;
        }

        /**
         * Sets the value of the erjileixing property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setErjileixing(Integer value) {
            this.erjileixing = value;
        }

        /**
         * Gets the value of the sanjileixing property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getSanjileixing() {
            return sanjileixing;
        }

        /**
         * Sets the value of the sanjileixing property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setSanjileixing(Integer value) {
            this.sanjileixing = value;
        }

        /**
         * Gets the value of the sijileixing property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getSijileixing() {
            return sijileixing;
        }

        /**
         * Sets the value of the sijileixing property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setSijileixing(Integer value) {
            this.sijileixing = value;
        }

        /**
         * Gets the value of the wujileixing property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getWujileixing() {
            return wujileixing;
        }

        /**
         * Sets the value of the wujileixing property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setWujileixing(Integer value) {
            this.wujileixing = value;
        }

        /**
         * Gets the value of the liuchengwaichuli property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isLiuchengwaichuli() {
            return liuchengwaichuli;
        }

        /**
         * Sets the value of the liuchengwaichuli property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setLiuchengwaichuli(Boolean value) {
            this.liuchengwaichuli = value;
        }

        /**
         * Gets the value of the zhongshencengji property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getZhongshencengji() {
            return zhongshencengji;
        }

        /**
         * Sets the value of the zhongshencengji property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setZhongshencengji(Integer value) {
            this.zhongshencengji = value;
        }

        /**
         * Gets the value of the zhubiaozuotiaojian property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZhubiaozuotiaojian() {
            return zhubiaozuotiaojian;
        }

        /**
         * Sets the value of the zhubiaozuotiaojian property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZhubiaozuotiaojian(String value) {
            this.zhubiaozuotiaojian = value;
        }

        /**
         * Gets the value of the guanxi property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGuanxi() {
            return guanxi;
        }

        /**
         * Sets the value of the guanxi property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGuanxi(String value) {
            this.guanxi = value;
        }

        /**
         * Gets the value of the zibiaotiaojian property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZibiaotiaojian() {
            return zibiaotiaojian;
        }

        /**
         * Sets the value of the zibiaotiaojian property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZibiaotiaojian(String value) {
            this.zibiaotiaojian = value;
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
     *         &lt;element name="chengji" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="yhid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="duanxintongzhi" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="youjiantongzhi" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="pingtaitongzhi" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="cengji" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="zhubiaozuoziduan" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="200"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="zhubiaofuhao" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="zhubiaoyouziduan" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="200"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="fuzhu" minOccurs="0">
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
        "zhubiaoid",
        "chengji",
        "yhid",
        "duanxintongzhi",
        "youjiantongzhi",
        "pingtaitongzhi",
        "cengji",
        "zhubiaozuoziduan",
        "zhubiaofuhao",
        "zhubiaoyouziduan",
        "fuzhu"
    })
    public static class Gongzuoliuzibiao {

        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int id;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer zhubiaoid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer chengji;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer yhid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean duanxintongzhi;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean youjiantongzhi;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean pingtaitongzhi;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer cengji;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zhubiaozuoziduan;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zhubiaofuhao;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zhubiaoyouziduan;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String fuzhu;

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
         * Gets the value of the chengji property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getChengji() {
            return chengji;
        }

        /**
         * Sets the value of the chengji property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setChengji(Integer value) {
            this.chengji = value;
        }

        /**
         * Gets the value of the yhid property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getYhid() {
            return yhid;
        }

        /**
         * Sets the value of the yhid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setYhid(Integer value) {
            this.yhid = value;
        }

        /**
         * Gets the value of the duanxintongzhi property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDuanxintongzhi() {
            return duanxintongzhi;
        }

        /**
         * Sets the value of the duanxintongzhi property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDuanxintongzhi(Boolean value) {
            this.duanxintongzhi = value;
        }

        /**
         * Gets the value of the youjiantongzhi property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isYoujiantongzhi() {
            return youjiantongzhi;
        }

        /**
         * Sets the value of the youjiantongzhi property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setYoujiantongzhi(Boolean value) {
            this.youjiantongzhi = value;
        }

        /**
         * Gets the value of the pingtaitongzhi property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPingtaitongzhi() {
            return pingtaitongzhi;
        }

        /**
         * Sets the value of the pingtaitongzhi property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPingtaitongzhi(Boolean value) {
            this.pingtaitongzhi = value;
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
         * Gets the value of the zhubiaozuoziduan property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZhubiaozuoziduan() {
            return zhubiaozuoziduan;
        }

        /**
         * Sets the value of the zhubiaozuoziduan property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZhubiaozuoziduan(String value) {
            this.zhubiaozuoziduan = value;
        }

        /**
         * Gets the value of the zhubiaofuhao property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZhubiaofuhao() {
            return zhubiaofuhao;
        }

        /**
         * Sets the value of the zhubiaofuhao property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZhubiaofuhao(String value) {
            this.zhubiaofuhao = value;
        }

        /**
         * Gets the value of the zhubiaoyouziduan property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZhubiaoyouziduan() {
            return zhubiaoyouziduan;
        }

        /**
         * Sets the value of the zhubiaoyouziduan property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZhubiaoyouziduan(String value) {
            this.zhubiaoyouziduan = value;
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
     *         &lt;element name="bianma">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="mingcheng">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="cangkuid" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="zuidatiji" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="zuidazhongliang" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="zidingyi1" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="10"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="zidingyi2" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="10"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="zhujifu" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="suoshuleibieid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="tingyong" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        "bianma",
        "mingcheng",
        "cangkuid",
        "zuidatiji",
        "zuidazhongliang",
        "zidingyi1",
        "zidingyi2",
        "zhujifu",
        "suoshuleibieid",
        "tingyong"
    })
    public static class Huoweidangan {

        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int id;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd", required = true)
        protected String bianma;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd", required = true)
        protected String mingcheng;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int cangkuid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected BigDecimal zuidatiji;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected BigDecimal zuidazhongliang;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zidingyi1;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zidingyi2;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zhujifu;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer suoshuleibieid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean tingyong;

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
         * Gets the value of the bianma property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBianma() {
            return bianma;
        }

        /**
         * Sets the value of the bianma property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBianma(String value) {
            this.bianma = value;
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
         * Gets the value of the zuidatiji property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getZuidatiji() {
            return zuidatiji;
        }

        /**
         * Sets the value of the zuidatiji property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setZuidatiji(BigDecimal value) {
            this.zuidatiji = value;
        }

        /**
         * Gets the value of the zuidazhongliang property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getZuidazhongliang() {
            return zuidazhongliang;
        }

        /**
         * Sets the value of the zuidazhongliang property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setZuidazhongliang(BigDecimal value) {
            this.zuidazhongliang = value;
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
         * Gets the value of the zhujifu property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZhujifu() {
            return zhujifu;
        }

        /**
         * Sets the value of the zhujifu property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZhujifu(String value) {
            this.zhujifu = value;
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
         * Gets the value of the tingyong property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isTingyong() {
            return tingyong;
        }

        /**
         * Sets the value of the tingyong property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setTingyong(Boolean value) {
            this.tingyong = value;
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
     *         &lt;element name="bianma" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="mingcheng" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="shifoumoji" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="sunxuma" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="leibielujing" minOccurs="0">
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
        "bianma",
        "mingcheng",
        "shifoumoji",
        "sunxuma",
        "leibielujing"
    })
    public static class Huoweileibie {

        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int id;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected BigDecimal bianma;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String mingcheng;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean shifoumoji;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected BigDecimal sunxuma;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String leibielujing;

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
         * Gets the value of the bianma property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getBianma() {
            return bianma;
        }

        /**
         * Sets the value of the bianma property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setBianma(BigDecimal value) {
            this.bianma = value;
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
         * Gets the value of the shifoumoji property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isShifoumoji() {
            return shifoumoji;
        }

        /**
         * Sets the value of the shifoumoji property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setShifoumoji(Boolean value) {
            this.shifoumoji = value;
        }

        /**
         * Gets the value of the sunxuma property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getSunxuma() {
            return sunxuma;
        }

        /**
         * Sets the value of the sunxuma property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setSunxuma(BigDecimal value) {
            this.sunxuma = value;
        }

        /**
         * Gets the value of the leibielujing property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLeibielujing() {
            return leibielujing;
        }

        /**
         * Sets the value of the leibielujing property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLeibielujing(String value) {
            this.leibielujing = value;
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
     *         &lt;element name="qijianid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="mokuai" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="100"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="isjiezhang" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="shuihuid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
        "qijianid",
        "mokuai",
        "isjiezhang",
        "shuihuid"
    })
    public static class Jiezhangbiaoshi {

        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int id;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer qijianid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String mokuai;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean isjiezhang;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer shuihuid;

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
         * Gets the value of the qijianid property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getQijianid() {
            return qijianid;
        }

        /**
         * Sets the value of the qijianid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setQijianid(Integer value) {
            this.qijianid = value;
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
         * Gets the value of the isjiezhang property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsjiezhang() {
            return isjiezhang;
        }

        /**
         * Sets the value of the isjiezhang property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIsjiezhang(Boolean value) {
            this.isjiezhang = value;
        }

        /**
         * Gets the value of the shuihuid property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getShuihuid() {
            return shuihuid;
        }

        /**
         * Sets the value of the shuihuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setShuihuid(Integer value) {
            this.shuihuid = value;
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
     *         &lt;element name="canshuid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="kexuanzhi" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="20"/>
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
        "canshuid",
        "kexuanzhi"
    })
    public static class Kexuanchanshuzhi {

        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int id;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer canshuid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String kexuanzhi;

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
         * Gets the value of the canshuid property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCanshuid() {
            return canshuid;
        }

        /**
         * Sets the value of the canshuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCanshuid(Integer value) {
            this.canshuid = value;
        }

        /**
         * Gets the value of the kexuanzhi property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKexuanzhi() {
            return kexuanzhi;
        }

        /**
         * Sets the value of the kexuanzhi property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKexuanzhi(String value) {
            this.kexuanzhi = value;
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
     *         &lt;element name="shuihuid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="bianma" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="bianmam" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="mingcheng" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="26"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="bizhongid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="danweiwanglai" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="gerenwanglai" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="bumenhesuan" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="xiangmuhesuan" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="xiangmuid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="yinhangkemu" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="xianjinkemu" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="yuefangxiang" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="4"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="tingyong" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="suoshuleibieid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="emingcheng" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="26"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="yingshoukemu" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="yingfukemu" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="iswaibi" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="zhujifu" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="100"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="shifoumoji" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="sunxuma" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="xiashujg" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        "shuihuid",
        "bianma",
        "bianmam",
        "mingcheng",
        "bizhongid",
        "danweiwanglai",
        "gerenwanglai",
        "bumenhesuan",
        "xiangmuhesuan",
        "xiangmuid",
        "yinhangkemu",
        "xianjinkemu",
        "yuefangxiang",
        "tingyong",
        "suoshuleibieid",
        "emingcheng",
        "yingshoukemu",
        "yingfukemu",
        "iswaibi",
        "zhujifu",
        "shifoumoji",
        "sunxuma",
        "xiashujg"
    })
    public static class Kuaijikemu {

        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int id;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer shuihuid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected BigDecimal bianma;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String bianmam;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String mingcheng;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer bizhongid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean danweiwanglai;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean gerenwanglai;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean bumenhesuan;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean xiangmuhesuan;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer xiangmuid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean yinhangkemu;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean xianjinkemu;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String yuefangxiang;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean tingyong;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer suoshuleibieid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String emingcheng;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean yingshoukemu;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean yingfukemu;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean iswaibi;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zhujifu;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean shifoumoji;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected BigDecimal sunxuma;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean xiashujg;

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
         * Gets the value of the shuihuid property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getShuihuid() {
            return shuihuid;
        }

        /**
         * Sets the value of the shuihuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setShuihuid(Integer value) {
            this.shuihuid = value;
        }

        /**
         * Gets the value of the bianma property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getBianma() {
            return bianma;
        }

        /**
         * Sets the value of the bianma property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setBianma(BigDecimal value) {
            this.bianma = value;
        }

        /**
         * Gets the value of the bianmam property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBianmam() {
            return bianmam;
        }

        /**
         * Sets the value of the bianmam property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBianmam(String value) {
            this.bianmam = value;
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

        /**
         * Gets the value of the danweiwanglai property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDanweiwanglai() {
            return danweiwanglai;
        }

        /**
         * Sets the value of the danweiwanglai property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDanweiwanglai(Boolean value) {
            this.danweiwanglai = value;
        }

        /**
         * Gets the value of the gerenwanglai property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isGerenwanglai() {
            return gerenwanglai;
        }

        /**
         * Sets the value of the gerenwanglai property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setGerenwanglai(Boolean value) {
            this.gerenwanglai = value;
        }

        /**
         * Gets the value of the bumenhesuan property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isBumenhesuan() {
            return bumenhesuan;
        }

        /**
         * Sets the value of the bumenhesuan property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setBumenhesuan(Boolean value) {
            this.bumenhesuan = value;
        }

        /**
         * Gets the value of the xiangmuhesuan property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isXiangmuhesuan() {
            return xiangmuhesuan;
        }

        /**
         * Sets the value of the xiangmuhesuan property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setXiangmuhesuan(Boolean value) {
            this.xiangmuhesuan = value;
        }

        /**
         * Gets the value of the xiangmuid property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getXiangmuid() {
            return xiangmuid;
        }

        /**
         * Sets the value of the xiangmuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setXiangmuid(Integer value) {
            this.xiangmuid = value;
        }

        /**
         * Gets the value of the yinhangkemu property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isYinhangkemu() {
            return yinhangkemu;
        }

        /**
         * Sets the value of the yinhangkemu property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setYinhangkemu(Boolean value) {
            this.yinhangkemu = value;
        }

        /**
         * Gets the value of the xianjinkemu property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isXianjinkemu() {
            return xianjinkemu;
        }

        /**
         * Sets the value of the xianjinkemu property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setXianjinkemu(Boolean value) {
            this.xianjinkemu = value;
        }

        /**
         * Gets the value of the yuefangxiang property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getYuefangxiang() {
            return yuefangxiang;
        }

        /**
         * Sets the value of the yuefangxiang property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setYuefangxiang(String value) {
            this.yuefangxiang = value;
        }

        /**
         * Gets the value of the tingyong property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isTingyong() {
            return tingyong;
        }

        /**
         * Sets the value of the tingyong property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setTingyong(Boolean value) {
            this.tingyong = value;
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
         * Gets the value of the emingcheng property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmingcheng() {
            return emingcheng;
        }

        /**
         * Sets the value of the emingcheng property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmingcheng(String value) {
            this.emingcheng = value;
        }

        /**
         * Gets the value of the yingshoukemu property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isYingshoukemu() {
            return yingshoukemu;
        }

        /**
         * Sets the value of the yingshoukemu property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setYingshoukemu(Boolean value) {
            this.yingshoukemu = value;
        }

        /**
         * Gets the value of the yingfukemu property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isYingfukemu() {
            return yingfukemu;
        }

        /**
         * Sets the value of the yingfukemu property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setYingfukemu(Boolean value) {
            this.yingfukemu = value;
        }

        /**
         * Gets the value of the iswaibi property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIswaibi() {
            return iswaibi;
        }

        /**
         * Sets the value of the iswaibi property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIswaibi(Boolean value) {
            this.iswaibi = value;
        }

        /**
         * Gets the value of the zhujifu property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZhujifu() {
            return zhujifu;
        }

        /**
         * Sets the value of the zhujifu property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZhujifu(String value) {
            this.zhujifu = value;
        }

        /**
         * Gets the value of the shifoumoji property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isShifoumoji() {
            return shifoumoji;
        }

        /**
         * Sets the value of the shifoumoji property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setShifoumoji(Boolean value) {
            this.shifoumoji = value;
        }

        /**
         * Gets the value of the sunxuma property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getSunxuma() {
            return sunxuma;
        }

        /**
         * Sets the value of the sunxuma property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setSunxuma(BigDecimal value) {
            this.sunxuma = value;
        }

        /**
         * Gets the value of the xiashujg property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isXiashujg() {
            return xiashujg;
        }

        /**
         * Sets the value of the xiashujg property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setXiashujg(Boolean value) {
            this.xiashujg = value;
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
     *         &lt;element name="shuihuid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="niandu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="qijian" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="kaishiriqi" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="jieshuriqi" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
        "shuihuid",
        "niandu",
        "qijian",
        "kaishiriqi",
        "jieshuriqi"
    })
    public static class Kuaijiqijian {

        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int id;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer shuihuid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer niandu;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer qijian;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar kaishiriqi;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar jieshuriqi;

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
         * Gets the value of the shuihuid property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getShuihuid() {
            return shuihuid;
        }

        /**
         * Sets the value of the shuihuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setShuihuid(Integer value) {
            this.shuihuid = value;
        }

        /**
         * Gets the value of the niandu property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getNiandu() {
            return niandu;
        }

        /**
         * Sets the value of the niandu property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setNiandu(Integer value) {
            this.niandu = value;
        }

        /**
         * Gets the value of the qijian property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getQijian() {
            return qijian;
        }

        /**
         * Sets the value of the qijian property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setQijian(Integer value) {
            this.qijian = value;
        }

        /**
         * Gets the value of the kaishiriqi property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getKaishiriqi() {
            return kaishiriqi;
        }

        /**
         * Sets the value of the kaishiriqi property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setKaishiriqi(XMLGregorianCalendar value) {
            this.kaishiriqi = value;
        }

        /**
         * Gets the value of the jieshuriqi property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getJieshuriqi() {
            return jieshuriqi;
        }

        /**
         * Sets the value of the jieshuriqi property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setJieshuriqi(XMLGregorianCalendar value) {
            this.jieshuriqi = value;
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
     *         &lt;element name="zzxiang" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="lsh" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
        "zzxiang",
        "lsh"
    })
    public static class Lshzz {

        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int id;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zzxiang;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer lsh;

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
         * Gets the value of the zzxiang property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZzxiang() {
            return zzxiang;
        }

        /**
         * Sets the value of the zzxiang property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZzxiang(String value) {
            this.zzxiang = value;
        }

        /**
         * Gets the value of the lsh property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getLsh() {
            return lsh;
        }

        /**
         * Sets the value of the lsh property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setLsh(Integer value) {
            this.lsh = value;
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
     *         &lt;element name="zhubiaoid" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="kongjian" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="30"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="kongjianmingcheng" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="500"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="xz" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="yz" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="xianshi" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="shifoubilu" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="cankaodangan" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="100"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="xianshilie" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="100"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="guanliedangan" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="100"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="dingwei" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="zonghe" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="300"/>
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
        "zhubiaoid",
        "kongjian",
        "kongjianmingcheng",
        "xz",
        "yz",
        "xianshi",
        "shifoubilu",
        "cankaodangan",
        "xianshilie",
        "guanliedangan",
        "dingwei",
        "zonghe"
    })
    public static class Mobandangan {

        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int id;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int zhubiaoid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String kongjian;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String kongjianmingcheng;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer xz;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer yz;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean xianshi;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean shifoubilu;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String cankaodangan;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String xianshilie;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String guanliedangan;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean dingwei;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zonghe;

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
         */
        public int getZhubiaoid() {
            return zhubiaoid;
        }

        /**
         * Sets the value of the zhubiaoid property.
         * 
         */
        public void setZhubiaoid(int value) {
            this.zhubiaoid = value;
        }

        /**
         * Gets the value of the kongjian property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKongjian() {
            return kongjian;
        }

        /**
         * Sets the value of the kongjian property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKongjian(String value) {
            this.kongjian = value;
        }

        /**
         * Gets the value of the kongjianmingcheng property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKongjianmingcheng() {
            return kongjianmingcheng;
        }

        /**
         * Sets the value of the kongjianmingcheng property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKongjianmingcheng(String value) {
            this.kongjianmingcheng = value;
        }

        /**
         * Gets the value of the xz property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getXz() {
            return xz;
        }

        /**
         * Sets the value of the xz property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setXz(Integer value) {
            this.xz = value;
        }

        /**
         * Gets the value of the yz property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getYz() {
            return yz;
        }

        /**
         * Sets the value of the yz property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setYz(Integer value) {
            this.yz = value;
        }

        /**
         * Gets the value of the xianshi property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isXianshi() {
            return xianshi;
        }

        /**
         * Sets the value of the xianshi property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setXianshi(Boolean value) {
            this.xianshi = value;
        }

        /**
         * Gets the value of the shifoubilu property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isShifoubilu() {
            return shifoubilu;
        }

        /**
         * Sets the value of the shifoubilu property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setShifoubilu(Boolean value) {
            this.shifoubilu = value;
        }

        /**
         * Gets the value of the cankaodangan property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCankaodangan() {
            return cankaodangan;
        }

        /**
         * Sets the value of the cankaodangan property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCankaodangan(String value) {
            this.cankaodangan = value;
        }

        /**
         * Gets the value of the xianshilie property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXianshilie() {
            return xianshilie;
        }

        /**
         * Sets the value of the xianshilie property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXianshilie(String value) {
            this.xianshilie = value;
        }

        /**
         * Gets the value of the guanliedangan property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGuanliedangan() {
            return guanliedangan;
        }

        /**
         * Sets the value of the guanliedangan property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGuanliedangan(String value) {
            this.guanliedangan = value;
        }

        /**
         * Gets the value of the dingwei property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDingwei() {
            return dingwei;
        }

        /**
         * Sets the value of the dingwei property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDingwei(Boolean value) {
            this.dingwei = value;
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
     *         &lt;element name="bianma" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="mingcheng" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="suoshuyewuid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="leixing" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="10"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="shifoumoji" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="dayinji" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="100"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="zhizhang" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="tupianlujing" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="200"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="zonghe" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="300"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="sunxuma" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
        "bianma",
        "mingcheng",
        "suoshuyewuid",
        "leixing",
        "shifoumoji",
        "dayinji",
        "zhizhang",
        "tupianlujing",
        "zonghe",
        "sunxuma"
    })
    public static class Mobanzhubiao {

        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int id;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected BigDecimal bianma;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String mingcheng;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer suoshuyewuid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String leixing;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean shifoumoji;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String dayinji;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zhizhang;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String tupianlujing;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zonghe;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected BigDecimal sunxuma;

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
         * Gets the value of the bianma property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getBianma() {
            return bianma;
        }

        /**
         * Sets the value of the bianma property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setBianma(BigDecimal value) {
            this.bianma = value;
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
         * Gets the value of the suoshuyewuid property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getSuoshuyewuid() {
            return suoshuyewuid;
        }

        /**
         * Sets the value of the suoshuyewuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setSuoshuyewuid(Integer value) {
            this.suoshuyewuid = value;
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
         * Gets the value of the shifoumoji property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isShifoumoji() {
            return shifoumoji;
        }

        /**
         * Sets the value of the shifoumoji property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setShifoumoji(Boolean value) {
            this.shifoumoji = value;
        }

        /**
         * Gets the value of the dayinji property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDayinji() {
            return dayinji;
        }

        /**
         * Sets the value of the dayinji property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDayinji(String value) {
            this.dayinji = value;
        }

        /**
         * Gets the value of the zhizhang property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZhizhang() {
            return zhizhang;
        }

        /**
         * Sets the value of the zhizhang property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZhizhang(String value) {
            this.zhizhang = value;
        }

        /**
         * Gets the value of the tupianlujing property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTupianlujing() {
            return tupianlujing;
        }

        /**
         * Sets the value of the tupianlujing property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTupianlujing(String value) {
            this.tupianlujing = value;
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
         * Gets the value of the sunxuma property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getSunxuma() {
            return sunxuma;
        }

        /**
         * Sets the value of the sunxuma property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setSunxuma(BigDecimal value) {
            this.sunxuma = value;
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
     *         &lt;element name="yonghuid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="yewuming" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="100"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="xz" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="yz" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="zonghe" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="300"/>
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
        "yonghuid",
        "yewuming",
        "xz",
        "yz",
        "zonghe"
    })
    public static class Mywork {

        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int id;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer yonghuid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String yewuming;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer xz;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer yz;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zonghe;

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
         * Gets the value of the yonghuid property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getYonghuid() {
            return yonghuid;
        }

        /**
         * Sets the value of the yonghuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setYonghuid(Integer value) {
            this.yonghuid = value;
        }

        /**
         * Gets the value of the yewuming property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getYewuming() {
            return yewuming;
        }

        /**
         * Sets the value of the yewuming property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setYewuming(String value) {
            this.yewuming = value;
        }

        /**
         * Gets the value of the xz property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getXz() {
            return xz;
        }

        /**
         * Sets the value of the xz property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setXz(Integer value) {
            this.xz = value;
        }

        /**
         * Gets the value of the yz property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getYz() {
            return yz;
        }

        /**
         * Sets the value of the yz property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setYz(Integer value) {
            this.yz = value;
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
     *         &lt;element name="yhid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="mingcheng" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="chakan" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="xiugai" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="shanchu" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="shenhe" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="qishen" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="dengzhang" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="qideng" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="zengjia" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="yemianshezhi" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="yulan" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="dayin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="guanbi" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="dakai" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="shuchu" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="lanmu" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="pz" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="yewuid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
        "yhid",
        "mingcheng",
        "chakan",
        "xiugai",
        "shanchu",
        "shenhe",
        "qishen",
        "dengzhang",
        "qideng",
        "zengjia",
        "yemianshezhi",
        "yulan",
        "dayin",
        "guanbi",
        "dakai",
        "shuchu",
        "lanmu",
        "pz",
        "yewuid"
    })
    public static class Quanxiandangan {

        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int id;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer yhid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String mingcheng;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean chakan;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean xiugai;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean shanchu;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean shenhe;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean qishen;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean dengzhang;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean qideng;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean zengjia;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean yemianshezhi;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean yulan;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean dayin;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean guanbi;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean dakai;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean shuchu;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean lanmu;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean pz;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer yewuid;

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
         * Gets the value of the yhid property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getYhid() {
            return yhid;
        }

        /**
         * Sets the value of the yhid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setYhid(Integer value) {
            this.yhid = value;
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
         * Gets the value of the chakan property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isChakan() {
            return chakan;
        }

        /**
         * Sets the value of the chakan property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setChakan(Boolean value) {
            this.chakan = value;
        }

        /**
         * Gets the value of the xiugai property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isXiugai() {
            return xiugai;
        }

        /**
         * Sets the value of the xiugai property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setXiugai(Boolean value) {
            this.xiugai = value;
        }

        /**
         * Gets the value of the shanchu property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isShanchu() {
            return shanchu;
        }

        /**
         * Sets the value of the shanchu property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setShanchu(Boolean value) {
            this.shanchu = value;
        }

        /**
         * Gets the value of the shenhe property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isShenhe() {
            return shenhe;
        }

        /**
         * Sets the value of the shenhe property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setShenhe(Boolean value) {
            this.shenhe = value;
        }

        /**
         * Gets the value of the qishen property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isQishen() {
            return qishen;
        }

        /**
         * Sets the value of the qishen property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setQishen(Boolean value) {
            this.qishen = value;
        }

        /**
         * Gets the value of the dengzhang property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDengzhang() {
            return dengzhang;
        }

        /**
         * Sets the value of the dengzhang property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDengzhang(Boolean value) {
            this.dengzhang = value;
        }

        /**
         * Gets the value of the qideng property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isQideng() {
            return qideng;
        }

        /**
         * Sets the value of the qideng property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setQideng(Boolean value) {
            this.qideng = value;
        }

        /**
         * Gets the value of the zengjia property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isZengjia() {
            return zengjia;
        }

        /**
         * Sets the value of the zengjia property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setZengjia(Boolean value) {
            this.zengjia = value;
        }

        /**
         * Gets the value of the yemianshezhi property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isYemianshezhi() {
            return yemianshezhi;
        }

        /**
         * Sets the value of the yemianshezhi property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setYemianshezhi(Boolean value) {
            this.yemianshezhi = value;
        }

        /**
         * Gets the value of the yulan property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isYulan() {
            return yulan;
        }

        /**
         * Sets the value of the yulan property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setYulan(Boolean value) {
            this.yulan = value;
        }

        /**
         * Gets the value of the dayin property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDayin() {
            return dayin;
        }

        /**
         * Sets the value of the dayin property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDayin(Boolean value) {
            this.dayin = value;
        }

        /**
         * Gets the value of the guanbi property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isGuanbi() {
            return guanbi;
        }

        /**
         * Sets the value of the guanbi property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setGuanbi(Boolean value) {
            this.guanbi = value;
        }

        /**
         * Gets the value of the dakai property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDakai() {
            return dakai;
        }

        /**
         * Sets the value of the dakai property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDakai(Boolean value) {
            this.dakai = value;
        }

        /**
         * Gets the value of the shuchu property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isShuchu() {
            return shuchu;
        }

        /**
         * Sets the value of the shuchu property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setShuchu(Boolean value) {
            this.shuchu = value;
        }

        /**
         * Gets the value of the lanmu property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isLanmu() {
            return lanmu;
        }

        /**
         * Sets the value of the lanmu property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setLanmu(Boolean value) {
            this.lanmu = value;
        }

        /**
         * Gets the value of the pz property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPz() {
            return pz;
        }

        /**
         * Sets the value of the pz property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPz(Boolean value) {
            this.pz = value;
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
     *         &lt;element name="yhid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="yewuid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="ziduan" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="100"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="mingcheng" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="100"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="chakan" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="xiugai" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        "yhid",
        "yewuid",
        "ziduan",
        "mingcheng",
        "chakan",
        "xiugai"
    })
    public static class Quanxianziduan {

        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int id;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer yhid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer yewuid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String ziduan;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String mingcheng;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean chakan;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean xiugai;

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
         * Gets the value of the yhid property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getYhid() {
            return yhid;
        }

        /**
         * Sets the value of the yhid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setYhid(Integer value) {
            this.yhid = value;
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
         * Gets the value of the ziduan property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZiduan() {
            return ziduan;
        }

        /**
         * Sets the value of the ziduan property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZiduan(String value) {
            this.ziduan = value;
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
         * Gets the value of the chakan property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isChakan() {
            return chakan;
        }

        /**
         * Sets the value of the chakan property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setChakan(Boolean value) {
            this.chakan = value;
        }

        /**
         * Gets the value of the xiugai property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isXiugai() {
            return xiugai;
        }

        /**
         * Sets the value of the xiugai property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setXiugai(Boolean value) {
            this.xiugai = value;
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
     *         &lt;element name="bumenid" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="bianma">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="xingming">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="xingbie" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="zhiwu" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="dianhua" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="email" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="200"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="beizhu" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="tingyong" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="dengluming" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="mima" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="shifouyewuyuan" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="zidingyi1" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="zidingyi2" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="zidingyi3" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="zidingyi4" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="zidingyi5" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="jilushijian" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="jilurenid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="shifoucaozuoyuan" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="leixing" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="zonghe" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="3000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="fenzuzhuguan" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="zhujifu" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="zidingyi6" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="100"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="zidingyi7" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="100"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="zidingyi8" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="100"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="zidingyi9" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="100"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="zidingyi10" minOccurs="0">
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
        "bumenid",
        "bianma",
        "xingming",
        "xingbie",
        "zhiwu",
        "dianhua",
        "email",
        "beizhu",
        "tingyong",
        "dengluming",
        "mima",
        "shifouyewuyuan",
        "zidingyi1",
        "zidingyi2",
        "zidingyi3",
        "zidingyi4",
        "zidingyi5",
        "jilushijian",
        "jilurenid",
        "shifoucaozuoyuan",
        "leixing",
        "zonghe",
        "fenzuzhuguan",
        "zhujifu",
        "zidingyi6",
        "zidingyi7",
        "zidingyi8",
        "zidingyi9",
        "zidingyi10"
    })
    public static class Renyuandangan {

        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int id;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int bumenid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd", required = true)
        protected String bianma;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd", required = true)
        protected String xingming;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String xingbie;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zhiwu;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String dianhua;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String email;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String beizhu;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean tingyong;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String dengluming;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String mima;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean shifouyewuyuan;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zidingyi1;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zidingyi2;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zidingyi3;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zidingyi4;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zidingyi5;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar jilushijian;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer jilurenid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean shifoucaozuoyuan;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String leixing;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zonghe;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean fenzuzhuguan;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zhujifu;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zidingyi6;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zidingyi7;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zidingyi8;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zidingyi9;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zidingyi10;

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
         * Gets the value of the bumenid property.
         * 
         */
        public int getBumenid() {
            return bumenid;
        }

        /**
         * Sets the value of the bumenid property.
         * 
         */
        public void setBumenid(int value) {
            this.bumenid = value;
        }

        /**
         * Gets the value of the bianma property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBianma() {
            return bianma;
        }

        /**
         * Sets the value of the bianma property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBianma(String value) {
            this.bianma = value;
        }

        /**
         * Gets the value of the xingming property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXingming() {
            return xingming;
        }

        /**
         * Sets the value of the xingming property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXingming(String value) {
            this.xingming = value;
        }

        /**
         * Gets the value of the xingbie property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXingbie() {
            return xingbie;
        }

        /**
         * Sets the value of the xingbie property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXingbie(String value) {
            this.xingbie = value;
        }

        /**
         * Gets the value of the zhiwu property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZhiwu() {
            return zhiwu;
        }

        /**
         * Sets the value of the zhiwu property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZhiwu(String value) {
            this.zhiwu = value;
        }

        /**
         * Gets the value of the dianhua property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDianhua() {
            return dianhua;
        }

        /**
         * Sets the value of the dianhua property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDianhua(String value) {
            this.dianhua = value;
        }

        /**
         * Gets the value of the email property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmail() {
            return email;
        }

        /**
         * Sets the value of the email property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmail(String value) {
            this.email = value;
        }

        /**
         * Gets the value of the beizhu property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBeizhu() {
            return beizhu;
        }

        /**
         * Sets the value of the beizhu property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBeizhu(String value) {
            this.beizhu = value;
        }

        /**
         * Gets the value of the tingyong property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isTingyong() {
            return tingyong;
        }

        /**
         * Sets the value of the tingyong property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setTingyong(Boolean value) {
            this.tingyong = value;
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
         * Gets the value of the mima property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMima() {
            return mima;
        }

        /**
         * Sets the value of the mima property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMima(String value) {
            this.mima = value;
        }

        /**
         * Gets the value of the shifouyewuyuan property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isShifouyewuyuan() {
            return shifouyewuyuan;
        }

        /**
         * Sets the value of the shifouyewuyuan property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setShifouyewuyuan(Boolean value) {
            this.shifouyewuyuan = value;
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

        /**
         * Gets the value of the zidingyi4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZidingyi4() {
            return zidingyi4;
        }

        /**
         * Sets the value of the zidingyi4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZidingyi4(String value) {
            this.zidingyi4 = value;
        }

        /**
         * Gets the value of the zidingyi5 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZidingyi5() {
            return zidingyi5;
        }

        /**
         * Sets the value of the zidingyi5 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZidingyi5(String value) {
            this.zidingyi5 = value;
        }

        /**
         * Gets the value of the jilushijian property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getJilushijian() {
            return jilushijian;
        }

        /**
         * Sets the value of the jilushijian property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setJilushijian(XMLGregorianCalendar value) {
            this.jilushijian = value;
        }

        /**
         * Gets the value of the jilurenid property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getJilurenid() {
            return jilurenid;
        }

        /**
         * Sets the value of the jilurenid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setJilurenid(Integer value) {
            this.jilurenid = value;
        }

        /**
         * Gets the value of the shifoucaozuoyuan property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isShifoucaozuoyuan() {
            return shifoucaozuoyuan;
        }

        /**
         * Sets the value of the shifoucaozuoyuan property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setShifoucaozuoyuan(Boolean value) {
            this.shifoucaozuoyuan = value;
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
         * Gets the value of the fenzuzhuguan property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFenzuzhuguan() {
            return fenzuzhuguan;
        }

        /**
         * Sets the value of the fenzuzhuguan property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFenzuzhuguan(Boolean value) {
            this.fenzuzhuguan = value;
        }

        /**
         * Gets the value of the zhujifu property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZhujifu() {
            return zhujifu;
        }

        /**
         * Sets the value of the zhujifu property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZhujifu(String value) {
            this.zhujifu = value;
        }

        /**
         * Gets the value of the zidingyi6 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZidingyi6() {
            return zidingyi6;
        }

        /**
         * Sets the value of the zidingyi6 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZidingyi6(String value) {
            this.zidingyi6 = value;
        }

        /**
         * Gets the value of the zidingyi7 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZidingyi7() {
            return zidingyi7;
        }

        /**
         * Sets the value of the zidingyi7 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZidingyi7(String value) {
            this.zidingyi7 = value;
        }

        /**
         * Gets the value of the zidingyi8 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZidingyi8() {
            return zidingyi8;
        }

        /**
         * Sets the value of the zidingyi8 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZidingyi8(String value) {
            this.zidingyi8 = value;
        }

        /**
         * Gets the value of the zidingyi9 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZidingyi9() {
            return zidingyi9;
        }

        /**
         * Sets the value of the zidingyi9 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZidingyi9(String value) {
            this.zidingyi9 = value;
        }

        /**
         * Gets the value of the zidingyi10 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZidingyi10() {
            return zidingyi10;
        }

        /**
         * Sets the value of the zidingyi10 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZidingyi10(String value) {
            this.zidingyi10 = value;
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
     *         &lt;element name="bbid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="shituid" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="jiegou" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="100"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="mingcheng" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="100"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="kuandu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="xuhao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="geshi" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="dingwei" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="leixing" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="biaodashi" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="3000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="heji" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="zonghe" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="3000"/>
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
        "bbid",
        "shituid",
        "jiegou",
        "mingcheng",
        "kuandu",
        "xuhao",
        "geshi",
        "dingwei",
        "leixing",
        "biaodashi",
        "heji",
        "zonghe"
    })
    public static class Shitujiegou {

        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int id;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer bbid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int shituid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String jiegou;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String mingcheng;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer kuandu;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer xuhao;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String geshi;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean dingwei;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String leixing;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String biaodashi;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean heji;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zonghe;

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
         * Gets the value of the bbid property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getBbid() {
            return bbid;
        }

        /**
         * Sets the value of the bbid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setBbid(Integer value) {
            this.bbid = value;
        }

        /**
         * Gets the value of the shituid property.
         * 
         */
        public int getShituid() {
            return shituid;
        }

        /**
         * Sets the value of the shituid property.
         * 
         */
        public void setShituid(int value) {
            this.shituid = value;
        }

        /**
         * Gets the value of the jiegou property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJiegou() {
            return jiegou;
        }

        /**
         * Sets the value of the jiegou property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJiegou(String value) {
            this.jiegou = value;
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
         * Gets the value of the kuandu property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getKuandu() {
            return kuandu;
        }

        /**
         * Sets the value of the kuandu property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setKuandu(Integer value) {
            this.kuandu = value;
        }

        /**
         * Gets the value of the xuhao property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getXuhao() {
            return xuhao;
        }

        /**
         * Sets the value of the xuhao property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setXuhao(Integer value) {
            this.xuhao = value;
        }

        /**
         * Gets the value of the geshi property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGeshi() {
            return geshi;
        }

        /**
         * Sets the value of the geshi property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGeshi(String value) {
            this.geshi = value;
        }

        /**
         * Gets the value of the dingwei property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDingwei() {
            return dingwei;
        }

        /**
         * Sets the value of the dingwei property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDingwei(Boolean value) {
            this.dingwei = value;
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
         * Gets the value of the biaodashi property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBiaodashi() {
            return biaodashi;
        }

        /**
         * Sets the value of the biaodashi property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBiaodashi(String value) {
            this.biaodashi = value;
        }

        /**
         * Gets the value of the heji property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isHeji() {
            return heji;
        }

        /**
         * Sets the value of the heji property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setHeji(Boolean value) {
            this.heji = value;
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
     *               &lt;maxLength value="100"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="quancheng">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="100"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="dizhi">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="200"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="shuihao" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="100"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="yinhangzhanghao" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="300"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="dianhua" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="zuigaojine" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="duizhaoma" minOccurs="0">
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
        "quancheng",
        "dizhi",
        "shuihao",
        "yinhangzhanghao",
        "dianhua",
        "zuigaojine",
        "duizhaoma"
    })
    public static class Shuihudangan {

        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int id;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd", required = true)
        protected String mingcheng;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd", required = true)
        protected String quancheng;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd", required = true)
        protected String dizhi;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String shuihao;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String yinhangzhanghao;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String dianhua;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected BigDecimal zuigaojine;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String duizhaoma;

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
         * Gets the value of the quancheng property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQuancheng() {
            return quancheng;
        }

        /**
         * Sets the value of the quancheng property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQuancheng(String value) {
            this.quancheng = value;
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
         * Gets the value of the shuihao property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShuihao() {
            return shuihao;
        }

        /**
         * Sets the value of the shuihao property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShuihao(String value) {
            this.shuihao = value;
        }

        /**
         * Gets the value of the yinhangzhanghao property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getYinhangzhanghao() {
            return yinhangzhanghao;
        }

        /**
         * Sets the value of the yinhangzhanghao property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setYinhangzhanghao(String value) {
            this.yinhangzhanghao = value;
        }

        /**
         * Gets the value of the dianhua property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDianhua() {
            return dianhua;
        }

        /**
         * Sets the value of the dianhua property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDianhua(String value) {
            this.dianhua = value;
        }

        /**
         * Gets the value of the zuigaojine property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getZuigaojine() {
            return zuigaojine;
        }

        /**
         * Sets the value of the zuigaojine property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setZuigaojine(BigDecimal value) {
            this.zuigaojine = value;
        }

        /**
         * Gets the value of the duizhaoma property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDuizhaoma() {
            return duizhaoma;
        }

        /**
         * Sets the value of the duizhaoma property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDuizhaoma(String value) {
            this.duizhaoma = value;
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
     *         &lt;element name="bianma" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="biao" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="16"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="shuxing">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="26"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="mingcheng" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="yeqian" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        "bianma",
        "biao",
        "shuxing",
        "mingcheng",
        "yeqian"
    })
    public static class Shuxingmingchengdangan {

        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int id;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected BigDecimal bianma;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String biao;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd", required = true)
        protected String shuxing;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String mingcheng;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean yeqian;

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
         * Gets the value of the bianma property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getBianma() {
            return bianma;
        }

        /**
         * Sets the value of the bianma property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setBianma(BigDecimal value) {
            this.bianma = value;
        }

        /**
         * Gets the value of the biao property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBiao() {
            return biao;
        }

        /**
         * Sets the value of the biao property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBiao(String value) {
            this.biao = value;
        }

        /**
         * Gets the value of the shuxing property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShuxing() {
            return shuxing;
        }

        /**
         * Sets the value of the shuxing property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShuxing(String value) {
            this.shuxing = value;
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
         * Gets the value of the yeqian property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isYeqian() {
            return yeqian;
        }

        /**
         * Sets the value of the yeqian property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setYeqian(Boolean value) {
            this.yeqian = value;
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
     *         &lt;element name="biao" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="120"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="shuxing">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="30"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="bianma" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="mingcheng" minOccurs="0">
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
        "biao",
        "shuxing",
        "bianma",
        "mingcheng"
    })
    public static class Shuxingxuanxiangdangan {

        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int id;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String biao;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd", required = true)
        protected String shuxing;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String bianma;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String mingcheng;

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
         * Gets the value of the biao property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBiao() {
            return biao;
        }

        /**
         * Sets the value of the biao property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBiao(String value) {
            this.biao = value;
        }

        /**
         * Gets the value of the shuxing property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShuxing() {
            return shuxing;
        }

        /**
         * Sets the value of the shuxing property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShuxing(String value) {
            this.shuxing = value;
        }

        /**
         * Gets the value of the bianma property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBianma() {
            return bianma;
        }

        /**
         * Sets the value of the bianma property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBianma(String value) {
            this.bianma = value;
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
     *         &lt;element name="bianma" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="mingcheng" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="10"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="morenhuilv" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
        "bianma",
        "mingcheng",
        "morenhuilv"
    })
    public static class Waibidangan {

        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int id;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String bianma;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String mingcheng;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected BigDecimal morenhuilv;

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
         * Gets the value of the bianma property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBianma() {
            return bianma;
        }

        /**
         * Sets the value of the bianma property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBianma(String value) {
            this.bianma = value;
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
         * Gets the value of the morenhuilv property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMorenhuilv() {
            return morenhuilv;
        }

        /**
         * Sets the value of the morenhuilv property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMorenhuilv(BigDecimal value) {
            this.morenhuilv = value;
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
     *         &lt;element name="bianma" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="mingcheng" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="beizhu" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="suoshuleibieid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="tingyong" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
     *               &lt;maxLength value="500"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="zidingyi3" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="500"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="zidingyi4" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="zidingyi5" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="zidingyi6" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
        "bianma",
        "mingcheng",
        "beizhu",
        "suoshuleibieid",
        "tingyong",
        "zidingyi1",
        "zidingyi2",
        "zidingyi3",
        "zidingyi4",
        "zidingyi5",
        "zidingyi6"
    })
    public static class Xiangmudangan {

        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int id;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String bianma;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String mingcheng;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String beizhu;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer suoshuleibieid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean tingyong;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zidingyi1;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zidingyi2;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zidingyi3;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected BigDecimal zidingyi4;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected BigDecimal zidingyi5;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar zidingyi6;

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
         * Gets the value of the bianma property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBianma() {
            return bianma;
        }

        /**
         * Sets the value of the bianma property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBianma(String value) {
            this.bianma = value;
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
         * Gets the value of the beizhu property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBeizhu() {
            return beizhu;
        }

        /**
         * Sets the value of the beizhu property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBeizhu(String value) {
            this.beizhu = value;
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
         * Gets the value of the tingyong property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isTingyong() {
            return tingyong;
        }

        /**
         * Sets the value of the tingyong property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setTingyong(Boolean value) {
            this.tingyong = value;
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

        /**
         * Gets the value of the zidingyi4 property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getZidingyi4() {
            return zidingyi4;
        }

        /**
         * Sets the value of the zidingyi4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setZidingyi4(BigDecimal value) {
            this.zidingyi4 = value;
        }

        /**
         * Gets the value of the zidingyi5 property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getZidingyi5() {
            return zidingyi5;
        }

        /**
         * Sets the value of the zidingyi5 property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setZidingyi5(BigDecimal value) {
            this.zidingyi5 = value;
        }

        /**
         * Gets the value of the zidingyi6 property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getZidingyi6() {
            return zidingyi6;
        }

        /**
         * Sets the value of the zidingyi6 property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setZidingyi6(XMLGregorianCalendar value) {
            this.zidingyi6 = value;
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
     *         &lt;element name="bianma" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="mingcheng" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="300"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="shuxing" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="qushubaobiaoid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="fenpeibaobiaoid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
        "bianma",
        "mingcheng",
        "shuxing",
        "qushubaobiaoid",
        "fenpeibaobiaoid"
    })
    public static class Xiangmufeiyongyaoshu {

        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int id;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String bianma;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String mingcheng;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String shuxing;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer qushubaobiaoid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer fenpeibaobiaoid;

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
         * Gets the value of the bianma property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBianma() {
            return bianma;
        }

        /**
         * Sets the value of the bianma property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBianma(String value) {
            this.bianma = value;
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
         * Gets the value of the shuxing property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShuxing() {
            return shuxing;
        }

        /**
         * Sets the value of the shuxing property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShuxing(String value) {
            this.shuxing = value;
        }

        /**
         * Gets the value of the qushubaobiaoid property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getQushubaobiaoid() {
            return qushubaobiaoid;
        }

        /**
         * Sets the value of the qushubaobiaoid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setQushubaobiaoid(Integer value) {
            this.qushubaobiaoid = value;
        }

        /**
         * Gets the value of the fenpeibaobiaoid property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getFenpeibaobiaoid() {
            return fenpeibaobiaoid;
        }

        /**
         * Sets the value of the fenpeibaobiaoid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setFenpeibaobiaoid(Integer value) {
            this.fenpeibaobiaoid = value;
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
     *         &lt;element name="bianma" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element name="mingcheng">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="sunxuma" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="shifoumoji" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        "bianma",
        "mingcheng",
        "sunxuma",
        "shifoumoji"
    })
    public static class Xiangmuleibie {

        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int id;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd", required = true)
        protected BigDecimal bianma;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd", required = true)
        protected String mingcheng;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected BigDecimal sunxuma;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean shifoumoji;

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
         * Gets the value of the bianma property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getBianma() {
            return bianma;
        }

        /**
         * Sets the value of the bianma property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setBianma(BigDecimal value) {
            this.bianma = value;
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
         * Gets the value of the sunxuma property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getSunxuma() {
            return sunxuma;
        }

        /**
         * Sets the value of the sunxuma property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setSunxuma(BigDecimal value) {
            this.sunxuma = value;
        }

        /**
         * Gets the value of the shifoumoji property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isShifoumoji() {
            return shifoumoji;
        }

        /**
         * Sets the value of the shifoumoji property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setShifoumoji(Boolean value) {
            this.shifoumoji = value;
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
     *         &lt;element name="bianma" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="mingcheng">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="sunxuma" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element name="shifoumoji" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="leibielujing" minOccurs="0">
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
        "bianma",
        "mingcheng",
        "sunxuma",
        "shifoumoji",
        "leibielujing"
    })
    public static class Xiaoxileibie {

        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int id;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected BigDecimal bianma;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd", required = true)
        protected String mingcheng;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd", required = true)
        protected BigDecimal sunxuma;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean shifoumoji;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String leibielujing;

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
         * Gets the value of the bianma property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getBianma() {
            return bianma;
        }

        /**
         * Sets the value of the bianma property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setBianma(BigDecimal value) {
            this.bianma = value;
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
         * Gets the value of the sunxuma property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getSunxuma() {
            return sunxuma;
        }

        /**
         * Sets the value of the sunxuma property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setSunxuma(BigDecimal value) {
            this.sunxuma = value;
        }

        /**
         * Gets the value of the shifoumoji property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isShifoumoji() {
            return shifoumoji;
        }

        /**
         * Sets the value of the shifoumoji property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setShifoumoji(Boolean value) {
            this.shifoumoji = value;
        }

        /**
         * Gets the value of the leibielujing property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLeibielujing() {
            return leibielujing;
        }

        /**
         * Sets the value of the leibielujing property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLeibielujing(String value) {
            this.leibielujing = value;
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
     *         &lt;element name="kaishishijian" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="jieshushijian" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="xuqiulaiyuan" minOccurs="0">
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
        "kaishishijian",
        "jieshushijian",
        "xuqiulaiyuan"
    })
    public static class Xuqiushizha {

        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int id;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer kaishishijian;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer jieshushijian;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String xuqiulaiyuan;

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
         * Gets the value of the kaishishijian property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getKaishishijian() {
            return kaishishijian;
        }

        /**
         * Sets the value of the kaishishijian property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setKaishishijian(Integer value) {
            this.kaishishijian = value;
        }

        /**
         * Gets the value of the jieshushijian property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getJieshushijian() {
            return jieshushijian;
        }

        /**
         * Sets the value of the jieshushijian property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setJieshushijian(Integer value) {
            this.jieshushijian = value;
        }

        /**
         * Gets the value of the xuqiulaiyuan property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXuqiulaiyuan() {
            return xuqiulaiyuan;
        }

        /**
         * Sets the value of the xuqiulaiyuan property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXuqiulaiyuan(String value) {
            this.xuqiulaiyuan = value;
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
     *         &lt;element name="bianma" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element name="mingcheng">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="leixing" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="10"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="tongjileibie" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="16"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="shifoumoji" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="sunxuma" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="mokuai" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="16"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="shifoufushu" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="shengchengdanjumingcheng1" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="shengchengdanjumingcheng2" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="zhubiao" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="zibiao" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="yinchang" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="xitongsheding" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="czdj1fw" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="czdj2fw" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="caidanxiang" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="200"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="zonghe" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="300"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="kongzhitixing" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="300"/>
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
        "bianma",
        "mingcheng",
        "leixing",
        "tongjileibie",
        "shifoumoji",
        "sunxuma",
        "mokuai",
        "shifoufushu",
        "shengchengdanjumingcheng1",
        "shengchengdanjumingcheng2",
        "zhubiao",
        "zibiao",
        "yinchang",
        "xitongsheding",
        "czdj1Fw",
        "czdj2Fw",
        "caidanxiang",
        "zonghe",
        "kongzhitixing"
    })
    public static class Yewudangan {

        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int id;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd", required = true)
        protected BigDecimal bianma;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd", required = true)
        protected String mingcheng;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String leixing;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String tongjileibie;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected boolean shifoumoji;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected BigDecimal sunxuma;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String mokuai;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean shifoufushu;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String shengchengdanjumingcheng1;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String shengchengdanjumingcheng2;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zhubiao;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zibiao;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected boolean yinchang;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected boolean xitongsheding;
        @XmlElement(name = "czdj1fw", namespace = "http://tempuri.org/jichuDs.xsd")
        protected String czdj1Fw;
        @XmlElement(name = "czdj2fw", namespace = "http://tempuri.org/jichuDs.xsd")
        protected String czdj2Fw;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String caidanxiang;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zonghe;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String kongzhitixing;

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
         * Gets the value of the bianma property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getBianma() {
            return bianma;
        }

        /**
         * Sets the value of the bianma property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setBianma(BigDecimal value) {
            this.bianma = value;
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
         * Gets the value of the tongjileibie property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTongjileibie() {
            return tongjileibie;
        }

        /**
         * Sets the value of the tongjileibie property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTongjileibie(String value) {
            this.tongjileibie = value;
        }

        /**
         * Gets the value of the shifoumoji property.
         * 
         */
        public boolean isShifoumoji() {
            return shifoumoji;
        }

        /**
         * Sets the value of the shifoumoji property.
         * 
         */
        public void setShifoumoji(boolean value) {
            this.shifoumoji = value;
        }

        /**
         * Gets the value of the sunxuma property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getSunxuma() {
            return sunxuma;
        }

        /**
         * Sets the value of the sunxuma property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setSunxuma(BigDecimal value) {
            this.sunxuma = value;
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
         * Gets the value of the shifoufushu property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isShifoufushu() {
            return shifoufushu;
        }

        /**
         * Sets the value of the shifoufushu property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setShifoufushu(Boolean value) {
            this.shifoufushu = value;
        }

        /**
         * Gets the value of the shengchengdanjumingcheng1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShengchengdanjumingcheng1() {
            return shengchengdanjumingcheng1;
        }

        /**
         * Sets the value of the shengchengdanjumingcheng1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShengchengdanjumingcheng1(String value) {
            this.shengchengdanjumingcheng1 = value;
        }

        /**
         * Gets the value of the shengchengdanjumingcheng2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShengchengdanjumingcheng2() {
            return shengchengdanjumingcheng2;
        }

        /**
         * Sets the value of the shengchengdanjumingcheng2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShengchengdanjumingcheng2(String value) {
            this.shengchengdanjumingcheng2 = value;
        }

        /**
         * Gets the value of the zhubiao property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZhubiao() {
            return zhubiao;
        }

        /**
         * Sets the value of the zhubiao property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZhubiao(String value) {
            this.zhubiao = value;
        }

        /**
         * Gets the value of the zibiao property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZibiao() {
            return zibiao;
        }

        /**
         * Sets the value of the zibiao property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZibiao(String value) {
            this.zibiao = value;
        }

        /**
         * Gets the value of the yinchang property.
         * 
         */
        public boolean isYinchang() {
            return yinchang;
        }

        /**
         * Sets the value of the yinchang property.
         * 
         */
        public void setYinchang(boolean value) {
            this.yinchang = value;
        }

        /**
         * Gets the value of the xitongsheding property.
         * 
         */
        public boolean isXitongsheding() {
            return xitongsheding;
        }

        /**
         * Sets the value of the xitongsheding property.
         * 
         */
        public void setXitongsheding(boolean value) {
            this.xitongsheding = value;
        }

        /**
         * Gets the value of the czdj1Fw property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCzdj1Fw() {
            return czdj1Fw;
        }

        /**
         * Sets the value of the czdj1Fw property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCzdj1Fw(String value) {
            this.czdj1Fw = value;
        }

        /**
         * Gets the value of the czdj2Fw property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCzdj2Fw() {
            return czdj2Fw;
        }

        /**
         * Sets the value of the czdj2Fw property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCzdj2Fw(String value) {
            this.czdj2Fw = value;
        }

        /**
         * Gets the value of the caidanxiang property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCaidanxiang() {
            return caidanxiang;
        }

        /**
         * Sets the value of the caidanxiang property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCaidanxiang(String value) {
            this.caidanxiang = value;
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
         * Gets the value of the kongzhitixing property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKongzhitixing() {
            return kongzhitixing;
        }

        /**
         * Sets the value of the kongzhitixing property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKongzhitixing(String value) {
            this.kongzhitixing = value;
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
     *         &lt;element name="yewuid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="shuihuid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="leixing" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="kemuleibieid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="kemuid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="zdsc" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="zddz" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="biaotishuju" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="pzlb" minOccurs="0">
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
        "yewuid",
        "shuihuid",
        "leixing",
        "kemuleibieid",
        "kemuid",
        "zdsc",
        "zddz",
        "biaotishuju",
        "pzlb"
    })
    public static class Yewukemubiao {

        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int id;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer yewuid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer shuihuid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String leixing;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer kemuleibieid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer kemuid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean zdsc;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean zddz;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean biaotishuju;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String pzlb;

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
         * Gets the value of the shuihuid property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getShuihuid() {
            return shuihuid;
        }

        /**
         * Sets the value of the shuihuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setShuihuid(Integer value) {
            this.shuihuid = value;
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
         * Gets the value of the kemuleibieid property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getKemuleibieid() {
            return kemuleibieid;
        }

        /**
         * Sets the value of the kemuleibieid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setKemuleibieid(Integer value) {
            this.kemuleibieid = value;
        }

        /**
         * Gets the value of the kemuid property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getKemuid() {
            return kemuid;
        }

        /**
         * Sets the value of the kemuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setKemuid(Integer value) {
            this.kemuid = value;
        }

        /**
         * Gets the value of the zdsc property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isZdsc() {
            return zdsc;
        }

        /**
         * Sets the value of the zdsc property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setZdsc(Boolean value) {
            this.zdsc = value;
        }

        /**
         * Gets the value of the zddz property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isZddz() {
            return zddz;
        }

        /**
         * Sets the value of the zddz property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setZddz(Boolean value) {
            this.zddz = value;
        }

        /**
         * Gets the value of the biaotishuju property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isBiaotishuju() {
            return biaotishuju;
        }

        /**
         * Sets the value of the biaotishuju property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setBiaotishuju(Boolean value) {
            this.biaotishuju = value;
        }

        /**
         * Gets the value of the pzlb property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPzlb() {
            return pzlb;
        }

        /**
         * Sets the value of the pzlb property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPzlb(String value) {
            this.pzlb = value;
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
     *         &lt;element name="yewukemubiaoid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="danweileibieid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="danweiid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="bumenid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="cangkuid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="cunhuoleibieid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="cunhuoid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="kemuid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="cengji" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
        "yewukemubiaoid",
        "danweileibieid",
        "danweiid",
        "bumenid",
        "cangkuid",
        "cunhuoleibieid",
        "cunhuoid",
        "kemuid",
        "cengji"
    })
    public static class Yewukemuduizhaobiao {

        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int id;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer yewukemubiaoid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer danweileibieid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer danweiid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer bumenid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer cangkuid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer cunhuoleibieid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer cunhuoid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer kemuid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer cengji;

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
         * Gets the value of the yewukemubiaoid property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getYewukemubiaoid() {
            return yewukemubiaoid;
        }

        /**
         * Sets the value of the yewukemubiaoid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setYewukemubiaoid(Integer value) {
            this.yewukemubiaoid = value;
        }

        /**
         * Gets the value of the danweileibieid property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getDanweileibieid() {
            return danweileibieid;
        }

        /**
         * Sets the value of the danweileibieid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setDanweileibieid(Integer value) {
            this.danweileibieid = value;
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
         * Gets the value of the cunhuoleibieid property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCunhuoleibieid() {
            return cunhuoleibieid;
        }

        /**
         * Sets the value of the cunhuoleibieid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCunhuoleibieid(Integer value) {
            this.cunhuoleibieid = value;
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
         * Gets the value of the kemuid property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getKemuid() {
            return kemuid;
        }

        /**
         * Sets the value of the kemuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setKemuid(Integer value) {
            this.kemuid = value;
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
     *         &lt;element name="danweiid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="xiashujgid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="jiancheng" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
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
     *         &lt;element name="ysyuanbijine" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="ysbenbijine" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="yfyuanbijine" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="yfbenbijine" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="fuzhu" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="100"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="djrq" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="dqrq" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="skyuanbijine" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="skbenbijine" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="fkyuanbijine" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="fkbenbijine" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="hxyuanbijine" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="hxbenbijine" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="hphxyuanbijine" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="hphxbenbijine" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="bumenid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="renyuanid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="kemuid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="xiangmuid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="btziyouxiang1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="btziyouxiang2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="btziyouxiang3" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="btziyouxiang4" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="btziyouxiang5" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="bizhongid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="danjuyue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
        "danweiid",
        "xiashujgid",
        "jiancheng",
        "djbh",
        "djlx",
        "djmc",
        "ysyuanbijine",
        "ysbenbijine",
        "yfyuanbijine",
        "yfbenbijine",
        "fuzhu",
        "djrq",
        "dqrq",
        "skyuanbijine",
        "skbenbijine",
        "fkyuanbijine",
        "fkbenbijine",
        "hxyuanbijine",
        "hxbenbijine",
        "hphxyuanbijine",
        "hphxbenbijine",
        "bumenid",
        "renyuanid",
        "kemuid",
        "xiangmuid",
        "btziyouxiang1",
        "btziyouxiang2",
        "btziyouxiang3",
        "btziyouxiang4",
        "btziyouxiang5",
        "bizhongid",
        "danjuyue"
    })
    public static class Ysyfmingxizhang {

        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int id;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer zhubiaoid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer danweiid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer xiashujgid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String jiancheng;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String djbh;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String djlx;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String djmc;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected BigDecimal ysyuanbijine;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected BigDecimal ysbenbijine;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected BigDecimal yfyuanbijine;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected BigDecimal yfbenbijine;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String fuzhu;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar djrq;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar dqrq;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected BigDecimal skyuanbijine;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected BigDecimal skbenbijine;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected BigDecimal fkyuanbijine;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected BigDecimal fkbenbijine;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected BigDecimal hxyuanbijine;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected BigDecimal hxbenbijine;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected BigDecimal hphxyuanbijine;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected BigDecimal hphxbenbijine;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer bumenid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer renyuanid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer kemuid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer xiangmuid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer btziyouxiang1;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer btziyouxiang2;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer btziyouxiang3;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer btziyouxiang4;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer btziyouxiang5;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Integer bizhongid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected BigDecimal danjuyue;

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
         * Gets the value of the jiancheng property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJiancheng() {
            return jiancheng;
        }

        /**
         * Sets the value of the jiancheng property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJiancheng(String value) {
            this.jiancheng = value;
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
         * Gets the value of the ysyuanbijine property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getYsyuanbijine() {
            return ysyuanbijine;
        }

        /**
         * Sets the value of the ysyuanbijine property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setYsyuanbijine(BigDecimal value) {
            this.ysyuanbijine = value;
        }

        /**
         * Gets the value of the ysbenbijine property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getYsbenbijine() {
            return ysbenbijine;
        }

        /**
         * Sets the value of the ysbenbijine property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setYsbenbijine(BigDecimal value) {
            this.ysbenbijine = value;
        }

        /**
         * Gets the value of the yfyuanbijine property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getYfyuanbijine() {
            return yfyuanbijine;
        }

        /**
         * Sets the value of the yfyuanbijine property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setYfyuanbijine(BigDecimal value) {
            this.yfyuanbijine = value;
        }

        /**
         * Gets the value of the yfbenbijine property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getYfbenbijine() {
            return yfbenbijine;
        }

        /**
         * Sets the value of the yfbenbijine property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setYfbenbijine(BigDecimal value) {
            this.yfbenbijine = value;
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
         * Gets the value of the djrq property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDjrq() {
            return djrq;
        }

        /**
         * Sets the value of the djrq property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDjrq(XMLGregorianCalendar value) {
            this.djrq = value;
        }

        /**
         * Gets the value of the dqrq property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDqrq() {
            return dqrq;
        }

        /**
         * Sets the value of the dqrq property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDqrq(XMLGregorianCalendar value) {
            this.dqrq = value;
        }

        /**
         * Gets the value of the skyuanbijine property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getSkyuanbijine() {
            return skyuanbijine;
        }

        /**
         * Sets the value of the skyuanbijine property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setSkyuanbijine(BigDecimal value) {
            this.skyuanbijine = value;
        }

        /**
         * Gets the value of the skbenbijine property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getSkbenbijine() {
            return skbenbijine;
        }

        /**
         * Sets the value of the skbenbijine property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setSkbenbijine(BigDecimal value) {
            this.skbenbijine = value;
        }

        /**
         * Gets the value of the fkyuanbijine property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getFkyuanbijine() {
            return fkyuanbijine;
        }

        /**
         * Sets the value of the fkyuanbijine property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setFkyuanbijine(BigDecimal value) {
            this.fkyuanbijine = value;
        }

        /**
         * Gets the value of the fkbenbijine property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getFkbenbijine() {
            return fkbenbijine;
        }

        /**
         * Sets the value of the fkbenbijine property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setFkbenbijine(BigDecimal value) {
            this.fkbenbijine = value;
        }

        /**
         * Gets the value of the hxyuanbijine property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getHxyuanbijine() {
            return hxyuanbijine;
        }

        /**
         * Sets the value of the hxyuanbijine property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setHxyuanbijine(BigDecimal value) {
            this.hxyuanbijine = value;
        }

        /**
         * Gets the value of the hxbenbijine property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getHxbenbijine() {
            return hxbenbijine;
        }

        /**
         * Sets the value of the hxbenbijine property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setHxbenbijine(BigDecimal value) {
            this.hxbenbijine = value;
        }

        /**
         * Gets the value of the hphxyuanbijine property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getHphxyuanbijine() {
            return hphxyuanbijine;
        }

        /**
         * Sets the value of the hphxyuanbijine property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setHphxyuanbijine(BigDecimal value) {
            this.hphxyuanbijine = value;
        }

        /**
         * Gets the value of the hphxbenbijine property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getHphxbenbijine() {
            return hphxbenbijine;
        }

        /**
         * Sets the value of the hphxbenbijine property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setHphxbenbijine(BigDecimal value) {
            this.hphxbenbijine = value;
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
         * Gets the value of the kemuid property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getKemuid() {
            return kemuid;
        }

        /**
         * Sets the value of the kemuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setKemuid(Integer value) {
            this.kemuid = value;
        }

        /**
         * Gets the value of the xiangmuid property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getXiangmuid() {
            return xiangmuid;
        }

        /**
         * Sets the value of the xiangmuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setXiangmuid(Integer value) {
            this.xiangmuid = value;
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

        /**
         * Gets the value of the danjuyue property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getDanjuyue() {
            return danjuyue;
        }

        /**
         * Sets the value of the danjuyue property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setDanjuyue(BigDecimal value) {
            this.danjuyue = value;
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
     *         &lt;element name="fenzuid" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="bianma" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="mingcheng" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="zidingyi1" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="zidingyi2" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="zidingyi3" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="zidingyi4" minOccurs="0">
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
        "fenzuid",
        "bianma",
        "mingcheng",
        "zidingyi1",
        "zidingyi2",
        "zidingyi3",
        "zidingyi4"
    })
    public static class Ziyouxiangdangan {

        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int id;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int fenzuid;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String bianma;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String mingcheng;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zidingyi1;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zidingyi2;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zidingyi3;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String zidingyi4;

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
         * Gets the value of the fenzuid property.
         * 
         */
        public int getFenzuid() {
            return fenzuid;
        }

        /**
         * Sets the value of the fenzuid property.
         * 
         */
        public void setFenzuid(int value) {
            this.fenzuid = value;
        }

        /**
         * Gets the value of the bianma property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBianma() {
            return bianma;
        }

        /**
         * Sets the value of the bianma property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBianma(String value) {
            this.bianma = value;
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

        /**
         * Gets the value of the zidingyi4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZidingyi4() {
            return zidingyi4;
        }

        /**
         * Sets the value of the zidingyi4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZidingyi4(String value) {
            this.zidingyi4 = value;
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
     *         &lt;element name="bianma" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="mingcheng" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="sunxuma" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="shifoumoji" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="leibielujing" minOccurs="0">
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
        "bianma",
        "mingcheng",
        "sunxuma",
        "shifoumoji",
        "leibielujing"
    })
    public static class Ziyouxiangfenzu {

        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected int id;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected BigDecimal bianma;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String mingcheng;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected BigDecimal sunxuma;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected Boolean shifoumoji;
        @XmlElement(namespace = "http://tempuri.org/jichuDs.xsd")
        protected String leibielujing;

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
         * Gets the value of the bianma property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getBianma() {
            return bianma;
        }

        /**
         * Sets the value of the bianma property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setBianma(BigDecimal value) {
            this.bianma = value;
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
         * Gets the value of the sunxuma property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getSunxuma() {
            return sunxuma;
        }

        /**
         * Sets the value of the sunxuma property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setSunxuma(BigDecimal value) {
            this.sunxuma = value;
        }

        /**
         * Gets the value of the shifoumoji property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isShifoumoji() {
            return shifoumoji;
        }

        /**
         * Sets the value of the shifoumoji property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setShifoumoji(Boolean value) {
            this.shifoumoji = value;
        }

        /**
         * Gets the value of the leibielujing property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLeibielujing() {
            return leibielujing;
        }

        /**
         * Sets the value of the leibielujing property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLeibielujing(String value) {
            this.leibielujing = value;
        }

    }

}
