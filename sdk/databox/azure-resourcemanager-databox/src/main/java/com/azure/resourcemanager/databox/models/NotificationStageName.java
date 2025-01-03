// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Name of the stage.
 */
public final class NotificationStageName extends ExpandableStringEnum<NotificationStageName> {
    /**
     * Static value DevicePrepared for NotificationStageName.
     */
    public static final NotificationStageName DEVICE_PREPARED = fromString("DevicePrepared");

    /**
     * Static value Dispatched for NotificationStageName.
     */
    public static final NotificationStageName DISPATCHED = fromString("Dispatched");

    /**
     * Static value Delivered for NotificationStageName.
     */
    public static final NotificationStageName DELIVERED = fromString("Delivered");

    /**
     * Static value PickedUp for NotificationStageName.
     */
    public static final NotificationStageName PICKED_UP = fromString("PickedUp");

    /**
     * Static value AtAzureDC for NotificationStageName.
     */
    public static final NotificationStageName AT_AZURE_DC = fromString("AtAzureDC");

    /**
     * Static value DataCopy for NotificationStageName.
     */
    public static final NotificationStageName DATA_COPY = fromString("DataCopy");

    /**
     * Static value Created for NotificationStageName.
     */
    public static final NotificationStageName CREATED = fromString("Created");

    /**
     * Static value ShippedToCustomer for NotificationStageName.
     */
    public static final NotificationStageName SHIPPED_TO_CUSTOMER = fromString("ShippedToCustomer");

    /**
     * Creates a new instance of NotificationStageName value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public NotificationStageName() {
    }

    /**
     * Creates or finds a NotificationStageName from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding NotificationStageName.
     */
    public static NotificationStageName fromString(String name) {
        return fromString(name, NotificationStageName.class);
    }

    /**
     * Gets known NotificationStageName values.
     * 
     * @return known NotificationStageName values.
     */
    public static Collection<NotificationStageName> values() {
        return values(NotificationStageName.class);
    }
}
