
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.twilio;

import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link com.twilio.rest.api.v2010.Account}.
 */
@ApiParams(apiName = "account", 
           description = "",
           apiMethods = {@ApiMethod(methodName = "creator", description="Create a AccountCreator to execute create", signatures={"com.twilio.rest.api.v2010.AccountCreator creator()"}), @ApiMethod(methodName = "fetcher", description="Create a AccountFetcher to execute fetch", signatures={"com.twilio.rest.api.v2010.AccountFetcher fetcher()", "com.twilio.rest.api.v2010.AccountFetcher fetcher(String pathSid)"}), @ApiMethod(methodName = "reader", description="Create a AccountReader to execute read", signatures={"com.twilio.rest.api.v2010.AccountReader reader()"}), @ApiMethod(methodName = "updater", description="Create a AccountUpdater to execute update", signatures={"com.twilio.rest.api.v2010.AccountUpdater updater()", "com.twilio.rest.api.v2010.AccountUpdater updater(String pathSid)"}), }, aliases = {"^creator$=create", "^deleter$=delete", "^fetcher$=fetch", "^reader$=read", "^updater$=update"})
@UriParams
@Configurer(extended = true)
public final class AccountEndpointConfiguration extends TwilioConfiguration {
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "fetcher", description="Fetch by unique Account Sid"), @ApiMethod(methodName = "updater", description="Update by unique Account Sid")})
    private String pathSid;

    public String getPathSid() {
        return pathSid;
    }

    public void setPathSid(String pathSid) {
        this.pathSid = pathSid;
    }
}
