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
import org.apache.camel.component.sparkrest.SparkComponent;

/**
 * The spark-rest component is used for hosting REST services which has been
 * defined using Camel rest-dsl.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface SparkRestComponentBuilderFactory {

    /**
     * Spark Rest (camel-spark-rest)
     * The spark-rest component is used for hosting REST services which has been
     * defined using Camel rest-dsl.
     * 
     * Category: rest
     * Since: 2.14
     * Maven coordinates: org.apache.camel:camel-spark-rest
     */
    static SparkRestComponentBuilder sparkRest() {
        return new SparkRestComponentBuilderImpl();
    }

    /**
     * Builder for the Spark Rest component.
     */
    interface SparkRestComponentBuilder
            extends
                ComponentBuilder<SparkComponent> {
        /**
         * Port number. Will by default use 4567.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 4567
         * Group: consumer
         */
        default SparkRestComponentBuilder port(int port) {
            doSetProperty("port", port);
            return this;
        }
        /**
         * Set the IP address that Spark should listen on. If not called the
         * default address is '0.0.0.0'.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: 0.0.0.0
         * Group: consumer
         */
        default SparkRestComponentBuilder ipAddress(java.lang.String ipAddress) {
            doSetProperty("ipAddress", ipAddress);
            return this;
        }
        /**
         * Minimum number of threads in Spark thread-pool (shared globally).
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: advanced
         */
        default SparkRestComponentBuilder minThreads(int minThreads) {
            doSetProperty("minThreads", minThreads);
            return this;
        }
        /**
         * Maximum number of threads in Spark thread-pool (shared globally).
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: advanced
         */
        default SparkRestComponentBuilder maxThreads(int maxThreads) {
            doSetProperty("maxThreads", maxThreads);
            return this;
        }
        /**
         * Thread idle timeout in millis where threads that has been idle for a
         * longer period will be terminated from the thread pool.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: advanced
         */
        default SparkRestComponentBuilder timeOutMillis(int timeOutMillis) {
            doSetProperty("timeOutMillis", timeOutMillis);
            return this;
        }
        /**
         * Configures connection to be secure to use the keystore file.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default SparkRestComponentBuilder keystoreFile(
                java.lang.String keystoreFile) {
            doSetProperty("keystoreFile", keystoreFile);
            return this;
        }
        /**
         * Configures connection to be secure to use the keystore password.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default SparkRestComponentBuilder keystorePassword(
                java.lang.String keystorePassword) {
            doSetProperty("keystorePassword", keystorePassword);
            return this;
        }
        /**
         * Configures connection to be secure to use the truststore file.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default SparkRestComponentBuilder truststoreFile(
                java.lang.String truststoreFile) {
            doSetProperty("truststoreFile", truststoreFile);
            return this;
        }
        /**
         * Configures connection to be secure to use the truststore password.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default SparkRestComponentBuilder truststorePassword(
                java.lang.String truststorePassword) {
            doSetProperty("truststorePassword", truststorePassword);
            return this;
        }
        /**
         * To use the shared SparkConfiguration.
         * 
         * The option is a:
         * <code>org.apache.camel.component.sparkrest.SparkConfiguration</code>
         * type.
         * 
         * Group: advanced
         */
        default SparkRestComponentBuilder sparkConfiguration(
                org.apache.camel.component.sparkrest.SparkConfiguration sparkConfiguration) {
            doSetProperty("sparkConfiguration", sparkConfiguration);
            return this;
        }
        /**
         * To use a custom SparkBinding to map to/from Camel message.
         * 
         * The option is a:
         * <code>org.apache.camel.component.sparkrest.SparkBinding</code> type.
         * 
         * Group: advanced
         */
        default SparkRestComponentBuilder sparkBinding(
                org.apache.camel.component.sparkrest.SparkBinding sparkBinding) {
            doSetProperty("sparkBinding", sparkBinding);
            return this;
        }
        /**
         * Whether the component should use basic property binding (Camel 2.x)
         * or the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default SparkRestComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
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
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default SparkRestComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
    }

    class SparkRestComponentBuilderImpl
            extends
                AbstractComponentBuilder<SparkComponent>
            implements
                SparkRestComponentBuilder {
        @Override
        protected SparkComponent buildConcreteComponent() {
            return new SparkComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "port": ((SparkComponent) component).setPort((int) value); return true;
            case "ipAddress": ((SparkComponent) component).setIpAddress((java.lang.String) value); return true;
            case "minThreads": ((SparkComponent) component).setMinThreads((int) value); return true;
            case "maxThreads": ((SparkComponent) component).setMaxThreads((int) value); return true;
            case "timeOutMillis": ((SparkComponent) component).setTimeOutMillis((int) value); return true;
            case "keystoreFile": ((SparkComponent) component).setKeystoreFile((java.lang.String) value); return true;
            case "keystorePassword": ((SparkComponent) component).setKeystorePassword((java.lang.String) value); return true;
            case "truststoreFile": ((SparkComponent) component).setTruststoreFile((java.lang.String) value); return true;
            case "truststorePassword": ((SparkComponent) component).setTruststorePassword((java.lang.String) value); return true;
            case "sparkConfiguration": ((SparkComponent) component).setSparkConfiguration((org.apache.camel.component.sparkrest.SparkConfiguration) value); return true;
            case "sparkBinding": ((SparkComponent) component).setSparkBinding((org.apache.camel.component.sparkrest.SparkBinding) value); return true;
            case "basicPropertyBinding": ((SparkComponent) component).setBasicPropertyBinding((boolean) value); return true;
            case "bridgeErrorHandler": ((SparkComponent) component).setBridgeErrorHandler((boolean) value); return true;
            default: return false;
            }
        }
    }
}