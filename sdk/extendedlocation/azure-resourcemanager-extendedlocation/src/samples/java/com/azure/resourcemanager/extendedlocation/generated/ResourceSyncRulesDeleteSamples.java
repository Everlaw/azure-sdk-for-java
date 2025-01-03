// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.extendedlocation.generated;

/**
 * Samples for ResourceSyncRules Delete.
 */
public final class ResourceSyncRulesDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/extendedlocation/resource-manager/Microsoft.ExtendedLocation/preview/2021-08-31-preview/examples/
     * ResourceSyncRulesDelete.json
     */
    /**
     * Sample code: Delete Resource Sync Rule.
     * 
     * @param manager Entry point to CustomLocationsManager.
     */
    public static void
        deleteResourceSyncRule(com.azure.resourcemanager.extendedlocation.CustomLocationsManager manager) {
        manager.resourceSyncRules()
            .deleteWithResponse("testresourcegroup", "customLocation01", "resourceSyncRule01",
                com.azure.core.util.Context.NONE);
    }
}
