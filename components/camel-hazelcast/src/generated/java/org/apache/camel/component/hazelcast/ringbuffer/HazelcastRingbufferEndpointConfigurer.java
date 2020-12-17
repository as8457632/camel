/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.hazelcast.ringbuffer;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class HazelcastRingbufferEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        HazelcastRingbufferEndpoint target = (HazelcastRingbufferEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "defaultoperation":
        case "defaultOperation": target.setDefaultOperation(property(camelContext, org.apache.camel.component.hazelcast.HazelcastOperation.class, value)); return true;
        case "hazelcastinstance":
        case "hazelcastInstance": target.setHazelcastInstance(property(camelContext, com.hazelcast.core.HazelcastInstance.class, value)); return true;
        case "hazelcastinstancename":
        case "hazelcastInstanceName": target.setHazelcastInstanceName(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "defaultoperation":
        case "defaultOperation": return org.apache.camel.component.hazelcast.HazelcastOperation.class;
        case "hazelcastinstance":
        case "hazelcastInstance": return com.hazelcast.core.HazelcastInstance.class;
        case "hazelcastinstancename":
        case "hazelcastInstanceName": return java.lang.String.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "synchronous": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        HazelcastRingbufferEndpoint target = (HazelcastRingbufferEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "defaultoperation":
        case "defaultOperation": return target.getDefaultOperation();
        case "hazelcastinstance":
        case "hazelcastInstance": return target.getHazelcastInstance();
        case "hazelcastinstancename":
        case "hazelcastInstanceName": return target.getHazelcastInstanceName();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "synchronous": return target.isSynchronous();
        default: return null;
        }
    }
}

