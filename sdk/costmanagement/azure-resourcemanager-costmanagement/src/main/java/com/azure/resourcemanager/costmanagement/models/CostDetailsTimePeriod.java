// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The start and end date for pulling data for the cost detailed report. API only allows data to be pulled for 1 month
 * or less and no older than 13 months.
 */
@Fluent
public final class CostDetailsTimePeriod {
    /*
     * The start date to pull data from. example format 2020-03-15
     */
    @JsonProperty(value = "start", required = true)
    private String start;

    /*
     * The end date to pull data to. example format 2020-03-15
     */
    @JsonProperty(value = "end", required = true)
    private String end;

    /** Creates an instance of CostDetailsTimePeriod class. */
    public CostDetailsTimePeriod() {
    }

    /**
     * Get the start property: The start date to pull data from. example format 2020-03-15.
     *
     * @return the start value.
     */
    public String start() {
        return this.start;
    }

    /**
     * Set the start property: The start date to pull data from. example format 2020-03-15.
     *
     * @param start the start value to set.
     * @return the CostDetailsTimePeriod object itself.
     */
    public CostDetailsTimePeriod withStart(String start) {
        this.start = start;
        return this;
    }

    /**
     * Get the end property: The end date to pull data to. example format 2020-03-15.
     *
     * @return the end value.
     */
    public String end() {
        return this.end;
    }

    /**
     * Set the end property: The end date to pull data to. example format 2020-03-15.
     *
     * @param end the end value to set.
     * @return the CostDetailsTimePeriod object itself.
     */
    public CostDetailsTimePeriod withEnd(String end) {
        this.end = end;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (start() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property start in model CostDetailsTimePeriod"));
        }
        if (end() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property end in model CostDetailsTimePeriod"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CostDetailsTimePeriod.class);
}