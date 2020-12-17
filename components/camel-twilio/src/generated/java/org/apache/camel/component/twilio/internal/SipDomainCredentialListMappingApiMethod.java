
/*
 * Camel ApiMethod Enumeration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.twilio.internal;

import java.lang.reflect.Method;
import java.util.List;

import com.twilio.rest.api.v2010.account.sip.domain.CredentialListMapping;

import org.apache.camel.support.component.ApiMethod;
import org.apache.camel.support.component.ApiMethodArg;
import org.apache.camel.support.component.ApiMethodImpl;

import static org.apache.camel.support.component.ApiMethodArg.arg;

/**
 * Camel {@link ApiMethod} Enumeration for com.twilio.rest.api.v2010.account.sip.domain.CredentialListMapping
 */
public enum SipDomainCredentialListMappingApiMethod implements ApiMethod {

    CREATOR(
        com.twilio.rest.api.v2010.account.sip.domain.CredentialListMappingCreator.class,
        "creator",
        arg("pathDomainSid", String.class),
        arg("credentialListSid", String.class)),

    CREATOR_1(
        com.twilio.rest.api.v2010.account.sip.domain.CredentialListMappingCreator.class,
        "creator",
        arg("pathAccountSid", String.class),
        arg("pathDomainSid", String.class),
        arg("credentialListSid", String.class)),

    DELETER(
        com.twilio.rest.api.v2010.account.sip.domain.CredentialListMappingDeleter.class,
        "deleter",
        arg("pathDomainSid", String.class),
        arg("pathSid", String.class)),

    DELETER_1(
        com.twilio.rest.api.v2010.account.sip.domain.CredentialListMappingDeleter.class,
        "deleter",
        arg("pathAccountSid", String.class),
        arg("pathDomainSid", String.class),
        arg("pathSid", String.class)),

    FETCHER(
        com.twilio.rest.api.v2010.account.sip.domain.CredentialListMappingFetcher.class,
        "fetcher",
        arg("pathDomainSid", String.class),
        arg("pathSid", String.class)),

    FETCHER_1(
        com.twilio.rest.api.v2010.account.sip.domain.CredentialListMappingFetcher.class,
        "fetcher",
        arg("pathAccountSid", String.class),
        arg("pathDomainSid", String.class),
        arg("pathSid", String.class)),

    READER(
        com.twilio.rest.api.v2010.account.sip.domain.CredentialListMappingReader.class,
        "reader",
        arg("pathDomainSid", String.class)),

    READER_1(
        com.twilio.rest.api.v2010.account.sip.domain.CredentialListMappingReader.class,
        "reader",
        arg("pathAccountSid", String.class),
        arg("pathDomainSid", String.class));

    private final ApiMethod apiMethod;

    private SipDomainCredentialListMappingApiMethod(Class<?> resultType, String name, ApiMethodArg... args) {
        this.apiMethod = new ApiMethodImpl(CredentialListMapping.class, resultType, name, args);
    }

    @Override
    public String getName() { return apiMethod.getName(); }

    @Override
    public Class<?> getResultType() { return apiMethod.getResultType(); }

    @Override
    public List<String> getArgNames() { return apiMethod.getArgNames(); }

    @Override
    public List<Class<?>> getArgTypes() { return apiMethod.getArgTypes(); }

    @Override
    public Method getMethod() { return apiMethod.getMethod(); }
}
