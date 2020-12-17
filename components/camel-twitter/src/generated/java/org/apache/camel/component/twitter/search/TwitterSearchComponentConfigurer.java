/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.twitter.search;

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
public class TwitterSearchComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        TwitterSearchComponent target = (TwitterSearchComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstoken":
        case "accessToken": target.setAccessToken(property(camelContext, java.lang.String.class, value)); return true;
        case "accesstokensecret":
        case "accessTokenSecret": target.setAccessTokenSecret(property(camelContext, java.lang.String.class, value)); return true;
        case "autowiredenabled":
        case "autowiredEnabled": target.setAutowiredEnabled(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "consumerkey":
        case "consumerKey": target.setConsumerKey(property(camelContext, java.lang.String.class, value)); return true;
        case "consumersecret":
        case "consumerSecret": target.setConsumerSecret(property(camelContext, java.lang.String.class, value)); return true;
        case "httpproxyhost":
        case "httpProxyHost": target.setHttpProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "httpproxypassword":
        case "httpProxyPassword": target.setHttpProxyPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "httpproxyport":
        case "httpProxyPort": target.setHttpProxyPort(property(camelContext, int.class, value)); return true;
        case "httpproxyuser":
        case "httpProxyUser": target.setHttpProxyUser(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstoken":
        case "accessToken": return java.lang.String.class;
        case "accesstokensecret":
        case "accessTokenSecret": return java.lang.String.class;
        case "autowiredenabled":
        case "autowiredEnabled": return boolean.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "consumerkey":
        case "consumerKey": return java.lang.String.class;
        case "consumersecret":
        case "consumerSecret": return java.lang.String.class;
        case "httpproxyhost":
        case "httpProxyHost": return java.lang.String.class;
        case "httpproxypassword":
        case "httpProxyPassword": return java.lang.String.class;
        case "httpproxyport":
        case "httpProxyPort": return int.class;
        case "httpproxyuser":
        case "httpProxyUser": return java.lang.String.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        TwitterSearchComponent target = (TwitterSearchComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstoken":
        case "accessToken": return target.getAccessToken();
        case "accesstokensecret":
        case "accessTokenSecret": return target.getAccessTokenSecret();
        case "autowiredenabled":
        case "autowiredEnabled": return target.isAutowiredEnabled();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "consumerkey":
        case "consumerKey": return target.getConsumerKey();
        case "consumersecret":
        case "consumerSecret": return target.getConsumerSecret();
        case "httpproxyhost":
        case "httpProxyHost": return target.getHttpProxyHost();
        case "httpproxypassword":
        case "httpProxyPassword": return target.getHttpProxyPassword();
        case "httpproxyport":
        case "httpProxyPort": return target.getHttpProxyPort();
        case "httpproxyuser":
        case "httpProxyUser": return target.getHttpProxyUser();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        default: return null;
        }
    }
}

