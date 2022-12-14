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

//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Runtime Version:4.0.30319.18052
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

using org.uddi.apiv3;
using System.ServiceModel;
namespace org.apache.juddi.v3.client.subscription.wcf
{
    /// <summary>
    /// This interface is an adaptation to enable WCF style self hosted services while using
    /// ASP.NET generated XML classes
    /// </summary>

    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ServiceModel.ServiceContractAttribute(Namespace = "urn:uddi-org:v3_service")]
    public interface UDDI_SubscriptionListener_PortType
    {

        // CODEGEN: Generating message contract since the operation notify_subscriptionListener is neither RPC nor document wrapped.
        [System.ServiceModel.OperationContractAttribute(Action = "notify_subscriptionListener", ReplyAction = "*")]
        [System.ServiceModel.XmlSerializerFormatAttribute()]
        dispositionReport notify_subscriptionListener(notify_subscriptionListener request);
    }




}