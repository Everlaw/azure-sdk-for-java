// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The URL to download the generated report. */
@Fluent
public final class DownloadUrlInner {
    /*
     * The time at which report URL becomes invalid/expires in UTC e.g. 2020-12-08T05:55:59.4394737Z.
     */
    @JsonProperty(value = "expiryTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime expiryTime;

    /*
     * The time at which report URL becomes invalid/expires in UTC e.g. 2020-12-08T05:55:59.4394737Z.
     */
    @JsonProperty(value = "validTill")
    private OffsetDateTime validTill;

    /*
     * The URL to download the generated report.
     */
    @JsonProperty(value = "downloadUrl")
    private String downloadUrl;

    /** Creates an instance of DownloadUrlInner class. */
    public DownloadUrlInner() {
    }

    /**
     * Get the expiryTime property: The time at which report URL becomes invalid/expires in UTC e.g.
     * 2020-12-08T05:55:59.4394737Z.
     *
     * @return the expiryTime value.
     */
    public OffsetDateTime expiryTime() {
        return this.expiryTime;
    }

    /**
     * Get the validTill property: The time at which report URL becomes invalid/expires in UTC e.g.
     * 2020-12-08T05:55:59.4394737Z.
     *
     * @return the validTill value.
     */
    public OffsetDateTime validTill() {
        return this.validTill;
    }

    /**
     * Set the validTill property: The time at which report URL becomes invalid/expires in UTC e.g.
     * 2020-12-08T05:55:59.4394737Z.
     *
     * @param validTill the validTill value to set.
     * @return the DownloadUrlInner object itself.
     */
    public DownloadUrlInner withValidTill(OffsetDateTime validTill) {
        this.validTill = validTill;
        return this;
    }

    /**
     * Get the downloadUrl property: The URL to download the generated report.
     *
     * @return the downloadUrl value.
     */
    public String downloadUrl() {
        return this.downloadUrl;
    }

    /**
     * Set the downloadUrl property: The URL to download the generated report.
     *
     * @param downloadUrl the downloadUrl value to set.
     * @return the DownloadUrlInner object itself.
     */
    public DownloadUrlInner withDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}