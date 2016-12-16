package com.kastling.plugin;

import oracle.security.am.plugin.ExecutionStatus;
import oracle.security.am.plugin.MonitoringData;
import oracle.security.am.plugin.PluginConfig;
import oracle.security.am.plugin.authn.AbstractAuthenticationPlugIn;
import oracle.security.am.plugin.authn.AuthenticationContext;
import oracle.security.am.plugin.authn.AuthenticationException;

import java.util.Collections;
import java.util.Map;
import java.util.logging.Logger;

public class CustomAuthenticationPlugin extends AbstractAuthenticationPlugIn {

    private Logger log = Logger.getLogger(this.getClass().getName());

    @Override
    public String getDescription() {
        return "Plugin Description";
    }

    @Override
    public Map<String, MonitoringData> getMonitoringData() {
        return Collections.emptyMap();
    }

    @Override
    public boolean getMonitoringStatus() {
        return false;
    }

    @Override
    public String getPluginName() {
        return this.getClass().getSimpleName();
    }

    @Override
    public int getRevision() {
        return 0;
    }

    @Override
    public ExecutionStatus initialize(PluginConfig config) {
        super.initialize(config);

        ExecutionStatus status = ExecutionStatus.FAILURE;
        status = ExecutionStatus.SUCCESS;
        return status;
    }

    @Override
    public ExecutionStatus process(AuthenticationContext context)
            throws AuthenticationException {
        ExecutionStatus status = ExecutionStatus.FAILURE;

        try {
            boolean result = true;
            if (result) {
                status = ExecutionStatus.SUCCESS;
            }
        } catch (Exception e) {
            log.severe(e.getMessage());
        }

        return status;
    }

    @Override
    public void setMonitoringStatus(boolean status) {

    }
}