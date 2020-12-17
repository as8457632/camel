
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.google.calendar;

import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link com.google.api.services.calendar.Calendar.Settings}.
 */
@ApiParams(apiName = "settings", 
           description = "The settings collection of methods",
           apiMethods = {@ApiMethod(methodName = "get", description="Returns a single user setting", signatures={"com.google.api.services.calendar.Calendar$Settings$Get get(String setting)"}), @ApiMethod(methodName = "list", description="Returns all user settings for the authenticated user", signatures={"com.google.api.services.calendar.Calendar$Settings$List list()"}), @ApiMethod(methodName = "watch", description="Watch for changes to Settings resources", signatures={"com.google.api.services.calendar.Calendar$Settings$Watch watch(com.google.api.services.calendar.model.Channel content)"})}, aliases = {})
@UriParams
@Configurer(extended = true)
public final class CalendarSettingsEndpointConfiguration extends GoogleCalendarConfiguration {
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "watch", description="The com.google.api.services.calendar.model.Channel")})
    private com.google.api.services.calendar.model.Channel contentChannel;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "get", description="The id of the user setting")})
    private String setting;

    public com.google.api.services.calendar.model.Channel getContentChannel() {
        return contentChannel;
    }

    public void setContentChannel(com.google.api.services.calendar.model.Channel contentChannel) {
        this.contentChannel = contentChannel;
    }

    public String getSetting() {
        return setting;
    }

    public void setSetting(String setting) {
        this.setting = setting;
    }
}
