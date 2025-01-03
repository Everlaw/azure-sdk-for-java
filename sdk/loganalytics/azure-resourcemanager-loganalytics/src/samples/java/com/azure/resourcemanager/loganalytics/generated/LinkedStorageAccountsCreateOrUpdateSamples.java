// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.generated;

import com.azure.resourcemanager.loganalytics.models.DataSourceType;
import java.util.Arrays;

/**
 * Samples for LinkedStorageAccounts CreateOrUpdate.
 */
public final class LinkedStorageAccountsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/operationalinsights/resource-manager/Microsoft.OperationalInsights/stable/2020-08-01/examples/
     * LinkedStorageAccountsCreate.json
     */
    /**
     * Sample code: LinkedStorageAccountsCreate.
     * 
     * @param manager Entry point to LogAnalyticsManager.
     */
    public static void linkedStorageAccountsCreate(com.azure.resourcemanager.loganalytics.LogAnalyticsManager manager) {
        manager.linkedStorageAccounts()
            .define(DataSourceType.CUSTOM_LOGS)
            .withExistingWorkspace("mms-eus", "testLinkStorageAccountsWS")
            .withStorageAccountIds(Arrays.asList(
                "/subscriptions/00000000-0000-0000-0000-00000000000/resourceGroups/mms-eus/providers/Microsoft.Storage/storageAccounts/testStorageA",
                "/subscriptions/00000000-0000-0000-0000-00000000000/resourceGroups/mms-eus/providers/Microsoft.Storage/storageAccounts/testStorageB"))
            .create();
    }
}
