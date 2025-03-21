// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.translation.document.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * List of possible statuses for job or document.
 */
public final class TranslationStatus extends ExpandableStringEnum<TranslationStatus> {

    /**
     * NotStarted.
     */
    @Generated
    public static final TranslationStatus NOT_STARTED = fromString("NotStarted");

    /**
     * Running.
     */
    @Generated
    public static final TranslationStatus RUNNING = fromString("Running");

    /**
     * Succeeded.
     */
    @Generated
    public static final TranslationStatus SUCCEEDED = fromString("Succeeded");

    /**
     * Failed.
     */
    @Generated
    public static final TranslationStatus FAILED = fromString("Failed");

    /**
     * Cancelled.
     */
    @Generated
    public static final TranslationStatus CANCELLED = fromString("Cancelled");

    /**
     * Cancelling.
     */
    @Generated
    public static final TranslationStatus CANCELLING = fromString("Cancelling");

    /**
     * ValidationFailed.
     */
    @Generated
    public static final TranslationStatus VALIDATION_FAILED = fromString("ValidationFailed");

    /**
     * Creates a new instance of TranslationStatus value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public TranslationStatus() {
    }

    /**
     * Creates or finds a TranslationStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TranslationStatus.
     */
    @Generated
    public static TranslationStatus fromString(String name) {
        return fromString(name, TranslationStatus.class);
    }

    /**
     * Gets known TranslationStatus values.
     *
     * @return known TranslationStatus values.
     */
    @Generated
    public static Collection<TranslationStatus> values() {
        return values(TranslationStatus.class);
    }
}
