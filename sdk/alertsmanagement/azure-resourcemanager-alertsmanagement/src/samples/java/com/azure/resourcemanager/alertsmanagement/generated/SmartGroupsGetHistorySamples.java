// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.alertsmanagement.generated;

/**
 * Samples for SmartGroups GetHistory.
 */
public final class SmartGroupsGetHistorySamples {
    /*
     * x-ms-original-file:
     * specification/alertsmanagement/resource-manager/Microsoft.AlertsManagement/preview/2019-05-05-preview/examples/
     * SmartGroups_History.json
     */
    /**
     * Sample code: Resolve.
     * 
     * @param manager Entry point to AlertsManagementManager.
     */
    public static void resolve(com.azure.resourcemanager.alertsmanagement.AlertsManagementManager manager) {
        manager.smartGroups()
            .getHistoryWithResponse("a808445e-bb38-4751-85c2-1b109ccc1059", com.azure.core.util.Context.NONE);
    }
}
