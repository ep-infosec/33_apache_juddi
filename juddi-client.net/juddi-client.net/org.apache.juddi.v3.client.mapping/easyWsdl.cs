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

using System.Collections.Generic;
using System.Xml.Serialization;

// 
// This source code was auto-generated by xsd, Version=4.0.30319.17929.
// 

namespace org.xmlsoap.schemas.easyWsdl
{
    public static class ConvertTo
    {
        public static tDefinitions toEasyWsdl(org.xmlsoap.schemas.tDefinitions items)
        {

            tDefinitions x = new tDefinitions();
            x.Any = ConvertTo.toEasyAny(items.Any);
            x.binding = ConvertTo.toEasyBinding(items.binding);
            x.documentation = ConvertTo.toEasyDocumentation(items.documentation);
            x.import = ConvertTo.toEasyImport(items.import);
            x.message = ConvertTo.toEasyMessage(items.message);
            x.name = items.name;
            x.portType = ConvertTo.toEasyPorts(items.portType);
            x.service = ConvertTo.toEasyServices(items.service);
            x.targetNamespace = items.targetNamespace;
            x.types = ConvertTo.toEasyTypes(items.types);
            return x;

        }

        private static HashSet<tBinding> toEasyBinding(schemas.tBinding[] items)
        {
            HashSet<tBinding> ret = new HashSet<tBinding>();
            if (items != null)
            {
                for (int i = 0; i < items.Length; i++)
                {
                    tBinding x = new tBinding();
                    x.Any = ConvertTo.toEasyAny(items[i].Any);
                    x.documentation = ConvertTo.toEasyDocumentation(items[i].documentation);
                    x.name = items[i].name;
                    x.operation = ConvertTo.toBindingOperation(items[i].operation);
                    x.type = ConvertTo.toBindingType(items[i].type);
                    ret.Add(x);
                }
            }

            return ret;
        }

        private static System.Xml.XmlQualifiedName toBindingType(System.Xml.XmlQualifiedName xmlQualifiedName)
        {


            return xmlQualifiedName;
        }

        private static HashSet<tBindingOperation> toBindingOperation(schemas.tBindingOperation[] items)
        {
            HashSet<tBindingOperation> ret = new HashSet<tBindingOperation>();
            if (items != null)
            {
                for (int i = 0; i < items.Length; i++)
                {
                    tBindingOperation x = new tBindingOperation();
                    x.Any = ConvertTo.toEasyAny(items[i].Any);
                    x.documentation = ConvertTo.toEasyDocumentation(items[i].documentation);
                    x.name = items[i].name;
                    x.fault = ConvertTo.toOperationBindingFault(items[i].fault);
                    x.input = ConvertTo.toOperationBindingMethod(items[i].input);
                    x.output = ConvertTo.toOperationBindingMethod(items[i].output);

                    ret.Add(x);
                }
            }

            return ret;
        }

        private static HashSet<tBindingOperationFault> toOperationBindingFault(schemas.tBindingOperationFault[] items)
        {
            HashSet<tBindingOperationFault> ret = new HashSet<tBindingOperationFault>();
            if (items != null)
            {
                for (int i = 0; i < items.Length; i++)
                {
                    tBindingOperationFault x = new tBindingOperationFault();
                    x.Any = ConvertTo.toEasyAny(items[i].Any);
                    x.documentation = ConvertTo.toEasyDocumentation(items[i].documentation);
                    x.name = items[i].name;
                    ret.Add(x);
                }
            }

            return ret;
        }

        private static tBindingOperationMessage toOperationBindingMethod(schemas.tBindingOperationMessage items)
        {
            tBindingOperationMessage ret = new tBindingOperationMessage();
            ret.Any = ConvertTo.toEasyAny(items.Any);
            ret.documentation = ConvertTo.toEasyDocumentation(items.documentation);
            ret.name = items.name;
            return ret;
        }

        private static tDocumentation toEasyDocumentation(schemas.tDocumentation item)
        {
            if (item == null)
                return null;
            tDocumentation ret = new tDocumentation();
            ret.Any = ConvertTo.toEasyAny(item.Any);
            return ret;
        }

