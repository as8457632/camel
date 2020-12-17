/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.mongodb.gridfs;

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
public class GridFsEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        GridFsEndpoint target = (GridFsEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "bucket": target.setBucket(property(camelContext, java.lang.String.class, value)); return true;
        case "database": target.setDatabase(property(camelContext, java.lang.String.class, value)); return true;
        case "delay": target.setDelay(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "fileattributename":
        case "fileAttributeName": target.setFileAttributeName(property(camelContext, java.lang.String.class, value)); return true;
        case "initialdelay":
        case "initialDelay": target.setInitialDelay(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "operation": target.setOperation(property(camelContext, java.lang.String.class, value)); return true;
        case "persistenttscollection":
        case "persistentTSCollection": target.setPersistentTSCollection(property(camelContext, java.lang.String.class, value)); return true;
        case "persistenttsobject":
        case "persistentTSObject": target.setPersistentTSObject(property(camelContext, java.lang.String.class, value)); return true;
        case "query": target.setQuery(property(camelContext, java.lang.String.class, value)); return true;
        case "querystrategy":
        case "queryStrategy": target.setQueryStrategy(property(camelContext, org.apache.camel.component.mongodb.gridfs.QueryStrategy.class, value)); return true;
        case "readpreference":
        case "readPreference": target.setReadPreference(property(camelContext, com.mongodb.ReadPreference.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "writeconcern":
        case "writeConcern": target.setWriteConcern(property(camelContext, com.mongodb.WriteConcern.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "bucket": return java.lang.String.class;
        case "database": return java.lang.String.class;
        case "delay": return long.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "fileattributename":
        case "fileAttributeName": return java.lang.String.class;
        case "initialdelay":
        case "initialDelay": return long.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "operation": return java.lang.String.class;
        case "persistenttscollection":
        case "persistentTSCollection": return java.lang.String.class;
        case "persistenttsobject":
        case "persistentTSObject": return java.lang.String.class;
        case "query": return java.lang.String.class;
        case "querystrategy":
        case "queryStrategy": return org.apache.camel.component.mongodb.gridfs.QueryStrategy.class;
        case "readpreference":
        case "readPreference": return com.mongodb.ReadPreference.class;
        case "synchronous": return boolean.class;
        case "writeconcern":
        case "writeConcern": return com.mongodb.WriteConcern.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        GridFsEndpoint target = (GridFsEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "bucket": return target.getBucket();
        case "database": return target.getDatabase();
        case "delay": return target.getDelay();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "fileattributename":
        case "fileAttributeName": return target.getFileAttributeName();
        case "initialdelay":
        case "initialDelay": return target.getInitialDelay();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "operation": return target.getOperation();
        case "persistenttscollection":
        case "persistentTSCollection": return target.getPersistentTSCollection();
        case "persistenttsobject":
        case "persistentTSObject": return target.getPersistentTSObject();
        case "query": return target.getQuery();
        case "querystrategy":
        case "queryStrategy": return target.getQueryStrategy();
        case "readpreference":
        case "readPreference": return target.getReadPreference();
        case "synchronous": return target.isSynchronous();
        case "writeconcern":
        case "writeConcern": return target.getWriteConcern();
        default: return null;
        }
    }
}

