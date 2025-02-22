// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.securityinsights.fluent.models.AatpCheckRequirementsProperties;
import org.junit.jupiter.api.Assertions;

public final class AatpCheckRequirementsPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AatpCheckRequirementsProperties model
            = BinaryData.fromString("{\"tenantId\":\"cstu\"}").toObject(AatpCheckRequirementsProperties.class);
        Assertions.assertEquals("cstu", model.tenantId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AatpCheckRequirementsProperties model = new AatpCheckRequirementsProperties().withTenantId("cstu");
        model = BinaryData.fromObject(model).toObject(AatpCheckRequirementsProperties.class);
        Assertions.assertEquals("cstu", model.tenantId());
    }
}
