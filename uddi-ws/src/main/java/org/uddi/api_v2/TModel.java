/*
 * Copyright 2001-2008 The Apache Software Foundation.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package org.uddi.api_v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:uddi-org:api_v2}name"/>
 *         &lt;element ref="{urn:uddi-org:api_v2}description" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:uddi-org:api_v2}overviewDoc" minOccurs="0"/>
 *         &lt;element ref="{urn:uddi-org:api_v2}identifierBag" minOccurs="0"/>
 *         &lt;element ref="{urn:uddi-org:api_v2}categoryBag" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="tModelKey" use="required" type="{urn:uddi-org:api_v2}tModelKey" />
 *       &lt;attribute name="operator" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="authorizedName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tModel", propOrder = {
    "name",
    "description",
    "overviewDoc",
    "identifierBag",
    "categoryBag"
})
public class TModel {

    @XmlElement(required = true)
    protected Name name;
    protected List<Description> description;
    protected OverviewDoc overviewDoc;
    protected IdentifierBag identifierBag;
    protected CategoryBag categoryBag;
    @XmlAttribute(name = "tModelKey", required = true)
    protected String tModelKey;
    @XmlAttribute(name = "operator")
    protected String operator;
    @XmlAttribute(name = "authorizedName")
    protected String authorizedName;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link Name }
     *     
     */
    public Name getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link Name }
     *     
     */
    public void setName(Name value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Description }
     * 
     * 
     */
    public List<Description> getDescription() {
        if (description == null) {
            description = new ArrayList<Description>();
        }
        return this.description;
    }

    /**
     * Gets the value of the overviewDoc property.
     * 
     * @return
     *     possible object is
     *     {@link OverviewDoc }
     *     
     */
    public OverviewDoc getOverviewDoc() {
        return overviewDoc;
    }

    /**
     * Sets the value of the overviewDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverviewDoc }
     *     
     */
    public void setOverviewDoc(OverviewDoc value) {
        this.overviewDoc = value;
    }

    /**
     * Gets the value of the identifierBag property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierBag }
     *     
     */
    public IdentifierBag getIdentifierBag() {
        return identifierBag;
    }

    /**
     * Sets the value of the identifierBag property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierBag }
     *     
     */
    public void setIdentifierBag(IdentifierBag value) {
        this.identifierBag = value;
    }

    /**
     * Gets the value of the categoryBag property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryBag }
     *     
     */
    public CategoryBag getCategoryBag() {
        return categoryBag;
    }

    /**
     * Sets the value of the categoryBag property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryBag }
     *     
     */
    public void setCategoryBag(CategoryBag value) {
        this.categoryBag = value;
    }

    /**
     * Gets the value of the tModelKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTModelKey() {
        return tModelKey;
    }

    /**
     * Sets the value of the tModelKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTModelKey(String value) {
        this.tModelKey = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperator(String value) {
        this.operator = value;
    }

    /**
     * Gets the value of the authorizedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizedName() {
        return authorizedName;
    }

    /**
     * Sets the value of the authorizedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizedName(String value) {
        this.authorizedName = value;
    }

}
