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


package org.uddi.policy_v3_instanceparms;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for authInfoUse_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="authInfoUse_type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="required"/>
 *     &lt;enumeration value="optional"/>
 *     &lt;enumeration value="ignored"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "authInfoUse_type")
@XmlEnum
public enum AuthInfoUseType implements Serializable{

    @XmlEnumValue("required")
    REQUIRED("required"),
    @XmlEnumValue("optional")
    OPTIONAL("optional"),
    @XmlEnumValue("ignored")
    IGNORED("ignored");
    private final String value;

    AuthInfoUseType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AuthInfoUseType fromValue(String v) {
        for (AuthInfoUseType c: AuthInfoUseType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
