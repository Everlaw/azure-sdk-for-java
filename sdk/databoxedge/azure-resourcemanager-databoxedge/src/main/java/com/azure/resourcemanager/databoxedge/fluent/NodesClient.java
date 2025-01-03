// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.databoxedge.fluent.models.NodeInner;

/**
 * An instance of this class provides access to all the operations defined in NodesClient.
 */
public interface NodesClient {
    /**
     * Gets all the nodes currently configured under this Data Box Edge device.
     * 
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the nodes currently configured under this Data Box Edge device as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NodeInner> listByDataBoxEdgeDevice(String deviceName, String resourceGroupName);

    /**
     * Gets all the nodes currently configured under this Data Box Edge device.
     * 
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the nodes currently configured under this Data Box Edge device as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NodeInner> listByDataBoxEdgeDevice(String deviceName, String resourceGroupName, Context context);
}
