/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.06.14 at 03:58:12 PM GMT-03:00 
//


package org.mule.module.extension.internal.capability.xml.schema.model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * The element element can be used either
 * at the top level to define an element-type binding globally,
 * or within a content model to either reference a globally-defined
 * element or type or declare an element-type binding locally.
 * The ref form is not allowed at the top level.
 * <p/>
 * <p>Java class for element complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="element">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.w3.org/2001/XMLSchema}annotated">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="simpleType" type="{http://www.w3.org/2001/XMLSchema}localSimpleType"/>
 *           &lt;element name="complexType" type="{http://www.w3.org/2001/XMLSchema}localComplexType"/>
 *         &lt;/choice>
 *         &lt;group ref="{http://www.w3.org/2001/XMLSchema}identityConstraint" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.w3.org/2001/XMLSchema}occurs"/>
 *       &lt;attGroup ref="{http://www.w3.org/2001/XMLSchema}defRef"/>
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;attribute name="substitutionGroup" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;attribute name="default" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="fixed" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="nillable" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="abstract" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="final" type="{http://www.w3.org/2001/XMLSchema}derivationSet" />
 *       &lt;attribute name="block" type="{http://www.w3.org/2001/XMLSchema}blockSet" />
 *       &lt;attribute name="form" type="{http://www.w3.org/2001/XMLSchema}formChoice" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "element", propOrder = {
        "simpleType",
        "complexType",
        "identityConstraint"
})
@XmlSeeAlso({
                    TopLevelElement.class,
                    LocalElement.class
            })
