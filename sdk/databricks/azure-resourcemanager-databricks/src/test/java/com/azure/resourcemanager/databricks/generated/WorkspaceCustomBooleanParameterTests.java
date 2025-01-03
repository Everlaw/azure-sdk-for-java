// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databricks.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.databricks.models.WorkspaceCustomBooleanParameter;
import org.junit.jupiter.api.Assertions;

public final class WorkspaceCustomBooleanParameterTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WorkspaceCustomBooleanParameter model = BinaryData.fromString("{\"type\":\"String\",\"value\":false}")
            .toObject(WorkspaceCustomBooleanParameter.class);
        Assertions.assertEquals(false, model.value());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WorkspaceCustomBooleanParameter model = new WorkspaceCustomBooleanParameter().withValue(false);
        model = BinaryData.fromObject(model).toObject(WorkspaceCustomBooleanParameter.class);
        Assertions.assertEquals(false, model.value());
    }
}
