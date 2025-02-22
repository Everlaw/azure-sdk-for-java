// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.providerhub.fluent.models.CustomRolloutInner;

/**
 * An instance of this class provides access to all the operations defined in CustomRolloutsClient.
 */
public interface CustomRolloutsClient {
    /**
     * Gets the custom rollout details.
     * 
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param rolloutName The rollout name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the custom rollout details along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CustomRolloutInner> getWithResponse(String providerNamespace, String rolloutName, Context context);

    /**
     * Gets the custom rollout details.
     * 
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param rolloutName The rollout name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the custom rollout details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CustomRolloutInner get(String providerNamespace, String rolloutName);

    /**
     * Creates or updates the rollout details.
     * 
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param rolloutName The rollout name.
     * @param properties The custom rollout properties supplied to the CreateOrUpdate operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return rollout details along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CustomRolloutInner> createOrUpdateWithResponse(String providerNamespace, String rolloutName,
        CustomRolloutInner properties, Context context);

    /**
     * Creates or updates the rollout details.
     * 
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param rolloutName The rollout name.
     * @param properties The custom rollout properties supplied to the CreateOrUpdate operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return rollout details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CustomRolloutInner createOrUpdate(String providerNamespace, String rolloutName, CustomRolloutInner properties);

    /**
     * Gets the list of the custom rollouts for the given provider.
     * 
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of the custom rollouts for the given provider as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CustomRolloutInner> listByProviderRegistration(String providerNamespace);

    /**
     * Gets the list of the custom rollouts for the given provider.
     * 
     * @param providerNamespace The name of the resource provider hosted within ProviderHub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of the custom rollouts for the given provider as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CustomRolloutInner> listByProviderRegistration(String providerNamespace, Context context);
}
