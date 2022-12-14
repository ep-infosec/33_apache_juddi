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
package org.uddi.v2_service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import org.uddi.api_v2.AddPublisherAssertions;
import org.uddi.api_v2.AssertionStatusReport;
import org.uddi.api_v2.AuthToken;
import org.uddi.api_v2.BindingDetail;
import org.uddi.api_v2.BusinessDetail;
import org.uddi.api_v2.DeleteBinding;
import org.uddi.api_v2.DeleteBusiness;
import org.uddi.api_v2.DeletePublisherAssertions;
import org.uddi.api_v2.DeleteService;
import org.uddi.api_v2.DeleteTModel;
import org.uddi.api_v2.DiscardAuthToken;
import org.uddi.api_v2.GetAssertionStatusReport;
import org.uddi.api_v2.GetAuthToken;
import org.uddi.api_v2.GetPublisherAssertions;
import org.uddi.api_v2.GetRegisteredInfo;
import org.uddi.api_v2.ObjectFactory;
import org.uddi.api_v2.PublisherAssertions;
import org.uddi.api_v2.RegisteredInfo;
import org.uddi.api_v2.SaveBinding;
import org.uddi.api_v2.SaveBusiness;
import org.uddi.api_v2.SaveService;
import org.uddi.api_v2.SaveTModel;
import org.uddi.api_v2.ServiceDetail;
import org.uddi.api_v2.SetPublisherAssertions;
import org.uddi.api_v2.TModelDetail;