        private static HashSet<System.Xml.XmlNode> toEasyAny(System.Xml.XmlNode[] items)
        {
            HashSet<System.Xml.XmlNode> ret = new HashSet<System.Xml.XmlNode>();
            if (items != null)
                for (int i = 0; i < items.Length; i++)
                    ret.Add(items[i]);
            return ret;
        }

        private static HashSet<tImport> toEasyImport(schemas.tImport[] items)
        {
            HashSet<tImport> ret = new HashSet<tImport>();
            if (items == null)
                return ret;
            for (int i = 0; i < items.Length; i++)
            {
                tImport x = new tImport();
                x.AnyAttr = ConvertTo.toEasyAnyAttr(items[i].AnyAttr);
                x.documentation = ConvertTo.toEasyDocumentation(items[i].documentation);
                x.location = items[i].location;
                x.@namespace = items[i].@namespace;
                ret.Add(x);

            }
            return ret;
        }

        private static HashSet<System.Xml.XmlAttribute> toEasyAnyAttr(System.Xml.XmlAttribute[] xmlAttribute)
        {
            return new HashSet<System.Xml.XmlAttribute>();
        }

        private static HashSet<tMessage> toEasyMessage(schemas.tMessage[] items)
        {
            return new HashSet<tMessage>();
        }

        private static HashSet<tPortType> toEasyPorts(schemas.tPortType[] items)
        {
            HashSet<tPortType> ret = new HashSet<tPortType>();
            if (items == null)
                return ret;
            for (int i = 0; i < items.Length; i++)
            {
                tPortType x = new tPortType();
                x.documentation = ConvertTo.toEasyDocumentation(items[i].documentation);
                x.operation = ConvertTo.toEasyOperation(items[i].operation);
                x.name = items[i].name;
                ret.Add(x);
            }
            return ret;
        }

        private static HashSet<tOperation> toEasyOperation(schemas.tOperation[] items)
        {
            HashSet<tOperation> ret = new HashSet<tOperation>();
            if (items == null)
                return ret;
            for (int i = 0; i < items.Length; i++)
            {
                tOperation x = new tOperation();
                x.documentation = ConvertTo.toEasyDocumentation(items[i].documentation);
                x.Any = ConvertTo.toEasyAny(items[i].Any);
                x.parameterOrder = items[i].parameterOrder;
                x.name = items[i].name;
                ret.Add(x);
            }
            return ret;
        }

        private static HashSet<tService> toEasyServices(schemas.tService[] items)
        {
            HashSet<tService> ret = new HashSet<tService>();
            if (items == null)
                return ret;
            for (int i = 0; i < items.Length; i++)
            {
                tService x = new tService();
                x.Any = ConvertTo.toEasyAny(items[i].Any);
                x.documentation = ConvertTo.toEasyDocumentation(items[i].documentation);
                x.name = items[i].name;
                x.port = ConvertTo.toEasyPort(items[i].port);
                ret.Add(x);
            }
            return ret;
        }

        private static HashSet<tPort> toEasyPort(schemas.tPort[] items) 
        {
            HashSet<tPort> ret = new HashSet<tPort>();
            if (items == null)
                return ret;
            for (int i = 0; i < items.Length; i++)
            {
                tPort x = new tPort();
                x.Any = ConvertTo.toEasyAny(items[i].Any);
                x.documentation = ConvertTo.toEasyDocumentation(items[i].documentation);
                x.name = items[i].name;
                x.binding = ConvertTo.toBindingType(items[i].binding);

                ret.Add(x);
            }
            return ret;
        }



        private static HashSet<tTypes> toEasyTypes(schemas.tTypes[] items)
        {
            return new HashSet<tTypes>();
        }

        private static HashSet<System.Xml.XmlElement> toEasyAny(System.Xml.XmlElement[] items)
        {
            HashSet<System.Xml.XmlElement> ret = new HashSet<System.Xml.XmlElement>();
            if (items!=null)
                for (int i = 0; i < items.Length; i++)
                {
                    ret.Add(items[i]);
                }
            return ret;
        }
    }


    public partial class tDefinitions : tExtensibleDocumented
    {

        private HashSet<tImport> importField;

        private HashSet<tTypes> typesField;

        private HashSet<tMessage> messageField;

