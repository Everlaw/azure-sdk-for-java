// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mixedreality.models;

import com.azure.resourcemanager.mixedreality.fluent.models.CheckNameAvailabilityResponseInner;

/**
 * An immutable client-side representation of CheckNameAvailabilityResponse.
 */
public interface CheckNameAvailabilityResponse {
    /**
     * Gets the nameAvailable property: if name Available.
     * 
     * @return the nameAvailable value.
     */
    boolean nameAvailable();

    /**
     * Gets the reason property: Resource Name To Verify.
     * 
     * @return the reason value.
     */
    NameUnavailableReason reason();

    /**
     * Gets the message property: detail message.
     * 
     * @return the message value.
     */
    String message();

    /**
     * Gets the inner com.azure.resourcemanager.mixedreality.fluent.models.CheckNameAvailabilityResponseInner object.
     * 
     * @return the inner object.
     */
    CheckNameAvailabilityResponseInner innerModel();
}
