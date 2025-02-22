// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedapplications.generated;

/**
 * Samples for Applications Delete.
 */
public final class ApplicationsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/solutions/resource-manager/Microsoft.Solutions/stable/2021-07-01/examples/deleteApplication.json
     */
    /**
     * Sample code: Delete managed application.
     * 
     * @param manager Entry point to ApplicationManager.
     */
    public static void
        deleteManagedApplication(com.azure.resourcemanager.managedapplications.ApplicationManager manager) {
        manager.applications().delete("rg", "myManagedApplication", com.azure.core.util.Context.NONE);
    }
}
