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
package org.uddi.v3_service;

import java.rmi.Remote;
import java.rmi.RemoteException;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import org.uddi.api_v3.AuthToken;
import org.uddi.api_v3.DiscardAuthToken;
import org.uddi.api_v3.GetAuthToken;

/**
 * This portType defines all of the UDDI security operations.
 *
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.5-b03- Generated
 * source version: 2.1
 *
 * <p class="MsoBodyText">The security API includes the following API calls:</p>
 *
 * <p class="MsoBodyText" style="margin-left:1.0in;text-indent:-.25in"><span
 * style="font-family:Symbol">·<span style="font:7.0pt &quot;Times New
 * Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
 * </span></span><b>discard_authToken</b>: Used to inform a node that a
 * previously obtained authentication token is no longer required and should be
 * considered invalid if used after this message is received.</p>
 *
 * <p class="MsoBodyText" style="margin-left:1.0in;text-indent:-.25in"><span
 * style="font-family:Symbol">·<span style="font:7.0pt &quot;Times New
 * Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
 * </span></span><b>get_authToken</b>: Used to request an authentication token
 * in the form of an authInfo element from a UDDI node.&nbsp; An authInfo
 * element MAY be required when using the API calls defined in Section <a
 * href="#_Ref8979317 ">5.1</a> <i>Inquiry API Set</i>, Section <a
 * href="#_Ref8979330 ">5.2</a> <i>Publication API Set</i>, Section <a
 * href="#_Ref8979371 ">5.4</a> <i>Custody and Ownership Transfer API Set,
 * </i>and Section <a href="#_Ref8979423 ">5.5</a> <i>Subscription API
 * Set</i>.</p>
 *
 * <p class="MsoBodyText">Whether authInfo elements are required on API calls is
 * determined by node policy as described in Section <a href="#_Ref8979130
 * ">4.8</a> <i>About Access Control and the authInfo Element</i>. In the event
 * that an authInfo element is not discarded, a node MAY choose to expire the
 * authentication token so it is no longer valid for authentication in API calls
 * after a period of time.&nbsp; If an expired token is passed to an API call
 * other than discard_authToken, the error E_authTokenExpired will be returned
 * as described in Chapter 12, <i>Error Codes</i>.</p>
 *
 * <p class="MsoBodyText">A UDDI node typically does not support the Security
 * API set if it does not support using an authInfo element in any API set. If
 * the node does support using an authInfo element in any of the API set
 * provided by the node, it SHOULD support the Security API set.&nbsp; A node
 * MAY provide an alternative mechanism for obtaining authInfo elements.&nbsp;
 * </p>
 */
@WebService(name = "UDDI_Security_PortType", targetNamespace = "urn:uddi-org:api_v3_portType")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    org.uddi.custody_v3.ObjectFactory.class,
    org.uddi.repl_v3.ObjectFactory.class,
    org.uddi.subr_v3.ObjectFactory.class,
    org.uddi.api_v3.ObjectFactory.class,
    org.uddi.vscache_v3.ObjectFactory.class,
    org.uddi.vs_v3.ObjectFactory.class,
    org.uddi.sub_v3.ObjectFactory.class,
    org.w3._2000._09.xmldsig_.ObjectFactory.class,
    org.uddi.policy_v3.ObjectFactory.class,
    org.uddi.policy_v3_instanceparms.ObjectFactory.class
})
public interface UDDISecurityPortType extends Remote {

    /**
     * The discard_authToken API call is used to inform a node that the passed
     * authentication token is to be discarded, effectively ending the session.
     *
     * @param body <span style="font-family:Symbol">·<span style="font:7.0pt
     * &quot;Times New
     * Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
     * </span></span><b><i>authInfo</i></b>: This required argument is an
     * element that contains an authentication token.&nbsp; Authentication
     * tokens are obtained using the get_authToken API call. Discarding an
     * expired authToken is processed and reported as a success condition.
     * @throws DispositionReportFaultMessage Upon successful completion, an
     * empty message is returned. See section 4.8 Success and Error Reporting.
     * If an error occurs in processing this API call, a dispositionReport
     * structure will be returned to the caller in a SOAP Fault.
     */
    @WebMethod(operationName = "discard_authToken", action = "discard_authToken")
    public void discardAuthToken(
            @WebParam(name = "discard_authToken", targetNamespace = "urn:uddi-org:api_v3", partName = "body") DiscardAuthToken body)
            throws DispositionReportFaultMessage, RemoteException;

    /**
     * The get_authToken API call is used to obtain an authentication token. An
     * authToken element MAY be required when using the API calls defined in
     * Section 5.1 Inquiry API Set, Section 5.2 Publication API Set, Section 5.4
     * Custody and Ownership Transfer API Set, and Section 5.5 Subscription API
     * Set.
     *
     * @param body <p class="MsoBodyText"
     * style="margin-left:1.0in;text-indent:-.25in"><span
     * style="font-family:Symbol">·<span style="font:7.0pt &quot;Times New
     * Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
     * </span></span><b><i>userID</i></b>: This required attribute argument is
     * the user identifier that an individual authorized user was assigned by a
     * UDDI node.&nbsp; Nodes SHOULD provide a means for individuals to obtain a
     * userID and password credentials that will be valid at the given node.</p>
     *
     * <p class="MsoBodyText" style="margin-left:1.0in;text-indent:-.25in"><span
     * style="font-family:Symbol">·<span style="font:7.0pt &quot;Times New
     * Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
     * </span></span><b><i>cred</i></b>: This required attribute argument is the
     * password or credential that is associated with the user.</p>
     * @return returns org.uddi.api_v3.AuthToken Upon successful completion this
     * API call returns an authToken structure that contains a valid authInfo
     * element that can be used in subsequent calls to API calls that require an
     * authInfo value.
     *
     * The authToken message has the form: <img
     * src="http://uddi.org/pubs/uddi-v3.0.2-20041019_files/image085.gif">
     *     
* The authToken structure contains a single authInfo element that
     * represents a token that is to be passed back in API calls that require
     * one. This structure is always returned as a synchronous response to the
     * get_authToken message.
     *
     *
     * @throws DispositionReportFaultMessage <p class="MsoBodyText">If an error
     * occurs in processing this API call, a dispositionReport element will be
     * returned to the caller within a SOAP Fault.&nbsp; In addition to the
     * errors common to all APIs, the following error information is relevant
     * here:</p>
     *
     * <p class="MsoBodyText" style="margin-left:1.0in;text-indent:-.25in"><span
     * style="font-family:Symbol">·<span style="font:7.0pt &quot;Times New
     * Roman&quot;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
     * </span></span><b>E_unknownUser</b>: Signifies that the UDDI node that
     * received the request does not accept the userID and/or cred argument
     * values passed as valid credentials.</p>
     *
     * <p class="MsoBodyText">&nbsp;</p>
     */
    @WebMethod(operationName = "get_authToken", action = "get_authToken")
    @WebResult(name = "authToken", targetNamespace = "urn:uddi-org:api_v3", partName = "body")
    public AuthToken getAuthToken(
            @WebParam(name = "get_authToken", targetNamespace = "urn:uddi-org:api_v3", partName = "body") GetAuthToken body)
            throws DispositionReportFaultMessage, RemoteException;
}
