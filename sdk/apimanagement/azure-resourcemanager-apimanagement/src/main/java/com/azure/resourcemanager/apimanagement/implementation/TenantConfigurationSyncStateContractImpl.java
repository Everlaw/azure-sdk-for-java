// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.resourcemanager.apimanagement.fluent.models.TenantConfigurationSyncStateContractInner;
import com.azure.resourcemanager.apimanagement.models.TenantConfigurationSyncStateContract;
import java.time.OffsetDateTime;

public final class TenantConfigurationSyncStateContractImpl implements TenantConfigurationSyncStateContract {
    private TenantConfigurationSyncStateContractInner innerObject;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    TenantConfigurationSyncStateContractImpl(TenantConfigurationSyncStateContractInner innerObject,
        com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String branch() {
        return this.innerModel().branch();
    }

    public String commitId() {
        return this.innerModel().commitId();
    }

    public Boolean isExport() {
        return this.innerModel().isExport();
    }

    public Boolean isSynced() {
        return this.innerModel().isSynced();
    }

    public Boolean isGitEnabled() {
        return this.innerModel().isGitEnabled();
    }

    public OffsetDateTime syncDate() {
        return this.innerModel().syncDate();
    }

    public OffsetDateTime configurationChangeDate() {
        return this.innerModel().configurationChangeDate();
    }

    public String lastOperationId() {
        return this.innerModel().lastOperationId();
    }

    public TenantConfigurationSyncStateContractInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }
}
