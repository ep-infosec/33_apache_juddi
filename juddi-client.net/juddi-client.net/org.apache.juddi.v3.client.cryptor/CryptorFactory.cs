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
using System;
using System.Collections.Generic;

using System.Text;


namespace org.apache.juddi.v3.client.cryptor
{
    /// <summary>
    /// loads the appropriate cipher
    /// </summary>
    /// <author><a href="mailto:alexoree@apache.org">Alex O'Ree</a></author> 
    public class CryptorFactory
    {
        static Dictionary<String, Cryptor> cache = new Dictionary<string, Cryptor>();

        public static readonly string AES128 = "AES128Cryptor";
        public static readonly string AES256 = "AES256Cryptor";
        [Obsolete("This class should not be used anymore!", false)]
        public static readonly string TripleDES = "TripleDESCryptor";
        /// <summary>
        /// known implementations
        /// org.apache.juddi.v3.client.crypto.AES128Cryptor
        /// org.apache.juddi.v3.client.crypto.AES256Cryptor
        /// org.apache.juddi.v3.client.crypto.TripleDESCryptor
        /// </summary>
        /// <param name="clazz"></param>
        /// <returns></returns>
        public static Cryptor getCryptor(string clazz)
        {
            if (cache.ContainsKey(clazz))
                return cache[clazz];
            Cryptor c = null;
            if (clazz.Equals(typeof(org.apache.juddi.v3.client.cryptor.AES128Cryptor).Name))
            {
                c = new AES128Cryptor();
            }
            if (clazz.Equals(typeof(org.apache.juddi.v3.client.cryptor.AES256Cryptor).Name))
            {
                c = new AES256Cryptor();
            }
            if (clazz.Equals(typeof(org.apache.juddi.v3.client.cryptor.TripleDESCryptor).Name))
            {
                c = new TripleDESCryptor();
            }
            if (c != null)
                cache.Add(clazz, c);
            return c;

        }
    }
}