/**
 * 
 * 			This portType defines all of the UDDI publish operations.
 * 	  
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Publish", targetNamespace = "urn:uddi-org:publication_v2")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Publish {


    /**
     * 
     * @param body
     * @return
     *     returns org.uddi.api_v2.DispositionReport
     * @throws org.uddi.v2_service.DispositionReport
     */
    @WebMethod(operationName = "add_publisherAssertions", action = "add_publisherAssertions")
    @WebResult(name = "dispositionReport", targetNamespace = "urn:uddi-org:api_v2", partName = "body")
    public org.uddi.api_v2.DispositionReport addPublisherAssertions(
        @WebParam(name = "add_publisherAssertions", targetNamespace = "urn:uddi-org:api_v2", partName = "body")
        AddPublisherAssertions body)
        throws org.uddi.v2_service.DispositionReport
    ;

    /**
     * 
     * @param body
     * @return
     *     returns org.uddi.api_v2.DispositionReport
     * @throws org.uddi.v2_service.DispositionReport
     */
    @WebMethod(operationName = "delete_binding", action = "delete_binding")
    @WebResult(name = "dispositionReport", targetNamespace = "urn:uddi-org:api_v2", partName = "body")
    public org.uddi.api_v2.DispositionReport deleteBinding(
        @WebParam(name = "delete_binding", targetNamespace = "urn:uddi-org:api_v2", partName = "body")
        DeleteBinding body)
        throws org.uddi.v2_service.DispositionReport
    ;

    /**
     * 
     * @param body
     * @return
     *     returns org.uddi.api_v2.DispositionReport
     * @throws org.uddi.v2_service.DispositionReport
     */
    @WebMethod(operationName = "delete_business", action = "delete_business")
    @WebResult(name = "dispositionReport", targetNamespace = "urn:uddi-org:api_v2", partName = "body")
    public org.uddi.api_v2.DispositionReport deleteBusiness(
        @WebParam(name = "delete_business", targetNamespace = "urn:uddi-org:api_v2", partName = "body")
        DeleteBusiness body)
        throws org.uddi.v2_service.DispositionReport
    ;

    /**
     * 
     * @param body
     * @return
     *     returns org.uddi.api_v2.DispositionReport
     * @throws org.uddi.v2_service.DispositionReport
     */
    @WebMethod(operationName = "delete_publisherAssertions", action = "delete_publisherAssertions")
    @WebResult(name = "dispositionReport", targetNamespace = "urn:uddi-org:api_v2", partName = "body")
    public org.uddi.api_v2.DispositionReport deletePublisherAssertions(
        @WebParam(name = "delete_publisherAssertions", targetNamespace = "urn:uddi-org:api_v2", partName = "body")
        DeletePublisherAssertions body)
        throws org.uddi.v2_service.DispositionReport
    ;

    /**
     * 
     * @param body
     * @return
     *     returns org.uddi.api_v2.DispositionReport
     * @throws org.uddi.v2_service.DispositionReport
     */
    @WebMethod(operationName = "delete_service", action = "delete_service")
    @WebResult(name = "dispositionReport", targetNamespace = "urn:uddi-org:api_v2", partName = "body")
    public org.uddi.api_v2.DispositionReport deleteService(
        @WebParam(name = "delete_service", targetNamespace = "urn:uddi-org:api_v2", partName = "body")
        DeleteService body)
        throws org.uddi.v2_service.DispositionReport
    ;

    /**
     * 
     * @param body
     * @return
     *     returns org.uddi.api_v2.DispositionReport
     * @throws org.uddi.v2_service.DispositionReport
     */
    @WebMethod(operationName = "delete_tModel", action = "delete_tModel")
    @WebResult(name = "dispositionReport", targetNamespace = "urn:uddi-org:api_v2", partName = "body")
    public org.uddi.api_v2.DispositionReport deleteTModel(
        @WebParam(name = "delete_tModel", targetNamespace = "urn:uddi-org:api_v2", partName = "body")
        DeleteTModel body)
        throws org.uddi.v2_service.DispositionReport
    ;

    /**
     * 
     * @param body
     * @return
     *     returns org.uddi.api_v2.DispositionReport
     * @throws org.uddi.v2_service.DispositionReport
     */
    @WebMethod(operationName = "discard_authToken", action = "discard_authToken")
    @WebResult(name = "dispositionReport", targetNamespace = "urn:uddi-org:api_v2", partName = "body")
    public org.uddi.api_v2.DispositionReport discardAuthToken(
        @WebParam(name = "discard_authToken", targetNamespace = "urn:uddi-org:api_v2", partName = "body")
        DiscardAuthToken body)
        throws org.uddi.v2_service.DispositionReport
    ;

    /**
     * 
     * @param body
     * @return
     *     returns org.uddi.api_v2.AssertionStatusReport
     * @throws org.uddi.v2_service.DispositionReport
     */
    @WebMethod(operationName = "get_assertionStatusReport", action = "get_assertionStatusReport")
    @WebResult(name = "assertionStatusReport", targetNamespace = "urn:uddi-org:api_v2", partName = "body")
    public AssertionStatusReport getAssertionStatusReport(
        @WebParam(name = "get_assertionStatusReport", targetNamespace = "urn:uddi-org:api_v2", partName = "body")
        GetAssertionStatusReport body)
        throws org.uddi.v2_service.DispositionReport
    ;

    /**
     * 
     * @param body
     * @return
     *     returns org.uddi.api_v2.AuthToken
     * @throws org.uddi.v2_service.DispositionReport
     */
    @WebMethod(operationName = "get_authToken", action = "get_authToken")
    @WebResult(name = "authToken", targetNamespace = "urn:uddi-org:api_v2", partName = "body")
    public AuthToken getAuthToken(
        @WebParam(name = "get_authToken", targetNamespace = "urn:uddi-org:api_v2", partName = "body")
        GetAuthToken body)
        throws org.uddi.v2_service.DispositionReport
    ;

    /**
     * 
     * @param body
     * @return
     *     returns org.uddi.api_v2.PublisherAssertions
     * @throws org.uddi.v2_service.DispositionReport
     */
    @WebMethod(operationName = "get_publisherAssertions", action = "get_publisherAssertions")
    @WebResult(name = "publisherAssertions", targetNamespace = "urn:uddi-org:api_v2", partName = "body")
    public PublisherAssertions getPublisherAssertions(
        @WebParam(name = "get_publisherAssertions", targetNamespace = "urn:uddi-org:api_v2", partName = "body")
        GetPublisherAssertions body)
        throws org.uddi.v2_service.DispositionReport
    ;

    /**
     * 
     * @param body
     * @return
     *     returns org.uddi.api_v2.RegisteredInfo
     * @throws org.uddi.v2_service.DispositionReport
     */
    @WebMethod(operationName = "get_registeredInfo", action = "get_registeredInfo")
    @WebResult(name = "registeredInfo", targetNamespace = "urn:uddi-org:api_v2", partName = "body")
    public RegisteredInfo getRegisteredInfo(
        @WebParam(name = "get_registeredInfo", targetNamespace = "urn:uddi-org:api_v2", partName = "body")
        GetRegisteredInfo body)
        throws org.uddi.v2_service.DispositionReport
    ;

    /**
     * 
     * @param body
     * @return
     *     returns org.uddi.api_v2.BindingDetail
     * @throws org.uddi.v2_service.DispositionReport
     */
    @WebMethod(operationName = "save_binding", action = "save_binding")
    @WebResult(name = "bindingDetail", targetNamespace = "urn:uddi-org:api_v2", partName = "body")
    public BindingDetail saveBinding(
        @WebParam(name = "save_binding", targetNamespace = "urn:uddi-org:api_v2", partName = "body")
        SaveBinding body)
        throws org.uddi.v2_service.DispositionReport
    ;

    /**
     * 
     * @param body
     * @return
     *     returns org.uddi.api_v2.BusinessDetail
     * @throws org.uddi.v2_service.DispositionReport
     */
    @WebMethod(operationName = "save_business", action = "save_business")
    @WebResult(name = "businessDetail", targetNamespace = "urn:uddi-org:api_v2", partName = "body")
    public BusinessDetail saveBusiness(
        @WebParam(name = "save_business", targetNamespace = "urn:uddi-org:api_v2", partName = "body")
        SaveBusiness body)
        throws org.uddi.v2_service.DispositionReport
    ;

    /**
     * 
     * @param body
     * @return
     *     returns org.uddi.api_v2.ServiceDetail
     * @throws org.uddi.v2_service.DispositionReport
     */
    @WebMethod(operationName = "save_service", action = "save_service")
    @WebResult(name = "serviceDetail", targetNamespace = "urn:uddi-org:api_v2", partName = "body")
    public ServiceDetail saveService(
        @WebParam(name = "save_service", targetNamespace = "urn:uddi-org:api_v2", partName = "body")
        SaveService body)
        throws org.uddi.v2_service.DispositionReport
    ;

    /**
     * 
     * @param body
     * @return
     *     returns org.uddi.api_v2.TModelDetail
     * @throws org.uddi.v2_service.DispositionReport
     */
    @WebMethod(operationName = "save_tModel", action = "save_tModel")
    @WebResult(name = "tModelDetail", targetNamespace = "urn:uddi-org:api_v2", partName = "body")
    public TModelDetail saveTModel(
        @WebParam(name = "save_tModel", targetNamespace = "urn:uddi-org:api_v2", partName = "body")
        SaveTModel body)
        throws org.uddi.v2_service.DispositionReport
    ;

    /**
     * 
     * @param body
     * @return
     *     returns org.uddi.api_v2.PublisherAssertions
     * @throws org.uddi.v2_service.DispositionReport
     */
    @WebMethod(operationName = "set_publisherAssertions", action = "set_publisherAssertions")
    @WebResult(name = "publisherAssertions", targetNamespace = "urn:uddi-org:api_v2", partName = "body")
    public PublisherAssertions setPublisherAssertions(
        @WebParam(name = "set_publisherAssertions", targetNamespace = "urn:uddi-org:api_v2", partName = "body")
        SetPublisherAssertions body)
        throws org.uddi.v2_service.DispositionReport
    ;

}
