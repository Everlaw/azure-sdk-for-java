// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devhub.generated;

/**
 * Samples for Workflow GetByResourceGroup.
 */
public final class WorkflowGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/developerhub/resource-manager/Microsoft.DevHub/preview/2022-10-11-preview/examples/Workflow_Get.
     * json
     */
    /**
     * Sample code: Get Workflow.
     * 
     * @param manager Entry point to DevHubManager.
     */
    public static void getWorkflow(com.azure.resourcemanager.devhub.DevHubManager manager) {
        manager.workflows()
            .getByResourceGroupWithResponse("resourceGroup1", "workflow1", com.azure.core.util.Context.NONE);
    }
}
