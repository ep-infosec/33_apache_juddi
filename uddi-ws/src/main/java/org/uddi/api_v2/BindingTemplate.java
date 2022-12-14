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
 * <p>Java class for bindingTemplate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bindingTemplate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:uddi-org:api_v2}description" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{urn:uddi-org:api_v2}accessPoint"/>
 *           &lt;element ref="{urn:uddi-org:api_v2}hostingRedirector"/>
 *         &lt;/choice>
 *         &lt;element ref="{urn:uddi-org:api_v2}tModelInstanceDetails"/>
 *       &lt;/sequence>
 *       &lt;attribute name="serviceKey" type="{urn:uddi-org:api_v2}serviceKey" />
 *       &lt;attribute name="bindingKey" use="required" type="{urn:uddi-org:api_v2}bindingKey" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bindingTemplate", propOrder = {
    "description",
    "accessPoint",
    "hostingRedirector",
    "tModelInstanceDetails"
})
public class BindingTemplate {

    protected List<Description> description;
    protected AccessPoint accessPoint;
    protected HostingRedirector hostingRedirector;
    @XmlElement(required = true)
    protected TModelInstanceDetails tModelInstanceDetails;
    @XmlAttribute(name = "serviceKey")
    protected String serviceKey;
    @XmlAttribute(name = "bindingKey", required = true)
    protected String bindingKey;

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
     * Gets the value of the accessPoint property.
     * 
     * @return
     *     possible object is
     *     {@link AccessPoint }
     *     
     */
    public AccessPoint getAccessPoint() {
        return accessPoint;
    }

    /**
     * Sets the value of the accessPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessPoint }
     *     
     */
    public void setAccessPoint(AccessPoint value) {
        this.accessPoint = value;
    }

    /**
     * Gets the value of the hostingRedirector property.
     * 
     * @return
     *     possible object is
     *     {@link HostingRedirector }
     *     
     */
    public HostingRedirector getHostingRedirector() {
        return hostingRedirector;
    }

    /**
     * Sets the value of the hostingRedirector property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostingRedirector }
     *     
     */
    public void setHostingRedirector(HostingRedirector value) {
        this.hostingRedirector = value;
    }

    /**
     * Gets the value of the tModelInstanceDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TModelInstanceDetails }
     *     
     */
    public TModelInstanceDetails getTModelInstanceDetails() {
        return tModelInstanceDetails;
    }

    /**
     * Sets the value of the tModelInstanceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TModelInstanceDetails }
     *     
     */
    public void setTModelInstanceDetails(TModelInstanceDetails value) {
        this.tModelInstanceDetails = value;
    }

    /**
     * Gets the value of the serviceKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceKey() {
        return serviceKey;
    }

    /**
     * Sets the value of the serviceKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceKey(String value) {
        this.serviceKey = value;
    }

    /**
     * Gets the value of the bindingKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBindingKey() {
        return bindingKey;
    }

    /**
     * Sets the value of the bindingKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBindingKey(String value) {
        this.bindingKey = value;
    }

}
