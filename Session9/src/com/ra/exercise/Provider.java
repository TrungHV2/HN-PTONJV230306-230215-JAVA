package com.ra.exercise;

public class Provider {
    private String providerId;
    private String providerName;
    private boolean status;

    //#region constructor
    public Provider(String providerId, String providerName, boolean status) {
        this.providerId = providerId;
        this.providerName = providerName;
        this.status = status;
    }

    public Provider() {
    }
    //#endregion

    //#region getter/setter
    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    //#endregion
}
