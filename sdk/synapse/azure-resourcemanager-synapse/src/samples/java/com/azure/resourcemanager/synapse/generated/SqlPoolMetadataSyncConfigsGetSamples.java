// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

/**
 * Samples for SqlPoolMetadataSyncConfigs Get.
 */
public final class SqlPoolMetadataSyncConfigsGetSamples {
    /*
     * x-ms-original-file:
     * specification/synapse/resource-manager/Microsoft.Synapse/stable/2021-03-01/examples/GetSqlPoolMetadataSyncConfig.
     * json
     */
    /**
     * Sample code: Get metadata sync config for a SQL Analytics pool.
     * 
     * @param manager Entry point to SynapseManager.
     */
    public static void
        getMetadataSyncConfigForASQLAnalyticsPool(com.azure.resourcemanager.synapse.SynapseManager manager) {
        manager.sqlPoolMetadataSyncConfigs()
            .getWithResponse("ExampleResourceGroup", "ExampleWorkspace", "ExampleSqlPool",
                com.azure.core.util.Context.NONE);
    }
}
