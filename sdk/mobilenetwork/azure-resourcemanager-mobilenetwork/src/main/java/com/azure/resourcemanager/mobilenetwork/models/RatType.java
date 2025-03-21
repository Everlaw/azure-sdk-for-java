// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * RAT Type.
 */
public final class RatType extends ExpandableStringEnum<RatType> {
    /**
     * Static value 4G for RatType.
     */
    public static final RatType FOURG = fromString("4G");

    /**
     * Static value 5G for RatType.
     */
    public static final RatType FIVEG = fromString("5G");

    /**
     * Creates a new instance of RatType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public RatType() {
    }

    /**
     * Creates or finds a RatType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding RatType.
     */
    public static RatType fromString(String name) {
        return fromString(name, RatType.class);
    }

    /**
     * Gets known RatType values.
     * 
     * @return known RatType values.
     */
    public static Collection<RatType> values() {
        return values(RatType.class);
    }
}
