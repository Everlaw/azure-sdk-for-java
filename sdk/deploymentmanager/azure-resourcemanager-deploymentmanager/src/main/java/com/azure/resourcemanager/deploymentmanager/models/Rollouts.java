// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deploymentmanager.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import java.util.List;

/** Resource collection API of Rollouts. */
public interface Rollouts {
    /**
     * Gets detailed information of a rollout.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param rolloutName The rollout name.
     * @param retryAttempt Rollout retry attempt ordinal to get the result of. If not specified, result of the latest
     *     attempt will be returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return detailed information of a rollout along with {@link Response}.
     */
    Response<Rollout> getByResourceGroupWithResponse(String resourceGroupName, String rolloutName, Integer retryAttempt,
        Context context);

    /**
     * Gets detailed information of a rollout.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param rolloutName The rollout name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return detailed information of a rollout.
     */
    Rollout getByResourceGroup(String resourceGroupName, String rolloutName);

    /**
     * Deletes a rollout resource.
     *
     * <p>Only rollouts in terminal state can be deleted.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param rolloutName The rollout name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByResourceGroupWithResponse(String resourceGroupName, String rolloutName, Context context);

    /**
     * Deletes a rollout resource.
     *
     * <p>Only rollouts in terminal state can be deleted.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param rolloutName The rollout name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String rolloutName);

    /**
     * Stops a running rollout.
     *
     * <p>Only running rollouts can be canceled.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param rolloutName The rollout name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the rollout along with {@link Response}.
     */
    Response<Rollout> cancelWithResponse(String resourceGroupName, String rolloutName, Context context);

    /**
     * Stops a running rollout.
     *
     * <p>Only running rollouts can be canceled.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param rolloutName The rollout name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the rollout.
     */
    Rollout cancel(String resourceGroupName, String rolloutName);

    /**
     * Restarts a failed rollout and optionally skips all succeeded steps.
     *
     * <p>Only failed rollouts can be restarted.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param rolloutName The rollout name.
     * @param skipSucceeded If true, will skip all succeeded steps so far in the rollout. If false, will execute the
     *     entire rollout again regardless of the current state of individual resources. Defaults to false if not
     *     specified.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the rollout along with {@link Response}.
     */
    Response<Rollout> restartWithResponse(String resourceGroupName, String rolloutName, Boolean skipSucceeded,
        Context context);

    /**
     * Restarts a failed rollout and optionally skips all succeeded steps.
     *
     * <p>Only failed rollouts can be restarted.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param rolloutName The rollout name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the rollout.
     */
    Rollout restart(String resourceGroupName, String rolloutName);

    /**
     * Lists the rollouts in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of rollouts along with {@link Response}.
     */
    Response<List<Rollout>> listWithResponse(String resourceGroupName, Context context);

    /**
     * Lists the rollouts in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of rollouts.
     */
    List<Rollout> list(String resourceGroupName);

    /**
     * Deletes a rollout resource.
     *
     * <p>Only rollouts in terminal state can be deleted.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a rollout resource.
     *
     * <p>Only rollouts in terminal state can be deleted.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new RolloutRequest resource.
     *
     * @param name resource name.
     * @return the first stage of the new RolloutRequest definition.
     */
    RolloutRequest.DefinitionStages.Blank define(String name);
}
