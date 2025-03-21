// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appconfiguration.fluent.SnapshotsClient;
import com.azure.resourcemanager.appconfiguration.fluent.models.SnapshotInner;
import com.azure.resourcemanager.appconfiguration.models.Snapshot;
import com.azure.resourcemanager.appconfiguration.models.Snapshots;

public final class SnapshotsImpl implements Snapshots {
    private static final ClientLogger LOGGER = new ClientLogger(SnapshotsImpl.class);

    private final SnapshotsClient innerClient;

    private final com.azure.resourcemanager.appconfiguration.AppConfigurationManager serviceManager;

    public SnapshotsImpl(SnapshotsClient innerClient,
        com.azure.resourcemanager.appconfiguration.AppConfigurationManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<Snapshot> getWithResponse(String resourceGroupName, String configStoreName, String snapshotName,
        Context context) {
        Response<SnapshotInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, configStoreName, snapshotName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new SnapshotImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Snapshot get(String resourceGroupName, String configStoreName, String snapshotName) {
        SnapshotInner inner = this.serviceClient().get(resourceGroupName, configStoreName, snapshotName);
        if (inner != null) {
            return new SnapshotImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Snapshot getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String configStoreName = ResourceManagerUtils.getValueFromIdByName(id, "configurationStores");
        if (configStoreName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'configurationStores'.", id)));
        }
        String snapshotName = ResourceManagerUtils.getValueFromIdByName(id, "snapshots");
        if (snapshotName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'snapshots'.", id)));
        }
        return this.getWithResponse(resourceGroupName, configStoreName, snapshotName, Context.NONE).getValue();
    }

    public Response<Snapshot> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String configStoreName = ResourceManagerUtils.getValueFromIdByName(id, "configurationStores");
        if (configStoreName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'configurationStores'.", id)));
        }
        String snapshotName = ResourceManagerUtils.getValueFromIdByName(id, "snapshots");
        if (snapshotName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'snapshots'.", id)));
        }
        return this.getWithResponse(resourceGroupName, configStoreName, snapshotName, context);
    }

    private SnapshotsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.appconfiguration.AppConfigurationManager manager() {
        return this.serviceManager;
    }

    public SnapshotImpl define(String name) {
        return new SnapshotImpl(name, this.manager());
    }
}
