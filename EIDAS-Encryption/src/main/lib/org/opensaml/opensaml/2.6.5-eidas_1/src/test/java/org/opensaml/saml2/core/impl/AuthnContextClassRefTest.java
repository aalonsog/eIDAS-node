/*
 * Licensed to the University Corporation for Advanced Internet Development, 
 * Inc. (UCAID) under one or more contributor license agreements.  See the 
 * NOTICE file distributed with this work for additional information regarding
 * copyright ownership. The UCAID licenses this file to You under the Apache 
 * License, Version 2.0 (the "License"); you may not use this file except in 
 * compliance with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.opensaml.saml2.core.impl;

import javax.xml.namespace.QName;

import org.opensaml.common.BaseSAMLObjectProviderTestCase;
import org.opensaml.common.xml.SAMLConstants;
import org.opensaml.saml2.core.AuthnContextClassRef;

/**
 * Test case for creating, marshalling, and unmarshalling {@link org.opensaml.saml2.core.impl.AuthnContextClassRefImpl}.
 */
public class AuthnContextClassRefTest extends BaseSAMLObjectProviderTestCase {

    /** Expected Class Reference value */
    protected String expectedClassRef;

    /** Constructor */
    public AuthnContextClassRefTest() {
        singleElementFile = "/data/org/opensaml/saml2/core/impl/AuthnContextClassRef.xml";
    }

    /** {@inheritDoc} */
    protected void setUp() throws Exception {
        super.setUp();

        expectedClassRef = "class reference";
    }

    /** {@inheritDoc} */
    public void testSingleElementUnmarshall() {
        AuthnContextClassRef authnContextClassRef = (AuthnContextClassRef) unmarshallElement(singleElementFile);

        String classRef = authnContextClassRef.getAuthnContextClassRef();
        assertEquals("Class Reference was " + classRef + ", expected " + expectedClassRef, expectedClassRef, classRef);
    }

    /** {@inheritDoc} */
    public void testSingleElementOptionalAttributesUnmarshall() {
        // do nothing
    }

    /** {@inheritDoc} */
    public void testSingleElementMarshall() {
        QName qname = new QName(SAMLConstants.SAML20_NS, AuthnContextClassRef.DEFAULT_ELEMENT_LOCAL_NAME, SAMLConstants.SAML20_PREFIX);
        AuthnContextClassRef authnContextClassRef = (AuthnContextClassRef) buildXMLObject(qname);

        authnContextClassRef.setAuthnContextClassRef(expectedClassRef);
        assertEquals(expectedDOM, authnContextClassRef);
    }

    /** {@inheritDoc} */
    public void testSingleElementOptionalAttributesMarshall() {
        // do nothing
    }
}