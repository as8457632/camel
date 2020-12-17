/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.pubnub;

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
public class PubNubEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        PubNubEndpoint target = (PubNubEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "authkey":
        case "authKey": target.getConfiguration().setAuthKey(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "cipherkey":
        case "cipherKey": target.getConfiguration().setCipherKey(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "operation": target.getConfiguration().setOperation(property(camelContext, java.lang.String.class, value)); return true;
        case "publishkey":
        case "publishKey": target.getConfiguration().setPublishKey(property(camelContext, java.lang.String.class, value)); return true;
        case "pubnub": target.setPubnub(property(camelContext, com.pubnub.api.PubNub.class, value)); return true;
        case "secretkey":
        case "secretKey": target.getConfiguration().setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
        case "secure": target.getConfiguration().setSecure(property(camelContext, boolean.class, value)); return true;
        case "subscribekey":
        case "subscribeKey": target.getConfiguration().setSubscribeKey(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "uuid": target.getConfiguration().setUuid(property(camelContext, java.lang.String.class, value)); return true;
        case "withpresence":
        case "withPresence": target.getConfiguration().setWithPresence(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "authkey":
        case "authKey": return java.lang.String.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "cipherkey":
        case "cipherKey": return java.lang.String.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "operation": return java.lang.String.class;
        case "publishkey":
        case "publishKey": return java.lang.String.class;
        case "pubnub": return com.pubnub.api.PubNub.class;
        case "secretkey":
        case "secretKey": return java.lang.String.class;
        case "secure": return boolean.class;
        case "subscribekey":
        case "subscribeKey": return java.lang.String.class;
        case "synchronous": return boolean.class;
        case "uuid": return java.lang.String.class;
        case "withpresence":
        case "withPresence": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        PubNubEndpoint target = (PubNubEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "authkey":
        case "authKey": return target.getConfiguration().getAuthKey();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "cipherkey":
        case "cipherKey": return target.getConfiguration().getCipherKey();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "operation": return target.getConfiguration().getOperation();
        case "publishkey":
        case "publishKey": return target.getConfiguration().getPublishKey();
        case "pubnub": return target.getPubnub();
        case "secretkey":
        case "secretKey": return target.getConfiguration().getSecretKey();
        case "secure": return target.getConfiguration().isSecure();
        case "subscribekey":
        case "subscribeKey": return target.getConfiguration().getSubscribeKey();
        case "synchronous": return target.isSynchronous();
        case "uuid": return target.getConfiguration().getUuid();
        case "withpresence":
        case "withPresence": return target.getConfiguration().isWithPresence();
        default: return null;
        }
    }
}

