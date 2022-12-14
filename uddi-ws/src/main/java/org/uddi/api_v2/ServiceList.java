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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serviceList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serviceList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:uddi-org:api_v2}serviceInfos"/>
 *       &lt;/sequence>
 *       &lt;attribute name="generic" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="operator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="truncated" type="{urn:uddi-org:api_v2}truncated" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceList", propOrder = {
    "serviceInfos"
})
public class ServiceList {

    @XmlElement(required = true)
    protected ServiceInfos serviceInfos;
    @XmlAttribute(name = "generic", required = true)
    protected String generic;
    @XmlAttribute(name = "operator", required = true)
    protected String operator;
    @XmlAttribute(name = "truncated")
    protected Truncated truncated;

    /**
     * Gets the value of the serviceInfos property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceInfos }
     *     
     */
    public ServiceInfos getServiceInfos() {
        return serviceInfos;
    }

    /**
     * Sets the value of the serviceInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceInfos }
     *     
     */
    public void setServiceInfos(ServiceInfos value) {
        this.serviceInfos = value;
    }

    /**
     * Gets the value of the generic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneric() {
        return generic;
    }

    /**
     * Sets the value of the generic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneric(String value) {
        this.generic = value;
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
     * Gets the value of the truncated property.
     * 
     * @return
     *     possible object is
     *     {@link Truncated }
     *     
     */
    public Truncated getTruncated() {
        return truncated;
    }

    /**
     * Sets the value of the truncated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Truncated }
     *     
     */
    public void setTruncated(Truncated value) {
        this.truncated = value;
    }

}