public abstract class Element
        extends Annotated
{

    protected LocalSimpleType simpleType;
    protected LocalComplexType complexType;
    @XmlElementRefs({
                            @XmlElementRef(name = "unique", namespace = "http://www.w3.org/2001/XMLSchema", type = JAXBElement.class),
                            @XmlElementRef(name = "key", namespace = "http://www.w3.org/2001/XMLSchema", type = JAXBElement.class),
                            @XmlElementRef(name = "keyref", namespace = "http://www.w3.org/2001/XMLSchema", type = Keyref.class)
                    })
    protected List<Object> identityConstraint;
    @XmlAttribute(name = "type")
    protected QName type;
    @XmlAttribute(name = "substitutionGroup")
    protected QName substitutionGroup;
    @XmlAttribute(name = "default")
    protected String _default;
    @XmlAttribute(name = "fixed")
    protected String fixed;
    @XmlAttribute(name = "nillable")
    protected Boolean nillable;
    @XmlAttribute(name = "abstract")
    protected Boolean _abstract;
    @XmlAttribute(name = "final")
    @XmlSchemaType(name = "derivationSet")
    protected List<String> _final;
    @XmlAttribute(name = "block")
    @XmlSchemaType(name = "blockSet")
    protected List<String> block;
    @XmlAttribute(name = "form")
    protected FormChoice form;
    @XmlAttribute(name = "minOccurs")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger minOccurs;
    @XmlAttribute(name = "maxOccurs")
    @XmlSchemaType(name = "allNNI")
    protected String maxOccurs;
    @XmlAttribute(name = "name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String name;
    @XmlAttribute(name = "ref")
    protected QName ref;

    /**
     * Gets the value of the simpleType property.
     *
     * @return possible object is
     * {@link LocalSimpleType }
     */
    public LocalSimpleType getSimpleType()
    {
        return simpleType;
    }

    /**
     * Sets the value of the simpleType property.
     *
     * @param value allowed object is
     *              {@link LocalSimpleType }
     */
    public void setSimpleType(LocalSimpleType value)
    {
        this.simpleType = value;
    }

    /**
     * Gets the value of the complexType property.
     *
     * @return possible object is
     * {@link LocalComplexType }
     */
    public LocalComplexType getComplexType()
    {
        return complexType;
    }

    /**
     * Sets the value of the complexType property.
     *
     * @param value allowed object is
     *              {@link LocalComplexType }
     */
    public void setComplexType(LocalComplexType value)
    {
        this.complexType = value;
    }

    /**
     * Gets the value of the identityConstraint property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identityConstraint property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentityConstraint().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link Keyref }
     * {@link JAXBElement }{@code <}{@link Keybase }{@code >}
     * {@link JAXBElement }{@code <}{@link Keybase }{@code >}
     */
    public List<Object> getIdentityConstraint()
    {
        if (identityConstraint == null)
        {
            identityConstraint = new ArrayList<Object>();
        }
        return this.identityConstraint;
    }

    /**
     * Gets the value of the type property.
     *
     * @return possible object is
     * {@link QName }
     */
    public QName getType()
    {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value allowed object is
     *              {@link QName }
     */
    public void setType(QName value)
    {
        this.type = value;
    }

    /**
     * Gets the value of the substitutionGroup property.
     *
     * @return possible object is
     * {@link QName }
     */
    public QName getSubstitutionGroup()
    {
        return substitutionGroup;
    }

    /**
     * Sets the value of the substitutionGroup property.
     *
     * @param value allowed object is
     *              {@link QName }
     */
    public void setSubstitutionGroup(QName value)
    {
        this.substitutionGroup = value;
    }

    /**
     * Gets the value of the default property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDefault()
    {
        return _default;
    }

    /**
     * Sets the value of the default property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDefault(String value)
    {
        this._default = value;
    }

    /**
     * Gets the value of the fixed property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFixed()
    {
        return fixed;
    }

    /**
     * Sets the value of the fixed property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFixed(String value)
    {
        this.fixed = value;
    }

    /**
     * Gets the value of the nillable property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public boolean isNillable()
    {
        if (nillable == null)
        {
            return false;
        }
        else
        {
            return nillable;
        }
    }

    /**
     * Sets the value of the nillable property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setNillable(Boolean value)
    {
        this.nillable = value;
    }

    /**
     * Gets the value of the abstract property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public boolean isAbstract()
    {
        if (_abstract == null)
        {
            return false;
        }
        else
        {
            return _abstract;
        }
    }

    /**
     * Sets the value of the abstract property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setAbstract(Boolean value)
    {
        this._abstract = value;
    }

    /**
     * Gets the value of the final property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the final property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinal().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<String> getFinal()
    {
        if (_final == null)
        {
            _final = new ArrayList<String>();
        }
        return this._final;
    }

    /**
     * Gets the value of the block property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the block property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBlock().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<String> getBlock()
    {
        if (block == null)
        {
            block = new ArrayList<String>();
        }
        return this.block;
    }

    /**
     * Gets the value of the form property.
     *
     * @return possible object is
     * {@link FormChoice }
     */
    public FormChoice getForm()
    {
        return form;
    }

    /**
     * Sets the value of the form property.
     *
     * @param value allowed object is
     *              {@link FormChoice }
     */
    public void setForm(FormChoice value)
    {
        this.form = value;
    }

    /**
     * Gets the value of the minOccurs property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getMinOccurs()
    {
        if (minOccurs == null)
        {
            return new BigInteger("1");
        }
        else
        {
            return minOccurs;
        }
    }

    /**
     * Sets the value of the minOccurs property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setMinOccurs(BigInteger value)
    {
        this.minOccurs = value;
    }

    /**
     * Gets the value of the maxOccurs property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMaxOccurs()
    {
        if (maxOccurs == null)
        {
            return "1";
        }
        else
        {
            return maxOccurs;
        }
    }

    /**
     * Sets the value of the maxOccurs property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMaxOccurs(String value)
    {
        this.maxOccurs = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getName()
    {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setName(String value)
    {
        this.name = value;
    }

    /**
     * Gets the value of the ref property.
     *
     * @return possible object is
     * {@link QName }
     */
    public QName getRef()
    {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     *
     * @param value allowed object is
     *              {@link QName }
     */
    public void setRef(QName value)
    {
        this.ref = value;
    }

}
