// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billingbenefits.models;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.billingbenefits.fluent.models.SavingsPlanOrderModelInner;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * An immutable client-side representation of SavingsPlanOrderModel.
 */
public interface SavingsPlanOrderModel {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the sku property: Savings plan SKU.
     * 
     * @return the sku value.
     */
    Sku sku();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the displayName property: Display name.
     * 
     * @return the displayName value.
     */
    String displayName();

    /**
     * Gets the provisioningState property: Provisioning state.
     * 
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the billingScopeId property: Subscription that will be charged for purchasing the benefit.
     * 
     * @return the billingScopeId value.
     */
    String billingScopeId();

    /**
     * Gets the billingProfileId property: Fully-qualified identifier of the billing profile where the savings plan is
     * applied. Present only for Field-led or Customer-led customers.
     * 
     * @return the billingProfileId value.
     */
    String billingProfileId();

    /**
     * Gets the customerId property: Fully-qualified identifier of the customer where the savings plan is applied.
     * Present only for Partner-led customers.
     * 
     * @return the customerId value.
     */
    String customerId();

    /**
     * Gets the billingAccountId property: Fully-qualified identifier of the billing account where the savings plan is
     * applied. Present only for Enterprise Agreement customers.
     * 
     * @return the billingAccountId value.
     */
    String billingAccountId();

    /**
     * Gets the term property: Represent benefit term in ISO 8601 format.
     * 
     * @return the term value.
     */
    Term term();

    /**
     * Gets the billingPlan property: Represents the billing plan in ISO 8601 format. Required only for monthly billing
     * plans.
     * 
     * @return the billingPlan value.
     */
    BillingPlan billingPlan();

    /**
     * Gets the expiryDateTime property: Expiry date time.
     * 
     * @return the expiryDateTime value.
     */
    OffsetDateTime expiryDateTime();

    /**
     * Gets the benefitStartTime property: This is the DateTime when the savings plan benefit started.
     * 
     * @return the benefitStartTime value.
     */
    OffsetDateTime benefitStartTime();

    /**
     * Gets the planInformation property: Information describing the type of billing plan for this savings plan.
     * 
     * @return the planInformation value.
     */
    BillingPlanInformation planInformation();

    /**
     * Gets the savingsPlans property: The savingsPlans property.
     * 
     * @return the savingsPlans value.
     */
    List<String> savingsPlans();

    /**
     * Gets the extendedStatusInfo property: The extendedStatusInfo property.
     * 
     * @return the extendedStatusInfo value.
     */
    ExtendedStatusInfo extendedStatusInfo();

    /**
     * Gets the inner com.azure.resourcemanager.billingbenefits.fluent.models.SavingsPlanOrderModelInner object.
     * 
     * @return the inner object.
     */
    SavingsPlanOrderModelInner innerModel();
}
