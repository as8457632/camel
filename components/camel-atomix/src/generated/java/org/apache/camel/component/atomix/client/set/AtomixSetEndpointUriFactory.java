/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.atomix.client.set;

import java.net.URISyntaxException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class AtomixSetEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":resourceName";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    static {
        Set<String> props = new HashSet<>(19);
        props.add("synchronous");
        props.add("exchangePattern");
        props.add("ephemeral");
        props.add("resourceName");
        props.add("resourceConfigs");
        props.add("resultHeader");
        props.add("ttl");
        props.add("configurationUri");
        props.add("defaultResourceOptions");
        props.add("resourceOptions");
        props.add("lazyStartProducer");
        props.add("defaultAction");
        props.add("nodes");
        props.add("bridgeErrorHandler");
        props.add("defaultResourceConfig");
        props.add("transportClassName");
        props.add("atomix");
        props.add("exceptionHandler");
        props.add("readConsistency");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        SECRET_PROPERTY_NAMES = Collections.emptySet();
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "atomix-set".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "resourceName", null, true, copy);
        uri = buildQueryParameters(uri, copy, encode);
        return uri;
    }

    @Override
    public Set<String> propertyNames() {
        return PROPERTY_NAMES;
    }

    @Override
    public Set<String> secretPropertyNames() {
        return SECRET_PROPERTY_NAMES;
    }

    @Override
    public boolean isLenientProperties() {
        return false;
    }
}

