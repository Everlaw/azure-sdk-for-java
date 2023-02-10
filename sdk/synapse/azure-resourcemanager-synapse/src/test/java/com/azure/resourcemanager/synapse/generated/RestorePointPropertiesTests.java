// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.synapse.fluent.models.RestorePointProperties;

public final class RestorePointPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RestorePointProperties model =
            BinaryData
                .fromString(
                    "{\"restorePointType\":\"DISCRETE\",\"earliestRestoreDate\":\"2021-02-06T06:59:31Z\",\"restorePointCreationDate\":\"2021-09-18T13:17Z\",\"restorePointLabel\":\"qp\"}")
                .toObject(RestorePointProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RestorePointProperties model = new RestorePointProperties();
        model = BinaryData.fromObject(model).toObject(RestorePointProperties.class);
    }
}