        private HashSet<tPortType> portTypeField;

        private HashSet<tBinding> bindingField;

        private HashSet<tService> serviceField;

        private string targetNamespaceField;

        private string nameField;

        /// <remarks/>

        public HashSet<tImport> import
        {
            get
            {
                return this.importField;
            }
            set
            {
                this.importField = value;
            }
        }

        /// <remarks/>

        public HashSet<tTypes> types
        {
            get
            {
                return this.typesField;
            }
            set
            {
                this.typesField = value;
            }
        }

        public HashSet<tMessage> message
        {
            get
            {
                return this.messageField;
            }
            set
            {
                this.messageField = value;
            }
        }


        public HashSet<tPortType> portType
        {
            get
            {
                return this.portTypeField;
            }
            set
            {
                this.portTypeField = value;
            }
        }


        public HashSet<tBinding> binding
        {
            get
            {
                return this.bindingField;
            }
            set
            {
                this.bindingField = value;
            }
        }

        public HashSet<tService> service
        {
            get
            {
                return this.serviceField;
            }
            set
            {
                this.serviceField = value;
            }
        }


        public string targetNamespace
        {
            get
            {
                return this.targetNamespaceField;
            }
            set
            {
                this.targetNamespaceField = value;
            }
        }


        public string name
        {
            get
            {
                return this.nameField;
            }
            set
            {
                this.nameField = value;
            }
        }

        public Dictionary<apache.juddi.v3.client.mapping.QName, tPortType> getAllPortTypes()
        {
            Dictionary<apache.juddi.v3.client.mapping.QName, tPortType> ret = new Dictionary<apache.juddi.v3.client.mapping.QName, tPortType>();
            HashSet<tPortType>.Enumerator it = this.portType.GetEnumerator();
            while (it.MoveNext())
            {
                ret.Add(new apache.juddi.v3.client.mapping.QName(this.targetNamespace, it.Current.name), it.Current);
            }
            return ret;
        }

        public Dictionary<apache.juddi.v3.client.mapping.QName, tBinding> getAllBindings()
        {
            Dictionary<apache.juddi.v3.client.mapping.QName, tBinding> ret = new Dictionary<apache.juddi.v3.client.mapping.QName, tBinding>();
            HashSet<tBinding>.Enumerator it = this.binding.GetEnumerator();
            while (it.MoveNext())
            {
                ret.Add(new apache.juddi.v3.client.mapping.QName(this.targetNamespace, it.Current.name), it.Current);
            }
            return ret;
        }

        public Dictionary<apache.juddi.v3.client.mapping.QName, tService> getAllServices()
        {
            Dictionary<apache.juddi.v3.client.mapping.QName, tService> ret = new Dictionary<apache.juddi.v3.client.mapping.QName, tService>();
            HashSet<tService>.Enumerator it = this.service.GetEnumerator();
            while (it.MoveNext())
            {
                ret.Add(new apache.juddi.v3.client.mapping.QName(this.targetNamespace, it.Current.name), it.Current);
            }
            return ret;
        }

        public tService getService(apache.juddi.v3.client.mapping.QName serviceQName)
        {
            HashSet<tService>.Enumerator it = this.service.GetEnumerator();
            while (it.MoveNext())
            {
                if (it.Current.name.Equals(serviceQName.getLocalPart(), System.StringComparison.CurrentCultureIgnoreCase))
                    return it.Current;
            }
            return null;
        }

        public tBinding getBinding(System.Xml.XmlQualifiedName bx)
        {
             HashSet<tBinding>.Enumerator it = this.binding.GetEnumerator();
            while (it.MoveNext())
            {
                if (it.Current.name.Equals(bx.Name, System.StringComparison.CurrentCultureIgnoreCase))
                    return it.Current;
            }
            return null;
        }

        public tPortType getPortType(System.Xml.XmlQualifiedName bx)
        {
            HashSet<tPortType>.Enumerator it = this.portType.GetEnumerator();
            while (it.MoveNext())
            {
                if (it.Current.name.Equals(bx.Name, System.StringComparison.CurrentCultureIgnoreCase))
                    return it.Current;
            }
            return null;
        }
    }


    public partial class tImport : tExtensibleAttributesDocumented
    {

