// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/** Defines values for SkuName. */
public final class SkuName extends ExpandableStringEnum<SkuName> {
    /** Static value B0 for SkuName. */
    public static final SkuName B0 = fromString("B0");

    /** Static value S0 for SkuName. */
    public static final SkuName S0 = fromString("S0");

    /**
     * (Avoid using it. Instead, consider using {@link SpringService.DefinitionStages.WithSku#withEnterpriseTierSku})
     * Static value E0 for SkuName. This stands for Enterprise Tier.
     */
    public static final SkuName E0 = fromString("E0");

    /**
     * Creates a new instance of SkuName value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SkuName() {
    }

    /**
     * Creates or finds a SkuName from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SkuName.
     */
    public static SkuName fromString(String name) {
        return fromString(name, SkuName.class);
    }

    /**
     * Gets known SkuName values.
     *
     * @return known SkuName values.
     */
    public static Collection<SkuName> values() {
        return values(SkuName.class);
    }
}
