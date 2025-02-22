// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/**
 * Resource collection API of StatisticsOperations.
 */
public interface StatisticsOperations {
    /**
     * Retrieve the statistics for the account.
     * 
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for the list statistics operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Statistics> listByAutomationAccount(String resourceGroupName, String automationAccountName);

    /**
     * Retrieve the statistics for the account.
     * 
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param filter The filter to apply on the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for the list statistics operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Statistics> listByAutomationAccount(String resourceGroupName, String automationAccountName,
        String filter, Context context);
}