        private string namespaceField;

        private string locationField;

        public string @namespace
        {
            get
            {
                return this.namespaceField;
            }
            set
            {
                this.namespaceField = value;
            }
        }

        public string location
        {
            get
            {
                return this.locationField;
            }
            set
            {
                this.locationField = value;
            }
        }
    }

    /// <remarks/>
    [System.Xml.Serialization.XmlIncludeAttribute(typeof(tFault))]
    [System.Xml.Serialization.XmlIncludeAttribute(typeof(tParam))]
    [System.Xml.Serialization.XmlIncludeAttribute(typeof(tPortType))]
    [System.Xml.Serialization.XmlIncludeAttribute(typeof(tPart))]
    [System.Xml.Serialization.XmlIncludeAttribute(typeof(tImport))]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("xsd", "4.0.30319.17929")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(Namespace = "http://schemas.xmlsoap.org/wsdl/")]
    public abstract partial class tExtensibleAttributesDocumented : tDocumented
    {

        private HashSet<System.Xml.XmlAttribute> anyAttrField;

        /// <remarks/>
        [System.Xml.Serialization.XmlAnyAttributeAttribute()]
        public HashSet<System.Xml.XmlAttribute> AnyAttr
        {
            get
            {
                return this.anyAttrField;
            }
            set
            {
                this.anyAttrField = value;
            }
        }
    }

    /// <remarks/>
    [System.Xml.Serialization.XmlIncludeAttribute(typeof(tExtensibleDocumented))]
    [System.Xml.Serialization.XmlIncludeAttribute(typeof(tOperation))]
    [System.Xml.Serialization.XmlIncludeAttribute(typeof(tPort))]
    [System.Xml.Serialization.XmlIncludeAttribute(typeof(tService))]
    [System.Xml.Serialization.XmlIncludeAttribute(typeof(tBindingOperationFault))]
    [System.Xml.Serialization.XmlIncludeAttribute(typeof(tBindingOperationMessage))]
    [System.Xml.Serialization.XmlIncludeAttribute(typeof(tBindingOperation))]
    [System.Xml.Serialization.XmlIncludeAttribute(typeof(tBinding))]
    [System.Xml.Serialization.XmlIncludeAttribute(typeof(tMessage))]
    [System.Xml.Serialization.XmlIncludeAttribute(typeof(tTypes))]
    [System.Xml.Serialization.XmlIncludeAttribute(typeof(tDefinitions))]
    [System.Xml.Serialization.XmlIncludeAttribute(typeof(tExtensibleAttributesDocumented))]
    [System.Xml.Serialization.XmlIncludeAttribute(typeof(tFault))]
    [System.Xml.Serialization.XmlIncludeAttribute(typeof(tParam))]
    [System.Xml.Serialization.XmlIncludeAttribute(typeof(tPortType))]
    [System.Xml.Serialization.XmlIncludeAttribute(typeof(tPart))]
    [System.Xml.Serialization.XmlIncludeAttribute(typeof(tImport))]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("xsd", "4.0.30319.17929")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(Namespace = "http://schemas.xmlsoap.org/wsdl/")]
    public partial class tDocumented
    {

        private tDocumentation documentationField;

        /// <remarks/>
        public tDocumentation documentation
        {
            get
            {
                return this.documentationField;
            }
            set
            {
                this.documentationField = value;
            }
        }
    }

    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("xsd", "4.0.30319.17929")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(Namespace = "http://schemas.xmlsoap.org/wsdl/")]
    public partial class tDocumentation
    {

        private HashSet<System.Xml.XmlNode> anyField;

        /// <remarks/>
        [System.Xml.Serialization.XmlTextAttribute()]
        [System.Xml.Serialization.XmlAnyElementAttribute()]
        public HashSet<System.Xml.XmlNode> Any
        {
            get
            {
                return this.anyField;
            }
            set
            {
                this.anyField = value;
            }
        }
    }

    /// <remarks/>
    [System.Xml.Serialization.XmlIncludeAttribute(typeof(tOperation))]
    [System.Xml.Serialization.XmlIncludeAttribute(typeof(tPort))]
    [System.Xml.Serialization.XmlIncludeAttribute(typeof(tService))]
    [System.Xml.Serialization.XmlIncludeAttribute(typeof(tBindingOperationFault))]
    [System.Xml.Serialization.XmlIncludeAttribute(typeof(tBindingOperationMessage))]
    [System.Xml.Serialization.XmlIncludeAttribute(typeof(tBindingOperation))]
    [System.Xml.Serialization.XmlIncludeAttribute(typeof(tBinding))]
    [System.Xml.Serialization.XmlIncludeAttribute(typeof(tMessage))]
    [System.Xml.Serialization.XmlIncludeAttribute(typeof(tTypes))]
    [System.Xml.Serialization.XmlIncludeAttribute(typeof(tDefinitions))]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("xsd", "4.0.30319.17929")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(Namespace = "http://schemas.xmlsoap.org/wsdl/")]
    public abstract partial class tExtensibleDocumented : tDocumented
    {

        private HashSet<System.Xml.XmlElement> anyField;

        /// <remarks/>
        [System.Xml.Serialization.XmlAnyElementAttribute()]
        public HashSet<System.Xml.XmlElement> Any
        {
            get
            {
                return this.anyField;
            }
            set
            {
                this.anyField = value;
            }
        }
    }

    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("xsd", "4.0.30319.17929")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(Namespace = "http://schemas.xmlsoap.org/wsdl/")]
    public partial class tOperation : tExtensibleDocumented
    {

        private HashSet<tExtensibleAttributesDocumented> itemsField;

        private HashSet<ItemsChoiceType> itemsElementNameField;

        private string nameField;

        private string parameterOrderField;

        /// <remarks/>
        [System.Xml.Serialization.XmlElementAttribute("fault", typeof(tFault))]
        [System.Xml.Serialization.XmlElementAttribute("input", typeof(tParam))]
        [System.Xml.Serialization.XmlElementAttribute("output", typeof(tParam))]
        [System.Xml.Serialization.XmlChoiceIdentifierAttribute("ItemsElementName")]
        public HashSet<tExtensibleAttributesDocumented> Items
        {
            get
            {
                return this.itemsField;
            }
            set
            {
                this.itemsField = value;
            }
        }

        /// <remarks/>
        [System.Xml.Serialization.XmlElementAttribute("ItemsElementName")]
        [System.Xml.Serialization.XmlIgnoreAttribute()]
        public HashSet<ItemsChoiceType> ItemsElementName
        {
            get
            {
                return this.itemsElementNameField;
            }
            set
            {
                this.itemsElementNameField = value;
            }
        }

        /// <remarks/>
        [System.Xml.Serialization.XmlAttributeAttribute(DataType = "NCName")]
        public string name
        {
            get
            {
                return this.nameField;
            }
            set
            {
                this.nameField = value;
            }
        }

        /// <remarks/>
        [System.Xml.Serialization.XmlAttributeAttribute(DataType = "NMTOKENS")]
        public string parameterOrder
        {
            get
            {
                return this.parameterOrderField;
            }
            set
            {
                this.parameterOrderField = value;
            }
        }
    }

    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("xsd", "4.0.30319.17929")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(Namespace = "http://schemas.xmlsoap.org/wsdl/")]
    public partial class tFault : tExtensibleAttributesDocumented
    {

        private string nameField;

        private System.Xml.XmlQualifiedName messageField;

        /// <remarks/>
        [System.Xml.Serialization.XmlAttributeAttribute(DataType = "NCName")]
        public string name
        {
            get
            {
                return this.nameField;
            }
            set
            {
                this.nameField = value;
            }
        }

        /// <remarks/>
        [System.Xml.Serialization.XmlAttributeAttribute()]
        public System.Xml.XmlQualifiedName message
        {
            get
            {
                return this.messageField;
            }
            set
            {
                this.messageField = value;
            }
        }
    }

    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("xsd", "4.0.30319.17929")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(Namespace = "http://schemas.xmlsoap.org/wsdl/")]
    public partial class tParam : tExtensibleAttributesDocumented
    {

        private string nameField;

        private System.Xml.XmlQualifiedName messageField;

        /// <remarks/>
        [System.Xml.Serialization.XmlAttributeAttribute(DataType = "NCName")]
        public string name
        {
            get
            {
                return this.nameField;
            }
            set
            {
                this.nameField = value;
            }
        }

        /// <remarks/>
        [System.Xml.Serialization.XmlAttributeAttribute()]
        public System.Xml.XmlQualifiedName message
        {
            get
            {
                return this.messageField;
            }
            set
            {
                this.messageField = value;
            }
        }
    }

    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("xsd", "4.0.30319.17929")]
    [System.SerializableAttribute()]
    [System.Xml.Serialization.XmlTypeAttribute(Namespace = "http://schemas.xmlsoap.org/wsdl/", IncludeInSchema = false)]
    public enum ItemsChoiceType
    {

        /// <remarks/>
        fault,

        /// <remarks/>
        input,

        /// <remarks/>
        output,
    }

    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("xsd", "4.0.30319.17929")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(Namespace = "http://schemas.xmlsoap.org/wsdl/")]
    public partial class tPort : tExtensibleDocumented
    {

        private string nameField;

        private System.Xml.XmlQualifiedName bindingField;

        /// <remarks/>
        [System.Xml.Serialization.XmlAttributeAttribute(DataType = "NCName")]
        public string name
        {
            get
            {
                return this.nameField;
            }
            set
            {
                this.nameField = value;
            }
        }

        /// <remarks/>
        [System.Xml.Serialization.XmlAttributeAttribute()]
        public System.Xml.XmlQualifiedName binding
        {
            get
            {
                return this.bindingField;
            }
            set
            {
                this.bindingField = value;
            }
        }
    }

    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("xsd", "4.0.30319.17929")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(Namespace = "http://schemas.xmlsoap.org/wsdl/")]
    public partial class tService : tExtensibleDocumented
    {

        private HashSet<tPort> portField;

        private string nameField;

        /// <remarks/>
        [System.Xml.Serialization.XmlElementAttribute("port")]
        public HashSet<tPort> port
        {
            get
            {
                return this.portField;
            }
            set
            {
                this.portField = value;
            }
        }

        /// <remarks/>
        [System.Xml.Serialization.XmlAttributeAttribute(DataType = "NCName")]
        public string name
        {
            get
            {
                return this.nameField;
            }
            set
            {
                this.nameField = value;
            }
        }

        public tPort getPort(string portName)
        {
            HashSet<tPort>.Enumerator it = this.port.GetEnumerator();
            while (it.MoveNext())
            {
                if (it.Current.name.Equals(portName, System.StringComparison.CurrentCultureIgnoreCase))
                    return it.Current;
            }
            return null;
        }
    }

    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("xsd", "4.0.30319.17929")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(Namespace = "http://schemas.xmlsoap.org/wsdl/")]
    public partial class tBindingOperationFault : tExtensibleDocumented
    {

        private string nameField;

        /// <remarks/>
        [System.Xml.Serialization.XmlAttributeAttribute(DataType = "NCName")]
        public string name
        {
            get
            {
                return this.nameField;
            }
            set
            {
                this.nameField = value;
            }
        }
    }

    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("xsd", "4.0.30319.17929")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(Namespace = "http://schemas.xmlsoap.org/wsdl/")]
    public partial class tBindingOperationMessage : tExtensibleDocumented
    {

        private string nameField;

        /// <remarks/>
        [System.Xml.Serialization.XmlAttributeAttribute(DataType = "NCName")]
        public string name
        {
            get
            {
                return this.nameField;
            }
            set
            {
                this.nameField = value;
            }
        }
    }

    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("xsd", "4.0.30319.17929")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(Namespace = "http://schemas.xmlsoap.org/wsdl/")]
    public partial class tBindingOperation : tExtensibleDocumented
    {

        private tBindingOperationMessage inputField;

        private tBindingOperationMessage outputField;

        private HashSet<tBindingOperationFault> faultField;

        private string nameField;

        /// <remarks/>
        public tBindingOperationMessage input
        {
            get
            {
                return this.inputField;
            }
            set
            {
                this.inputField = value;
            }
        }

        /// <remarks/>
        public tBindingOperationMessage output
        {
            get
            {
                return this.outputField;
            }
            set
            {
                this.outputField = value;
            }
        }

        /// <remarks/>
        [System.Xml.Serialization.XmlElementAttribute("fault")]
        public HashSet<tBindingOperationFault> fault
        {
            get
            {
                return this.faultField;
            }
            set
            {
                this.faultField = value;
            }
        }

        /// <remarks/>
        [System.Xml.Serialization.XmlAttributeAttribute(DataType = "NCName")]
        public string name
        {
            get
            {
                return this.nameField;
            }
            set
            {
                this.nameField = value;
            }
        }
    }

    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("xsd", "4.0.30319.17929")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(Namespace = "http://schemas.xmlsoap.org/wsdl/")]
    public partial class tBinding : tExtensibleDocumented
    {

        private HashSet<tBindingOperation> operationField;

        private string nameField;

        private System.Xml.XmlQualifiedName typeField;

        /// <remarks/>
        [System.Xml.Serialization.XmlElementAttribute("operation")]
        public HashSet<tBindingOperation> operation
        {
            get
            {
                return this.operationField;
            }
            set
            {
                this.operationField = value;
            }
        }

        /// <remarks/>
        [System.Xml.Serialization.XmlAttributeAttribute(DataType = "NCName")]
        public string name
        {
            get
            {
                return this.nameField;
            }
            set
            {
                this.nameField = value;
            }
        }

        /// <remarks/>
        [System.Xml.Serialization.XmlAttributeAttribute()]
        public System.Xml.XmlQualifiedName type
        {
            get
            {
                return this.typeField;
            }
            set
            {
                this.typeField = value;
            }
        }
    }

    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("xsd", "4.0.30319.17929")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(Namespace = "http://schemas.xmlsoap.org/wsdl/")]
    public partial class tMessage : tExtensibleDocumented
    {

        private HashSet<tPart> partField;

        private string nameField;

        /// <remarks/>
        [System.Xml.Serialization.XmlElementAttribute("part")]
        public HashSet<tPart> part
        {
            get
            {
                return this.partField;
            }
            set
            {
                this.partField = value;
            }
        }

        /// <remarks/>
        [System.Xml.Serialization.XmlAttributeAttribute(DataType = "NCName")]
        public string name
        {
            get
            {
                return this.nameField;
            }
            set
            {
                this.nameField = value;
            }
        }
    }

    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("xsd", "4.0.30319.17929")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(Namespace = "http://schemas.xmlsoap.org/wsdl/")]
    public partial class tPart : tExtensibleAttributesDocumented
    {

        private string nameField;

        private System.Xml.XmlQualifiedName elementField;

        private System.Xml.XmlQualifiedName typeField;

        /// <remarks/>
        [System.Xml.Serialization.XmlAttributeAttribute(DataType = "NCName")]
        public string name
        {
            get
            {
                return this.nameField;
            }
            set
            {
                this.nameField = value;
            }
        }

        /// <remarks/>
        [System.Xml.Serialization.XmlAttributeAttribute()]
        public System.Xml.XmlQualifiedName element
        {
            get
            {
                return this.elementField;
            }
            set
            {
                this.elementField = value;
            }
        }

        /// <remarks/>
        [System.Xml.Serialization.XmlAttributeAttribute()]
        public System.Xml.XmlQualifiedName type
        {
            get
            {
                return this.typeField;
            }
            set
            {
                this.typeField = value;
            }
        }
    }

    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("xsd", "4.0.30319.17929")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(Namespace = "http://schemas.xmlsoap.org/wsdl/")]
    public partial class tTypes : tExtensibleDocumented
    {
    }

    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("xsd", "4.0.30319.17929")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(Namespace = "http://schemas.xmlsoap.org/wsdl/")]
    public partial class tPortType : tExtensibleAttributesDocumented
    {

        private HashSet<tOperation> operationField;

        private string nameField;

        /// <remarks/>
        [System.Xml.Serialization.XmlElementAttribute("operation")]
        public HashSet<tOperation> operation
        {
            get
            {
                return this.operationField;
            }
            set
            {
                this.operationField = value;
            }
        }

        /// <remarks/>
        [System.Xml.Serialization.XmlAttributeAttribute(DataType = "NCName")]
        public string name
        {
            get
            {
                return this.nameField;
            }
            set
            {
                this.nameField = value;
            }
        }
    }
}