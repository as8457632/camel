/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.component.dsl;

import javax.annotation.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.twilio.TwilioComponent;

/**
 * Interact with Twilio REST APIs using Twilio Java SDK.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface TwilioComponentBuilderFactory {

    /**
     * Twilio (camel-twilio)
     * Interact with Twilio REST APIs using Twilio Java SDK.
     * 
     * Category: api,messaging,cloud
     * Since: 2.20
     * Maven coordinates: org.apache.camel:camel-twilio
     * 
     * @return the dsl builder
     */
    static TwilioComponentBuilder twilio() {
        return new TwilioComponentBuilderImpl();
    }

    /**
     * Builder for the Twilio component.
     */
    interface TwilioComponentBuilder
            extends
                ComponentBuilder<TwilioComponent> {
        /**
         * To use the shared configuration.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.twilio.TwilioConfiguration&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param configuration the value to set
         * @return the dsl builder
         */
        default TwilioComponentBuilder configuration(
                org.apache.camel.component.twilio.TwilioConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default TwilioComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default TwilioComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether autowiring is enabled. This is used for automatic autowiring
         * options (the option must be marked as autowired) by looking up in the
         * registry to find if there is a single instance of matching type,
         * which then gets configured on the component. This can be used for
         * automatic configuring JDBC data sources, JMS connection factories,
         * AWS Clients, etc.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: advanced
         * 
         * @param autowiredEnabled the value to set
         * @return the dsl builder
         */
        default TwilioComponentBuilder autowiredEnabled(boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
        /**
         * To use the shared REST client.
         * 
         * The option is a:
         * &lt;code&gt;com.twilio.http.TwilioRestClient&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param restClient the value to set
         * @return the dsl builder
         */
        default TwilioComponentBuilder restClient(
                com.twilio.http.TwilioRestClient restClient) {
            doSetProperty("restClient", restClient);
            return this;
        }
        /**
         * The account SID to use.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param accountSid the value to set
         * @return the dsl builder
         */
        default TwilioComponentBuilder accountSid(java.lang.String accountSid) {
            doSetProperty("accountSid", accountSid);
            return this;
        }
        /**
         * Auth token for the account.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param password the value to set
         * @return the dsl builder
         */
        default TwilioComponentBuilder password(java.lang.String password) {
            doSetProperty("password", password);
            return this;
        }
        /**
         * The account to use.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param username the value to set
         * @return the dsl builder
         */
        default TwilioComponentBuilder username(java.lang.String username) {
            doSetProperty("username", username);
            return this;
        }
    }

    class TwilioComponentBuilderImpl
            extends
                AbstractComponentBuilder<TwilioComponent>
            implements
                TwilioComponentBuilder {
        @Override
        protected TwilioComponent buildConcreteComponent() {
            return new TwilioComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "configuration": ((TwilioComponent) component).setConfiguration((org.apache.camel.component.twilio.TwilioConfiguration) value); return true;
            case "bridgeErrorHandler": ((TwilioComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "lazyStartProducer": ((TwilioComponent) component).setLazyStartProducer((boolean) value); return true;
            case "autowiredEnabled": ((TwilioComponent) component).setAutowiredEnabled((boolean) value); return true;
            case "restClient": ((TwilioComponent) component).setRestClient((com.twilio.http.TwilioRestClient) value); return true;
            case "accountSid": ((TwilioComponent) component).setAccountSid((java.lang.String) value); return true;
            case "password": ((TwilioComponent) component).setPassword((java.lang.String) value); return true;
            case "username": ((TwilioComponent) component).setUsername((java.lang.String) value); return true;
            default: return false;
            }
        }
    }
}