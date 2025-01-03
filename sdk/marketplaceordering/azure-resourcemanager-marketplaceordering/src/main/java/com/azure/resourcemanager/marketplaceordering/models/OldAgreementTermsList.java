// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.marketplaceordering.models;

import com.azure.resourcemanager.marketplaceordering.fluent.models.OldAgreementTermsListInner;
import java.util.List;

/**
 * An immutable client-side representation of OldAgreementTermsList.
 */
public interface OldAgreementTermsList {
    /**
     * Gets the value property: The value property.
     * 
     * @return the value value.
     */
    List<OldAgreementTerms> value();

    /**
     * Gets the inner com.azure.resourcemanager.marketplaceordering.fluent.models.OldAgreementTermsListInner object.
     * 
     * @return the inner object.
     */
    OldAgreementTermsListInner innerModel();
}
